

import antlr.AssemblerLexer;
import antlr.AssemblerParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import recognizer.State;

import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        ANTLRInputStream input;
        {
//            try {
//                input = new ANTLRInputStream(System.in);
//                var lexer = new AssemblerLexer(input);
//                var commonTokenStream = new CommonTokenStream(lexer);
//                var parser = new AssemblerParser(commonTokenStream);
//
//                ParseTree parseTree = parser.programm();
//                System.out.println(parseTree.toStringTree());
//                var state = new State();
//                var visitor = new AssemblerVisitor();
//                var res = visitor.visit(parseTree);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
