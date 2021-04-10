package recognizer;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class InitialState {
  Map<String, Integer> jmpLabels = new HashMap<>();
}
