package estruturaDeControle.exercicioModulo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/*
		 * 4. Criar um programa que receba um número e diga se ele é um número primo.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");

		int numero = scanner.nextInt();
		int contador = 0;
		
		if (numero > 1 ) {
			for (int i = 2; i < numero; i++) {

				if (numero % i == 0) {
					contador++;
					break;
				}
			}
		}
		
		if(contador == 0) {
			System.out.printf("%d %s", numero, "é primo");
		}else {
			
			System.out.printf("%d %s", numero, "não é primo");
		}

		scanner.close();
	}
}