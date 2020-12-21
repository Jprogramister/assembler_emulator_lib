package emulator.context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.EmptyStackException;
import java.util.Stack;

@Slf4j
public class CallStackContext {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Stack<Number> callStack = new Stack<>();

    @Override
    public String toString() {
        try {
            return toJson();
        } catch (JsonProcessingException e) {
            log.error("CallStack to json mapping error", e);
            return "{}";
        }
    }

    public String toJson() throws JsonProcessingException {
        return objectMapper.writeValueAsString(callStack);
    }

    public Number push(Number x) {
        return callStack.push(x);
    }

    /**
     * Returns top element from stack (and removes this element)
     * @return value
     * @throws EmptyStackException if stack is empty
     */
    public Number pop() throws EmptyStackException {
        return callStack.pop();
    }
}
