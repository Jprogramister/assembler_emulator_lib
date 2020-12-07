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

    public static Statement create(Operation operator, String leftRegisterId, String rightRegisterId) {
       return create(
               StatementType.BINARY_OPERATION_REGISTERS,
               state -> BinaryOperationExecutor.perform(operator, leftRegisterId, rightRegisterId, state)
       );
    }

    public static Statement create(Operation operator, String leftRegisterId, Number rightValue) {
        return create(
                StatementType.BINARY_OPERATION_REGISTER_CONST,
                state -> BinaryOperationExecutor.perform(operator, leftRegisterId, rightValue, state)
        );
    }

    /**
     * Creates {@link Statement} by statement type and action
     * @param type statement type
     * @param action actions of statement
     * @return new {@link Statement} instance
     */
    public static Statement create(StatementType type, Function<State, State> action) {
        return Statement.builder()
                .action(action)
                .type(type)
                .build();
    }
}
