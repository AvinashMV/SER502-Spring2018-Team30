import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.PrintWriter;

public class sliceRunner {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD

        //get the character stream from the input file
        org.antlr.v4.runtime.CharStream data =  CharStreams.fromFileName("/Users/darshan/IdeaProjects/SER502-Spring2018-Team30/examples/Input Files/Input 9.txt");

        //pass the character stream to lexer
=======
        //Please specify the input filename as an argument when running this file
        org.antlr.v4.runtime.CharStream data =  CharStreams.fromFileName("C:\\Users\\Vaishak\\Documents"
        		+ "\\GitHub\\SER502-Spring2018-Team30\\examples\\Input Files\\Input 11.txt");
>>>>>>> 7db807745836da9ab7715e3fe1b33a4e00d4d131
        sliceLexer lexer = new sliceLexer(data);

        // generate tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //generate parse tree by passing tokens through parser
        sliceParser parser = new sliceParser(tokens);
        ParserRuleContext tree = parser.program();

        // print LISP-style tree in file parseTree.pt
        try {

            //generate parse tree file
            PrintWriter writer = new PrintWriter("/Users/darshan/IdeaProjects/SER502-Spring2018-Team30/examples/Parse Tree/parseTree9.pt", "UTF-8");
            writer.println(tree);
            writer.println(tree.toStringTree(parser));
            writer.close();
        } catch (Exception e) {
            System.out.println("Cannot write to the file \n\n\n\n"
                    + e.toString());
        }

        // create standard walker
        ParseTreeWalker walker = new ParseTreeWalker();
        sliceBaseListener extractor = new sliceBaseListener();

        // initiate walk of tree with listener
        walker.walk(extractor, tree);

        // print the output in the file output.sl
        try {
            PrintWriter writer = new PrintWriter("/Users/darshan/IdeaProjects/SER502-Spring2018-Team30/examples/Intermediate Code/intermediate9.sl", "UTF-8");
            for (int i = 1; i < extractor.op.size(); i++) {
                writer.println(extractor.op.get(i));
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Cannot write to the file \n\n\n\n"
                    + e.toString());
        }
    }
}