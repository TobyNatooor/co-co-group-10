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
	progLexer lex = new progLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lex);
	progParser parser = new progParser(tokens);
	ParseTree parseTree = parser.start();
	ASTMaker astmaker = new ASTMaker();
	Program p=(Program)astmaker.visit(parseTree);
	p.eval(new Environment());
    }
}

/* Visitor that turns the ANTLR parse tree into more friendly abstract
 * syntax tree (AST). The return type <T> is AST, see AST.java
 */

class ASTMaker extends AbstractParseTreeVisitor<AST>
               implements progVisitor<AST> {
    public AST visitStart(progParser.StartContext ctx){
	List<Program> ps = new ArrayList<Program>();
	for (progParser.CmdContext s : ctx.cs )
	    ps.add((Program) visit(s));
	return new Sequence(ps);
    };
    public AST visitSingle(progParser.SingleContext ctx)
    {
	return visit(ctx.c);
    };
    public AST visitBlock(progParser.BlockContext ctx){
	List<Program> ps = new ArrayList<Program>();
	for (progParser.CmdContext s : ctx.cs )
	    ps.add((Program) visit(s));
	return new Sequence(ps);
    };
    public AST visitAssign(progParser.AssignContext ctx){
	return new Assignment(ctx.x.getText(),(Exp) visit(ctx.e));
    };
    public AST visitWhile(progParser.WhileContext ctx){
	return new While((Condition) visit(ctx.c), (Program) visit(ctx.p));
    };
    public AST visitOutput(progParser.OutputContext ctx){
	return new Output((Exp) visit(ctx.e));
	
    };
    public AST visitIf(progParser.IfContext ctx){
	return new If((Condition) visit(ctx.c),
		      (Program) visit(ctx.p1),
		      (Program) visit(ctx.p2));
    };
    public AST visitGreater(progParser.GreaterContext ctx){
	return new Greater((Exp) visit(ctx.e1), (Exp) visit(ctx.e2)); 
    };
    public AST visitEqual(progParser.EqualContext ctx){
	System.err.println("visitEqual: Implement me!");
	System.exit(-1);
	return null;
    };
    public AST visitUnequal(progParser.UnequalContext ctx){
	System.err.println("visitUnequal: Implement me!");
	System.exit(-1);
	return null;
    };
    public AST visitAdd(progParser.AddContext ctx){
	if (ctx.op.getText().equals("+"))
	    return new Addition((Exp) visit(ctx.e1),
				(Exp) visit(ctx.e2));
	else return new Subtraction((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
    };
    public AST visitMult(progParser.MultContext ctx){
	if (ctx.op.getText().equals("*"))
	    return new Multiplication((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
	else return new Division((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
    };
    public AST visitVar(progParser.VarContext ctx){
	return new Variable(ctx.x.getText());
    };
    public AST visitConst(progParser.ConstContext ctx){
	return new Constant(Double.valueOf(ctx.f.getText()));
    };
    public AST visitParen(progParser.ParenContext ctx){
	return visit(ctx.e);
    };
}

