package state;

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
  private final Registers registers;
  private final List<Statement> statements;
  private final ListIterator<Statement> statementIterator;
  private final Labels labels;

  public State(AssemblerListener listener) {
    this(
            new Registers(),
            listener.getStatements(),
            listener.getStatements().listIterator(),
            listener.getLabelsContext()
    );
  }

  public State setRegister(String id, Number value) {
    return new State(
            registers.set(id, value),
            this.statements,
            this.statementIterator,
            this.labels
    );
  }

  public Number gerRegisterValue(String id) {
    return registers.getRegisterValue(id);
  }

  public State push(Number value) {
    callStack.push(value);
    return this;
  }

  public Number pop() {
    return callStack.pop();
  }

  public State jumpTo(int index) {
    validate(index);
    while (statementIterator.nextIndex() - 1 != index) {
      if (statementIterator.nextIndex() - 1 > index) {
        statementIterator.previous();
      } else {
        statementIterator.next();
      }
    }
    return this;
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
    json.put("registersContext", registers.toJson());
    json.put("statementsContext", statements.toString());
    json.put("labelsContext", labels.toJson());
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
