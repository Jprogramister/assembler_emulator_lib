// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/grammar/Assembler.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(AssemblerParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(AssemblerParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#labelDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDef(AssemblerParser.LabelDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperationConst}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperationConst(AssemblerParser.UnaryOperationConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOperationRegister}
	 * labeled alternative in {@link AssemblerParser#unaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperationRegister(AssemblerParser.UnaryOperationRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(AssemblerParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExprRegisters}
	 * labeled alternative in {@link AssemblerParser#binaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExprRegisters(AssemblerParser.BinaryExprRegistersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExprRegisterConst}
	 * labeled alternative in {@link AssemblerParser#binaryOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExprRegisterConst(AssemblerParser.BinaryExprRegisterConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(AssemblerParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AssemblerParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(AssemblerParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#commonRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonRegister(AssemblerParser.CommonRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#codeRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeRegister(AssemblerParser.CodeRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#stackRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackRegister(AssemblerParser.StackRegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerParser#dataRegister}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataRegister(AssemblerParser.DataRegisterContext ctx);
}