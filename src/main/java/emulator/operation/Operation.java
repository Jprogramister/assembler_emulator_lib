package emulator.operation;

import emulator.operation.binary.BinaryOperation;
import emulator.operation.unary.UnaryOperation;

public interface Operation {
    String getId();

    /**
     * Create {@link Operation} instance by string with operation ID
     * @param id string with id
     * @return instance of {@link Operation}
     * @throws OperationParsingError if string contains unknown operation id or other incorrect text
     */
    public static Operation parse(String id) throws OperationParsingError {
        id = id.toUpperCase();
        if (BinaryOperation.ADD.getId().equals(id)) {
            return BinaryOperation.ADD;
        }

        if (BinaryOperation.MOV.getId().equals(id)) {
            return BinaryOperation.MOV;
        }

        if (BinaryOperation.SUB.getId().equals(id)) {
            return BinaryOperation.SUB;
        }

        if (UnaryOperation.JMP.getId().equals(id)) {
            return UnaryOperation.JMP;
        }

        if (UnaryOperation.POP.getId().equals(id)) {
            return UnaryOperation.POP;
        }

        if (UnaryOperation.PUSH.getId().equals(id)) {
            return UnaryOperation.PUSH;
        }

        throw new OperationParsingError(String.format("Cannot parse operation %s", id));
    }
}
