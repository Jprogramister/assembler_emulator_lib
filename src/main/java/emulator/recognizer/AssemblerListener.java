 package emulator.recognizer;

import emulator.antlr.AssemblerBaseListener;
import emulator.antlr.AssemblerParser;
import emulator.context.LabelDefinitionException;
import emulator.context.LabelsContext;
import emulator.context.StatementsContext;
import emulator.statement.StatementType;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import emulator.statement.Statement;

@Slf4j
@NoArgsConstructor
public class AssemblerListener extends AssemblerBaseListener {
    @Getter
    private final StatementsContext statementsContext = new StatementsContext();
    @Getter
    private final LabelsContext labelsContext = new LabelsContext();
    private final AssemblerVisitor assemblerVisitor = new AssemblerVisitor();

    @Override
    public void exitLabelDef(AssemblerParser.LabelDefContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        try {
            String labelId = ctx.ID().getText();
            labelsContext.register(labelId, lineNumber);
            add(new Statement(lineNumber, StatementType.LABEL_DEFINITION, state -> state));
        } catch (LabelDefinitionException e) {
            log.error("Label definition error", e);
            add(new Statement(lineNumber, StatementType.ERROR_STATEMENT, state -> null));
        }
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
        statementsContext.add(s);
    }
}
