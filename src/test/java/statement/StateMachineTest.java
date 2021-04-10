package statement;

import emulator.CodeSamples;
import org.mockito.Mockito;
import recognizer.Recognizer;

import java.io.IOException;

public class StateMachineTest {
  private StateMachine createTestStateMachine() throws IOException {
    return new StateMachine(Recognizer.recognize(CodeSamples.ALL));
  }

//    private static State createInitialStateMock() {
//        var statements = List.of(
//                createMockStatement(0),
//                createMockStatement(1),
//                createMockStatement(2)
//        );
//        State initialStateMock = Mockito.mock(State.class);
//        var statementsMock = Mockito.mock(StatementsSet.class);
//        Mockito.when(statementsMock.getStatements()).thenReturn(statements);
//        Mockito.when(initialStateMock.getStatementsSet()).thenReturn(statementsMock);
//        return initialStateMock;
//    }

  private static Statement createMockStatement(int lineNumber) {
    var mockStatement = Mockito.mock(Statement.class);
    Mockito.when(mockStatement.getStatementIndex()).thenReturn(lineNumber);
    return mockStatement;
  }

  /**
   * Check initial state is valid
   */
//    @Test
//    public void init() throws IOException {
//        var stateMachine = createTestStateMachine();
//        assertEquals(0, stateMachine.getCurrentIndex());
//        assertEquals(0, stateMachine.getCurrentIndex());
//        assertTrue(stateMachine.hasNext());
//        assertFalse(stateMachine.hasPrev());
//    }
//
//    /**
//     * Check transition between states is valid
//     * @throws StatementExecutionException on statement execution error
//     */
//    @Test
//    public void statementsMovement() throws StatementExecutionException, IOException {
//        var stateMachine = createTestStateMachine();
//        assertEquals(0, stateMachine.getCurrentIndex());
//        stateMachine.stepOver();
//        assertEquals(1, stateMachine.getCurrentIndex());
//        stateMachine.stepBack();
//        assertEquals(0, stateMachine.getCurrentIndex());
//    }
}