package statement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import context.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Some operation which changes state of {@link State} of CPU
 */
@AllArgsConstructor
@Slf4j
public class Statement implements StatementAction<State, State> {
  public static final StatementAction<State, State> EMPTY_STATEMENT = state -> state;
  private final JsonMapper jsonMapper = new JsonMapper();
  /**
   * Line number where statement is located
   */
  @Getter
  private final int statementIndex;
  @Getter
  private final StatementType type;
  private final StatementAction<State, State> action;

  public static Statement emptyStatement(int lineNumber) {
    return new Statement(lineNumber, StatementType.ERROR_STATEMENT, EMPTY_STATEMENT);
  }

  @Override
  public State apply(State state) throws StatementExecutionException {
    return action.apply(state);
  }

  @Override
  public String toString() {
    try {
      return toJson();
    } catch (JsonProcessingException e) {
      log.error("Statement to json mapping error", e);
      return "{}";
    }
  }

  public String toJson() throws JsonProcessingException {
    Map<String, String> jsonRepresentation = new HashMap<>();
    jsonRepresentation.put("statementIndex", String.valueOf(statementIndex));
    jsonRepresentation.put("type", type.name());
    return jsonMapper.writeValueAsString(jsonRepresentation);
  }

}
