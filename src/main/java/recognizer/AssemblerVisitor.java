package recognizer;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import operation.Operation;
import operation.OperationParsingError;
import operation.StatementFactory;
import recognizer.generated.AssemblerBaseVisitor;
import recognizer.generated.AssemblerParser;
import statement.Statement;

import java.util.Map;

@Slf4j
class AssemblerVisitor extends AssemblerBaseVisitor<Statement> {
  @Getter
  private Map<String, Long> labelLine;

  @Override
  public Statement visitProgramm(AssemblerParser.ProgrammContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Statement visitLabelDef(AssemblerParser.LabelDefContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Statement visitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Statement visitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      log.debug("AssemblerVisitor visited unaryOperationRegister");
      var operatorId = ctx.unaryOperator().getText();
      var registerId = ctx.register().getText();
      return StatementFactory.createUnary(lineNumber, Operation.parse(operatorId), registerId);
    } catch (OperationParsingError e) {
      log.error("Unary operation parsing error", e);
      return Statement.emptyStatement(lineNumber);
    }
  }

  /**
   * Visits statement of type operator register1, register2
   */
  @Override
  public Statement visitBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      log.debug("AssemblerVisitor visited binaryExprRegisters");
      String operatorId = ctx.binaryOperator().getText();
      var leftRegister = ctx.register(0).getText();
      var rightRegister = ctx.register(1).getText();
      return StatementFactory.createBinary(
              lineNumber,
              Operation.parse(operatorId),
              leftRegister, rightRegister
      );
    } catch (OperationParsingError ex) {
      log.error("Binary operation parsing error", ex);
      return Statement.emptyStatement(lineNumber);
    }
  }

  /**
   * Visits statement of type operator register, const
   */
  @Override
  public Statement visitBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      log.debug("AssemblerVisitor visited binaryExprRegisterConst");
      String operatorId = ctx.binaryOperator().getText();
      var leftRegisterId = ctx.register().getText();
      var rightConstValue = Double.valueOf(ctx.NUMBER().getText());
      return StatementFactory.createBinary(lineNumber, Operation.parse(operatorId), leftRegisterId, rightConstValue);
    } catch (OperationParsingError ex) {
      log.error("Binary operation parsing error ", ex);
      return Statement.emptyStatement(lineNumber);
    }
  }

  @Override
  public Statement visitUnaryOperationLabelJump(AssemblerParser.UnaryOperationLabelJumpContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      log.debug("AssemblerVisitor visited unaryOperationLabelJump");
      String labelId = ctx.ID().getText();
      return StatementFactory.createJmp(lineNumber, labelId);
    } catch (OperationParsingError ex) {
      log.error("Visit unary operation label jump error", ex);
      return Statement.emptyStatement(lineNumber);
    }
  }
}
