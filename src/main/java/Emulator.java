import state.State;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import recognizer.Recognizer;
import statement.StateMachine;

@RequiredArgsConstructor
@Slf4j
public class Emulator {
  private final StateMachine stateMachine;
  @Getter
  private final State initialState;

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
    this.initialState = initialState;
    this.stateMachine = new StateMachine(initialState);
  }

  public void executeAll() {
  }
}
