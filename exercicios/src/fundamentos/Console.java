package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		System.out.print("Bom");
		System.out.print(" dia!\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);

		System.out.printf("Salário: R$ %.2f%n", 123.456666);
		System.out.printf("Nome: %s%n", "João");

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome! ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome!");
		String sobrenome = scanner.nextLine();	
		
		System.out.println("Digite sua idade! ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite sua idade! ");
		double salario = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.printf("Nome: %s %s %nAnos %d %nSalario: %.2f%n", nome, sobrenome, idade, salario);
		
		scanner.close();
	}
}
