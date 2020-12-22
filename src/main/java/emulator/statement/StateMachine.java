package emulator.statement;

import emulator.State;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class StateMachine {
    private final List<State> cache = new ArrayList<>();
    @Getter
    private int currentIndex;
    private final List<Statement> statements;
    private final State initialState;

    public State goNext() throws IndexOutOfBoundsException, StatementExecutionException {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Can not execute next statements statements list is over");
        }
        if (isCached(currentIndex)) {
            ++currentIndex;
            return cache.get(currentIndex);
        } else {
            return executeCurrent();
        }
    }

    private State executeCurrent() throws StatementExecutionException {
        var currentStatement = getCurrentStatement();
        var currentState = getCurrentState();
        var nextState = currentStatement.apply(currentState);

        ++currentIndex;
        cache.add(nextState);
        return nextState;
    }

    public boolean hasNext() {
        return currentIndex != statements.size();
    }

    public boolean hasPrev() {
        return currentIndex != 0;
    }

    public Statement getCurrentStatement() {
        return statements.get(currentIndex);
    }

    private State getCurrentState() {
        if (currentIndex == 0) {
            return initialState;
        }
        return cache.get(currentIndex - 1);
    }

    private boolean isCached(int statementIndex) {
        return statementIndex < cache.size() - 1;
    }

    public State goBack() throws IndexOutOfBoundsException {
        if (!hasPrev()) {
            throw new IndexOutOfBoundsException("Can not execute next statements statements list is over");
        }
        --currentIndex;
        return cache.get(currentIndex);
    }
}
