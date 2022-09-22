package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(300);
		Civic civic = new Civic(180);

		int valor = 40;
		while (valor > 0 && ferrari.acelerar()) {

			ferrari.desligarTurbo();
			civic.acelerar();
			ferrari.acelerar();
			//ferrari.ligarTurbo();
			ferrari.ligarAr();
			valor--;

			System.out.println("Ferrari " + ferrari);
			//System.out.println("Civic " + civic);
		}
	}
}
