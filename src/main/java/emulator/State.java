package emulator;

import antlr.AssemblerListener;
import emulator.context.StatementsContext;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import emulator.statement.Statement;
import emulator.context.CallStackContext;
import emulator.context.CodeStackContext;
import emulator.context.RegistersContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * Aggregation of CPU context states and list of code statements
 */
@Getter
public class State {
    private CallStackContext callStack;
    private CodeStackContext codeStack;
    @Getter
    private RegistersContext registersContext;
    private StatementsContext statements;

    public State(ParseTree tree) {
        this(new CallStackContext(), new CodeStackContext(), new RegistersContext(), new StatementsContext(tree));
    }

    public State(CallStackContext callStackCtx, CodeStackContext codeStackCtx, RegistersContext registersCtx,
                 StatementsContext statementsCtx) {
        this.callStack = callStackCtx;
        this.codeStack = codeStackCtx;
        this.registersContext = registersCtx;
        this.statements = statementsCtx;
    }

    public State cloneWithRegisters(final RegistersContext ctx) {
        return new State(this.callStack, this.codeStack, this.registersContext, this.statements);
    }
}
