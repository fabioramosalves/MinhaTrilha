package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	@Override
	void acelerar() {
		if (this.VELOCIDADE_MAXIMA > this.velocidadeAtual)
			this.velocidadeAtual += 15;
		else
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
	}
}
