package recognizer;

import antlr.AssemblerBaseListener;
import antlr.AssemblerParser;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import recognizer.statement.Statement;
import java.util.List;

@Slf4j
class AssemblerListener extends AssemblerBaseListener {
    @Getter
    private List<Statement> statements;
    private AssemblerVisitor assemblerVisitor;

    public AssemblerListener(final AssemblerVisitor visitor) {
        this.assemblerVisitor = visitor;
    }

    /**
     * Visit of expression which uses two arguments - registers
     */
    @Override
    public void exitBinaryExprRegisters(AssemblerParser.BinaryExprRegistersContext ctx) {
        log.debug("listen binary expresssiong");
        var statement = assemblerVisitor.visit(ctx);
        // statements.add(statement);
    }

    /**
     *  Visit of expression which uses two arguments - register and number literal
     */
    @Override
    public void exitBinaryExprRegisterConst(AssemblerParser.BinaryExprRegisterConstContext ctx) {
        log.debug("listen binary expresssiong");
        var statement = assemblerVisitor.visit(ctx);
        // statements.add(statement);
    }
}
