package EstruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String entrada = "";

		while (!entrada.equalsIgnoreCase("sair")) {
			System.out.println("Digite algo: ");
			entrada = scanner.next().trim();
			System.out.println("Você digitou: " + entrada);
		}
		
		System.out.println("FIM!!!");

		scanner.close();
	}
}
