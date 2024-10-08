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
	String p = htmlMaker.visit(parseTree);
    }
}

/* Visitor that turns the ANTLR parse tree into more friendly abstract
 * syntax tree (AST). The return type <T> is AST, see AST.java
 */

class HTMLMaker extends AbstractParseTreeVisitor<String>
               implements ccVisitor<String> {
	
	@Override
	public String visitStart(ccParser.StartContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitHardware(ccParser.HardwareContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitInputs(ccParser.InputsContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitOutputs(ccParser.OutputsContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitLatches(ccParser.LatchesContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitDef(ccParser.DefContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitUpdates(ccParser.UpdatesContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitSiminputs(ccParser.SiminputsContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitVal(ccParser.ValContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitUpdate(ccParser.UpdateContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitArgMulti(ccParser.ArgMultiContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitArgUni(ccParser.ArgUniContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitExUni(ccParser.ExUniContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitExMulti(ccParser.ExMultiContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitOr(ccParser.OrContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}	

	@Override
	public String visitFunCall(ccParser.FunCallContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitAndB(ccParser.AndBContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitAndA(ccParser.AndAContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitVar(ccParser.VarContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitPri(ccParser.PriContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}

	@Override
	public String visitNe(ccParser.NeContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";	
	}

	@Override
	public String visitParen(ccParser.ParenContext ctx) {
		// TODO Auto-generated method stub
		return "Not Implemented";
	}
    
}

