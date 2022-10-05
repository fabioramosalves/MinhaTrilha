package teste.basico;

import java.util.List;

import modelo.basico.Produto;
import modelo.basico.ProdutoDAO;

public class ObterProdutos {

	public static void main(String[] args) {

		ProdutoDAO dao = new ProdutoDAO();

		List<Produto> produtos = dao.getAll();

		produtos.forEach(p -> System.out.println(p.getNome()));

		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		
		System.out.println("O valor total é " + precoTotal);
	}
}
