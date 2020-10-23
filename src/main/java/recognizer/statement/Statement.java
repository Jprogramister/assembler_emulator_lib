package recognizer.statement;

import recognizer.State;

import java.util.function.Function;

/**
 * Some operation which changes state of {@link State} of CPU
 */
@FunctionalInterface
public interface Statement extends Function<State, State> {

}
