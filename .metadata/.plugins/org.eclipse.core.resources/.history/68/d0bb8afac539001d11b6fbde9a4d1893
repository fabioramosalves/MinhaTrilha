package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;

	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void frear() {
		if (this.velocidadeAtual > 0)
			this.velocidadeAtual -= 5;
		else
			this.velocidadeAtual = 0;
	}

	void acelerar() {
		if (this.VELOCIDADE_MAXIMA > this.velocidadeAtual)
			this.velocidadeAtual += 5;
		else
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
	}

	public String toString() {
		return String.format("Velocidade Atual é %d Km/h", this.velocidadeAtual);
	}
}
