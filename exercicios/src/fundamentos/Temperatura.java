package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double f;
		
		Scanner scanner = new Scanner(System.in);
		
		f = scanner.nextDouble();
		
		final int ajuste = 32;
		final double fator = 5.0/9.0;
		
		double c = f - ajuste * fator;
		
		System.out.printf("Temperatura %.2f%n", c);
		
		scanner.close();
	}
}
