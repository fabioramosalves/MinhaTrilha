package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();

		produto1.nome = "Detergente";
		produto1.preco = 1.12d;
		produto1.desconto = 0.1d;

		Produto produto2 = new Produto();
		produto2.nome = "Sabão";
		produto2.preco = 2.25d;
		produto2.desconto = 0.2d;

		System.out.printf("%s %.2f \n", produto1.nome, produto1.preco * (1 - produto1.desconto));
		System.out.printf("%s %.2f \n", produto2.nome, produto2.preco * (1 - produto2.desconto));
	}
}