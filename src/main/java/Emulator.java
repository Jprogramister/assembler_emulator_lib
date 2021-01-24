import context.State;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import recognizer.Recognizer;
import statement.StateMachine;
import statement.Statement;
import statement.StatementExecutionException;

@RequiredArgsConstructor
@Slf4j
public class Emulator {
    private final StateMachine stateMachine;
    @Getter
    private final State initialState;

    /**
     * Creates {@link Emulator} from stream
     * @param stream with assembler code
     * @return new instance of {@link Emulator}
     */
    public Emulator(CharStream stream) {
        this(Recognizer.recognize(stream));
    }

    public Emulator(State initialState) {
        this.initialState = initialState;
        this.stateMachine = new StateMachine(initialState);
    }

    public int getStatementsAmount() {
        return initialState.getStatementsContext().size();
    }

    public Statement getCurrentStatement() {
        return stateMachine.getCurrentStatement();
    }

    public int getCurrentStatementIndex() {
        return stateMachine.getCurrentIndex();
    }

    public State next() throws StatementExecutionException {
        if (!stateMachine.hasNext()) {
            return null;
        }
        return stateMachine.stepOver();
    }

    public State prev() {
        if (!stateMachine.hasPrev()) {
            return null;
        }
        return stateMachine.stepBack();
    }

    public void executeAll() throws StatementExecutionException {
        while (stateMachine.hasNext()) {
            stateMachine.stepOver();
        }
    }

    public void toStatement(int index) {

    }
}
