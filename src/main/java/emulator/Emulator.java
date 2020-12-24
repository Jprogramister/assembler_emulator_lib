package emulator;

import emulator.statement.StateMachine;
import emulator.statement.Statement;
import emulator.statement.StatementExecutionException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import emulator.recognizer.Recognizer;

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
        this.stateMachine = new StateMachine(initialState.getStatementsContext().getStatements(), initialState);
    }

    public int getStatementsAmount() {
        return initialState.getStatementsContext().size();
    }

    public Statement getCurrentStatement() {
        return stateMachine.getCurrentStatement();
    }

    public int getCurrentStatementIndex() {
        return stateMachine.getStatementIndex();
    }

    public State next() throws StatementExecutionException {
        if (!stateMachine.hasNext()) {
            return null;
        }
        return stateMachine.goNext();
    }

    public State prev() {
        if (!stateMachine.hasPrev()) {
            return null;
        }
        return stateMachine.goBack();
    }

    public void executeAll() throws StatementExecutionException {
        while (stateMachine.hasNext()) {
            stateMachine.goNext();
        }
    }

    public void toStatement(int index) {

    }
}
