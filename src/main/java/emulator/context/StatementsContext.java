package emulator.context;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import emulator.statement.Statement;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StatementsContext {
    private final JsonMapper jsonMapper = new JsonMapper();
    private final List<Statement> statements = new ArrayList<>();
    /* Next instruction for execution */
    @Getter
    private long currentStatement = 0;

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

    public Statement get(int index) {
        return statements.get(index);
    }

    public void add(Statement s) {
        statements.add(s);
    }

    public void setCurrentStatement(long statementIndex) throws StatementsNavigationException {
        if (statementIndex >= statements.size() || statementIndex < 0) {
            throw new StatementsNavigationException(String.format("Can not set statement at index %d", statementIndex));
        }
        currentStatement = statementIndex;
    }

    public void stepUp() throws StatementsNavigationException {
        setCurrentStatement(getCurrentStatement() + 1);
    }

    public void stepBack() throws StatementsNavigationException {
        setCurrentStatement(getCurrentStatement() - 1);
    }

    public String toJson() throws JsonProcessingException {
        List<String> statementsJson = statements.stream()
                .map(Statement::toString)
                .collect(Collectors.toList());
        return jsonMapper.writeValueAsString(statementsJson);
    }
}
