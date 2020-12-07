package emulator.statement;

import emulator.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.function.Function;

/**
 * Some operation which changes state of {@link State} of CPU
 */
@Builder
public abstract class Statement implements Function<State, State> {
    @Getter protected final StatementType type;
    protected final Function<State, State> action;
}
