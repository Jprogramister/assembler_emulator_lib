package exception;

/**
 * Exception occurs on statement execution
 */
public class StatementExecutionException extends Exception {
  public StatementExecutionException(String s) {
    super(s);
  }
}
