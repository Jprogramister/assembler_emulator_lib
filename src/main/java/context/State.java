package context;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import recognizer.AssemblerListener;
import statement.Statement;

import java.io.IOException;
import java.util.*;

import static java.lang.String.format;

/**
 * Aggregation of CPU context states and list of code statements
 */
@Getter
@AllArgsConstructor
@Slf4j
public class State {
  private final ObjectMapper objectMapper = new ObjectMapper();
  private final Deque<Number> callStack = new ArrayDeque<>();
  private final RegistersContext registersContext;
  private final List<Statement> statements;
  private final ListIterator<Statement> statementIterator;
  private final LabelsContext labelsContext;

  public State(AssemblerListener listener) {
    this(
            new RegistersContext(),
            listener.getStatements(),
            listener.getStatements().listIterator(),
            listener.getLabelsContext()
    );
  }

  /**
   * Creates new instance of state by this with other resgiters context
   *
   * @param ctx registers context for new instance
   * @return {@link State}
   */
  public State cloneWithRegisters(final RegistersContext ctx) {
    return new State(
            ctx,
            this.statements,
            this.statementIterator,
            this.labelsContext
    );
  }

  public void jumpTo(int index) {
    validate(index);
    while (statementIterator.nextIndex() - 1 != index) {
      if (statementIterator.nextIndex() - 1 > index) {
        statementIterator.previous();
      } else {
        statementIterator.next();
      }
    }
  }

  private void validate(int index) {
    if (index < 0 || index >= statements.size()) {
      throw new IndexOutOfBoundsException(
              format("Can't jump to index %d statements list size = %d", index, statements.size()));
    }
  }

  public String toJson() throws IOException {
    Map<String, String> json = new HashMap<>();
    json.put("callStackContext", callStack.toString());
    json.put("registersContext", registersContext.toJson());
    json.put("statementsContext", statements.toString());
    json.put("labelsContext", labelsContext.toJson());
    return objectMapper.writeValueAsString(json);
  }

  @Override
  public String toString() {
    try {
      return toJson();
    } catch (IOException e) {
      log.error("context.State to string mapping error", e);
      return "{}";
    }
  }
}
