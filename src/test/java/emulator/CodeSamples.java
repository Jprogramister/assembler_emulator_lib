package emulator;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Provides code samples for testing
 */
public final class CodeSamples {
    private CodeSamples() {}

    public static final String ALL = "mov AX , 1\n" +
            "add ax, 2\n" +
            "mov bx, 1\n" +
            "sub ax, bx\n" +
            "SOME_LABEL:\n" +
            "push ax\n" +
            "pop ax\n" +
            "jmp SOME_LABEL\n";

    /**
     * List of correct code samples for testing
     * @return list of strings with assembler code
     */
    public static List<String> getAllStatementsCode() {
        return List.of(
            CodeSamples.ALL
        );
    }
}
