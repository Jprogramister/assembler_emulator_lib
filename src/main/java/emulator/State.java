package emulator;

import emulator.context.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import emulator.statement.Statement;
import org.antlr.v4.runtime.tree.ParseTree;
import recognizer.AssemblerListener;

import java.util.List;

/**
 * Aggregation of CPU context states and list of code statements
 */
@Getter
@AllArgsConstructor
public class State {
    private final CallStackContext callStack;
    @Getter
    private final RegistersContext registersContext;
    private final StatementsContext statements;
    @Getter
    private final LabelsContext labelsContext;

    public State(AssemblerListener listener) {
        this(
          new CallStackContext(),
          new RegistersContext(),
          listener.getStatementsContext(),
          listener.getLabelsContext()
        );
    }

    public State cloneWithRegisters(final RegistersContext ctx) {
        return new State(this.callStack, this.registersContext, this.statements, this.labelsContext);
    }
}
