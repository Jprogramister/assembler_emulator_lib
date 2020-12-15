package emulator.operation.instruction;

import emulator.State;

public final class InstructionOperationExecutor {
    private InstructionOperationExecutor() { }

    public static State jump(State state, String labelId, long lineNumber) {
        state.getCodeStack().setCurrentCommandIndex();
        return null;
    }
}
