package calculatorImpl;

import java.util.HashMap;
import java.util.Map;

public class CalculatorVisitorImpl extends CalculatorBaseVisitor<Integer> {
    private final Map<String, Integer> varsTable = new HashMap<String, Integer>();

    @Override
    public Integer visitProg(CalculatorParser.ProgContext ctx) {
        System.out.println("Starting calculator pgoram...");
        return 0;
    }

    @Override
    public Integer visitStatPrint(CalculatorParser.StatPrintContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitStatAssign(CalculatorParser.StatAssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        varsTable.put(id, value);
        return value;
    }

    @Override
    public Integer visitStatBlank(CalculatorParser.StatBlankContext ctx) {
        System.out.println("");
        return 0;
    }

    @Override
    public Integer visitExprInt(CalculatorParser.ExprIntContext ctx) {
        System.out.println(ctx.INT().getText());
        return 0;
    }

    @Override
    public Integer visitExprId(CalculatorParser.ExprIdContext ctx) {
        String id = ctx.ID().getText();
        if (!varsTable.containsKey(id)) {
            throw new RuntimeException(String.format("Unknown variable identificator %s", id));
        }
        return varsTable.get(id);
    }

    @Override
    public Integer visitExprParens(CalculatorParser.ExprParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitExprArithmeticOperator(CalculatorParser.ExprArithmeticOperatorContext ctx) {
        int lvalue = visit(ctx.expr(0));
        int rvalue = visit(ctx.expr(1));
        return compute(lvalue, rvalue, ctx.operator.getType());
    }

    private Integer compute(Integer lvalue, Integer rvalue, int operatorType) {
        switch (operatorType) {
            case CalculatorParser.ADD: return lvalue + rvalue;
            case CalculatorParser.SUB: return lvalue - rvalue;
            case CalculatorParser.MUL: return lvalue * rvalue;
            case CalculatorParser.DIV: return lvalue / rvalue;
            default:
                throw new RuntimeException(String.format("Unknown arithmetic operator %d", operatorType));
        }
    }
}
