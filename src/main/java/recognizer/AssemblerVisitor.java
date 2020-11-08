package recognizer;

import antlr.AssemblerBaseVisitor;
import antlr.AssemblerParser;
import recognizer.statement.Statement;
import recognizer.statement.BinaryStatementsFactory;

public class AssemblerVisitor extends AssemblerBaseVisitor<Statement> {

    /**
     * Visit of expression which uses two arguments - registers
     */
    @Override
    public Statement visitBinaryExprRegisters(AssemblerParser.BinaryExprRegistersContext ctx) {
        System.out.println("visit binary expresssiong");
        String operatorId = ctx.binaryOperator().getText();
        var leftRegister = ctx.register(0).getText();
        var rightRegister = ctx.register(1).getText();
        return BinaryStatementsFactory.create(operatorId, leftRegister, rightRegister);
    }

    /**
     *  Visit of expression which uses two arguments - register and number literal
     */
    @Override
    public Statement visitBinaryExprRegisterConst(AssemblerParser.BinaryExprRegisterConstContext ctx) {
        System.out.println("visit binary expresssiong");
        String operatorId = ctx.binaryOperator().getText();
        var leftRegisterId = ctx.register().getText();
        var rightConstValue = Double.valueOf(ctx.NUMBER().getText());
        return BinaryStatementsFactory.create(operatorId, leftRegisterId, rightConstValue);
    }
}
