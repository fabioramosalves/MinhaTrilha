package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();

		c1.Cliente = "João Pedro";

		c1.adicionarItem("Carne", 2, 55.76);
		c1.adicionarItem(new Item("Cerveja", 2, 3.55));
		c1.adicionarItem(new Item("Carvão", 1, 12.60));

		System.out.println(c1.Cliente);

		for (Item item : c1.itens) {
			System.out.println(item);
		}

		System.out.println("\n" + c1);
		
		//comprovando a relação bidirecional
		c1.itens.get(0).compra.itens.get(0).compra.obterValorTotal();
	}
}
