package recognizer.statement;

import lombok.AllArgsConstructor;
import recognizer.State;
import recognizer.operation.BinaryOperationExecutor;

public class BinaryOperationStatementFactory {
//    private final String operatorId;
//    private final String leftRegisterId;
//    private final String rightRegisterId;

    public BaseStatement create(String operatorId, String leftRegisterId, String rightRegisterId) {
        return state -> BinaryOperationExecutor.execute(operatorId, leftRegisterId, rightRegisterId, state);
    }
}
