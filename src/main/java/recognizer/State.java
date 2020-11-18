package recognizer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import recognizer.statement.Statement;
import state.context.CallStackContext;
import state.context.CodeStackContext;
import state.context.RegistersContext;

import java.util.List;

/**
 * Aggregate of CPU context states
 */
public class State {
    @Getter
    private final CallStackContext callStack = new CallStackContext();
    @Getter
    private final CodeStackContext codeStack = new CodeStackContext();
    @Getter
    private final RegistersContext registersContext = new RegistersContext();
    @Getter
    @Setter
    private List<Statement> statements;
}
