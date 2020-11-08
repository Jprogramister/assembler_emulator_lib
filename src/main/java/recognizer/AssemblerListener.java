package recognizer;

import antlr.AssemblerBaseListener;
import recognizer.statement.BinaryStatementsFactory;
import recognizer.statement.Statement;

public class AssemblerListener extends AssemblerBaseListener {
    /**
     * Visit of expression which uses two arguments - registers
     */
//    @Override
//    public void exitBinaryExprRegisters(AssemblerParserParser.BinaryExprRegistersContext ctx) {
//        System.out.println("visit binary expresssiong");
//        String operatorId = ctx.binaryOperator().getText();
//        var leftRegister = ctx.register(0).getText();
//        var rightRegister = ctx.register(1).getText();
//        // return BinaryStatementsFactory.create(operatorId, leftRegister, rightRegister);
//    }
//
//    /**
//     *  Visit of expression which uses two arguments - register and number literal
//     */
//    @Override
//    public void exitBinaryExprRegisterConst(AssemblerParserParser.BinaryExprRegisterConstContext ctx) {
//        System.out.println("visit binary expresssiong");
//        String operatorId = ctx.binaryOperator().getText();
//        var leftRegisterId = ctx.register().getText();
//        var rightConstValue = Double.valueOf(ctx.NUMBER().getText());
//        // return BinaryStatementsFactory.create(operatorId, leftRegisterId, rightConstValue);
//    }
}
