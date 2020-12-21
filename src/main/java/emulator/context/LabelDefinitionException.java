package emulator.context;

/**
 * Will be thrown on attempt repeat label definition of attempt get nonexistent label
 */
public class LabelDefinitionException extends Exception {
    public LabelDefinitionException(String s) {
        super(s);
    }
}
