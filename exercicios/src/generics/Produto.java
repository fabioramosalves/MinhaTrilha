package generics;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {
	}

	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	public double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	public double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	public String toString() {
		return String.format("Nome: %s %.2f ", this.nome, this.preco);
	}
}
