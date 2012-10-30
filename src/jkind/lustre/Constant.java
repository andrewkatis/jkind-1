package jkind.lustre;


public class Constant extends AST {
	final public String id;
	final public Expr expr;

	public Constant(Location location, String id, Expr expr) {
		super(location);
		this.id = id;
		this.expr = expr;
	}
}
