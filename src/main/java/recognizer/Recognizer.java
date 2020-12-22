package recognizer;

import emulator.State;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Facade of assembler code recognition
 */
public final class Recognizer {
    private Recognizer() {}

    /**
     * Creates {@link State} by {@link String)}
     * @param code string with assembler code
     * @return new instance of {@link State}
     * @throws IOException if code param is incorrect
     */
    public static State recognize(final String code) throws IOException {
        var codeBytes = new ByteArrayInputStream(code.getBytes());
        return Recognizer.recognize(CharStreams.fromStream(codeBytes));
    }

    /**
     * Creates {@link State} by {@link CharStream}
     * @param stream stream with code text
     * @return {@link State}
     */
    public static State recognize(final CharStream stream) {
        ParseTree tree = Utils.createParseTree(stream);
        return recognize(tree);
    }

    /**
     * Creates {@link State} by {@link ParseTree}
     * @param tree parse tree
     * @return {@link State}
     */
    public static State recognize(ParseTree tree) {
        var listener = new AssemblerListener();
        new ParseTreeWalker().walk(listener, tree);
        return new State(listener);
    }
}
