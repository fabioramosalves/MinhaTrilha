package fundamentos.exerciciosModulo;

import java.util.Locale;
import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {

		double f, c;
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		f = scanner.nextDouble();

		c = (f - 32.0) / 9.0 / 5.0;
		
		System.out.printf("Celsius %.2f", c);
		
		scanner.close();
	}
}
