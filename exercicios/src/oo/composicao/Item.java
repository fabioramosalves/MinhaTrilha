package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	Compra compra;

	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String toString() {
		return String.format("%s R$ %.2f %d total R$ %.2f", nome, preco, quantidade, preco * quantidade);
	}
}
