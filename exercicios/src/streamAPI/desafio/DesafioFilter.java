package streamAPI.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import myClass.Util;

public class DesafioFilter {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Carne", 45.09, ProdutoTipo.Alimentacao, true, 0.0, 0.3));
		produtos.add(new Produto("Camisa", 45.80, ProdutoTipo.Vestuario, false, 100.0, 0.35));
		produtos.add(new Produto("Fogão", 1588.99, ProdutoTipo.Eletrodomestico, true, 100.0, 0.0));
		produtos.add(new Produto("Geladeira", 2665.99, ProdutoTipo.Eletrodomestico, true, 100.0, 0.0));
		produtos.add(new Produto("Bola", 165.99, ProdutoTipo.Esportivo, true, 0.0, 0.0));
		produtos.add(new Produto("Calça", 155.78, ProdutoTipo.Vestuario, true, 0.0, 0.40));

		Predicate<Produto> descontoMaior30 = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.frete == 0.0;
		Predicate<Produto> ativo = p -> p.ativo;
		Predicate<Produto> vestuario = p -> p.tipo == ProdutoTipo.Vestuario;
		Function<Produto, String> result = p -> "Produto: " + p.nome + "\n";

		//filtro do exercicio 202.Desafio Filter#01
		System.out.println("filtro do exercicio 202.Desafio Filter#01 ");
		produtos.stream().filter(ativo).filter(vestuario).map(result).forEach(Util.printOutString);
		
		//filtro do exercicio 202.Desafio Filter#02
		System.out.println("filtro do exercicio 202.Desafio Filter#01 ");
		produtos.stream().filter(descontoMaior30).filter(freteGratis).map(result).forEach(Util.printOutString);
	}
}
