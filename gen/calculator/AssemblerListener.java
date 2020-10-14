// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/calculator/Assembler.g4 by ANTLR 4.8
package calculator;
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
	 * Enter a parse tree produced by {@link AssemblerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AssemblerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AssemblerParser.StatContext ctx);
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
	 * Enter a parse tree produced by the {@code unaryExprConst}
	 * labeled alternative in {@link AssemblerParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExprConst(AssemblerParser.UnaryExprConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExprConst}
	 * labeled alternative in {@link AssemblerParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExprConst(AssemblerParser.UnaryExprConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExprRegister}
	 * labeled alternative in {@link AssemblerParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExprRegister(AssemblerParser.UnaryExprRegisterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExprRegister}
	 * labeled alternative in {@link AssemblerParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExprRegister(AssemblerParser.UnaryExprRegisterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExprRegisters}
	 * labeled alternative in {@link AssemblerParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExprRegisters(AssemblerParser.BinaryExprRegistersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExprRegisters}
	 * labeled alternative in {@link AssemblerParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExprRegisters(AssemblerParser.BinaryExprRegistersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExprRegisterConst}
	 * labeled alternative in {@link AssemblerParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExprRegisterConst(AssemblerParser.BinaryExprRegisterConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExprRegisterConst}
	 * labeled alternative in {@link AssemblerParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExprRegisterConst(AssemblerParser.BinaryExprRegisterConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AssemblerParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AssemblerParser.InstructionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#commonRegister}.
	 * @param ctx the parse tree
	 */
	void enterCommonRegister(AssemblerParser.CommonRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#commonRegister}.
	 * @param ctx the parse tree
	 */
	void exitCommonRegister(AssemblerParser.CommonRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#codeRegister}.
	 * @param ctx the parse tree
	 */
	void enterCodeRegister(AssemblerParser.CodeRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#codeRegister}.
	 * @param ctx the parse tree
	 */
	void exitCodeRegister(AssemblerParser.CodeRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#stackRegister}.
	 * @param ctx the parse tree
	 */
	void enterStackRegister(AssemblerParser.StackRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#stackRegister}.
	 * @param ctx the parse tree
	 */
	void exitStackRegister(AssemblerParser.StackRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerParser#dataRegister}.
	 * @param ctx the parse tree
	 */
	void enterDataRegister(AssemblerParser.DataRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerParser#dataRegister}.
	 * @param ctx the parse tree
	 */
	void exitDataRegister(AssemblerParser.DataRegisterContext ctx);
}