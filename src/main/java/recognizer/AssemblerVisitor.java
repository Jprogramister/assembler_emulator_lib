package recognizer;

import antlr.AssemblerBaseVisitor;
import antlr.AssemblerParser;
import emulator.State;
import emulator.operation.Operation;
import emulator.operation.OperationParsingError;
import emulator.operation.instruction.InstructionStatementFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import emulator.statement.Statement;
import emulator.operation.binary.BinaryStatementsFactory;

import java.util.Map;
import java.util.Optional;

@Slf4j
class AssemblerVisitor extends AssemblerBaseVisitor<Statement> {
    @Getter
    private Map<String, Long> labelLine;

    @Override
    public Statement visitProgramm(AssemblerParser.ProgrammContext ctx) { return visitChildren(ctx); }

    @Override
    public Statement visitLabelDef(AssemblerParser.LabelDefContext ctx) { return visitChildren(ctx); }

    @Override
    public Statement visitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx) { return visitChildren(ctx); }

    @Override
    public Statement visitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx) { return visitChildren(ctx); }

    @Override
    public Statement visitUnaryOperator(AssemblerParser.UnaryOperatorContext ctx) { return visitChildren(ctx); }

    /**
     * Visits statement of type operator register1, register2
     */
    @Override
    public Statement visitBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx) {
        try {
            log.debug("AssemblerVisitor visited binaryExprRegisters");
            String operatorId = ctx.binaryOperator().getText();
            var leftRegister = ctx.register(0).getText();
            var rightRegister = ctx.register(1).getText();
            return BinaryStatementsFactory.create(
                    ctx.getStart().getLine(),
                    Operation.parse(operatorId),
                    leftRegister, rightRegister
            );
        }
        catch (OperationParsingError ex) {
            log.error("Binary operation parsing error", ex);
            return null;
        }
    }

    /**
     * Visits statement of type operator register, const
     */
    @Override
    public Statement visitBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx) {
        try {
            log.debug("AssemblerVisitor visited binaryExprRegisterConst");
            String operatorId = ctx.binaryOperator().getText();
            var leftRegisterId = ctx.register().getText();
            var rightConstValue = Double.valueOf(ctx.NUMBER().getText());
            return BinaryStatementsFactory.create(
                    ctx.getStart().getLine(),
                    Operation.parse(operatorId),
                    leftRegisterId, rightConstValue
            );
        }
        catch (OperationParsingError ex) {
            log.error("Binary operation parsing error ", ex);
            return null;
        }
    }

    @Override
    public Statement visitUnaryOperationLabelJump(AssemblerParser.UnaryOperationLabelJumpContext ctx) {
        try {
            log.debug("AssemblerVisitor visited unaryOperationLabelJump");
            String labelId = ctx.ID().getText();
            return InstructionStatementFactory.createJmpStatement(
                    ctx.getStart().getLine(),
                    labelId
            );
        }
        catch (OperationParsingError ex) {
            log.error("Visit unary operation label jump error", ex);
            return null;
        }
    }
}
