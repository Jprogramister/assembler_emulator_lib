package operation;

import context.State;
import statement.StatementExecutionException;

public final class UnaryOperationExecutor {
  private UnaryOperationExecutor() {
  }

  public static State jump(State state, String labelId) throws StatementExecutionException {
    var statements = state.getStatements();
    var label = state.getLabelsContext().getLabel(labelId);
    var lineToJump = label.getDefinitionLineNumber() + 1;
    state.jumpTo(lineToJump);
    return state;
  }

  public static State perform(State state, Operation operator, String registerId)
          throws UnsupportedOperationException, IllegalArgumentException {
    requireUnaryOperation(operator);

    String id = operator.getId();
    if (id.equals(UnaryOperation.PUSH.getId())) {
      var value = state.getRegistersContext().getRegisterValue(registerId);
      state.getCallStack().push(value);
      return state;
    }

    if (id.equals(UnaryOperation.POP.getId())) {
      var value = state.getCallStack().pop();
      state.getRegistersContext().setRegisterValue(registerId, value);
      return state;
    }

    throw new UnsupportedOperationException(String.format("Unknown unary operation %s", operator.getId()));
  }

  public static State perform(State state, Operation operator, Number value)
          throws UnsupportedOperationException, IllegalArgumentException {
    requireUnaryOperation(operator);

    String id = operator.getId();
    if (id.equals(UnaryOperation.PUSH.getId())) {
      state.getCallStack().push(value);
      return state;
    }

    throw new UnsupportedOperationException(String.format("Unknown unary operation %s", operator.getId()));
  }

  private static void requireUnaryOperation(Operation operation) throws IllegalArgumentException {
    if (!(operation instanceof UnaryOperation)) {
      throw new IllegalArgumentException(
              String.format("Operation should be instance of UnaryOperation but %s accepted", operation.getClass().getName())
      );
    }
  }
}
