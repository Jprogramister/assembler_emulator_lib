package state.context;

import java.util.HashMap;
import java.util.Map;

public final class RegistersContext {
    public RegistersContext() { }

    /**
     * This value will be returned by method getValue if required register id is not initialized
     */
    private static final Number DEFAULT_REGISTER_VALUE = 0;

    private final Map<String, Number> registerValues = new HashMap<String, Number>();

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

    public void setRegisterValue(final String reg, final Number value) {
        registerValues.put(reg, value);
    }

    /**
     * User-friendly representation of register values for CLI output
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
}
