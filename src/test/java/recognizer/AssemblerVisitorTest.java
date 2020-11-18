package recognizer;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static recognizer.Utils.createParseTree;

public class AssemblerVisitorTest {
    private ParseTree parseTree;
    private AssemblerVisitor assemblerVisitor;

    @Before
    public void setUp() throws IOException {
        parseTree = createParseTree("code.asm");
        assemblerVisitor = new AssemblerVisitor();
    }

    /**
     * Check {@link AssemblerVisitor} don't throws exception while process parsing tree
     */
    @Test
    public void testParsingWorks() {
        assemblerVisitor.visit(parseTree);
    }
}
