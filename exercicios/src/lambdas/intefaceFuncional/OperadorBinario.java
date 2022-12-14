package lambdas.intefaceFuncional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

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
		BiFunction<Double, Double, String> resultado2 = (n1, n2) -> (n1 + n2) / 2 >= 7 ? "Aprovado" : "Reprovado";

		System.out.println(resultado1.apply(1d, 7d));
		System.out.println(resultado2.apply(8d, 7d));

		// Incluindo composição para obter o mesmo resultado acima

		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

		var resultado = media.andThen(conceito).apply(9.7, 4.1);

		System.out.println(resultado);

		// TODO: FABIO - ATENÇÃO VERIFICAR SE É POSSÍVEL FAZER ISSO ABAIXO:
		var resultadoCompose = conceito.apply(media.apply(9.7, 4.1));
		System.out.println(resultadoCompose);
	}
}
