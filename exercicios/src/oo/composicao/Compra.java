package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String Cliente;
	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}

	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.preco * item.quantidade;
		}

		return total;
	}

	public String toString() {
		return String.format("Valor total da compra R$ %.2f ", obterValorTotal());
	}
}
