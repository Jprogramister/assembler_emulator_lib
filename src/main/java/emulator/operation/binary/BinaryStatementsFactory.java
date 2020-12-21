package emulator.operation.binary;

import emulator.State;
import emulator.operation.Operation;
import emulator.statement.Statement;
import emulator.statement.StatementType;

import java.util.function.Function;

/**
 * Factory for making Statements
 */
public final class BinaryStatementsFactory {
    private BinaryStatementsFactory() { }

    public static Statement create(int lineNumber, Operation operator, String leftRegisterId, String rightRegisterId) {
       return new Statement(
               lineNumber,
               StatementType.BINARY_OPERATION_REGISTERS,
               state -> BinaryOperationExecutor.perform(operator, leftRegisterId, rightRegisterId, state)
       );
    }

    public static Statement create(int lineNumber, Operation operator, String leftRegisterId, Number rightValue) {
        return new Statement(
                lineNumber,
                StatementType.BINARY_OPERATION_REGISTER_CONST,
                state -> BinaryOperationExecutor.perform(operator, leftRegisterId, rightValue, state)
        );
    }
}
