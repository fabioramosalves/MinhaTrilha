package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private int idade;

	Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		setSobrenome(sobreNome);
		setIdade(idade);
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 && idade <= 120)
			this.idade = idade;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	public String toString() {
		return String.format("Nome: %s , Idade: %d ano(s) \n", getNomeCompleto(), getIdade());
	}
}
