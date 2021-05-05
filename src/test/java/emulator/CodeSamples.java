package emulator;

import java.util.List;

/**
 * Provides code samples for testing
 */
public final class CodeSamples {
  private CodeSamples() {
  }

  public static final String ALL =
          "mov AX , 1 \n" +
          "add ax, 2 \n" +
          "mov bx, 1 \n" +
          "sub ax, bx \n" +
          "SOME_LABEL: \n" +
          "push ax \n" +
          "pop ax \n" +
          "jmp SOME_LABEL \n";

  /**
   * List of correct code samples for testing
   *
   * @return list of strings with assembler code
   */
  public static List<String> getAllStatementsCode() {
    return List.of(
            CodeSamples.ALL
    );
  }
}
