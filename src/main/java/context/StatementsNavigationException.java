package context;

import statement.StatementExecutionException;

/**
 * Exception occurs on {@link StatementsContext} navigation methods
 */
public class StatementsNavigationException extends StatementExecutionException {
    public StatementsNavigationException(String s) {
        super(s);
    }
}
