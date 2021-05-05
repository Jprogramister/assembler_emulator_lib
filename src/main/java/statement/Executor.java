package statement;

import exception.StatementExecutionException;
import state.Registers;
import state.State;

import static java.lang.String.format;

/**
 * Aggregation of functions that perform binary operators
 */
public final class Executor {
  private Executor() {
  }

  /**
   * Executes operator which uses two registers ids
   *
   * @param operator        string id of operator
   * @param leftRegisterId  leftvalue register
   * @param rightRegisterId rightvalue register
   * @param state           state which will changed after operator execution
   * @return new or old changed state
   */
  public static State performBinary(State state, Operation operator, String leftRegisterId, String rightRegisterId) {
    var rightValue = state.getRegisterValue(rightRegisterId);
    return performBinary(state, operator, leftRegisterId, rightValue);
  }

  /**
   * Executes operator which uses register id and numerical literal
   *
   * @param operator       string id of operator
   * @param leftRegisterId left value register id
   * @param rvalue     right value number
   * @param state          state which will changed after operator execution
   * @return new or old changed state
   */
  public static State performBinary(State state, Operation operator, String leftRegisterId, Number rvalue) {
    var lvalue = state.getRegisterValue(leftRegisterId);
    return switch (operator) {
      case ADD -> state.setRegister(leftRegisterId, lvalue.doubleValue() + rvalue.doubleValue());
      case SUB -> state.setRegister(leftRegisterId, lvalue.doubleValue() - rvalue.doubleValue());
      case MOV -> state.setRegister(leftRegisterId, rvalue);
      default -> throw new UnsupportedOperationException(format("Cannot execute operation %s ", operator.getId()));
    };
  }

  public static State performUnary(State state, Operation operator, String registerId)
          throws UnsupportedOperationException, IllegalArgumentException {
    return switch (operator) {
      case PUSH -> state.push(state.getRegisterValue(registerId));
      case POP -> state.setRegister(registerId, state.pop());
      default -> throw new UnsupportedOperationException(format("Unknown unary operation %s", operator.getId()));
    };
  }

  public static State performUnary(State state, Operation operator, Number value)
          throws UnsupportedOperationException, IllegalArgumentException {
    return switch (operator) {
      case PUSH -> state.push(value);
      default -> throw new UnsupportedOperationException(format("Unknown unary operation %s", operator.getId()));
    };
  }

  public static State jump(State state, String labelId) throws StatementExecutionException {
    var label = state.getLabel(labelId);
    var lineToJump = label.getDefinitionLineNumber() + 1;
    return state.jumpTo(lineToJump);
  }
}
