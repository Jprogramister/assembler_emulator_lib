package emulator;

import lombok.Builder;
import org.antlr.v4.runtime.CharStream;
import recognizer.Recognizer;

import java.util.ArrayList;
import java.util.List;

@Builder
public class Emulator {
    private final List<State> statementsCache = new ArrayList<>();

    @Getter private State currentState;
    @Getter private int currentStatementIndex = 0;

    public static Emulator newFromCharStream(CharStream stream) {
        return new Emulator(Recognizer.recognizeCode(stream));
    }

    public void stepAll() {
        while (stepUp()) {}
    }

    public synchronized boolean toStatement(int index) {
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

    private void validateIndexOfStatement(int index) throws IllegalArgumentException {
        if (index < 0 || index >= currentState.getStatements().size()) {
            throw IllegalArgumentException(
                    String.format("Have not statement for index %s. Current statements amount %d", index, currentState.getStatements().size())
            );
        }
    }

    private synchronized Optional<State> stepUp() {
        if (currentStatementIndex < currentState.getStatements().size()) {
            currentState = currentState.getStatements().get(currentStatementIndex).apply(currentState);
            statementsCache.add(currentState);
            currentStatementIndex++;
            return Optional.of(currentState);
        }
        return Optional.empty();
    }

    private synchronized Optional<State> stepBack() {
        if (currentStatementIndex > 0) {
            currentStatementIndex--;
            currentState = statementsCache.get(currentStatementIndex);
            return Optional.of(currentState);
        }
        return Optional.empty();
    }
}
