package recognizer;

import antlr.AssemblerBaseVisitor;
import antlr.AssemblerParser;
import emulator.operation.Operation;
import emulator.operation.OperationParsingError;
import lombok.extern.slf4j.Slf4j;
import emulator.statement.Statement;
import emulator.operation.binary.BinaryStatementsFactory;

@Slf4j
class AssemblerVisitor extends AssemblerBaseVisitor<Statement> {

    @Override
    public Statement visitProgramm(AssemblerParser.ProgrammContext ctx) { return visitChildren(ctx); }

    @Override
    public Statement visitStat(AssemblerParser.StatContext ctx) { return visitChildren(ctx); }

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
            return BinaryStatementsFactory.create(Operation.parse(operatorId), leftRegister, rightRegister);
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
            System.out.println("AssemblerVisitor visited binaryExprRegisterConst");
            String operatorId = ctx.binaryOperator().getText();
            var leftRegisterId = ctx.register().getText();
            var rightConstValue = Double.valueOf(ctx.NUMBER().getText());
            return BinaryStatementsFactory.create(Operation.parse(operatorId), leftRegisterId, rightConstValue);
        }
        catch (OperationParsingError ex) {
            log.error("Binary operation parsing error ", ex);
            return null;
        }
    }

    /**
     * Visit instruction (statement without any arguments)
     */
    @Override
    public Statement visitInstruction(AssemblerParser.InstructionContext ctx) { return visitChildren(ctx); }
}
