package exercicioModulo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Criar um programa que receba um número e diga se ele é um número primo.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");

		int numero = scanner.nextInt();
		
		String resultado  = "";
		if (numero > 1 ) {
			for (int i = 1; i <= numero; i++) {

				if (numero % i == 0 && i != numero && i > 2) {
					resultado = "não é primo";
					break;
				}
				resultado = "é primo";
			}
		}
		
		System.out.printf("%d %s", numero, resultado);

		scanner.close();
	}
}
