package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if(....) sentença; ou {}
		// While(...) sentença; ou {}
		// for(...; ...; ...) sentença; ou {}

		// do sentença; {} while(...);

		Scanner scanner = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.println("Vc precisa falar as palavras mágicas...");
			System.out.println("Quer Sair? ");
			
			texto = scanner.nextLine();

		} while (!texto.equalsIgnoreCase("por favor"));

		scanner.close();
	}
}
