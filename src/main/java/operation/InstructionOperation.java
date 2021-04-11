package operation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import operation.Operation;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum InstructionOperation implements Operation {
  LABEL_DEFINITION();

  @Override
  public String getId() {
    return null;
  }
}
