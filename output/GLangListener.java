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
	 * Enter a parse tree produced by {@link GLangParser#startBlock}.
	 * @param ctx the parse tree
	 */
	void enterStartBlock(GLangParser.StartBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#startBlock}.
	 * @param ctx the parse tree
	 */
	void exitStartBlock(GLangParser.StartBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#nestedBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedBlock(GLangParser.NestedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#nestedBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedBlock(GLangParser.NestedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#nestedFunctionBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedFunctionBlock(GLangParser.NestedFunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#nestedFunctionBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedFunctionBlock(GLangParser.NestedFunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#defaultLine}.
	 * @param ctx the parse tree
	 */
	void enterDefaultLine(GLangParser.DefaultLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#defaultLine}.
	 * @param ctx the parse tree
	 */
	void exitDefaultLine(GLangParser.DefaultLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#basicLine}.
	 * @param ctx the parse tree
	 */
	void enterBasicLine(GLangParser.BasicLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#basicLine}.
	 * @param ctx the parse tree
	 */
	void exitBasicLine(GLangParser.BasicLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#functionLine}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLine(GLangParser.FunctionLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#functionLine}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLine(GLangParser.FunctionLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDef}
	 * labeled alternative in {@link GLangParser#functionStat}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(GLangParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDef}
	 * labeled alternative in {@link GLangParser#functionStat}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(GLangParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParams(GLangParser.FunctionParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParams(GLangParser.FunctionParamsContext ctx);
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
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void enterCall(GLangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link GLangParser#semicolonStat}.
	 * @param ctx the parse tree
	 */
	void exitCall(GLangParser.CallContext ctx);
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
	 * Enter a parse tree produced by {@link GLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParams(GLangParser.FunctionCallParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#functionCallParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParams(GLangParser.FunctionCallParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(GLangParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(GLangParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleIf}
	 * labeled alternative in {@link GLangParser#instructionStat}.
	 * @param ctx the parse tree
	 */
	void enterSingleIf(GLangParser.SingleIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleIf}
	 * labeled alternative in {@link GLangParser#instructionStat}.
	 * @param ctx the parse tree
	 */
	void exitSingleIf(GLangParser.SingleIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link GLangParser#instructionStat}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(GLangParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link GLangParser#instructionStat}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(GLangParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link GLangParser#instructionStat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GLangParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link GLangParser#instructionStat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GLangParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedElseBlock}
	 * labeled alternative in {@link GLangParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedElseBlock(GLangParser.NestedElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedElseBlock}
	 * labeled alternative in {@link GLangParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedElseBlock(GLangParser.NestedElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(GLangParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(GLangParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GLangParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void enterElseCondition(GLangParser.ElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GLangParser#elseCondition}.
	 * @param ctx the parse tree
	 */
	void exitElseCondition(GLangParser.ElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualCondition(GLangParser.EqualConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualCondition(GLangParser.EqualConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterCondition(GLangParser.GreaterConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterCondition(GLangParser.GreaterConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLessCondition(GLangParser.LessConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLessCondition(GLangParser.LessConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqualCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualCondition(GLangParser.GreaterEqualConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqualCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualCondition(GLangParser.GreaterEqualConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqualCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualCondition(GLangParser.LessEqualConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqualCondition}
	 * labeled alternative in {@link GLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualCondition(GLangParser.LessEqualConditionContext ctx);
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
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(GLangParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link GLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(GLangParser.FunctionCallExpressionContext ctx);
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