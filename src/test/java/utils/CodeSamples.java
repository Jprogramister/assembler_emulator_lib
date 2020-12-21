package utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Provides code samples for testing
 */
public final class CodeSamples {
    private CodeSamples() {}

    /**
     * List of correct code samples for testing
     * @return list of strings with assembler code
     * @throws IOException if some file was not found
     */
    public static List<String> getStandardCodeSamples() throws IOException {
        return List.of(
            readCodeSample("allCorrectStatements.asm")
        );
    }

    /**
     * Reads file content from test resources
     * @param sampleName name of file to read
     * @return text of file
     * @throws IOException if file was not found
     */
    public static String readCodeSample(String sampleName) throws IOException {
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(sampleName);
        return IOUtils.toString(requireNonNull(stream), "UTF-8");
    }
}
