package emulator.operation.instruction;

import emulator.State;
import jdk.jshell.spi.ExecutionControl;

public final class InstructionOperationExecutor {
    private InstructionOperationExecutor() { }

    public static State jump(State state, String labelId) throws Exception {
        var statements = state.getStatements();
        var label = state.getLabelsContext().getLabel(labelId);
        statements.setCurrentStatement(label.getDefinitionLineNumber() + 1);
        return state;
    }
}
