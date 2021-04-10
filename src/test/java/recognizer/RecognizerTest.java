package recognizer;

import context.State;
import emulator.CodeSamples;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class RecognizerTest {
  @Test
  public void recognizeTest() throws IOException {
    testRecognition(CodeSamples.ALL);
  }

  @SneakyThrows
  private static void testRecognition(String code) {
    State state = Recognizer.recognize(code);
    Assert.assertNotNull(state);
    // Assert.assertNotEquals(0, state.getStatementsSet().size());
    System.out.printf("context.State created from code \n %s %s%n", code, state.toString());
  }
}