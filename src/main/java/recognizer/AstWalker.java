package recognizer;

import exception.LabelDefinitionException;
import recognizer.generated.AssemblerParser.*;
import state.Labels;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import recognizer.generated.AssemblerBaseListener;
import statement.Statement;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

@Slf4j
@NoArgsConstructor
public class AstWalker extends AssemblerBaseListener {
  @Getter
  private final List<Statement> statements = new ArrayList<>();
  @Getter
  private final Labels labels = new Labels();
  private final StatementsVisitor visitor = new StatementsVisitor();

  @Override
  public void exitLabelDef(LabelDefContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      var labelId = ctx.ID().getText();
      labels.register(labelId, lineNumber);
      add(new Statement(lineNumber, Statement.Type.LABEL_DEFINITION, state -> state));
    } catch (LabelDefinitionException e) {
      log.error("Label definition error", e);
      add(new Statement(lineNumber, Statement.Type.ERROR_STATEMENT, state -> null));
    }
  }

  @Override
  public void exitUnaryOperationConst(UnaryOperationConstContext ctx) {
    var statement = requireNonNull(visitor.visit(ctx), format("Can't unary operator with const statement at %s", ctx.start.toString()));
    add(statement);
  }

  @Override
  public void exitUnaryOperationRegister(UnaryOperationRegisterContext ctx) {
    var statement = requireNonNull(visitor.visit(ctx), format("Can't unary operator statement with register at %s", ctx.start.toString()));
    add(statement);
  }

  @Override
  public void exitBinaryOperationRegisters(BinaryOperationRegistersContext ctx) {
    var statement = requireNonNull(visitor.visit(ctx), format("Can't create binary operation statement with registers at %s", ctx.start.toString()));
    add(statement);
  }

  @Override
  public void exitBinaryOperationRegisterConst(BinaryOperationRegisterConstContext ctx) {
    var statement = requireNonNull(visitor.visit(ctx), format("Can't create binary operation statement with resgister and const at %s", ctx.start.toString()));
    add(statement);
  }

  @Override
  public void enterUnaryOperationLabelJump(UnaryOperationLabelJumpContext ctx) {
    var statement = requireNonNull(visitor.visit(ctx), format("Can't create jump statement at %s", ctx.start.toString()));
    add(statement);
  }

  private void add(Statement s) {
    statements.add(s);
  }
}
