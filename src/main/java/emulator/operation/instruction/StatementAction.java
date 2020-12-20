package emulator.operation.instruction;

@FunctionalInterface
public interface StatementAction<T, R> {
    R apply(T t) throws Exception;
}