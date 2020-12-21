package emulator.statement;

/**
 * Exception occurs on some statement execution
 */
public class StatementExecutionException extends Exception {
    public StatementExecutionException(String s) {
        super(s);
    }
}
