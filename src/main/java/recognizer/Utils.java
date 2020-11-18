package recognizer;

import antlr.AssemblerLexer;
import antlr.AssemblerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;

public class Utils {
    /**
     * Loads file and creates parse tree by its text
     * @param fileName file name for loading
     */
    public static ParseTree createParseTree(String fileName) throws IOException {
        CharStream stream = CharStreams.fromStream(requireNonNull(
                Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName))
        );
        return createParseTree(stream);
    }

    public static ParseTree createParseTree(CharStream stream) {
        var lexer = new AssemblerLexer(stream);
        var parser = new AssemblerParser(new CommonTokenStream(lexer));
        return parser.programm();
    }
}
