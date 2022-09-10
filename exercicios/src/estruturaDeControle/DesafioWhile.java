package estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int contador = 0, total = 0, nota = 0;

		while (nota != -1) {

			System.out.println("Digite uma nota (ou -1 p/ sair): ");
			nota = scanner.nextInt();

			if (nota >= 0 && nota <= 10) {

				total += nota;
				contador++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!!!");
			}
		}

		System.out.printf("total = %d média = %d ", total, total / contador);

		scanner.close();
	}
}
