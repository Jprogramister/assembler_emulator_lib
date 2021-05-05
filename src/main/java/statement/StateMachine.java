package statement;

import exception.StatementExecutionException;
import state.State;


import java.util.*;

import static java.lang.String.format;

// TODO transfer to Emulator
public class StateMachine {
  private final Queue<State> cache = new ArrayDeque<>();
  private State currentState;

  public StateMachine(State initialState) {
    this.currentState = initialState;
    cache.add(initialState);
  }

  public void executeAll() throws StatementExecutionException {
    while (currentState.hasNext()) {
     executeCurrent();
    }
  }

  public State executeCurrent() throws StatementExecutionException {
    var nextStatement = currentState.next().apply(currentState);
    cache.add(currentState);
    currentState = nextStatement;
    return currentState;
  }

  public void rollbackTo(int index) {
    validate(index);
    while (cache.size() < index) {
      currentState = cache.remove();
    }
  }

  public void rollbackLast() {
    rollbackTo(cache.size() - 1);
  }

  private void validate(int index) {
    if (index < 0 || index > statementsCount()) {
      throw new IndexOutOfBoundsException(format("Invalid index %d for statements amount %d", index, cache.size()));
    }
  }

  public Collection<State> cache() {
    return Collections.unmodifiableCollection(cache);
  }

  public State state() {
    return currentState;
  }

  public int statementsCount() {
    return currentState.statementsCount();
  }
}
