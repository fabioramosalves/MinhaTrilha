package fundamentos.exerciciosModulo;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {

		int a, b, c, delta;

		double x1, x2;

		System.out.println("digite a b c: ");

		Scanner scanner = new Scanner(System.in);

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		delta = (b * b) - (4 * a * c);

		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("Resultado Delta: %d x1 = %.2f x2 = %.2f ", delta, x1, x2);

		scanner.close();
	}
}
