// Generated from C:/Users/User/IdeaProjects/assembler_emulator_lib/src/main/java/recognizer/grammar\Assembler.g4 by ANTLR 4.9
package recognizer.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface AssemblerVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link AssemblerParser#programm}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProgramm(AssemblerParser.ProgrammContext ctx);

  /**
   * Visit a parse tree produced by {@link AssemblerParser#command}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitCommand(AssemblerParser.CommandContext ctx);

  /**
   * Visit a parse tree produced by {@link AssemblerParser#labelDef}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitLabelDef(AssemblerParser.LabelDefContext ctx);

  /**
   * Visit a parse tree produced by the {@code procedureReturn}
   * labeled alternative in {@link AssemblerParser#instruction}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitProcedureReturn(AssemblerParser.ProcedureReturnContext ctx);

  /**
   * Visit a parse tree produced by the {@code resetInterruptionFlag}
   * labeled alternative in {@link AssemblerParser#instruction}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitResetInterruptionFlag(AssemblerParser.ResetInterruptionFlagContext ctx);

  /**
   * Visit a parse tree produced by the {@code unaryOperationConst}
   * labeled alternative in {@link AssemblerParser#unaryOperation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx);

  /**
   * Visit a parse tree produced by the {@code unaryOperationRegister}
   * labeled alternative in {@link AssemblerParser#unaryOperation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx);

  /**
   * Visit a parse tree produced by the {@code unaryOperationProcedureCall}
   * labeled alternative in {@link AssemblerParser#unaryOperation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnaryOperationProcedureCall(AssemblerParser.UnaryOperationProcedureCallContext ctx);

  /**
   * Visit a parse tree produced by the {@code unaryOperationLabelJump}
   * labeled alternative in {@link AssemblerParser#unaryOperation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnaryOperationLabelJump(AssemblerParser.UnaryOperationLabelJumpContext ctx);

  /**
   * Visit a parse tree produced by {@link AssemblerParser#unaryOperator}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitUnaryOperator(AssemblerParser.UnaryOperatorContext ctx);

  /**
   * Visit a parse tree produced by the {@code binaryOperationRegisters}
   * labeled alternative in {@link AssemblerParser#binaryOperation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx);

  /**
   * Visit a parse tree produced by the {@code binaryOperationRegisterConst}
   * labeled alternative in {@link AssemblerParser#binaryOperation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx);

  /**
   * Visit a parse tree produced by {@link AssemblerParser#binaryOperator}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitBinaryOperator(AssemblerParser.BinaryOperatorContext ctx);

  /**
   * Visit a parse tree produced by {@link AssemblerParser#register}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  T visitRegister(AssemblerParser.RegisterContext ctx);
}