package oo.heranca.desafio;

public class Carro {

	protected final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	private int delta = 5;

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public int getDelta() {
		return this.delta;
	}

	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void frear() {
		if (this.velocidadeAtual > 0)
			this.velocidadeAtual -= 5;
		else
			this.velocidadeAtual = 0;
	}

	public boolean acelerar() {
		if (this.VELOCIDADE_MAXIMA > this.velocidadeAtual) {
			this.velocidadeAtual += getDelta();
			return true;
		} else {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
			return false;
		}
	}

	public String toString() {
		return String.format("Velocidade Atual é %d Km/h", this.velocidadeAtual);
	}
}
