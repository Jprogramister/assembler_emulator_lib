package statement;

import exception.OperationParsingError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
  @Test
  void parse() throws OperationParsingError {
    Operation.parse("add");
    Operation.parse("ADD");
  }
}