package recognizer;

import antlr.AssemblerBaseListener;
import antlr.AssemblerParser;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import emulator.statement.Statement;

import java.util.Collections;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
class AssemblerListener extends AssemblerBaseListener {
    @Getter
    private List<Statement> statements;
    private final AssemblerVisitor assemblerVisitor;

    /**
     * Walks on tree and create list of statements
     * @param tree tree to walk
     * @return {@link List<Statement>}
     */
    public static List<Statement> walk(ParseTree tree) {
        var visitor = new AssemblerVisitor();
        var listener = new AssemblerListener(visitor);
        var walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        return Collections.unmodifiableList(listener.getStatements());
    }

    /**
     * Visit of expression which uses two arguments - registers
     */
    @Override
    public void exitBinaryExprRegisters(AssemblerParser.BinaryExprRegistersContext ctx) {
        log.debug("listen binary expression");
        Statement statement = assemblerVisitor.visit(ctx);
        statements.add(statement);
    }

    /**
     *  Visit of expression which uses two arguments - register and number literal
     */
    @Override
    public void exitBinaryExprRegisterConst(AssemblerParser.BinaryExprRegisterConstContext ctx) {
        log.debug("listen binary expression");
        Statement statement = assemblerVisitor.visit(ctx);
        statements.add(statement);
    }
}
