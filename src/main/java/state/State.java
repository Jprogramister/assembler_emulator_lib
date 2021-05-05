package state;

import com.fasterxml.jackson.databind.ObjectMapper;
import exception.LabelDefinitionException;
import lombok.AllArgsConstructor;
import recognizer.AstWalker;
import statement.Statement;

import java.io.IOException;
import java.util.*;

import static java.lang.String.format;

/**
 * Aggregation of CPU context states and list of code statements
 */
@AllArgsConstructor
public class State {
  private final ObjectMapper objectMapper = new ObjectMapper();
  private final Deque<Number> callStack = new ArrayDeque<>();
  private final Registers registers;
  private final List<Statement> statements;
  private final ListIterator<Statement> statementIterator;
  private final Labels labels;

  public State(AstWalker listener) {
    this(
            new Registers(),
            listener.getStatements(),
            listener.getStatements().listIterator(),
            listener.getLabels()
    );
  }

  public int statementsCount() {
    return statements.size();
  }

  public Statement next() {
    return statementIterator.next();
  }

  public boolean hasNext() {
    return statementIterator.hasNext();
  }

  public State setRegister(String id, Number value) {
    return new State(
            registers.set(id, value),
            this.statements,
            this.statementIterator,
            this.labels
    );
  }

  public Label getLabel(String id) throws LabelDefinitionException {
    return labels.getLabel(id);
  }

  public Number getRegisterValue(String id) {
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

  @Override
  public String toString() {
    try {
      Map<String, String> json = new HashMap<>();
      json.put("callStackContext", callStack.toString());
      json.put("registersContext", registers.toString());
      json.put("statementsContext", statements.toString());
      json.put("labelsContext", labels.toString());
      return objectMapper.writeValueAsString(json);
    } catch (IOException e) {
      return "{}";
    }
  }
}
