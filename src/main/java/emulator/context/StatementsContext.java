package emulator.context;

import emulator.statement.Statement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class StatementsContext {
    private final List<Statement> statements = new ArrayList<>();
    /**
     * Next instruction for execution
     */
    @Getter
    private long currentStatement = 0;

    public int size() {
        return statements.size();
    }

    public Statement get(int index) {
        return statements.get(index);
    }

    public void add(Statement s) {
        statements.add(s);
    }

    public void setCurrentStatement(long statementIndex) throws Exception {
        if (statementIndex >= statements.size() || statementIndex < 0) {
            throw new Exception(String.format("Can not set statement at index %d", statementIndex));
        }
        currentStatement = statementIndex;
    }

    public void stepUp() throws Exception {
        setCurrentStatement(getCurrentStatement() + 1);
    }

    public void stepBack() throws Exception {
        setCurrentStatement(getCurrentStatement() - 1);
    }
}
