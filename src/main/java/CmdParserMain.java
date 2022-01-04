import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CmdParserMain {
    public static void main(String[] args) {
        String cmd = "hello there";
        System.out.println("command : " + cmd);
        CmdLexer lexer = new CmdLexer(CharStreams.fromString(cmd));
        System.out.println("here 1");
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("here 2");
        CmdParser parser = new CmdParser(tokens);
        System.out.println("here 3");
        ParseTree tree = parser.prule();
        System.out.println("here 4");
        ParseTreeWalker walker = new ParseTreeWalker();
        System.out.println("here 5");
        walker.walk(new CmdWalker(), tree);
        System.out.println("here 6");
    }
}
