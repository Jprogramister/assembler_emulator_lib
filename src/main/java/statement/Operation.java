package statement;

import exception.OperationParsingError;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

import static java.lang.String.format;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Operation {
  POP("POP", Type.UNARY),
  JMP("JMP", Type.UNARY),
  PUSH("PUSH", Type.UNARY),
  ADD("ADD", Type.BINARY),
  SUB("SUB", Type.BINARY),
  MOV("MOV", Type.BINARY),
  LABEL_DEF("LABEL_DEF", Type.INSTRUCTION);

  private final String id;
  private final Type type;

  private static final Map<String, Operation> operations = Map.of(
          "ADD", ADD,
          "JMP", JMP,
          "PUSH", PUSH,
          "SUB", SUB,
          "MOV", MOV,
          "LABEL_DEF", LABEL_DEF,
          "POP", POP
  );

  /**
   * Create {@link Operation} instance by string with operation ID
   *
   * @param id string with id
   * @return instance of {@link Operation}
   * @throws OperationParsingError if string contains unknown operation id or other incorrect text
   */
  static public Operation parse(String id) throws OperationParsingError {
    return Objects.requireNonNull(operations.get(id.toUpperCase()), format("Unknown operation %s", id));
  }

  @Getter
  @AllArgsConstructor(access = AccessLevel.PRIVATE)
  public enum Type {
    BINARY("BINARY"),
    UNARY("UNARY"),
    INSTRUCTION("INSTRUCTION");

    private final String id;
  }

}
