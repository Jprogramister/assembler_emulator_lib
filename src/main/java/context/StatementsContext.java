package context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import statement.Statement;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StatementsContext {
    private final JsonMapper jsonMapper = new JsonMapper();
    @Getter
    private final List<Statement> statements = new ArrayList<>();

    @Setter
    @Getter
    private int currentStatementIndex = 0;

    @Override
    public String toString() {
        try {
            return toJson();
        } catch (JsonProcessingException e) {
            log.error("Statements context mapping to json error", e);
            return "{}";
        }
    }

    public int size() {
        return statements.size();
    }

    public void add(Statement s) {
        statements.add(s);
    }

    public String toJson() throws JsonProcessingException {
        List<String> statementsJson = statements.stream()
                .map(Statement::toString)
                .collect(Collectors.toList());
        return jsonMapper.writeValueAsString(statementsJson);
    }
}
