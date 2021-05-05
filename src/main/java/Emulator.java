import exception.StatementExecutionException;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import recognizer.Recognizer;
import state.State;
import statement.StateMachine;

import java.util.Collection;

@Slf4j
public class Emulator {
  private StateMachine stateMachine;

  /**
   * Creates {@link Emulator} from stream
   *
   * @param stream with assembler code
   * @return new instance of {@link Emulator}
   */
  public Emulator(CharStream stream) {
    this(Recognizer.recognize(stream));
  }

  public Emulator(State initialState) {
    this.stateMachine = new StateMachine(initialState);
  }

  public void executeAll() throws StatementExecutionException {
    stateMachine.executeAll();
  }

  public void executeCurrent() throws StatementExecutionException {
    stateMachine.executeCurrent();
  }

  public Collection<State> cache() {
    return stateMachine.cache();
  }

  public void rollbackTo(int index) {
    stateMachine.rollbackTo(index);
  }

  public State currentState() {
    return stateMachine.state();
  }
}
