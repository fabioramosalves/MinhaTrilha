package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}

	void addCompra(Compra compra) {
		this.compras.add(compra);
	}

	double totalCompras() {
		double total = 0.0;

		for (Compra compra : compras)
			total += compra.obterValorTotal();

		return total;
	}
}