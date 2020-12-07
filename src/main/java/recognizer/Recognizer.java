package recognizer;

import emulator.State;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Facade of assembler code recognition
 */
public class Recognizer {
    /**
     * Processes assembler code and make {@link State}
     * @param stream stream with code text
     * @return {@link State}
     */
    public static State recognizeCode(CharStream stream) {
        ParseTree tree = Utils.createParseTree(stream);
        return createState(tree);
    }

    /**
     * Creates {@link State} by {@link ParseTree}
     * @param tree parse tree from {@link Utils#createParseTree(String)}
     * @return {@link State}
     */
    public static State createState(ParseTree tree) {
        return State.builder()
                .statements(AssemblerListener.walk(tree))
                .build();
    }
}
