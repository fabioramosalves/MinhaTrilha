package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];

		Scanner scanner = new Scanner(System.in);

		System.out.println(Arrays.toString(notasAlunoA));

		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + " ");
			notasAlunoA[i] = scanner.nextDouble();
		}

		System.out.println(Arrays.toString(notasAlunoA));

		double total = 0.d;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
			System.out.println(notasAlunoA[i]);
		}

		System.out.println(total);

		double nota = 7.55;
		// dados literais
		double[] notasAlunoB = { 8.05, nota, 1.28 };

		for (double d : notasAlunoB) {
			System.out.println(d);
		}

		scanner.close();
	}
}
