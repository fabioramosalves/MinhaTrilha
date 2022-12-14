package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.apply(3d, 5.0));

		calculo = (x, y) -> x - y; // return de forma implícita (sem as chaves)
		System.out.println(calculo.apply(3.0, 5.0));

		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(3.0, 5.0));

		BinaryOperator<Integer> calculo1 = (x, y) -> x * y;
		System.out.println(calculo1.apply(3, 5));
	}
}
