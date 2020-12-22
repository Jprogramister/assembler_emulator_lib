package emulator.statement;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class StateMachineTest {
    private static StateMachine stateMachine;
    private static List<Statement> statements;

    @Before
    public void setUp() throws Exception {
        statements = List.of(
                mockStatement(0),
                mockStatement(1),
                mockStatement(2)
        );
        stateMachine = new StateMachine(statements, null);
    }

    private Statement mockStatement(int lineNumber) {
        Statement mockStatement = Mockito.mock(Statement.class);
        Mockito.when(mockStatement.getStatementIndex()).thenReturn(lineNumber);
        return mockStatement;
    }

    @Test
    public void init() {
        stateMachine = new StateMachine(statements, null);
        assertEquals(0, stateMachine.getCurrentIndex());
        assertEquals(0, stateMachine.getCurrentStatement().getStatementIndex());
        assertTrue(stateMachine.hasNext());
        assertFalse(stateMachine.hasPrev());
    }

    @Test
    public void statementsMovement() throws StatementExecutionException {
        stateMachine = new StateMachine(statements, null);
        assertEquals(0, stateMachine.getCurrentStatement().getStatementIndex());
        stateMachine.goNext();
        assertEquals(1, stateMachine.getCurrentStatement().getStatementIndex());
        stateMachine.goBack();
        assertEquals(0, stateMachine.getCurrentStatement().getStatementIndex());
    }
}