package emulator.context;

import lombok.Value;

@Value
public class Label {
    /* Unique id of label */
    String id;
    /* Line number where label was defined */
    int definitionLineNumber;
}
