package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Fabio", 120);

		pessoa.setIdade(-50);// alterando a variável

		System.out.println(pessoa);// ler a variável
	}
}