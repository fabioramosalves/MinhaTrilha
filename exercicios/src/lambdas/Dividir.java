package lambdas;

public class Dividir implements Calculo {

	public double executar(double a, double b) {
		if (b != 0)
			return a / b;

		return 0;
	}
}