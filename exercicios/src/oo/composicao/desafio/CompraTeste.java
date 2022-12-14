package oo.composicao.desafio;

public class CompraTeste {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Fabio");

		Compra compra1 = new Compra();

		compra1.adicionarItem(new Produto("Caneta", 4.55), 10);
		compra1.adicionarItem(new Produto("Lapis", 2.40), 10);

		Compra compra2 = new Compra();

		compra1.adicionarItem("Caderno", 10.00, 1);
		compra1.adicionarItem("Caderno", 10.00, 1);
		
		cliente1.addCompra(compra1);
		cliente1.addCompra(compra2);

		System.out.printf("Total R$ %.2f", cliente1.totalCompras());
	}
}
