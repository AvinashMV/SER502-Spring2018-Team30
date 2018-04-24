class interpreter:

    def __init__(self):
        self.executionlist=[]
        self.stack=[]
        self.symboltable=[]
        self.symboldict={}

    def readfile(self):
        self.file = input("enter the file: ")
        with open(self.file) as f:
            for line in f:
                
                line= line.rstrip("\n")
                line= line.rstrip("")
                self.executionlist=line.split(" ")

                self.opcode = self.executionlist[0]

                if self.opcode=="</":
                    continue
                    
                elif self.opcode=="PUSH":
                    self.push()

                elif self.opcode=="STORE":
                    self.store()


                elif self.opcode=="ADD":
                    self.add()

                elif self.opcode=="giveout":
                    self.giveout()

               # print(self.executionlist)



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


    def add(self):
        temp1 = self.symboldict[self.stack.pop()]
        temp2 = self.symboldict[self.stack.pop()]
        temp3= int(temp1) + int(temp2)
        self.stack.append(temp3)

if __name__=="__main__":
    obj=interpreter()
    obj.readfile()
