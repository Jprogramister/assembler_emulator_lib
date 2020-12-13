package recognizer;

import antlr.AssemblerBaseListener;
import antlr.AssemblerParser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import emulator.statement.Statement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@NoArgsConstructor
public class AssemblerListener extends AssemblerBaseListener {
    @Getter
    private List<Statement> statements = new ArrayList<Statement>();
    private final AssemblerVisitor assemblerVisitor = new AssemblerVisitor();

    public static List<Statement> generateStatements(ParseTree tree) {
        var listener = new AssemblerListener();
        new ParseTreeWalker().walk(listener, tree);
        return listener.getStatements();
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
