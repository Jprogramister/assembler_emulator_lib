package emulator.statement;

import emulator.State;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class StateMachine {
    private final List<State> cache = new ArrayList<>();
    private final List<Statement> statements;
    private final State initialState;

    public State goNext() throws IndexOutOfBoundsException, StatementExecutionException {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Can not execute next statements statements list is over");
        }
        if (isCached(getStatementIndex())) {
            incStatementIndex();
            return cache.get(getStatementIndex());
        } else {
            return executeCurrent();
        }
    }

    private State executeCurrent() throws StatementExecutionException {
        var currentStatement = getCurrentStatement();
        var currentState = getCurrentState();
        var nextState = currentStatement.apply(currentState);

        incStatementIndex();
        cache.add(nextState);
        return nextState;
    }

    public boolean hasNext() {
        return getStatementIndex() != statements.size();
    }

    public boolean hasPrev() {
        return getStatementIndex() != 0;
    }

    public Statement getCurrentStatement() {
        return statements.get(getStatementIndex());
    }

    private State getCurrentState() {
        if (getStatementIndex() == 0) {
            return initialState;
        }
        return cache.get(getStatementIndex() - 1);
    }

    private boolean isCached(int statementIndex) {
        return statementIndex < cache.size() - 1;
    }

    public State goBack() throws IndexOutOfBoundsException {
        if (!hasPrev()) {
            throw new IndexOutOfBoundsException("Can not execute next statements statements list is over");
        }
        decStatementIndex();
        return cache.get(getStatementIndex());
    }

    private void incStatementIndex() {
        var statementsCtx = initialState.getStatementsContext();
        var index = statementsCtx.getCurrentStatementIndex();
        statementsCtx.setCurrentStatementIndex(index + 1);
    }

    private void decStatementIndex() {
        var statementsCtx = initialState.getStatementsContext();
        var index = statementsCtx.getCurrentStatementIndex();
        statementsCtx.setCurrentStatementIndex(index - 1);
    }

    public int getStatementIndex() {
        return initialState.getStatementsContext().getCurrentStatementIndex();
    }
}
