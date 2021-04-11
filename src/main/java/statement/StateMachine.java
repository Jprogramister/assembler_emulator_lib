package statement;

import context.State;

import java.util.ArrayList;
import java.util.List;

public class StateMachine {
  private final List<State> cache = new ArrayList<>();
  private final State initialState;

  public StateMachine(State initialState) {
    this.initialState = initialState;
  }
}
