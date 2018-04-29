import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.PrintWriter;

public class sliceRunner {
    public static void main(String[] args) throws Exception {

        //get the character stream from the input file
        org.antlr.v4.runtime.CharStream data =  CharStreams.fromFileName(args[0]);

        //pass the character stream to lexer
        sliceLexer lexer = new sliceLexer(data);

        // generate tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //generate parse tree by passing tokens through parser
        sliceParser parser = new sliceParser(tokens);
        ParserRuleContext tree = parser.program();

        // print LISP-style tree in file parseTree.pt
        try {

            //generate parse tree file
            PrintWriter writer = new PrintWriter("parseTree.pt", "UTF-8");
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
            PrintWriter writer = new PrintWriter("intermediate.sl", "UTF-8");
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