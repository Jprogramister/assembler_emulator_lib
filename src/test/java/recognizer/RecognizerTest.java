package recognizer;

import state.State;
import emulator.CodeSamples;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RecognizerTest {
  @Test
  public void recognizeTest() throws IOException {
    testRecognition(CodeSamples.ALL);
  }

  private static void testRecognition(String code) throws IOException {
    State state = Recognizer.recognize(code);
    assertNotNull(state);
    assertEquals(8, state.statementsCount());
    System.out.printf("context.State created from code \n %s %s%n", code, state.toString());
  }
}