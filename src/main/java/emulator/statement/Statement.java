package emulator.statement;

import emulator.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.function.Function;

/**
 * Some operation which changes state of {@link State} of CPU
 */
@AllArgsConstructor
public class Statement implements Function<State, State> {
    private final Long statementIndex;
    private final StatementType type;
    private final Function<State, State> action;

    @Override
    public State apply(State state) {
        return action.apply(state);
    }
}
