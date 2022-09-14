package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Detergente");
		produto1.preco = 1.12d;

		Produto produto2 = new Produto();
		produto2.nome = "Sabão";
		produto2.preco = 2.25d;
		
		Produto.desconto = 0.2d;

		Produto produto3 = new Produto("Café",18.25d);
		
		System.out.printf("%s %.2f \n", produto1.nome, produto1.precoComDesconto());
		System.out.printf("%s %.2f desconto do gerente \n", produto1.nome, produto1.precoComDesconto(0.10));
		System.out.printf("%s %.2f \n", produto2.nome, produto2.precoComDesconto());
		System.out.printf("%s %.2f \n", produto3.nome, produto3.precoComDesconto());
	}
}