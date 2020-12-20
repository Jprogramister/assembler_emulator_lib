package emulator.statement;

import emulator.State;
import emulator.operation.instruction.StatementAction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.function.Function;

/**
 * Some operation which changes state of {@link State} of CPU
 */
@AllArgsConstructor
public class Statement implements StatementAction<State, State> {

    /**
     * Line number where statement is located
     */
    private final Long statementIndex;
    private final StatementType type;
    private final StatementAction<State, State> action;

    @Override
    public State apply(State state) throws Exception {
        return action.apply(state);
    }
}
