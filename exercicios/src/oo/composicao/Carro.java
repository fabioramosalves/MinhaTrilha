package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	final Motor motor;
	List<Porta> portas = new ArrayList<>();

	Carro() {
		motor = new Motor(this);
		portas.add(new Porta("Dianteira-Direita"));
		portas.add(new Porta("Dianteira-Esquerda"));
		portas.add(new Porta("Trazeira-Direita"));
		portas.add(new Porta("Trazeira-Esquerda"));
		portas.add(new Porta("Trazeira-Mala"));
	}

	boolean acelerar() {
		if (motor.fatorInjecao < 2.5 && !portaAberta()) {
			motor.fatorInjecao += 0.4;
			return true;
		}
		return false;
	}
	
	private boolean portaAberta() {
		for (Porta porta : portas) {
			if(porta.aberta) return true;
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
