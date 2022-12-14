package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade de notas ");
		int indice = scanner.nextInt();

		double[] notasAluno = new double[indice];

		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + " ");
			notasAluno[i] = scanner.nextDouble();
		}

		double total = 0.d;
		
		for (double nota : notasAluno) {
			total += nota;
			System.out.println(nota);
		}

		System.out.printf("Total: %.2f Média: %.2f ", total, total / notasAluno.length);

		scanner.close();
	}
}
