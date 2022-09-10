package fundamentos.exerciciosModulo;

import java.util.Locale;
import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {

		double f, c;

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");

		c = scanner.nextDouble();

		f = c * 1.8 + 32;

		System.out.printf("Fahrenheit %.2f", f);

		scanner.close();
	}
}
