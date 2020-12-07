package emulator.operation.unary;

import emulator.State;
import emulator.operation.Operation;

public final class UnaryOperationExecutor {
    private UnaryOperationExecutor() { }

    public static State perform(State state, Operation operation, String registerId) {
        return null;
    }

    public static State perform(State state, Operation operator, Number rightValue) {
        requireBinaryOperation(operator);
        return null;
    }

    private static void requireBinaryOperation(Operation operation) throws IllegalArgumentException {
        if (!(operation instanceof UnaryOperation)) {
            throw new IllegalArgumentException(
                    String.format("Operation should be instance of UnaryOperation but %s accepted", operation.getClass().getName())
            );
        }
    }
}
