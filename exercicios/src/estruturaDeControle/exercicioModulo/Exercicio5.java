package estruturaDeControle.exercicioModulo;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		/*
		 *5. Refatorar o exercício 04, utilizando a estrutura switch.
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
		
		switch(contador) {
		case 0:
			System.out.printf("%d %s", numero, "é primo");
			break;
		default:
			System.out.printf("%d %s", numero, "não é primo");
		}
		
		scanner.close();
	}
}
