package emulator;

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
    private final CallStackContext callStack = new CallStackContext();
    private final CodeStackContext codeStack = new CodeStackContext();
    private final RegistersContext registersContext = new RegistersContext();
    private final List<Statement> statements;
}
