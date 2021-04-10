package context;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import recognizer.AssemblerListener;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Aggregation of CPU context states and list of code statements
 */
@Getter
@AllArgsConstructor
@Slf4j
public class State {
  private final ObjectMapper objectMapper = new ObjectMapper();
  private final CallStackContext callStack;
  @Getter
  private final RegistersContext registersContext;
  private final StatementsSet statementsSet;
  @Getter
  private final LabelsContext labelsContext;

  public State(AssemblerListener listener) {
    this(
            new CallStackContext(),
            new RegistersContext(),
            listener.getStatementsContext(),
            listener.getLabelsContext()
    );
  }

  /**
   * Creates new instance of state by this with other resgiters context
   *
   * @param ctx registers context for new instance
   * @return {@link State}
   */
  public State cloneWithRegisters(final RegistersContext ctx) {
    return new State(
            this.callStack,
            ctx,
            this.statementsSet,
            this.labelsContext
    );
  }

  public String toJson() throws IOException {
    Map<String, String> json = new HashMap<>();
    json.put("callStackContext", callStack.toJson());
    json.put("registersContext", registersContext.toJson());
    json.put("statementsContext", statementsSet.toJson());
    json.put("labelsContext", labelsContext.toJson());
    return objectMapper.writeValueAsString(json);
  }

  @Override
  public String toString() {
    try {
      return toJson();
    } catch (IOException e) {
      log.error("context.State to string mapping error", e);
      return "{}";
    }
  }
}
