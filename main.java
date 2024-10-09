import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{
	if (args.length!=1) {
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];
	CharStream input = CharStreams.fromFileName(filename);
	ccLexer lex = new ccLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lex);
	ccParser parser = new ccParser(tokens);
	ParseTree parseTree = parser.start();

	HTMLMaker htmlMaker = new HTMLMaker();
		System.out.println("Before visit");
	String p = htmlMaker.visit(parseTree);
	System.out.println(p);
		System.out.println("Hej med dig");
    }
}


class HTMLMaker extends AbstractParseTreeVisitor<String>
               implements ccVisitor<String> {
	
	@Override
	public String visitStart(ccParser.StartContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Go into start");
		List<ccParser.SectionContext> test = ctx.scs;

		String result = "<!DOCTYPE html>\n" +
				"<html><head><title>TITLEOFTHEPAGE</title>\n" +
				"<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n" +
				"<script type=\"text/javascript\" id=\"MathJax-script\"\n" +
				"async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n" +
				"</script></head><body>\n";

		for(ccParser.SectionContext sc : test){
			result += visit(sc);
		}
		result += "</body></html>";
		return result;
	}

	@Override
	public String visitHardware(ccParser.HardwareContext ctx) {
		String title = ctx.t.getText();
		String result = "<h1>" + title + "</h1>\n";
		return result;
	}

	@Override
	public String visitInputs(ccParser.InputsContext ctx) {
		String scName = "<h2> " + "Inputs" + " </h2>\n";
		String signalStr = "";
		List<Token> signals = ctx.x;
		for (Token s : signals){
			signalStr += s.getText() + "<br>\n";
		}
		String result = scName + signalStr;
		return result;
	}

	@Override
	public String visitOutputs(ccParser.OutputsContext ctx) {
		String scName = "<h2> " + "Outputs" + " </h2>\n";
		String signalStr = "";
		List<Token> signals = ctx.x;
		for (Token s : signals){
			signalStr += s.getText() + "<br>\n";
		}
		String result = scName + signalStr;
		return result;
	}

	@Override
	public String visitLatches(ccParser.LatchesContext ctx) {
		String scName = "<h2> " + "Latches" + " </h2>\n";
		String signalStr = "";
		List<Token> signals = ctx.x;
		for (Token s : signals){
			signalStr += s.getText() + "<br>\n";
		}
		String result = scName + signalStr;
		return result;
	}

	@Override
	public String visitDefinitions(ccParser.DefinitionsContext ctx) {
		String scName = "<h2> " + "Definitions" + " </h2>\n";
		List<ccParser.DefContext> defs = ctx.d;
		String defsStr = "";
		for(ccParser.DefContext def : defs){
			defsStr += visit(def) + "\n";
		}
		String result = scName + defsStr;
		return result;
	}

	@Override
	public String visitUpdates(ccParser.UpdatesContext ctx) {
		String scName = "<h2> " + "Updates" + " </h2>\n";
		List<ccParser.UpdtContext> updts = ctx.u;
		String updtsStr = "";
		for(ccParser.UpdtContext updt : updts){
			updtsStr += visit(updt) + "\n";
		}
		String result = scName + updtsStr;
		return result;
	}

	@Override
	public String visitSiminputs(ccParser.SiminputsContext ctx) {
		String scName = "<h2> " + "Siminputs" + " </h2>\n";
		List<ccParser.ValueContext> vals = ctx.v;
		String valsStr = "";
		for(ccParser.ValueContext val : vals){
			valsStr += visit(val) + "<br>\n";
		}
		String result = scName + valsStr;
		return result;
	}

	@Override
	public String visitVal(ccParser.ValContext ctx) {
		return "<b>" + ctx.x.getText() + "</b>: " + ctx.v.getText();
	}

	@Override
	public String visitDefine(ccParser.DefineContext ctx){
		String defName = "\\(\\mathit{" + ctx.x.getText() + "}";
		List<Token> args = ctx.a;
		String argsStr = "(";
		for (int i = 0; i < args.size(); i++){
			if(i != 0){
				argsStr += ",";
			}
			argsStr += args.get(i).getText();
		}
		argsStr += ")=(";
		String expsStr = visit(ctx.e);
		expsStr += ")\\)<br>";

		String result = defName + argsStr + expsStr;
		return result;
	}

	@Override
	public String visitUpdate(ccParser.UpdateContext ctx) {
		String sig = ctx.x.getText();
		sig += "&larr;";
		String expsStr = "\\(" + visit(ctx.e) + "\\)";
		return sig + expsStr + "<br>";
	}

	@Override
	public String visitArgMulti(ccParser.ArgMultiContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitArgUni(ccParser.ArgUniContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitExUni(ccParser.ExUniContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitExMulti(ccParser.ExMultiContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitOr(ccParser.OrContext ctx) {
		return "(" + visit(ctx.e1) + "\\vee" + visit(ctx.e2) + ")";
	}	

	@Override
	public String visitFunCall(ccParser.FunCallContext ctx) {
		List<ccParser.ExpContext> exps = ctx.e;
		String defName = ctx.v.getText() + "(";
		String expsStr = "";
		for(int i = 0; i < exps.size(); i++){
			if (i != 0){
				expsStr += ",";
			}
			expsStr += visit(exps.get(i));
		}
		return defName + expsStr + ")";
	}

	@Override
	public String visitAndB(ccParser.AndBContext ctx) {
		return "(" + visit(ctx.e1) + "\\wedge" + visit(ctx.e2) + ")";
	}

	@Override
	public String visitAndA(ccParser.AndAContext ctx) {
		return "(" + visit(ctx.e1) + "\\wedge" + visit(ctx.e2) + ")";
	}

	@Override
	public String visitVar(ccParser.VarContext ctx) {
		return "\\mathrm{" + ctx.x.getText() + "}";
	}

	@Override
	public String visitPri(ccParser.PriContext ctx) {
		return "\\mathrm{" + ctx.x.getText() + "'}";
	}

	@Override
	public String visitNe(ccParser.NeContext ctx) {
		return "\\neg{(" + visit(ctx.e) + ")}";
	}

	@Override
	public String visitParen(ccParser.ParenContext ctx) {
		return "(" + visit(ctx.e) + ")";
	}
    
}

