package operation.binary;

import context.RegistersContext;
import context.State;
import operation.Operation;

/**
 * Aggregation of functions that perform binary operators
 */
public final class BinaryOperationExecutor {
  private BinaryOperationExecutor() {
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
  public static State perform(Operation operator, String leftRegisterId, String rightRegisterId, State state) {
    RegistersContext ctx = state.getRegistersContext();
    var rightValue = ctx.getRegisterValue(rightRegisterId);
    return perform(operator, leftRegisterId, rightValue, state);
  }

  /**
   * Executes operator which uses register id and numerical literal
   *
   * @param operator       string id of operator
   * @param leftRegisterId left value register id
   * @param rightValue     right value number
   * @param state          state which will changed after operator execution
   * @return new or old changed state
   */
  public static State perform(Operation operator, String leftRegisterId, Number rightValue, State state) {
    requireBinaryOperation(operator);

    RegistersContext ctx = state.getRegistersContext();
    var leftValue = ctx.getRegisterValue(leftRegisterId);
    var id = operator.getId();

    if (id.equals(BinaryOperation.ADD.getId())) {
      return state.cloneWithRegisters(
              ctx.cloneAndSet(leftRegisterId, leftValue.doubleValue() + rightValue.doubleValue())
      );
    }

    if (id.equals(BinaryOperation.SUB.getId())) {
      return state.cloneWithRegisters(
              ctx.cloneAndSet(leftRegisterId, leftValue.doubleValue() - rightValue.doubleValue())
      );
    }

    if (id.equals(BinaryOperation.MOV.getId())) {
      return state.cloneWithRegisters(
              ctx.cloneAndSet(leftRegisterId, rightValue)
      );
    }

    throw new UnsupportedOperationException(String.format("Cannot execute operation %s ", id));
  }

  private static void requireBinaryOperation(Operation operation) throws IllegalArgumentException {
    if (!(operation instanceof BinaryOperation)) {
      throw new IllegalArgumentException(
              String.format("Operation should be instance of BinaryOperation but %s accepted", operation.getClass().getName())
      );
    }
  }
}
