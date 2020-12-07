package emulator;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import recognizer.Recognizer;

import static org.junit.Assert.*;
import static recognizer.Utils.createParseTree;

public class EmulatorTest {
    private static Emulator emulator;

    @BeforeClass
    public static void setUp() throws Exception {
        ParseTree parseTree = createParseTree("code.asm");
        emulator = new Emulator(Recognizer.createState(parseTree));
    }

    @Test
    public void doAllStatements() {
        emulator.doAllStatements();
    }

//    @Test
//    public void toStatement() {
//    }
//
//    @Test
//    public void getCurrentState() {
//    }
//
//    @Test
//    public void getCurrentStatementIndex() {
//    }
}