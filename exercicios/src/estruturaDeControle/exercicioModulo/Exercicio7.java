package estruturaDeControle.exercicioModulo;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		/*
		 * 7. Criar um programa que enquanto estiver recebendo números positivos,
		 * imprime no console a soma dos números inseridos, caso receba um número
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número ");
		int valor = 0;

		while (valor >= 0) {

			int dig = scanner.nextInt();
			if (dig >= 0) {
				System.out.println("Informe o número ");
				valor += dig;
				System.out.println("Soma dos valores " + valor);
			} else
				break;

		}

		scanner.close();
	}
}
