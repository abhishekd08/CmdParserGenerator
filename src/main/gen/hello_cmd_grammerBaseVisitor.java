// Generated from /home/abhishek/IdeaProjects/CmdParserGenerator/src/main/resources/hello_cmd_grammer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link hello_cmd_grammerVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class hello_cmd_grammerBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements hello_cmd_grammerVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrule(hello_cmd_grammerParser.PruleContext ctx) { return visitChildren(ctx); }
}