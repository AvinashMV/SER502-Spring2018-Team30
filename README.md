# SER502-Spring2018-Team30
Compiler and Virtual Machine for a Programming Language

Slice, a simple language created for the SER 502 class project

Tools Used to develop the interpreter and intermediate code are ANTLR,IntelliJ IDEA, PyCharm

Instructions For Installation:

To run it:
1. Download the Slice.zip file
2. Extract the zip file and go to command line 
3. Write a Slice program and save it as a text file
4. Run java -jar Slice.jar input.txt
5. There will be two new files created after running the jar file in java:

    intermediate.sl - The intermediate code generated
    parseTree.pt - The parse tree for reference
    
6. Run python interpreter_slice.py at the same location and enter the name of the intermediate file intermediate.sl
7. The output will be displayed on the terminal.

Instruction for writing code:

1. Only one arithmetic expression is allowed per statement.
2. No nested if-else control blocks are allowed.
3. Boolean comparisions are not allowed at this point of time.
4. No indentation or end of line symbols are used since whitespace is ignored. 
5. '</' and '/>' indicate start and end of the block respectively. 
6. // Used for comments

Syntax for Program:

</

    //comments
    //declaration
    //control structure
    //looping structure
    //stack operations
    //print statement for initialised identifiers
    
/>

Syntax for Declaration:

ID = NUM | ID
Stack ID

Synatx for Condition expression:

ID ('>' | '<' | '==' | '<=' | '>='| '!=') ID|NUM

Syntax for Control Structure:

if { Condition expression }

</

    //declaration
    //stack operations
    //looping structure ( one loop is allowed )
    //print statement for initialised identifiers
    
/>

else //( optional block )

</

    //declaration
    //stack operations
    //looping structure ( one loop is allowed )
    //print statement for initialised identifiers
    
/>

Syntax for Looping Structure:

while { Condition expression }

</

    //declaration
    //stack operations
    //looping structure ( one loop is allowed )
    //print statement for initialised identifiers
    
/>

Syntax for Stack Operations:

stack_ID.push{ ID | NUM }
stack_ID.pop{}
stack_ID.isEmpty{}

Syntax for Print:

giveout ID | NUM 





Link To Youtube Video: https://youtu.be/shjZGsfciro
