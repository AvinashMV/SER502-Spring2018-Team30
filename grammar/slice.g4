//author:

grammar slice;

//program start rule
program : '</'block '/>';

block: (assignment | condition | loop | noreturnOp | stackDec | stackOp | input)* ;

// call

noreturnOp : 'giveout' (datatype | stackOp);

input : 'takein' Id;

datatype : (Num | Bool | Id);

// stack specs

stackDec : 'stack' Id;

stackOp : Id stackfunc ;

stackfunc : (push | pop | empty);

push : '.push' '{' (datatype | boolExpr | expr) '}';

pop : '.pop' '{' '}';

empty : '.isEmpty' '{' '}';

//if else statement

condition : (ifpart) (elsepart)?;

ifpart : 'if' '{' conditionCheck '}' '</' block '/>';

elsepart : 'else' '</' block '/>';


//Loop

loop : 'while' '{' conditionCheck '}' '</' block '/>' ;

//Comparison functions

conditionCheck : ( boolCompare | integerCompare | stackOp CompareInt Num) ;

integerCompare : expr CompareInt expr ;

boolCompare : boolExpr CompareBool boolExpr;

//Assignment

assignment : Id '=' (input | expr | boolExpr | stackOp) ;

//Integer expression

expr : (term)(subExpr)* ;

subExpr : AdditionOp term ;

term : (factor) (subTerm)*;

subTerm : MultiplicationOp factor;

factor : (Id | Num | '{' expr '}');


// Boolean expression

boolExpr : (boolTerm) (boolSubExpression)*;

boolSubExpression : BooleanOR boolTerm ;

boolTerm : (boolFactor) (subBoolTerm)*;

subBoolTerm : BooleanAnd boolFactor;

boolFactor : (Id | Bool | '(' boolExpr ')');

//Operators

MultiplicationOp : ('*' | '/' | '%');

AdditionOp : ('+' | '-') ;

CompareInt : ('>' | '<' | '==' | '<=' | '>='| '!=');

BooleanAnd : 'and' ;

BooleanOR : 'or' ;

CompareBool : 'is' ;

//Types

//boolean
Bool : ('T' | 'F') ;

//integer
Num : [0-9]+ ;

//valid identifiers (letters of either case and numbers)
Id: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;

//whitespace
Emptyspace: [ \t\r\n]+ -> skip;

//comments

Comments : '//' ~( '\r' | '\n' )* -> skip
;