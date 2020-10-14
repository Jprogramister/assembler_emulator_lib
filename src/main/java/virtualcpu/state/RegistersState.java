package virtualcpu.state;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton for registers values management
 */
public final class RegistersState {
    private RegistersState() { }

    /**
     * This value will be returned by method getValue if required register id is not initialized
     */
    private static final Number DEFAULT_REGISTER_VALUE = 0;

    public enum Register {
        AX,
        AH,
        AL,
        BX,
        BH,
        BL
    }

    private static final Map<Register, Number> registerValue = new HashMap<Register, Number>();

    /**
     * Returns register value or DEFAULT_REGISTER_VALUE if register value is not initialized yet
     * @param reg register ID
     * @return register value or default
     */
    public static Number getValue(final Register reg) {
        if (!registerValue.containsKey(reg)) {
            return DEFAULT_REGISTER_VALUE;
        }
        return registerValue.get(reg);
    }

    public static void setValue(final Register reg, final Number value) {
        registerValue.put(reg, value);
    }

    /**
     * User-friendly representation of register values for CLI output
     * @return string with registers values
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("REGISTER VALUES\n");
        for (Map.Entry<Register, Number> entry : registerValue.entrySet()) {
            builder
                    .append(entry.getKey())
                    .append(" ")
                    .append(entry.getValue())
                    .append('\n');
        }
        return builder.toString();
    }
}
