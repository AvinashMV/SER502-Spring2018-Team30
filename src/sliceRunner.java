import org.antlr.runtime.CharStream;
import org.antlr.runtime.CharStreamState;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.PrintWriter;

public class sliceRunner {
    public static void main(String[] args) throws Exception {
        //Please specify the input filename as an argument when running this file

        org.antlr.v4.runtime.CharStream data =  CharStreams.fromFileName("C:\\Users\\Vaishak\\Documents\\GitHub\\SER502-Spring2018-Team30\\examples\\Input.txt");
        sliceLexer lexer = new sliceLexer(data);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        sliceParser parser = new sliceParser(tokens);
        ParserRuleContext tree = parser.program();
        // print LISP-style tree in file parseTree.pt
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\Vaishak\\Documents\\GitHub\\SER502-Spring2018-Team30\\examples\\parseTree.pt", "UTF-8");
            writer.println(tree);
            writer.println(tree.toStringTree(parser));
            writer.close();
        } catch (Exception e) {
            System.out.println("Cannot write to the file \n\n\n\n"
                    + e.toString());
        }
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        sliceBaseListener extractor = new sliceBaseListener();
        walker.walk(extractor, tree); // initiate walk of tree with listener
        // print the output in the file output.bjav
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\Vaishak\\Documents\\GitHub\\SER502-Spring2018-Team30\\examples\\intermediate.sl", "UTF-8");
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