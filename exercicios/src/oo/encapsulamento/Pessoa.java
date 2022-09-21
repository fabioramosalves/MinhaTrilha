package oo.encapsulamento;

public class Pessoa {

	private int idade;

	Pessoa(int idade) {
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
}
