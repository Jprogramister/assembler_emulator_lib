package exception;

import exception.StatementExecutionException;

/**
 * Exception occurs on attempt of jump to unreal index of line
 */
public class StatementsNavigationException extends StatementExecutionException {
  public StatementsNavigationException(String s) {
    super(s);
  }
}
