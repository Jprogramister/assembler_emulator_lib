package emulator.operation.instruction;

import emulator.operation.Operation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum InstructionOperation implements Operation {
    LABEL_DEFINITION();

    @Override
    public String getId() {
        return null;
    }
}
