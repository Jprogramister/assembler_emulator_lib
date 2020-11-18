package emulator.statement;

import emulator.operation.BinaryOperationExecutor;

/**
 * Factory for making Statements
 */
public class BinaryStatementsFactory {

    /**
     *
     * @param operator string id of operator
     * @param lvalueRegister id of lvalue register
     * @param rightRegisterId id of rightvalue register
     * @return {@link Statement}
     */
    public static Statement create(String operator, String lvalueRegister, String rightRegisterId) {
        return state -> BinaryOperationExecutor.perform(operator, lvalueRegister, rightRegisterId, state);
    }

    public static Statement create(String operator, String lvalueRegister, Number value) {
        return state -> BinaryOperationExecutor.perform(operator, lvalueRegister, value, state);
    }
}
