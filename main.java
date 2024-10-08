import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
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
				"async\n" +
				"src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n" +
				"</script></head><body>\n";

		for(ccParser.SectionContext sc : test){
			result += visit(sc);
		}
		result += "</body></html>";
		return result;
	}

	@Override
	public String visitHardware(ccParser.HardwareContext ctx) {
		// TODO Auto-generated method stub
		String title = ctx.t.getText();
		String result = "<h1>" + title + "</h1>\n";
		return result;
	}

	@Override
	public String visitInputs(ccParser.InputsContext ctx) {
		String scName = "<h2> " + ctx.s.getText() + " </h2>\n";
		String signalStr = "";
		List<Token> signals = ctx.x;
		for (Token s : signals){
			signalStr += s.getText() + "\n";
		}
		String result = scName + signalStr;
		return result;
	}

	@Override
	public String visitOutputs(ccParser.OutputsContext ctx) {
		String scName = "<h2> " + ctx.s.getText() + " </h2>\n";
		String signalStr = "";
		List<Token> signals = ctx.x;
		for (Token s : signals){
			signalStr += s.getText() + "\n";
		}
		String result = scName + signalStr;
		return result;
	}

	@Override
	public String visitLatches(ccParser.LatchesContext ctx) {
		String scName = "<h2>" + ctx.s.getText() + "</h2>\n";
		String signalStr = "";
		List<Token> signals = ctx.x;
		for (Token s : signals){
			signalStr += s.getText() + "\n";
		}
		String result = scName + signalStr;
		return result;
	}

	@Override
	public String visitDef(ccParser.DefContext ctx) {
		String scName = "<h2>" + ctx.s.getText() + "</h2>\n";
		String defName = "\\mathit{" + ctx.x.getText() + "}";
		List<Token> args = ctx.a;
		String argsStr = "(";
		for (int i = 0; i < args.size(); i++){
			if(i != 0){
				argsStr += ",";
			}
			argsStr += args.get(i).getText();
		}
		argsStr += ")=";

		//String exp = ctx.e.getText();
		String result = scName + defName + argsStr + "\n";
		return result;
	}

	@Override
	public String visitUpdates(ccParser.UpdatesContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitSiminputs(ccParser.SiminputsContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitVal(ccParser.ValContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitUpdate(ccParser.UpdateContext ctx) {
		// TODO Auto-generated method stub
		return "";
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
		// TODO Auto-generated method stub
		return "";
	}	

	@Override
	public String visitFunCall(ccParser.FunCallContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitAndB(ccParser.AndBContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitAndA(ccParser.AndAContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitVar(ccParser.VarContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitPri(ccParser.PriContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitNe(ccParser.NeContext ctx) {
		// TODO Auto-generated method stub
		return "";	
	}

	@Override
	public String visitParen(ccParser.ParenContext ctx) {
		// TODO Auto-generated method stub
		return "";
	}
    
}

