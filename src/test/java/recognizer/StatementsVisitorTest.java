package recognizer;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static recognizer.Utils.createParseTree;

public class StatementsVisitorTest {
  private ParseTree parseTree;
  private StatementsVisitor visitor;

  @Before
  public void setUp() throws IOException {
    parseTree = createParseTree(emulator.CodeSamples.ALL);
    visitor = new StatementsVisitor();
  }

  /* Check {@link AssemblerVisitor} don't throws exception while process parsing tree */
  @Test
  public void testParsingWorks() {
    visitor.visit(parseTree);
  }
}
