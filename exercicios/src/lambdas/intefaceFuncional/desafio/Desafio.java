package lambdas.intefaceFuncional.desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.intefaceFuncional.Produto;

public class Desafio {

	public static void main(String[] args) {

		Produto p1 = new Produto("iPad", 3235.89, 0.13);

		/*
		 * 1. A partir do produto calcular o peco real (com desconto) 2. Imposto *
		 * Municipal: >= 2500 (8.5%) / < 2500 (Isento) 3. Frete: >= 3000 (100)/ < (3000)
		 * * (50) 4. Arredondar: Deixar duas casas decimais 5. Formatar: RS1234,56
		 */

		Function<Produto, Double> precoDesconto = prod 
				-> prod.getPreco() * (1 - prod.getDesconto());

		UnaryOperator<Double> calculoImposto = i -> i >= 2500.0 ? i + (i * 0.085) : i;

		UnaryOperator<Double> freteProduto = p -> p >= 3000.0 ? p + 100.0 : p + 50.0;

		UnaryOperator<Double> arredondar = f -> {
			BigDecimal bd = new BigDecimal(f).setScale(2, RoundingMode.HALF_EVEN);
			return bd.doubleValue();
		};

		Function<Double, String> formatar = d -> {
			return String.format("R$%.2f", d);
		};

		String result = precoDesconto
				.andThen(calculoImposto)
				.andThen(freteProduto)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p1);

		System.out.println(result);
	}
}
