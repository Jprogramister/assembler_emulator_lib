package operation.unary;

import operation.Operation;
import operation.OperationParsingError;
import statement.Statement;
import statement.StatementType;

public final class UnaryStatementFactory {
    private UnaryStatementFactory() { }

    public static Statement create(int lineNumber, Operation operation, String registerId) {
        return new Statement(
                lineNumber,
                StatementType.UNARY_OPERATION_REGISTER,
                state -> UnaryOperationExecutor.perform(state, operation, registerId)
        );
    }

    public static Statement create(int lineNumber, Operation operation, Number value) {
        return new Statement(
              lineNumber,
              StatementType.UNARY_OPERATION_CONST,
              state -> UnaryOperationExecutor.perform(state, operation, value)
        );
    }

    public static Statement createJmpStatement(int lineNumber, String labelId) throws OperationParsingError {
        return new Statement(
                lineNumber,
                StatementType.JMP,
                state -> UnaryOperationExecutor.jump(state, labelId)
        );
    }
}
