package emulator.context;

import lombok.Getter;
import lombok.Setter;

public class CodeStackContext {
    @Getter
    @Setter
    private long currentCommandIndex = 0;
}
