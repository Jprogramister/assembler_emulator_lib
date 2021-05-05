package recognizer;

import emulator.CodeSamples;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static recognizer.Utils.createParseTree;

public class AssemblerAstWalkerTest {
  private ParseTree parseTree;
  private AstWalker assemblerListener;

  @Before
  public void setUp() throws IOException {
    parseTree = createParseTree(CodeSamples.ALL);
    assemblerListener = new AstWalker();
  }

  /**
   * Check {@link AstWalker} don't throws exceptions while walk on parse tree
   */
  @Test
  public void visitTest() {
    var walker = new ParseTreeWalker();
    walker.walk(assemblerListener, parseTree);
  }
}
