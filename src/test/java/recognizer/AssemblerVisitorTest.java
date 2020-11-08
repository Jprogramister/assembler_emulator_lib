package recognizer;

import antlr.AssemblerLexer;
import antlr.AssemblerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
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
        CharStream input = CharStreams.fromStream(requireNonNull(Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)));
        var lexer = new AssemblerLexer(input);
        var parser = new AssemblerParser(new CommonTokenStream(lexer));
        return parser.programm();
    }

    @Test
    public void visitTest() {
        assemblerVisitor.visit(parseTree);
    }
}
