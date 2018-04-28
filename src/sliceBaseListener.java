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


	int line = 1;		// counter to keep the line count for generating intermediate code line by line

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
		op.add("</");		//start block indicator
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(sliceParser.BlockContext ctx) {
		line++;
		op.add("/>");		//end block indicator
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
		op.add("GIVEOUT");		//print keyword
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInput(sliceParser.InputContext ctx) {
		line++;
		op.add("TAKEIN");		//read keyword
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
			op.add("PUSH " + ctx.Num());		//keyword to identify pushing int values to stack
		}else if(ctx.Bool()!=null){
			line++;
			op.add("PUSH " + ctx.Bool());		//keyword to identify pushing boolean values to stack
		}else{
			line++;
			op.add("PUSH " + ctx.Id());			//keyword to identify pushing id  to stack
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
		op.add("STACK " +ctx.Id());			// keyword to identify stack declaration
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
			op.add("STACKPOP " + ctx.Id());				// keyword to identify popping of stack
		} else if(ctx.stackfunc().push() != null ){
			line++;
			op.add("STACKPUSH " + ctx.Id());			// keyword ti identify pushing value to stack
		} else{
			line++;
			op.add("STACKISEMPTY " + ctx.Id());			// keyword to check if stack is empty
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
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfpart(sliceParser.IfpartContext ctx) {
		ifElseCount.push(1);
		op.add("IF ");			// keyword to identify start of if block
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfpart(sliceParser.IfpartContext ctx) {
		op.add("ENDIF ");			// keyword to identify end of if block
		ifElseCond.push(line);
		line++;
		Integer pos = ifElseCond.pop();
		String prev = op.get(pos);
		op.set(pos, prev);
		line++;



	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElsepart(sliceParser.ElsepartContext ctx) {
		op.add("ELSE ");

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElsepart(sliceParser.ElsepartContext ctx) {

		ifElseCond.push(line);
		op.add("ENDELSE ");			// keyword to identify end of else block
		line++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoop(sliceParser.LoopContext ctx) {
		op.add("WHILE ");			// keyword to identify start of while block
		whileStart.push(line);

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoop(sliceParser.LoopContext ctx) {

		whileCond.push(line);		// keyword to identify end of while block
		op.add("ENDWHILE ");
		line++;
		Integer pos = whileCond.pop();
		String prev = op.get(pos);
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
				op.add("GREATER");			// keyword to identify greater than symbol
				break;
			case "<":
				line++;
				op.add("LESSER");			// keyword to identify lesser than symbol
				break;
			case ">=":
				line++;
				op.add("GREATEREQUAL");		// keyword to identify greater than or equal to
				break;
			case "<=":
				line++;
				op.add("LESSEREQUAL");		// keyword to identify lesser than or equal to
				break;
			case "==":
				line++;
				op.add("EQUALS");			// keyword to identify equals to
				break;
			case "!=":
				line++;
				op.add("NOTEQUALTO");		// keyword to identify not equal to
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
		op.add("STORE " + ctx.Id());		// keyword to identify storing elements on the stack in interpreter
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
				a = "ADDITION";			// keyword to identify addition operation
				break;
			case "-":
				a = "SUBTRACTION";		// keyword to identify subtraction operation
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
				a = "MULTIPLICATION";		// keyword to identify multiplication operation
				break;
			case "/":
				a = "DIVISION";				// keyword to identify division operation
				break;
			case "%":
				a = "MODULUS";				// keyword to identify modulus operation
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
			op.add("OR");			// keyword to identify boolean
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
			op.add("AND");			// keyword to identify boolean and
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