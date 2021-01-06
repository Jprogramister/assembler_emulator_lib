package context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Context of registers
 */
public final class RegistersContext {
    /**
     * This value will be returned by method getValue if required register id is not initialized
     */
    private static final Number DEFAULT_REGISTER_VALUE = 0;

    private final JsonMapper jsonMapper = new JsonMapper();

    /**
     * Values of registers. Key is id of register
     */
    private Map<String, Number> registerValues = new HashMap<String, Number>();

    public RegistersContext(Map<String, Number> registerValues) {
        this.registerValues = registerValues;
    }

    public RegistersContext() {

    }

    /**
     * Returns register value or DEFAULT_REGISTER_VALUE if register value is not initialized yet
     * @param reg register ID
     * @return register value or default
     */
    public Number getRegisterValue(final String reg) {
        if (!registerValues.containsKey(reg)) {
            return DEFAULT_REGISTER_VALUE;
        }
        return registerValues.get(reg);
    }

    /**
     * Updates value of register
     * @param registerId string id of register
     * @param value value to update
     */
    public void setRegisterValue(String registerId, Number value) {
        registerValues.put(registerId, value);
    }

    /**
     * Create changed copy of context
     * @param registerId id which should be changed
     * @param value value to set
     * @return changed copy {@link RegistersContext}
     */
    public RegistersContext cloneAndSet(String registerId, Number value) {
        Map<String, Number> valuesCopy = new HashMap<>(registerValues);
        valuesCopy.put(registerId, value);
        return new RegistersContext(valuesCopy);
    }

    /**
     * User-friendly representation of register values for output to CLI
     * @return string with registers values
     */
    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append("REGISTER VALUES\n");
        for (var entry : registerValues.entrySet()) {
            builder
                .append(entry.getKey())
                .append(" ")
                .append(entry.getValue())
                .append('\n');
        }
        return builder.toString();
    }

    public String toJson() throws JsonProcessingException {
        return jsonMapper.writeValueAsString(registerValues);
    }
}
