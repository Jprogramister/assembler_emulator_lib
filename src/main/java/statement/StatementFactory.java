package statement;

import exception.OperationParsingError;

import static statement.Statement.Type.*;

public class StatementFactory {
  public static Statement createBinary(int lineNumber, Operation operation, String lvalueRegister, String rvalueRegister) {
    return new Statement(lineNumber, BINARY_OPERATION_REGISTERS,
            state -> Executor.performBinary(state, operation, lvalueRegister, rvalueRegister));
  }

  public static Statement createBinary(int lineNumber, Operation operation, String register, Number rvalue) {
    return new Statement(lineNumber, BINARY_OPERATION_REGISTER_CONST,
            state -> Executor.performBinary(state, operation, register, rvalue));
  }

  public static Statement createUnary(int lineNumber, Operation operation, String registerId) {
    return new Statement(lineNumber, UNARY_OPERATION_REGISTER,
            state -> Executor.performUnary(state, operation, registerId));
  }

  public static Statement createUnary(int lineNumber, Operation operation, Number value) {
    return new Statement(lineNumber, UNARY_OPERATION_CONST,
            state -> Executor.performUnary(state, operation, value));
  }

  public static Statement createJmp(int lineNumber, String labelId) throws OperationParsingError {
    return new Statement(lineNumber, JMP, state -> Executor.jump(state, labelId));
  }
}
