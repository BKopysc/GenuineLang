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
	 * Enter a parse tree produced by the {@code operatorExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(GLangParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatorExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(GLangParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterAdd(GLangParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitAdd(GLangParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(GLangParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(GLangParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(GLangParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(GLangParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterDivide(GLangParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link GLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitDivide(GLangParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GLangParser.ValueContext ctx);
}