package recognizer;

import antlr.AssemblerLexer;
import antlr.AssemblerParserParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static java.util.Objects.requireNonNull;

public class AssemblerVisitorTest {
    private ParseTree parseTree;
    private AssemblerVisitor assemblerVisitor;

    @Before
    public void test() throws IOException {
        parseTree = createParseTree("code.asm");
        assemblerVisitor = new AssemblerVisitor();
        System.out.println(parseTree.toStringTree());
    }

    /**
     * Loading file and creation parse tree by its text
     * @param fileName file name for loading
     */
    private ParseTree createParseTree(final String fileName) throws IOException {
        var input = new ANTLRInputStream(requireNonNull(Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)));
        var lexer = new AssemblerLexer(input);
        var commonTokenStream = new CommonTokenStream(lexer);
        var parser = new AssemblerParserParser(commonTokenStream);
        return parser.programm();
    }

    @Test
    public void visitTest() {
        assemblerVisitor.visit(parseTree);
    }
}
