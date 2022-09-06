package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double f;
		
		Scanner scanner = new Scanner(System.in);
		
		f = scanner.nextDouble();
		
		double c = f - 32 * 5/9;
		
		System.out.printf("Temperatura %.2f%n", c);
		
		scanner.close();	
	}
}
