package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi(10,10);

		Monstro mostro = new Monstro(10,11);

		System.out.printf("Heroi " + heroi.getCoordenadas());
		System.out.printf("Monstro " + mostro.getCoordenadas());
	
		heroi.atacar(mostro);
		mostro.atacar(heroi);
		mostro.atacar(heroi);
		
		System.out.println("Heroi " + heroi.getVida());
		System.out.println("Monstro " + mostro.getVida());
	}
}
