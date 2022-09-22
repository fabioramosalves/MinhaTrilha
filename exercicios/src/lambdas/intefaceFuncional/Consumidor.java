package lambdas.intefaceFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = p -> 
		System.out.printf("\nNome: %s Preço: %.2f Desconto: %.2f", 
				p.nome, 
				p.preco,
				p.desconto);

		Produto p1 = new Produto("Caneta", 12.34, 0.09);

		imprimir.accept(p1);

		List<Produto> produtos = Arrays
				.asList(new Produto("Caneta", 12.34, 0.09), 
						new Produto("Lápis", 7.25, 0.09),
						new Produto("Caderno", 25.25, 0.09));


		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}