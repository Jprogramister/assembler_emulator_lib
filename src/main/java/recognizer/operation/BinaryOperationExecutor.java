package recognizer.operation;

import recognizer.State;
import state.context.RegistersContext;

import java.util.Locale;

public class BinaryOperationExecutor {
    public static State execute(String operationId, String leftRegisterId, String rightRegisterId, Object state) {
        RegistersContext ctx = ((State) state).getRegistersContext();
        var leftValue = ctx.getRegisterValue(leftRegisterId);
        var rightValue = ctx.getRegisterValue(rightRegisterId);
        switch (operationId.toUpperCase(Locale.ROOT)) {
            case "ADD":
                ctx.setRegisterValue(leftRegisterId, leftValue.doubleValue() + rightValue.doubleValue());
                break;

            case "SUB":
                ctx.setRegisterValue(leftRegisterId, leftValue.doubleValue() - rightValue.doubleValue());
                break;

            default:
                return null;
        }
        return ((State) state);
    }
}
