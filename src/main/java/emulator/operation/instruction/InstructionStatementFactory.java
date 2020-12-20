package emulator.operation.instruction;

import emulator.State;
import emulator.operation.OperationParsingError;
import emulator.statement.Statement;
import emulator.statement.StatementType;

public final class InstructionStatementFactory {
    private InstructionStatementFactory() {}

    public static Statement createJmpStatement(long lineNumber, String labelId) throws OperationParsingError {
        return new Statement(
            lineNumber,
            StatementType.JMP,
            state -> InstructionOperationExecutor.jump(state, labelId)
        );
    }
}
