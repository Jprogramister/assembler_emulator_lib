import emulator.CodeSamples;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.BeforeClass;
import org.junit.Test;
import recognizer.Recognizer;
import recognizer.Utils;

import java.io.IOException;

public class EmulatorTest {
  private static Emulator emulator;

  @BeforeClass
  public static void setUp() throws IOException {
    var parseTree = Utils.createParseTree(CodeSamples.ALL);
    emulator = new Emulator(Recognizer.recognize(parseTree));
  }

  @Test
  public void doAllStatements() throws Exception {
    emulator.executeAll();
  }
}