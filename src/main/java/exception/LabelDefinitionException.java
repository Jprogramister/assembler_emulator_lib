package exception;

import exception.StatementExecutionException;

/**
 * Will be thrown on attempt repeat label definition of attempt get nonexistent label
 */
public class LabelDefinitionException extends StatementExecutionException {
  public LabelDefinitionException(String s) {
    super(s);
  }
}
