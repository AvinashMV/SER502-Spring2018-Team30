// Generated from C:/Users/Vaishak/Desktop/SER 502/Project/Phase 2\slice.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sliceParser}.
 */
public interface sliceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sliceParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(sliceParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(sliceParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(sliceParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(sliceParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#noreturnOp}.
	 * @param ctx the parse tree
	 */
	void enterNoreturnOp(sliceParser.NoreturnOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#noreturnOp}.
	 * @param ctx the parse tree
	 */
	void exitNoreturnOp(sliceParser.NoreturnOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(sliceParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(sliceParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(sliceParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(sliceParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#stackDec}.
	 * @param ctx the parse tree
	 */
	void enterStackDec(sliceParser.StackDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#stackDec}.
	 * @param ctx the parse tree
	 */
	void exitStackDec(sliceParser.StackDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#stackOp}.
	 * @param ctx the parse tree
	 */
	void enterStackOp(sliceParser.StackOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#stackOp}.
	 * @param ctx the parse tree
	 */
	void exitStackOp(sliceParser.StackOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#stackfunc}.
	 * @param ctx the parse tree
	 */
	void enterStackfunc(sliceParser.StackfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#stackfunc}.
	 * @param ctx the parse tree
	 */
	void exitStackfunc(sliceParser.StackfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(sliceParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(sliceParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(sliceParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(sliceParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(sliceParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(sliceParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(sliceParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(sliceParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#ifpart}.
	 * @param ctx the parse tree
	 */
	void enterIfpart(sliceParser.IfpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#ifpart}.
	 * @param ctx the parse tree
	 */
	void exitIfpart(sliceParser.IfpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void enterElsepart(sliceParser.ElsepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#elsepart}.
	 * @param ctx the parse tree
	 */
	void exitElsepart(sliceParser.ElsepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(sliceParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(sliceParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#conditionCheck}.
	 * @param ctx the parse tree
	 */
	void enterConditionCheck(sliceParser.ConditionCheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#conditionCheck}.
	 * @param ctx the parse tree
	 */
	void exitConditionCheck(sliceParser.ConditionCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#integerCompare}.
	 * @param ctx the parse tree
	 */
	void enterIntegerCompare(sliceParser.IntegerCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#integerCompare}.
	 * @param ctx the parse tree
	 */
	void exitIntegerCompare(sliceParser.IntegerCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#boolCompare}.
	 * @param ctx the parse tree
	 */
	void enterBoolCompare(sliceParser.BoolCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#boolCompare}.
	 * @param ctx the parse tree
	 */
	void exitBoolCompare(sliceParser.BoolCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(sliceParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(sliceParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sliceParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sliceParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(sliceParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#subExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(sliceParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(sliceParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(sliceParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#subTerm}.
	 * @param ctx the parse tree
	 */
	void enterSubTerm(sliceParser.SubTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#subTerm}.
	 * @param ctx the parse tree
	 */
	void exitSubTerm(sliceParser.SubTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(sliceParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(sliceParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(sliceParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(sliceParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#boolSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolSubExpression(sliceParser.BoolSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#boolSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolSubExpression(sliceParser.BoolSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#boolTerm}.
	 * @param ctx the parse tree
	 */
	void enterBoolTerm(sliceParser.BoolTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#boolTerm}.
	 * @param ctx the parse tree
	 */
	void exitBoolTerm(sliceParser.BoolTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#subBoolTerm}.
	 * @param ctx the parse tree
	 */
	void enterSubBoolTerm(sliceParser.SubBoolTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#subBoolTerm}.
	 * @param ctx the parse tree
	 */
	void exitSubBoolTerm(sliceParser.SubBoolTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link sliceParser#boolFactor}.
	 * @param ctx the parse tree
	 */
	void enterBoolFactor(sliceParser.BoolFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sliceParser#boolFactor}.
	 * @param ctx the parse tree
	 */
	void exitBoolFactor(sliceParser.BoolFactorContext ctx);
}