// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/grammar/AssemblerParser.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerParserParser}.
 */
public interface AssemblerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(AssemblerParserParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(AssemblerParserParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AssemblerParserParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AssemblerParserParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#labelDef}.
	 * @param ctx the parse tree
	 */
	void enterLabelDef(AssemblerParserParser.LabelDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#labelDef}.
	 * @param ctx the parse tree
	 */
	void exitLabelDef(AssemblerParserParser.LabelDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperationConst}
	 * labeled alternative in {@link AssemblerParserParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperationConst(AssemblerParserParser.UnaryOperationConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperationConst}
	 * labeled alternative in {@link AssemblerParserParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperationConst(AssemblerParserParser.UnaryOperationConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOperationRegister}
	 * labeled alternative in {@link AssemblerParserParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperationRegister(AssemblerParserParser.UnaryOperationRegisterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOperationRegister}
	 * labeled alternative in {@link AssemblerParserParser#unaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperationRegister(AssemblerParserParser.UnaryOperationRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(AssemblerParserParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(AssemblerParserParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExprRegisters}
	 * labeled alternative in {@link AssemblerParserParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExprRegisters(AssemblerParserParser.BinaryExprRegistersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExprRegisters}
	 * labeled alternative in {@link AssemblerParserParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExprRegisters(AssemblerParserParser.BinaryExprRegistersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExprRegisterConst}
	 * labeled alternative in {@link AssemblerParserParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExprRegisterConst(AssemblerParserParser.BinaryExprRegisterConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExprRegisterConst}
	 * labeled alternative in {@link AssemblerParserParser#binaryOperation}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExprRegisterConst(AssemblerParserParser.BinaryExprRegisterConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(AssemblerParserParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(AssemblerParserParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AssemblerParserParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AssemblerParserParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(AssemblerParserParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(AssemblerParserParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#codeRegister}.
	 * @param ctx the parse tree
	 */
	void enterCodeRegister(AssemblerParserParser.CodeRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#codeRegister}.
	 * @param ctx the parse tree
	 */
	void exitCodeRegister(AssemblerParserParser.CodeRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#stackRegister}.
	 * @param ctx the parse tree
	 */
	void enterStackRegister(AssemblerParserParser.StackRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#stackRegister}.
	 * @param ctx the parse tree
	 */
	void exitStackRegister(AssemblerParserParser.StackRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#dataRegister}.
	 * @param ctx the parse tree
	 */
	void enterDataRegister(AssemblerParserParser.DataRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#dataRegister}.
	 * @param ctx the parse tree
	 */
	void exitDataRegister(AssemblerParserParser.DataRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParserParser#commonRegister}.
	 * @param ctx the parse tree
	 */
	void enterCommonRegister(AssemblerParserParser.CommonRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParserParser#commonRegister}.
	 * @param ctx the parse tree
	 */
	void exitCommonRegister(AssemblerParserParser.CommonRegisterContext ctx);
}