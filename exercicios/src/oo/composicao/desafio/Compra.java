package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
	
	void adicionarItem(String nome,double preco, int qtde) {
		this.itens.add(new Item(new Produto(nome, preco), qtde));
	}

	double obterValorTotal() {
		double valor = 0.0;
		for (Item item : itens)
			valor += item.quantidade * item.produto.preco;

		return valor;
	}
}
