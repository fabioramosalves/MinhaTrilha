package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos alunos? ");

		int qtdeAlunos = scanner.nextInt();

		System.out.println("Quantos notas? ");

		int qtdeNotas = scanner.nextInt();

		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

		double total = 0.0;

		for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d ", (nota + 1), aluno + 1);
				notasDaTurma[aluno][nota] = scanner.nextDouble();
				total += notasDaTurma[aluno][nota];
			}
		}

		System.out.printf("Total: %.2f - Média %.2f\n", total, total / (qtdeNotas * qtdeAlunos));
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}

		scanner.close();
	}
}
