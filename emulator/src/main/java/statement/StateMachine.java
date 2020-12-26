package statement;

import context.State;

import java.util.ArrayList;
import java.util.List;

public class StateMachine {
    private final List<State> cache = new ArrayList<>();
    private final List<Statement> statements;
    private final State initialState;

    public StateMachine(State initialState) {
        this.initialState = initialState;
        statements = initialState.getStatementsContext().getStatements();
    }

    /**
     * Executes current statement and move current index to next statement
     * @return next state created by execution current statement
     * @throws IndexOutOfBoundsException if there is not statement to execute
     * @throws StatementExecutionException if some error on current statement execution occurred
     */
    public State stepOver() throws IndexOutOfBoundsException, StatementExecutionException {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Can not execute next statements statements list is over");
        }
        if (isCached(getCurrentIndex())) {
            incStatementIndex();
            return cache.get(getCurrentIndex());
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
        return getCurrentIndex() < statements.size();
    }

    public boolean hasPrev() {
        return getCurrentIndex() != 0;
    }

    public Statement getCurrentStatement() {
        return statements.get(getCurrentIndex());
    }

    private State getCurrentState() {
        if (getCurrentIndex() == 0) {
            return initialState;
        }
        return cache.get(getCurrentIndex() - 1);
    }

    private boolean isCached(int statementIndex) {
        return statementIndex < cache.size() - 1;
    }

    public State stepBack() throws IndexOutOfBoundsException {
        if (!hasPrev()) {
            throw new IndexOutOfBoundsException("Can not execute next statements statements list is over");
        }
        decStatementIndex();
        return cache.get(getCurrentIndex());
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

    public int getCurrentIndex() {
        return initialState.getStatementsContext().getCurrentStatementIndex();
    }
}
