package recognizer;

import emulator.State;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class RecognizerTest {
    @Test
    public void recognizeTest() throws IOException {
        testRecognition("MOV ax, 2");
        testRecognition("JMP some_label_name");
    }

    private void testRecognition(String code) throws IOException {
        State state = Recognizer.recognize(code);
        Assert.assertNotNull(state);
        Assert.assertEquals(1, state.getStatements().size());
    }
}