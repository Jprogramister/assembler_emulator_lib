package recognizer;

import antlr.AssemblerBaseListener;
import antlr.AssemblerParser;
import emulator.State;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import emulator.statement.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@NoArgsConstructor
public class AssemblerListener extends AssemblerBaseListener {
    @Getter
    private List<Statement> statements = new ArrayList<Statement>();
    @Getter
    private Map<String, Long> labelLine = new HashMap<>();
    private final AssemblerVisitor assemblerVisitor = new AssemblerVisitor();

    public static List<Statement> generateStatements(ParseTree tree) {
        var listener = new AssemblerListener();
        new ParseTreeWalker().walk(listener, tree);
        return listener.getStatements();
    }

    @Override
    public void exitLabelDef(AssemblerParser.LabelDefContext ctx) {
        long lineNumber = ctx.getStart().getLine();
        String labelId = ctx.ID().getText();
        labelLine.put(labelId, lineNumber);
    }

    @Override
    public void exitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx) { }

    @Override
    public void exitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx) { }

    @Override
    public void exitUnaryOperator(AssemblerParser.UnaryOperatorContext ctx) { }

    @Override
    public void exitBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx) {
        add(assemblerVisitor.visit(ctx));
    }

    @Override
    public void exitBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx) {
        add(assemblerVisitor.visit(ctx));
    }

    @Override
    public void enterUnaryOperationLabelJump(AssemblerParser.UnaryOperationLabelJumpContext ctx) {
        add(assemblerVisitor.visit(ctx));
    }

    private void add(@NonNull Statement s) {
        statements.add(s);
    }
}
