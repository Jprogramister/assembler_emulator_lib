package operation.instruction;

import operation.Operation;
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
