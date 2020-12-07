package emulator.context;

import emulator.State;
import emulator.statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StatementsContext {
    private final List<Statement> statements = new ArrayList<>();

    public StatementsContext clone() {
        return this;
    }

    public int size() {
        return statements.size();
    }

    public Statement get(int index) {
        return statements.get(index);
    }
}
