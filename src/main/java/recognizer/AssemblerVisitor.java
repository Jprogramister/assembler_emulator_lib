package recognizer;

import antlr.AssemblerParserBaseVisitor;
import antlr.AssemblerParserParser;
import recognizer.statement.Statement;
import recognizer.statement.BinaryStatementsFactory;

public class AssemblerVisitor extends AssemblerParserBaseVisitor<Statement> {
    /**
     * Visit of expression which uses two arguments - registers
     */
    @Override
    public Statement visitBinaryExprRegisters(AssemblerParserParser.BinaryExprRegistersContext ctx) {
        String operatorId = ctx.binaryOperator().getText();
        var leftRegister = ctx.register(0).getText();
        var rightRegister = ctx.register(1).getText();
        return BinaryStatementsFactory.create(operatorId, leftRegister, rightRegister);
    }

    /**
     *  Visit of expression which uses two arguments - register and number literal
     */
    @Override
    public Statement visitBinaryExprRegisterConst(AssemblerParserParser.BinaryExprRegisterConstContext ctx) {
        String operatorId = ctx.binaryOperator().getText();
        var leftRegisterId = ctx.register().getText();
        var rightConstValue = Double.valueOf(ctx.NUMBER().getText());
        return BinaryStatementsFactory.create(operatorId, leftRegisterId, rightConstValue);
    }
}
