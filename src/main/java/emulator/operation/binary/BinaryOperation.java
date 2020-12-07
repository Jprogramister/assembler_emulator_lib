package emulator.operation.binary;

import emulator.operation.Operation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum BinaryOperation implements Operation {
    ADD("ADD"),
    SUB("SUB"),
    MOV("MOV");

    private final String id;

    @Override
    public String getId() {
        return this.id;
    }
};
