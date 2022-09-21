package oo.encapsulamento;

public class Pessoa {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private int idade;

	Pessoa(String nome, int idade) {
		setNome(nome);
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
	
	public String toString() {
		return String.format("Nome: %s , Idade: %d ano(s) \n",getNome(),getIdade());
	}
}
