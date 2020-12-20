package emulator.context;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.util.HashMap;
import java.util.Map;

public class LabelsContext {
    @Value
    public static class Label {
        String id;
        Long definitionLineNumber;
    }

    public static class LabelDefinitionException extends Exception {
        public LabelDefinitionException(String s) {
            super(s);
        }
    }

    private final Map<String, Label> labels = new HashMap<>();

    public Label getLabel(String labelId) throws Exception {
        if (!labels.containsKey(labelId)) {
            throw new Exception(String.format("Label not found with id %s", labelId));
        }
        return labels.get(labelId);
    }

    public void register(String labelId, long lineNumber) throws LabelDefinitionException {
        if (labels.containsKey(labelId)) {
            throw new LabelDefinitionException(String.format("Label with id %s is already exists", labelId));
        }
        if (labels.containsValue(lineNumber)) {
            throw new LabelDefinitionException(String.format("Label for jump to line %d is already exists", lineNumber));
        }
        labels.put(labelId, new Label(labelId, lineNumber));
    }
}
