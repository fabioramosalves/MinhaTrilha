package fundamentos.exerciciosModulo;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {

		double a, b, h;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a altura: ");
		h = scanner.nextDouble();

		System.out.println("Digite a base: ");
		b = scanner.nextDouble();

		a = b * h / 2;

		System.out.printf("Área %.2f", a);

		scanner.close();
	}
}
