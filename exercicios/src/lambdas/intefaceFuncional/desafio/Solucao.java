package lambdas.intefaceFuncional.desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import lambdas.intefaceFuncional.Produto;

public class Solucao {

	public static void main(String[] args) {

		/*
		 * 1. A partir do produto calcular o peco real (com desconto) 2. Imposto *
		 * Municipal: >= 2500 (8.5%) / < 2500 (Isento) 3. Frete: >= 3000 (100)/ < (3000)
		 * * (50) 4. Arredondar: Deixar duas casas decimais 5. Formatar: RS1234,56
		 */

		Produto produto1 = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal;
		UnaryOperator<Double> impostoMunicipal;
		UnaryOperator<Double> frete;
		UnaryOperator<Double> arredondar;
		Function<Double, String> formatar;

		precoFinal = produto -> produto.getPreco() * (1 - produto.getDesconto());
		impostoMunicipal = imposto -> imposto >= 2500 ? imposto + (imposto * 0.085) : imposto;
		frete = valor -> valor >= 3000 ? valor + 100.0 : valor + 50.0;
		arredondar = valor -> new BigDecimal(valor).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
		formatar = valor -> String.format("R$%.2f", valor);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto1);

		System.out.println("O preço final " + preco);
	}
}
