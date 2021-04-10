package recognizer;

import lombok.NonNull;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import recognizer.generated.AssemblerLexer;
import recognizer.generated.AssemblerParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils {
  /**
   * Loads file and creates parse tree by its text
   *
   * @param fileInputStream input stream with file context
   * @return {@link ParseTree}
   * @throws IOException if {@link CharStream} create error was occured
   */
  public static ParseTree createParseTree(@NonNull InputStream fileInputStream) throws IOException {
    CharStream stream = CharStreams.fromStream(fileInputStream);
    return createParseTree(stream);
  }

  public static ParseTree createParseTree(String code) throws IOException {
    return createParseTree(new ByteArrayInputStream(code.getBytes()));
  }

  public static ParseTree createParseTree(CharStream stream) {
    var lexer = new AssemblerLexer(stream);
    var parser = new AssemblerParser(new CommonTokenStream(lexer));
    return parser.programm();
  }
}
