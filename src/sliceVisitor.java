// Generated from C:/Users/Vaishak/Desktop/SER 502/Project/Phase 2\slice.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sliceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sliceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sliceParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(sliceParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(sliceParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#noreturnOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoreturnOp(sliceParser.NoreturnOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(sliceParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(sliceParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#stackDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackDec(sliceParser.StackDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#stackOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackOp(sliceParser.StackOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#stackfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackfunc(sliceParser.StackfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(sliceParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(sliceParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(sliceParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(sliceParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#ifpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfpart(sliceParser.IfpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#elsepart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsepart(sliceParser.ElsepartContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(sliceParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#conditionCheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionCheck(sliceParser.ConditionCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#integerCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerCompare(sliceParser.IntegerCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#boolCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompare(sliceParser.BoolCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(sliceParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(sliceParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#subExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(sliceParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(sliceParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#subTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTerm(sliceParser.SubTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(sliceParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(sliceParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#boolSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSubExpression(sliceParser.BoolSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#boolTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTerm(sliceParser.BoolTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#subBoolTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubBoolTerm(sliceParser.SubBoolTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link sliceParser#boolFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFactor(sliceParser.BoolFactorContext ctx);
}