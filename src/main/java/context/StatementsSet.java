package context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;


public class StatementsSet implements ListIterator<Statement> {
  private final JsonMapper jsonMapper = new JsonMapper();
  private final List<Statement> statements = new ArrayList<>();
  private int index = 0;

  @Override
  public boolean hasNext() {
    return index < statements.size() - 1;
  }

  @Override
  public Statement next() {
    return statements.get(index++);
  }

  @Override
  public boolean hasPrevious() {
    return index > 0;
  }

  @Override
  public Statement previous() {
    return null;
  }

  @Override
  public int nextIndex() {
    return 0;
  }

  @Override
  public int previousIndex() {
    return 0;
  }

  @Override
  public void remove() {

  }

  @Override
  public void set(Statement statement) {

  }

  @Override
  public void add(Statement statement) {

  }

  public int size() {
    return statements.size();
  }

  @Override
  public String toString() {
    try {
      return toJson();
    } catch (JsonProcessingException e) {
      return "{}";
    }
  }

  public String toJson() throws JsonProcessingException {
    List<String> statementsJson = statements.stream()
            .map(Statement::toString)
            .collect(Collectors.toList());
    return jsonMapper.writeValueAsString(statementsJson);
  }

  public void jumpTo(int lineToJump) {
    index = lineToJump;
  }
}
