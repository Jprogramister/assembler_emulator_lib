package emulator.statement;

public enum StatementType {
    /**
     * Statement with some error
     */
    ERROR_STATEMENT,

    /**
     * Definition of new label to jump
     */
    LABEL_DEFINITION,

    /**
     * Instruction for CPU
     */
    JMP,

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
