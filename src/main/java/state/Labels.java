package state;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import exception.LabelDefinitionException;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Labels {
  private final JsonMapper jsonMapper = new JsonMapper();
  private final Map<String, Label> labels = new HashMap<>();

  @Override
  public String toString() {
    try {
      return toJson();
    } catch (JsonProcessingException e) {
      log.error("LabelsContext to json mapping error", e);
      return "{}";
    }
  }

  public String toJson() throws JsonProcessingException {
    return jsonMapper.writeValueAsString(labels);
  }

  /**
   * Return registered label
   *
   * @param labelId unique id of label matches with {@link Label#id}
   * @return instance of {@link Label}
   * @throws LabelDefinitionException if required label is not registered
   */
  public Label getLabel(String labelId) throws LabelDefinitionException {
    if (!labels.containsKey(labelId)) {
      throw new LabelDefinitionException(String.format("Label not found with id %s", labelId));
    }
    return labels.get(labelId);
  }

  /**
   * Save new label in context
   *
   * @param labelId    unique id of label
   * @param lineNumber line number where label was defined
   * @throws LabelDefinitionException if label id already exists
   */
  public void register(String labelId, int lineNumber) throws LabelDefinitionException {
    if (labels.containsKey(labelId)) {
      throw new LabelDefinitionException(String.format("Label with id %s is already exists", labelId));
    }
    labels.put(labelId, new Label(labelId, lineNumber));
  }
}
