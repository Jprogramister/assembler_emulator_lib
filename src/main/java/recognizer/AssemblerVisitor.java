package recognizer;

import antlr.AssemblerBaseVisitor;
import antlr.AssemblerParser;
import lombok.extern.slf4j.Slf4j;
import emulator.statement.Statement;
import emulator.statement.BinaryStatementsFactory;

@Slf4j
class AssemblerVisitor extends AssemblerBaseVisitor<Statement> {
    /**
     * Visits of expression which uses two arguments - registers
     */
    @Override
    public Statement visitBinaryExprRegisters(AssemblerParser.BinaryExprRegistersContext ctx) {
        log.debug("AssemblerVisitor visited binaryExprRegisters");
        String operatorId = ctx.binaryOperator().getText();
        var leftRegister = ctx.register(0).getText();
        var rightRegister = ctx.register(1).getText();
        return BinaryStatementsFactory.create(operatorId, leftRegister, rightRegister);
    }

    /**
     *  Visits of expression which uses two arguments - register and number literal
     */
    @Override
    public Statement visitBinaryExprRegisterConst(AssemblerParser.BinaryExprRegisterConstContext ctx) {
        System.out.println("AssemblerVisitor visited binaryExprRegisterConst");
        String operatorId = ctx.binaryOperator().getText();
        var leftRegisterId = ctx.register().getText();
        var rightConstValue = Double.valueOf(ctx.NUMBER().getText());
        return BinaryStatementsFactory.create(operatorId, leftRegisterId, rightConstValue);
    }
}
