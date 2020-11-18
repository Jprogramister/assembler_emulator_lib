package emulator.operation;

import emulator.State;
import emulator.context.RegistersContext;

import java.util.Locale;

/**
 * Aggregate of functions that perform binary operators
 */
public class BinaryOperationExecutor {
    /**
     * Executes operator which uses two registers ids
     * @param operator string id of operator
     * @param leftRegisterId leftvalue register
     * @param rightRegisterId rightvalue register
     * @param state state which will changed after operator execution
     * @return new or old changed state
     */
    public static State perform(String operator, String leftRegisterId, String rightRegisterId, State state) {
        RegistersContext ctx = state.getRegistersContext();
        var rightValue = ctx.getRegisterValue(rightRegisterId);
        return perform(operator, leftRegisterId, rightValue, state);
    }

    /**
     * Executes operator which uses two registers ids
     * @param operator string id of operator
     * @param leftRegisterId leftvalue register id
     * @param rightValue rightvalue number
     * @param state state which will changed after operator execution
     * @return new or old changed state
     */
    public static State perform(String operator, String leftRegisterId, Number rightValue, State state) {
        RegistersContext ctx = state.getRegistersContext();
        var leftValue = ctx.getRegisterValue(leftRegisterId);
        switch (operator.toUpperCase(Locale.ROOT)) {
            case "ADD":
                ctx.cloneAndSet(leftRegisterId, leftValue.doubleValue() + rightValue.doubleValue());
                break;

            case "SUB":
                ctx.cloneAndSet(leftRegisterId, leftValue.doubleValue() - rightValue.doubleValue());
                break;

            default:
                return null;
        }
        return state;
    }
}
