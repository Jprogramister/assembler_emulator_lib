// Generated from C:/Users/User/IdeaProjects/assembler_emulator_lib/src/main/java/recognizer/grammar\Assembler.g4 by ANTLR 4.9.1
package recognizer.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerParser}.
 */
public interface AssemblerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(AssemblerParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(AssemblerParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AssemblerParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AssemblerParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#labelDef}.
	 * @param ctx the parse tree
	 */
	void enterLabelDef(AssemblerParser.LabelDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#labelDef}.
	 * @param ctx the parse tree
	 */
	void exitLabelDef(AssemblerParser.LabelDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureReturn}
	 * labeled alternative in {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterProcedureReturn(AssemblerParser.ProcedureReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureReturn}
	 * labeled alternative in {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitProcedureReturn(AssemblerParser.ProcedureReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetInterruptionFlag}
	 * labeled alternative in {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterResetInterruptionFlag(AssemblerParser.ResetInterruptionFlagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetInterruptionFlag}
	 * labeled alternative in {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitResetInterruptionFlag(AssemblerParser.ResetInterruptionFlagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperationConst}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperationConst}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperationRegister}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperationRegister}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperationProcedureCall}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperationProcedureCall(AssemblerParser.UnaryOperationProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperationProcedureCall}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperationProcedureCall(AssemblerParser.UnaryOperationProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperationLabelJump}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperationLabelJump(AssemblerParser.UnaryOperationLabelJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperationLabelJump}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperationLabelJump(AssemblerParser.UnaryOperationLabelJumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(AssemblerParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(AssemblerParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperationRegisters}
	 * labeled alternative in {@link AssemblerParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperationRegisters}
	 * labeled alternative in {@link AssemblerParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperationRegisters(AssemblerParser.BinaryOperationRegistersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperationRegisterConst}
	 * labeled alternative in {@link AssemblerParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperationRegisterConst}
	 * labeled alternative in {@link AssemblerParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperationRegisterConst(AssemblerParser.BinaryOperationRegisterConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(AssemblerParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(AssemblerParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(AssemblerParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(AssemblerParser.RegisterContext ctx);
}