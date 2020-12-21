package emulator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.CharStream;
import recognizer.Recognizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class Emulator {
    private final List<State> statementsCache = new ArrayList<>();
    @Getter
    private int currentStatementIndex;
    @Getter
    private State currentState;

    public Emulator(State initialState) {
        this.currentState = initialState;
    }

    /**
     * Creates {@link Emulator} from stream
     * @param stream with assembler code
     * @return new statement of {@link Emulator}
     */
    public Emulator(CharStream stream) {
        this(Recognizer.recognize(stream));
    }

    /**
     * Do all available statements
     */
    public void doAllStatements() throws Exception {
        while (stepUp().isPresent()) {}
    }

    /**
     * Changes {@link Emulator#currentState} step by step to the state at specified index
     * @param index
     */
    public synchronized void toStatement(int index) throws Exception {
        validateIndexOfStatement(index);
        while (currentStatementIndex != index) {
            if (currentStatementIndex > index) {
                stepBack();
            }
            else {
                stepUp();
            }
        }
    }

    /**
     * Validates index for getting element from statements list
     * @param index to validation
     * @throws IllegalArgumentException if index is not valid
     */
    private void validateIndexOfStatement(int index) throws IllegalArgumentException {
        if (index < 0 || index >= currentState.getStatementsContext().size()) {
            throw new IllegalArgumentException(
                    String.format("Have not statement for index %s. Current statements amount %d", index, currentState.getStatementsContext().size())
            );
        }
    }

    /**
     * Changes {@link Emulator#currentState} to next if able
     * @return new value of {@link Emulator#currentState} or empty optional value if next state is not exists
     */
    private synchronized Optional<State> stepUp() throws Exception {
        if (currentStatementIndex >= currentState.getStatementsContext().size()) {
            return Optional.empty();
        }
        executeCurrentStatement();
        return Optional.of(currentState);
    }

    /**
     * Executes current statement, saves current statement to statements history and increments statements index
     */
    private void executeCurrentStatement() throws Exception {
        currentState = currentState
                .getStatementsContext()
                .get(currentStatementIndex)
                .apply(currentState);
        statementsCache.add(currentState);
        currentStatementIndex++;
    }

    /**
     * Rollbacks {@link Emulator#currentState} to previous state
     * @return new value of {@link Emulator#currentState} or empty optional value if previous state is not exists
     */
    private synchronized Optional<State> stepBack() {
        if (currentStatementIndex < 0) {
            return Optional.empty();
        }
        rollbackToPreviousStatement();
        return Optional.of(currentState);
    }

    /**
     * Decrements statements index and sets previous state as current
     */
    private void rollbackToPreviousStatement() {
        currentStatementIndex--;
        currentState = statementsCache.get(currentStatementIndex);
    }
}
