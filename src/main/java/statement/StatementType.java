package statement;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum StatementType {

    /* Statement with some error */
    ERROR_STATEMENT("ERROR"),

    /* Definition of new label to jump */
    LABEL_DEFINITION("LABEL_DEFINITION"),

    /* Instruction for CPU */
    JMP("JMP"),

    /* Binary operation of type operation register1, register2 */
    BINARY_OPERATION_REGISTERS("BINARY_OPERATION_REGISTERS"),

    /* Binary operation of type operation register, const */
    BINARY_OPERATION_REGISTER_CONST("BINARY_OPERATION_REGISTER_CONST"),

    /* Unary operation of type operation const */
    UNARY_OPERATION_CONST("UNARY_OPERATION_CONST"),

    /* Unary operation of type operation registers */
    UNARY_OPERATION_REGISTER("UNARY_OPERATION_REGISTER");

    @Getter
    private final String name;
}
