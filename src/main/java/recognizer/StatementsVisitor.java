package recognizer;

import lombok.extern.slf4j.Slf4j;
import recognizer.generated.AssemblerParser.*;
import statement.Operation;
import exception.OperationParsingError;
import statement.StatementFactory;
import recognizer.generated.AssemblerBaseVisitor;
import statement.Statement;

/**
 * Creates statements by context of AST tree nodes.
 */
@Slf4j
class StatementsVisitor extends AssemblerBaseVisitor<Statement> {
  @Override
  public Statement visitProgramm(ProgrammContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Statement visitLabelDef(LabelDefContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Statement visitUnaryOperationConst(UnaryOperationConstContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Statement visitUnaryOperationRegister(UnaryOperationRegisterContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      var operator = ctx.unaryOperator().getText();
      var id = ctx.register().getText();
      return StatementFactory.createUnary(lineNumber, Operation.parse(operator), id);
    } catch (OperationParsingError e) {
      log.error("Unary operation parsing error", e);
      return Statement.emptyStatement(lineNumber);
    }
  }

  /**
   * Visits statement of type operator register1, register2
   */
  @Override
  public Statement visitBinaryOperationRegisters(BinaryOperationRegistersContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      String operatorId = ctx.binaryOperator().getText();
      var leftRegister = ctx.register(0).getText();
      var rightRegister = ctx.register(1).getText();
      return StatementFactory.createBinary(lineNumber, Operation.parse(operatorId), leftRegister, rightRegister);
    } catch (OperationParsingError ex) {
      log.error("Binary operation parsing error", ex);
      return Statement.emptyStatement(lineNumber);
    }
  }

  /**
   * Visits statement of type operator register, const
   */
  @Override
  public Statement visitBinaryOperationRegisterConst(BinaryOperationRegisterConstContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
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
  public Statement visitUnaryOperationLabelJump(UnaryOperationLabelJumpContext ctx) {
    int lineNumber = ctx.getStart().getLine();
    try {
      String labelId = ctx.ID().getText();
      return StatementFactory.createJmp(lineNumber, labelId);
    } catch (OperationParsingError ex) {
      log.error("Visit unary operation label jump error", ex);
      return Statement.emptyStatement(lineNumber);
    }
  }
}
