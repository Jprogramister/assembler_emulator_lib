package operation.binary;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import operation.Operation;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum BinaryOperation implements Operation {
  ADD("ADD"),
  SUB("SUB"),
  MOV("MOV");

  private final String id;

  @Override
  public String getId() {
    return this.id;
  }
};
