package recognizer;


import context.LabelDefinitionException;
import context.LabelsContext;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import recognizer.generated.AssemblerBaseListener;
import recognizer.generated.AssemblerParser;
import statement.Statement;
import statement.StatementType;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@NoArgsConstructor
public class AssemblerListener extends AssemblerBaseListener {
  @Getter
  private final List<Statement> statements = new ArrayList<>();
  @Getter
  private final LabelsContext labelsContext = new LabelsContext();
  private final AssemblerVisitor assemblerVisitor = new AssemblerVisitor();

  @Override
  public void exitLabelDef(AssemblerParser.LabelDefContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      String labelId = ctx.ID().getText();
      labelsContext.register(labelId, lineNumber);
      add(new Statement(lineNumber, StatementType.LABEL_DEFINITION, state -> state));
    } catch (LabelDefinitionException e) {
      log.error("Label definition error", e);
      add(new Statement(lineNumber, StatementType.ERROR_STATEMENT, state -> null));
    }
  }

  @Override
  public void exitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx) {
  }

  @Override
  public void exitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx) {
  }

  @Override
  public void exitUnaryOperator(AssemblerParser.UnaryOperatorContext ctx) {
  }

  @Override
  public void exitBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx) {
    add(assemblerVisitor.visit(ctx));
  }

  @Override
  public void exitBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx) {
    add(assemblerVisitor.visit(ctx));
  }

  @Override
  public void enterUnaryOperationLabelJump(AssemblerParser.UnaryOperationLabelJumpContext ctx) {
    add(assemblerVisitor.visit(ctx));
  }

  private void add(@NonNull Statement s) {
    statements.add(s);
  }
}
