package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro salário");
		String valor1 = scanner.nextLine().replace(",", ".");

		System.out.print("Digite o segundo salário");
		String valor2 = scanner.nextLine().replace(",", ".");

		System.out.print("Digite o terceiro salário");
		String valor3 = scanner.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		System.out.println("Média " + (salario1 + salario2 + salario3) / 3);

		scanner.close();
	}
}
