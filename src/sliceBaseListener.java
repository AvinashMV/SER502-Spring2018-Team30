// Generated from C:/Users/Vaishak/Desktop/SER 502/Project/Phase 2\slice.g4 by ANTLR 4.7
import java.util.ArrayList;
import java.util.Stack;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link sliceListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class sliceBaseListener implements sliceListener {

	ArrayList<String> op = new ArrayList<String>();
	Stack<Integer> whileStart = new Stack<Integer>();
	Stack<Integer> whileCond = new Stack<Integer>();
	Stack<Integer> ifElseCount = new Stack<Integer>();
	Stack<Integer> ifElseEnd = new Stack<Integer>();
	Stack<Integer> ifElseCond = new Stack<Integer>();


	int line = 1;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(sliceParser.ProgramContext ctx) {
		op.add("");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(sliceParser.ProgramContext ctx) {
		op.add("");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(sliceParser.BlockContext ctx) {
		line++;
		op.add("</");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(sliceParser.BlockContext ctx) {
		line++;
		op.add("/>");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNoreturnOp(sliceParser.NoreturnOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoreturnOp(sliceParser.NoreturnOpContext ctx) {
		line++;
		op.add("giveout");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInput(sliceParser.InputContext ctx) {
		line++;
		op.add("takein");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInput(sliceParser.InputContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDatatype(sliceParser.DatatypeContext ctx) {
		if(ctx.Num()!=null){
			line++;
			op.add("PUSH " + ctx.Num());
		}else if(ctx.Bool()!=null){
			line++;
			op.add("PUSH " + ctx.Bool());
		}else{
			line++;
			op.add("PUSH " + ctx.Id());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDatatype(sliceParser.DatatypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStackDec(sliceParser.StackDecContext ctx) {
		line++;
		op.add("stack" +ctx.Id());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStackDec(sliceParser.StackDecContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStackOp(sliceParser.StackOpContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStackOp(sliceParser.StackOpContext ctx) {
		if(ctx.stackfunc().pop() != null ){
			line++;
			op.add("STACKPOP " + ctx.Id());
		} else if(ctx.stackfunc().push() != null ){
			line++;
			op.add("STACKPUSH " + ctx.Id());
		} else{
			line++;
			op.add("STACKISEMPTY " + ctx.Id());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStackfunc(sliceParser.StackfuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStackfunc(sliceParser.StackfuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPush(sliceParser.PushContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPush(sliceParser.PushContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPop(sliceParser.PopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPop(sliceParser.PopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEmpty(sliceParser.EmptyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEmpty(sliceParser.EmptyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondition(sliceParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondition(sliceParser.ConditionContext ctx) {
		Integer count = ifElseCount.pop();
		for(int i=0;i<count;i++){
			Integer pos = ifElseEnd.pop();
			String prev = op.get(pos);
			prev += " " + (line);
			op.set(pos, prev);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfpart(sliceParser.IfpartContext ctx) {
		ifElseCount.push(1);
		op.add("IF");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfpart(sliceParser.IfpartContext ctx) {
		op.add("TESTFGOTO");
		ifElseCond.push(line);
		line++;

		op.add("PUSH True");
		op.add("TESTTGOTO");
		ifElseEnd.add(line);
		Integer pos = ifElseCond.pop();
		String prev = op.get(pos);
		prev += " " + (line + 1);
		op.set(pos, prev);
		line++;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElsepart(sliceParser.ElsepartContext ctx) { 
		op.add("ELSE");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElsepart(sliceParser.ElsepartContext ctx) {
		op.add("TESTFGOTO");
		ifElseCond.push(line);
		line++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoop(sliceParser.LoopContext ctx) {
		whileStart.push(line);
		op.add("WHILE");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoop(sliceParser.LoopContext ctx) {
		whileCond.push(line);
		op.add("TESTFGOTO");
		line++;

		op.add("PUSH True");
		op.add("TESTTGOTO " + whileStart.pop());
		Integer pos = whileCond.pop();
		String prev = op.get(pos);
		prev += " " + (line + 1);
		op.set(pos, prev);
		line++;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditionCheck(sliceParser.ConditionCheckContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditionCheck(sliceParser.ConditionCheckContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIntegerCompare(sliceParser.IntegerCompareContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIntegerCompare(sliceParser.IntegerCompareContext ctx) {
		switch(ctx.CompareInt().toString()){
			case ">":
				line++;
				op.add("GREATER");
				break;
			case "<":
				line++;
				op.add("LESSER");
				break;
			case ">=":
				line++;
				op.add("GREATEREQUAL");
				break;
			case "<=":
				line++;
				op.add("LESSEREQUAL");
				break;
			case "==":
				line++;
				op.add("EQUALS");
				break;
			case "!=":
				line++;
				op.add("NOTEQUALTO");
				break;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBoolCompare(sliceParser.BoolCompareContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBoolCompare(sliceParser.BoolCompareContext ctx) {
		line++;
		op.add("EQUALS");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(sliceParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(sliceParser.AssignmentContext ctx) {
		line++;
		op.add("STORE " + ctx.Id());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(sliceParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(sliceParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSubExpr(sliceParser.SubExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	public String checkAdditionOp(sliceParser.SubExprContext ctx){
		String a="";
		switch(ctx.AdditionOp().toString()){
			case "+":
				a = "ADD";
				break;
			case "-":
				a = "SUBTRACT";
				break;
		}
		return a;
	}
	@Override public void exitSubExpr(sliceParser.SubExprContext ctx) {
		line++;
		op.add(checkAdditionOp(ctx));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTerm(sliceParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTerm(sliceParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSubTerm(sliceParser.SubTermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	public String checkMultiplicationOp(sliceParser.SubTermContext ctx){
		String a="";
		switch(ctx.MultiplicationOp().toString()){
			case "*":
				a = "MULTIPLY";
				break;
			case "/":
				a = "DIVIDE";
				break;
			case "%":
				a = "MODULUS";
				break;

		}
		return a;
	}
	@Override public void exitSubTerm(sliceParser.SubTermContext ctx) {
		line++;
		op.add(checkMultiplicationOp(ctx));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(sliceParser.FactorContext ctx) {
		if(ctx.Id()!=null){
			line++;
			op.add("PUSH "+ctx.Id());
		} else if(ctx.Num()!=null){
			line++;
			op.add("PUSH "+ctx.Num());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(sliceParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBoolExpr(sliceParser.BoolExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBoolExpr(sliceParser.BoolExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBoolSubExpression(sliceParser.BoolSubExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBoolSubExpression(sliceParser.BoolSubExpressionContext ctx) {
		if(ctx.BooleanOR() != null){
			line++;
			op.add("OR");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBoolTerm(sliceParser.BoolTermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBoolTerm(sliceParser.BoolTermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSubBoolTerm(sliceParser.SubBoolTermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSubBoolTerm(sliceParser.SubBoolTermContext ctx) {
		if (ctx.BooleanAnd() != null) {
			line++;
			op.add("AND");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBoolFactor(sliceParser.BoolFactorContext ctx) {
			if(ctx.Id() != null){
				line++;
				op.add("PUSH " + ctx.Id());
			} else if(ctx.Bool() != null){
				line++;
				op.add("PUSH " + ctx.Bool());
			}
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBoolFactor(sliceParser.BoolFactorContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}