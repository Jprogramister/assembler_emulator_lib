package emulator;

import emulator.context.StatementsContext;
import lombok.Builder;
import lombok.Getter;
import emulator.statement.Statement;
import emulator.context.CallStackContext;
import emulator.context.CodeStackContext;
import emulator.context.RegistersContext;

import java.util.List;

/**
 * Aggregation of CPU context states and list of code statements
 */
@Builder
@Getter
public class State {
    private final CallStackContext callStack;
    private final CodeStackContext codeStack;
    private final RegistersContext registersContext;
    private final StatementsContext statements;

    public State clone(final RegistersContext ctx, final State sourceState) {
        return State.builder()
                .callStack(sourceState.getCallStack().clone())
                .codeStack(sourceState.getCodeStack().clone())
                .registersContext(ctx)
                .statements(sourceState.getStatements().clone())
                .build();
    }
}
