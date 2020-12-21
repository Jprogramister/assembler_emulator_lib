package emulator.statement;

@FunctionalInterface
public interface StatementAction<T, R> {
    R apply(T t) throws StatementExecutionException;
}