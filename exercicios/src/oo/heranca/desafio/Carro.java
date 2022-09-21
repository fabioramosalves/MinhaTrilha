package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual = 0;

	void frear() {
		if (this.velocidadeAtual > 0)
			this.velocidadeAtual -= 5;
		else 
			this.velocidadeAtual = 0;
	}

	void acelerar() {
		this.velocidadeAtual += 5;
	}
}
