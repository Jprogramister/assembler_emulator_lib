

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        ANTLRInputStream input;
        {
            try {
                input = new ANTLRInputStream(System.in);
                CalculatorLexer lexer = new CalculatorLexer(input);
                CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
                CalculatorParser parser = new CalculatorParser(commonTokenStream);

                ParseTree parseTree = parser.prog();
                System.out.println(parseTree.toStringTree());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
