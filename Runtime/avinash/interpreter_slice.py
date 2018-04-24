class interpreter:

    def __init__(self):
        self.executionlist=[]
        self.stack=[]
        self.symboltable=[]
        self.symboldict={}
        self.comparison=False
        self.if_flag=False

    def readfile(self):
        self.file = input("enter the file: ")
        with open(self.file) as f:
            for line in f:

                #print(line)
                line= line.rstrip("\n")
                line= line.rstrip("")
                self.executionlist=line.split(" ")

                self.opcode = self.executionlist[0]

                if self.opcode=="</":
                    if self.if_flag == self.comparison:  # if condition is true.
                        continue

                    elif self.if_flag != self.comparison: # if condition is false.
                        while "/>" not in line:
                            line=next(f)
                    
                elif self.opcode=="PUSH":
                    self.push()

                elif self.opcode=="STORE":
                    self.store()


                elif self.opcode=="ADDITION":
                    self.addition()

                elif self.opcode=="SUBTRACTION":
                    self.subtraction()

                elif self.opcode=="MULTIPLICATION":
                    self.multiplication()


                elif self.opcode=="DIVISION":
                    self.divide()


                elif self.opcode=="MODULUS":
                    self.modulus()


                elif self.opcode=="GIVEOUT":
                    self.giveout()

                elif self.opcode=="IF":
                    self.if_flag=True
                    continue

                elif self.opcode=="GREATER":
                    self.greater()

               # print(self.executionlist)



    def greater(self):
        temp1=self.stack.pop()
        if temp1 in self.symboldict:
            temp1= self.symboldict[temp1]
        else:
            temp1=int(temp1)

        temp2=self.stack.pop()

        if temp2 in self.symboldict:
            temp2= int(self.symboldict[temp2])
        else:
            temp2=int(temp2)

        self.comparison = temp2 > temp1





    def giveout(self):
        var=self.stack.pop()
        print("{} = {}".format(var, self.symboldict[var]))
        
    def push(self):
        if self.executionlist[1] in self.symboldict:
            self.stack.append(self.executionlist[1])
        else:
            self.stack.append(self.executionlist[1])

    
    def store(self):
        # self.executionlist[1]=self.stack.pop()
        # self.symboltable.append(self.executionlist[1])

        self.symboldict[self.executionlist[1]]= self.stack.pop()


    def addition(self):
        temp1 = self.symboldict[self.stack.pop()]
        temp2 = self.symboldict[self.stack.pop()]
        temp3= int(temp1) + int(temp2)
        self.stack.append(temp3)

    def subtraction(self):
        temp1 = self.symboldict[self.stack.pop()]
        temp2 = self.symboldict[self.stack.pop()]
        temp3= int(temp2) - int(temp1)
        self.stack.append(temp3)


    def multiplication(self):
        temp1 = self.symboldict[self.stack.pop()]
        temp2 = self.symboldict[self.stack.pop()]
        temp3= int(temp2) * int(temp1)
        self.stack.append(temp3)

    def divide(self):
        temp1 = self.symboldict[self.stack.pop()] 
        temp2 = self.symboldict[self.stack.pop()] 
        temp3= int(temp2) // int(temp1)
        self.stack.append(temp3)                  

    def modulus(self):
        temp1 = self.symboldict[self.stack.pop()]
        temp2 = self.symboldict[self.stack.pop()]
        temp3= int(temp2) % int(temp1)
        self.stack.append(temp3)


if __name__=="__main__":
    obj=interpreter()
    obj.readfile()
