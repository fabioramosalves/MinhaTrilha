package streamAPI.desafio;

public class Produto {

	String nome;
	double preco;
	ProdutoTipo tipo;
	boolean ativo;
	double frete;
	double desconto;
	
	Produto(String nome, double preco, ProdutoTipo tipo, boolean ativo, double frete, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.ativo = ativo;
		this.frete = frete;
		this.desconto = desconto;
	}
}
