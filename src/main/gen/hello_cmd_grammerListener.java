// Generated from /home/abhishek/IdeaProjects/CmdParserGenerator/src/main/resources/hello_cmd_grammer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hello_cmd_grammerParser}.
 */
public interface hello_cmd_grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hello_cmd_grammerParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(hello_cmd_grammerParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link hello_cmd_grammerParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(hello_cmd_grammerParser.PruleContext ctx);
}