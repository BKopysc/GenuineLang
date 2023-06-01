// Generated from GLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GLangParser}.
 */
public interface GLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(GLangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(GLangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignNew}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignNew(GLangParser.AssignNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignNew}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignNew(GLangParser.AssignNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(GLangParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(GLangParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void enterRead(GLangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void exitRead(GLangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(GLangParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(GLangParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(GLangParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(GLangParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(GLangParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(GLangParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(GLangParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(GLangParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(GLangParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(GLangParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueID}
	 * labeled alternative in {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueID(GLangParser.ValueIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueID}
	 * labeled alternative in {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueID(GLangParser.ValueIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueINT}
	 * labeled alternative in {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueINT(GLangParser.ValueINTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueINT}
	 * labeled alternative in {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueINT(GLangParser.ValueINTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueREAL}
	 * labeled alternative in {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueREAL(GLangParser.ValueREALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueREAL}
	 * labeled alternative in {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueREAL(GLangParser.ValueREALContext ctx);
}