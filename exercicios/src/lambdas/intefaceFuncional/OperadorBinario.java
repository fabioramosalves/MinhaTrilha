package lambdas.intefaceFuncional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(9.8, 5.7));

		// criando um corpo com par de chaves
		BiFunction<Double, Double, String> resultado1 = (n1, n2) -> {
			double notafinal = (n1 + n2) / 2;
			return notafinal >= 7 ? "Aprovado" : "Reprovado";
		};

		// maneira mais simples
		BiFunction<Double, Double, String> resultado2 = 
				(n1, n2) -> (n1 + n2) / 2 >= 7 ? "Aprovado" : "Reprovado";

		
		System.out.println(resultado1.apply(1d, 7d));
		System.out.println(resultado2.apply(8d, 7d));
	}
}
