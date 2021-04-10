package operation.unary;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import operation.Operation;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum UnaryOperation implements Operation {
  POP("POP"),
  JMP("JMP"),
  PUSH("PUSH");

  private final String id;

  @Override
  public String getId() {
    return this.id;
  }
}
