package exercicioModulo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double n1, n2, nf;

		System.out.println("Digite a primeira nota");
		n1 = scanner.nextDouble();

		System.out.println("Digite a segunda nota");
		n2 = scanner.nextDouble();

		nf = (n1 + n2 )/ 2.0;

		if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10) {
			System.out.printf("Nota inválida!");
		} else if (nf >= 7) {
			System.out.printf("media %.2f Aprovado", nf);
		} else if ( nf >= 4) {
			System.out.printf("media %.2f Recuperação", nf);
		} else
			System.out.printf("media %.2f Reprovado", nf);

		scanner.close();
	}
}
