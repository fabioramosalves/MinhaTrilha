package estruturaDeControle;

import java.util.Locale;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		System.out.println("Informe a média: ");
		double media = scanner.nextDouble();
		String resultado = "";

		if (media < 4.5) {
			resultado = "Reprovado";
		}

		if (media > 4.5 && media < 7) {
			resultado = "Recuperação";
		}

		if (media >= 7 && media <= 10) {
			resultado = "Aprovado Parabéns!";
		}

		System.out.println("Resultado: " + resultado);

		scanner.close();
	}
}
