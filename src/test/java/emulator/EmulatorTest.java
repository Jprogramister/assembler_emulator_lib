package emulator;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.BeforeClass;
import org.junit.Test;
import emulator.recognizer.Recognizer;


import static emulator.recognizer.Utils.createParseTree;

public class EmulatorTest {
    private static Emulator emulator;

    @BeforeClass
    public static void setUp() throws Exception {
       //  ParseTree parseTree = createParseTree(emulator.CodeSamples.readCodeSample("code.asm"));
        // emulator = new Emulator(Recognizer.recognize(parseTree));
    }

    @Test
    public void doAllStatements() throws Exception {
        emulator.executeAll();
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