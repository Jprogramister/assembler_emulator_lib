package emulator.statement;

public enum StatementType {
    /**
     * Instruction for CPU
     */
    INSTRUCTION,

    /**
     * Binary operation of type operation register1, register2
     */
    BINARY_OPERATION_REGISTERS,

    /**
     * Binary operation of type operation register, const
     */
    BINARY_OPERATION_REGISTER_CONST,

    /**
     * Unary operation of type operation const
     */
    UNARY_OPERATION_CONST,

    /**
     * Unary operation of type operation registers
     */
    UNARY_OPERATION_REGISTER
}
