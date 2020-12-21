package recognizer;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static recognizer.Utils.createParseTree;

public class AssemblerListenerTest {
    private ParseTree parseTree;
    private AssemblerListener assemblerListener;

    @Before
    public void setUp() throws IOException {
        parseTree = createParseTree("allCorrectStatements.asm");
        var assemblerVisitor = new AssemblerVisitor();
        assemblerListener = new AssemblerListener();
    }

    /**
     * Check {@link AssemblerListener} don't throws exceptions while walk on parse tree
     */
    @Test
    public void visitTest() {
        var walker = new ParseTreeWalker();
        walker.walk(assemblerListener, parseTree);
    }
}
