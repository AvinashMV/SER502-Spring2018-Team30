import sys

class interpreter:

    #all required initial set up.
    def __init__(self):
        self.executionlist = [ ]
        self.stack = [ ]
        self.symboldict = {}
        self.comparison_flag = False
        self.if_flag = False
        self.else_flag = False
        self.stack_flag = False
        self.usingstack = None
        self.using_if = None
        self.stackpopvalue = None
        self.while_flag = None

    def readfile(self):
        #input file is specified in cmd line arguments.
        if len(sys.argv)<2:
            print("Please specify the input file along with command line arg")
        self.file = sys.argv[1]

        with open(self.file) as f:
            line = f.readline()
            while line:
                line = f.readline()
                line = line.rstrip("\n")
                line = line.rstrip("")
                self.executionlist = line.split(" ")
                self.opcode = self.executionlist[ 0 ]

                if self.opcode == "</":
                    if self.if_flag == True and self.comparison_flag == True:  # if condition is true.
                        self.else_flag == False  # else part should not run
                        continue

                    elif self.if_flag == True and self.comparison_flag == False:  # if condition is false.
                        self.else_flag = True
                        while "ENDIF" not in line:
                            line = next(f)

                    elif self.while_flag == True and self.comparison_flag == False:  # is false.
                        self.while_flag = False
                        while "ENDWHILE" not in line:
                            line = next(f)


                elif self.opcode == "ENDELSE":
                    self.else_flag == None

                elif self.opcode == "ELSE":
                    if self.else_flag == False:  # else should not run
                        while "ENDELSE" not in line:
                            line = next(f)

                # will push to stack.
                # PUSH a , PUSH 3
                elif self.opcode == "PUSH":
                    self.push()

                # will pop topmost element and store in arguement.
                # STORE a
                elif self.opcode == "STORE":
                    self.store()

                # Pop two elements and add them.
                # push the result
                elif self.opcode == "ADDITION":
                    self.addition()

                # Pop two elements and push the result.
                elif self.opcode == "SUBTRACTION":
                    self.subtraction()

                # pop two elements and push the result.
                elif self.opcode == "MULTIPLICATION":
                    self.multiplication()

                # pop two elements and push the result.
                elif self.opcode == "DIVISION":
                    self.divide()

                # pop two elements and push the result.
                elif self.opcode == "MODULUS":
                    self.modulus()

                # Pop an element and check it's value in symbol table.
                # print the value.
                elif self.opcode == "GIVEOUT":
                    self.giveout()

                # sets the if_flag.
                elif self.opcode == "IF":
                    # self.stack.append("IF")
                    self.if_flag = True
                    self.using_if = self.executionlist[ 1 ]

                    continue

                # elif self.opcode=="ENDIF":
                # self.stack.pop()

                # pop two elemennts and sets the comparison_flag flag.
                elif self.opcode == "GREATER":
                    self.greater()

                # pop two elemennts and sets the comparison_flag flag.
                elif self.opcode == "LESSER":
                    self.lesser()

                # pop two elemennts and sets the comparison_flag flag.
                elif self.opcode == "GREATEREQUAL":
                    self.greater_equal()

                # pop two elemennts and sets the comparison_flag flag.
                elif self.opcode == "LESSEREQUAL":
                    self.lesser_equal()

                # pop two elemennts and sets the comparison_flag flag.
                elif self.opcode == "EQUALS":
                    self.equals()

                # pop two elemennts and sets the comparison_flag flag.
                elif self.opcode == "NOTEQUALTO":
                    self.notequalto()

                # declare a stack on symbol stack.
                elif self.opcode == "STACK":
                    self.stack_slice()

                # Pop an element from the system stack and
                # Push it to declared stack.
                elif self.opcode == "STACKPUSH":
                    self.stackpush()

                # Pop an element from the declared stack and
                # get the value from symbol table and assign it to
                # the required variable.
                elif self.opcode == "STACKPOP":
                    lastpos = f.tell()
                    self.stackpop(f)
                    f.seek(lastpos)

                # check if the declared empty or not and display the result.
                elif self.opcode == "STACKISEMPTY":
                    self.stackempty()


                elif self.opcode == "WHILE":
                    self.while_flag = True
                    self.whilepos = f.tell()

                elif self.opcode == "ENDWHILE":
                    f.seek(self.whilepos)

    #Functions for each operation. 

    def stackempty(self):
        temp = self.executionlist[ 1 ]
        temp2 = self.symboldict[ temp ]
        if len(temp2) == 0:
            print("stack {} is empty ".format(temp))
        else:
            print("stack {} is not empty".format(temp))

    def stackpop(self, f):
        linetemp = next(f)  # do a forward look up if next instruction is store?
        if "STORE" in linetemp:
            self.stack_flag = True
            self.usingstack = self.executionlist[ 1 ]
            self.stackpopvalue = self.symboldict[ self.executionlist[ 1 ] ].pop()

        else:
            temp = self.executionlist[ 1 ]
            self.symboldict[ temp ].pop()

    def stackpush(self):
        temp = self.stack.pop()
        self.symboldict[ self.executionlist[ 1 ] ].append(temp)

    def stack_slice(self):
        self.symboldict[ self.executionlist[ 1 ] ] = [ ]

    def equals(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = int(self.symboldict[ temp1 ])
        else:
            temp1 = int(temp1)

        temp2 = self.stack.pop()

        if temp2 in self.symboldict:
            temp2 = int(self.symboldict[ temp2 ])
        else:
            temp2 = int(temp2)

        self.comparison_flag = temp2 == temp1

    def notequalto(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = int(self.symboldict[ temp1 ])
        else:
            temp1 = int(temp1)

        temp2 = self.stack.pop()

        if temp2 in self.symboldict:
            temp2 = int(self.symboldict[ temp2 ])
        else:
            temp2 = int(temp2)

        self.comparison_flag = temp2 != temp1

    def greater(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = int(self.symboldict[ temp1 ])
        else:
            temp1 = int(temp1)

        temp2 = self.stack.pop()

        if temp2 in self.symboldict:
            temp2 = int(self.symboldict[ temp2 ])
        else:
            temp2 = int(temp2)

        self.comparison_flag = temp2 > temp1

    def lesser(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = int(self.symboldict[ temp1 ])
        else:
            temp1 = int(temp1)

        temp2 = self.stack.pop()

        if temp2 in self.symboldict:
            temp2 = int(self.symboldict[ temp2 ])
        else:
            temp2 = int(temp2)

        self.comparison_flag = temp2 < temp1

    def greater_equal(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = int(self.symboldict[ temp1 ])
        else:
            temp1 = int(temp1)

        temp2 = self.stack.pop()

        if temp2 in self.symboldict:
            temp2 = int(self.symboldict[ temp2 ])
        else:
            temp2 = int(temp2)

        self.comparison_flag = temp2 >= temp1

    def lesser_equal(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = int(self.symboldict[ temp1 ])
        else:
            temp1 = int(temp1)

        temp2 = self.stack.pop()

        if temp2 in self.symboldict:
            temp2 = int(self.symboldict[ temp2 ])
        else:
            temp2 = int(temp2)

        self.comparison_flag = temp2 <= temp1

    def giveout(self):
        var = self.stack.pop()
        if var in self.symboldict:
            print("{} = {}".format(var, self.symboldict[ var ]))
        else:
            print(var)

    def push(self):
        if self.executionlist[ 1 ] in self.symboldict:
            self.stack.append(self.executionlist[ 1 ])
        else:
            self.stack.append(self.executionlist[ 1 ])

    def store(self):
        # self.executionlist[1]=self.stack.pop()
        # self.symboltable.append(self.executionlist[1])

        if self.stack_flag == True:
            if self.stackpopvalue in self.symboldict:
                self.stackpopvalue = self.symboldict[ self.stackpopvalue ]

            self.symboldict[ self.executionlist[ 1 ] ] = self.stackpopvalue
            self.stack_flag = False
            self.usingstack = None
            self.stackpopvalue = None
        else:
            self.symboldict[ self.executionlist[ 1 ] ] = self.stack.pop()

    def addition(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = self.symboldict[ temp1 ]

        temp2 = self.stack.pop()
        if temp2 in self.symboldict:
            temp2 = self.symboldict[ temp2 ]

        temp3 = int(temp1) + int(temp2)
        self.stack.append(temp3)

    def subtraction(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = self.symboldict[ temp1 ]

        temp2 = self.stack.pop()
        if temp2 in self.symboldict:
            temp2 = self.symboldict[ temp2 ]

        temp3 = int(temp2) - int(temp1)
        self.stack.append(temp3)

    def multiplication(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = self.symboldict[ temp1 ]

        temp2 = self.stack.pop()
        if temp2 in self.symboldict:
            temp2 = self.symboldict[ temp2 ]

        temp3 = int(temp2) * int(temp1)
        self.stack.append(temp3)

    def divide(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = self.symboldict[ temp1 ]

        temp2 = self.stack.pop()
        if temp2 in self.symboldict:
            temp2 = self.symboldict[ temp2 ]

        temp3 = int(temp2) // int(temp1)
        self.stack.append(temp3)

    def modulus(self):
        temp1 = self.stack.pop()
        if temp1 in self.symboldict:
            temp1 = self.symboldict[ temp1 ]

        temp2 = self.stack.pop()
        if temp2 in self.symboldict:
            temp2 = self.symboldict[ temp2 ]

        temp3 = int(temp2) % int(temp1)
        self.stack.append(temp3)


if __name__ == "__main__":
    obj = interpreter()
    obj.readfile()
