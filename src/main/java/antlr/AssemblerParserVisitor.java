// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/grammar/AssemblerParser.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblerParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(AssemblerParserParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(AssemblerParserParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#labelDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDef(AssemblerParserParser.LabelDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperationConst}
	 * labeled alternative in {@link AssemblerParserParser#unaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperationConst(AssemblerParserParser.UnaryOperationConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperationRegister}
	 * labeled alternative in {@link AssemblerParserParser#unaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperationRegister(AssemblerParserParser.UnaryOperationRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(AssemblerParserParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExprRegisters}
	 * labeled alternative in {@link AssemblerParserParser#binaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExprRegisters(AssemblerParserParser.BinaryExprRegistersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExprRegisterConst}
	 * labeled alternative in {@link AssemblerParserParser#binaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExprRegisterConst(AssemblerParserParser.BinaryExprRegisterConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(AssemblerParserParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AssemblerParserParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(AssemblerParserParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#codeRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeRegister(AssemblerParserParser.CodeRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#stackRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackRegister(AssemblerParserParser.StackRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#dataRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRegister(AssemblerParserParser.DataRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParserParser#commonRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonRegister(AssemblerParserParser.CommonRegisterContext ctx);
}