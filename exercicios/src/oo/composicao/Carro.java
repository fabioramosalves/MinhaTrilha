package oo.composicao;

public class Carro {

	final Motor motor;

	Carro() {
		motor = new Motor(this);
	}

	boolean acelerar() {
		if (motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 0.4;
			return true;
		}
		return false;
	}

	boolean frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
			return true;
		}
		return false;
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
