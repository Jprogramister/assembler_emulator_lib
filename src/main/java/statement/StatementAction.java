package statement;

import exception.StatementExecutionException;

@FunctionalInterface
public interface StatementAction<T, R> {
  R apply(T t) throws StatementExecutionException;
}