package estruturaDeControle.exercicioModulo;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		/*
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
		 * o número armazenado.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sorteando numero entre 0 e 100...\n");
		
		Random numeroAleatorio = new Random();
		int valor = numeroAleatorio.nextInt(101);
		int tentativa;
		
		System.out.println("Começou o jogo! Sera que consegue me vencer?");
		for(int i = 1; i <= 10; i++) {		
			
			tentativa = scanner.nextInt();
			if(tentativa == valor){
				System.out.println("Acertou!");
				break;
			}
			else if(tentativa > valor) {
				System.out.printf("Tentativa %d O valor é nenor", i);
			}
			else 
				System.out.printf("Tentativa %d O valor é maior", i);
		}
			
		scanner.close();
	}
}
