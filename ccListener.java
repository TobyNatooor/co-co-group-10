// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccParser}.
 */
public interface ccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ccParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ccParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Hardware}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void enterHardware(ccParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Hardware}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void exitHardware(ccParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void enterInputs(ccParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void exitInputs(ccParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Outputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(ccParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Outputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Latches}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void enterLatches(ccParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Latches}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void exitLatches(ccParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Definitions}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(ccParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Definitions}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(ccParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Updates}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Updates}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Siminputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Siminputs}
	 * labeled alternative in {@link ccParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Val}
	 * labeled alternative in {@link ccParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVal(ccParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link ccParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVal(ccParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Define}
	 * labeled alternative in {@link ccParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDefine(ccParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Define}
	 * labeled alternative in {@link ccParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDefine(ccParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Update}
	 * labeled alternative in {@link ccParser#updt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(ccParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link ccParser#updt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(ccParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgMulti}
	 * labeled alternative in {@link ccParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgMulti(ccParser.ArgMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgMulti}
	 * labeled alternative in {@link ccParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgMulti(ccParser.ArgMultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgUni}
	 * labeled alternative in {@link ccParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgUni(ccParser.ArgUniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgUni}
	 * labeled alternative in {@link ccParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgUni(ccParser.ArgUniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExUni}
	 * labeled alternative in {@link ccParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExUni(ccParser.ExUniContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExUni}
	 * labeled alternative in {@link ccParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExUni(ccParser.ExUniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExMulti}
	 * labeled alternative in {@link ccParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExMulti(ccParser.ExMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExMulti}
	 * labeled alternative in {@link ccParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExMulti(ccParser.ExMultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr(ccParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr(ccParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(ccParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(ccParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndB}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndB(ccParser.AndBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndB}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndB(ccParser.AndBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndA}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndA(ccParser.AndAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndA}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndA(ccParser.AndAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVar(ccParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVar(ccParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pri}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPri(ccParser.PriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pri}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPri(ccParser.PriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNe(ccParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ne}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNe(ccParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParen(ccParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParen(ccParser.ParenContext ctx);
}