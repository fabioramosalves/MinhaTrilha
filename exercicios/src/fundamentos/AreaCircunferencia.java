package fundamentos;

import java.util.Locale;

public class AreaCircunferencia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double raio = 3.5;
		double area =  Math.PI * Math.pow(raio, 2);
		
		System.out.printf("Área circulo: %.2f%n", area);
	}
}
