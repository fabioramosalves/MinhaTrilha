package lambdas;

@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b);
	// double teste(); //interface funcional deve ter apenas um método ou função
	
	public default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}