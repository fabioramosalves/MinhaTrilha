package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

		Produto produto = new Produto("Caneta", 7.45);
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.beginTransaction().add(produto).commitTransaction();

		// utilizando o método atômico
		var produto1 = new Produto("Lápis", 5.55);
		dao.addAtomic(produto1);
		
		var produto2 = new Produto("Caderno", 25.33);
		dao.addAtomic(produto2).close();

		System.out.println("Id do produto " + produto.getId());
		System.out.println("Id do produto " + produto1.getId());
		System.out.println("Id do produto " + produto2.getId());

		/*
		 * 
		 * // verificar se é possível utilizar a api de stream para filtrar o objeto var
		 * produtoRemove = dao.getAll().stream().filter(p -> p.getId() ==
		 * 1).findFirst().get();
		 * 
		 * if (produtoRemove != null)
		 * dao.beginTransaction().remove(produtoRemove).commitTransaction().close();
		 * 
		 */
	}
}
