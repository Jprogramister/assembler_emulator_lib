package emulator;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.BeforeClass;
import org.junit.Test;
import emulator.recognizer.Recognizer;

import java.io.IOException;

import static emulator.recognizer.Utils.createParseTree;

public class EmulatorTest {
    private static Emulator emulator;

    @BeforeClass
    public static void setUp() throws IOException {
         ParseTree parseTree = createParseTree(CodeSamples.ALL);
         emulator = new Emulator(Recognizer.recognize(parseTree));
    }

    @Test
    public void doAllStatements() throws Exception {
        emulator.executeAll();
    }
}