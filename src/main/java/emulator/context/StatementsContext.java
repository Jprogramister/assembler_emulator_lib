package emulator.context;

import emulator.State;
import emulator.statement.Statement;
import lombok.AllArgsConstructor;
import org.antlr.v4.runtime.tree.ParseTree;
import recognizer.AssemblerListener;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
public class StatementsContext {
    private final List<Statement> statements;

    public StatementsContext(ParseTree tree) {
        this.statements = AssemblerListener.generateStatements(tree);
    }

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
