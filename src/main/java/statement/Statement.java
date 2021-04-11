package statement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import exception.StatementExecutionException;
import state.State;
import lombok.AccessLevel;
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
  private final int index;
  private final Type type;
  private final StatementAction<State, State> action;

  public static Statement emptyStatement(int lineNumber) {
    return new Statement(lineNumber, Type.ERROR_STATEMENT, EMPTY_STATEMENT);
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

  // TODO test GSON serialization
  public String toJson() throws JsonProcessingException {
    Map<String, String> jsonRepresentation = new HashMap<>();
    jsonRepresentation.put("statementIndex", String.valueOf(index));
    jsonRepresentation.put("type", type.name());
    return jsonMapper.writeValueAsString(jsonRepresentation);
  }

  @AllArgsConstructor(access = AccessLevel.PRIVATE)
  public enum Type {

    /* Statement with some error */
    ERROR_STATEMENT("ERROR"),

    /* Definition of new label to jump */
    LABEL_DEFINITION("LABEL_DEFINITION"),

    /* Instruction for CPU */
    JMP("JMP"),

    /* Binary operation of type operation register1, register2 */
    BINARY_OPERATION_REGISTERS("BINARY_OPERATION_REGISTERS"),

    /* Binary operation of type operation register, const */
    BINARY_OPERATION_REGISTER_CONST("BINARY_OPERATION_REGISTER_CONST"),

    /* Unary operation of type operation const */
    UNARY_OPERATION_CONST("UNARY_OPERATION_CONST"),

    /* Unary operation of type operation registers */
    UNARY_OPERATION_REGISTER("UNARY_OPERATION_REGISTER");

    @Getter
    private final String name;
  }
}
