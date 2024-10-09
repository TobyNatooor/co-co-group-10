// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ccParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Hardware}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(ccParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(ccParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Outputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Latches}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(ccParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Definitions}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(ccParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Updates}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Siminputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link ccParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ccParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Define}
	 * labeled alternative in {@link ccParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(ccParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link ccParser#updt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(ccParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ccParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(ccParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndB}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndB(ccParser.AndBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndA}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndA(ccParser.AndAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ccParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pri}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPri(ccParser.PriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe(ccParser.NeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(ccParser.ParenContext ctx);
}