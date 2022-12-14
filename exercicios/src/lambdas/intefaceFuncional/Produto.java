package lambdas.intefaceFuncional;

public class Produto extends Object{

	final String nome;
	final double preco;
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	final double desconto;

	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		return String.format("%s R$%.2f ", 
				this.nome, 
				this.preco * (1- this.desconto));
	}
}
