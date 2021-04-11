package operation;

import statement.Statement;
import statement.StatementType;

public class StatementFactory {
  public static Statement createBinary(int lineNumber, Operation operator, String leftRegisterId, String rightRegisterId) {
    return new Statement(
            lineNumber,
            StatementType.BINARY_OPERATION_REGISTERS,
            state -> BinaryOperationExecutor.perform(operator, leftRegisterId, rightRegisterId, state)
    );
  }

  public static Statement createBinary(int lineNumber, Operation operator, String leftRegisterId, Number rightValue) {
    return new Statement(
            lineNumber,
            StatementType.BINARY_OPERATION_REGISTER_CONST,
            state -> BinaryOperationExecutor.perform(operator, leftRegisterId, rightValue, state)
    );
  }

  public static Statement createUnary(int lineNumber, Operation operation, String registerId) {
    return new Statement(
            lineNumber,
            StatementType.UNARY_OPERATION_REGISTER,
            state -> UnaryOperationExecutor.perform(state, operation, registerId)
    );
  }

  public static Statement createUnary(int lineNumber, Operation operation, Number value) {
    return new Statement(
            lineNumber,
            StatementType.UNARY_OPERATION_CONST,
            state -> UnaryOperationExecutor.perform(state, operation, value)
    );
  }

  public static Statement createJmp(int lineNumber, String labelId) throws OperationParsingError {
    return new Statement(
            lineNumber,
            StatementType.JMP,
            state -> UnaryOperationExecutor.jump(state, labelId)
    );
  }
}
