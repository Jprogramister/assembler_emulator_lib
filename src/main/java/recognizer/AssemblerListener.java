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
        var listener = new AssemblerListener(new AssemblerVisitor());
        var walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        return Collections.unmodifiableList(listener.getStatements());
    }

    @Override
    public void exitLabelDef(AssemblerParser.LabelDefContext ctx) { }

    @Override
    public void exitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx) { }

    @Override
    public void exitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx) { }

    @Override
    public void exitUnaryOperator(AssemblerParser.UnaryOperatorContext ctx) { }

    @Override
    public void exitBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx) {
        log.debug("listen binary expression");
        Statement statement = assemblerVisitor.visit(ctx);
        statements.add(statement);
    }

    @Override
    public void exitBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx) {
        log.debug("listen binary expression");
        Statement statement = assemblerVisitor.visit(ctx);
        statements.add(statement);
    }

    @Override
    public void exitBinaryOperator(AssemblerParser.BinaryOperatorContext ctx) { }

    @Override
    public void exitInstruction(AssemblerParser.InstructionContext ctx) { }
}
