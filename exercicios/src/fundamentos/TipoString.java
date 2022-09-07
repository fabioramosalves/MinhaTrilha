package fundamentos;

import java.util.Locale;

public class TipoString {

	public static void main(String[] args) {

		// String é um objeto imutável;

		System.out.println("Olá pessoal".charAt(0));

		var index = "Olá pessoal".length();
		var text = "Olá pessoal";

		for (int i = 0; i < index; i++) {

			System.out.println(text.charAt(i));
		}

		String s = "Boa tarde".concat(" !!");

		System.out.println(s);

		System.out.println(s.startsWith("Boa")); // true
		System.out.println(s.startsWith("boa")); // false
		System.out.println(s.endsWith("!")); // true
		System.out.println(s.equals("boa tarde !!")); // false
		System.out.println(s.equalsIgnoreCase("Boa tarde !!")); // true

		var nome = "Pedro";
		var sobreNome = "Santos";
		var salario = 4123.5555d;

		System.out.println("Nome: " + nome + " Sobrenome: " + sobreNome + " Salário: " + salario);

		Locale.setDefault(Locale.US);

		System.out.printf("Nome: %s Sobrenome: %s Salário: R$%.2f%n", nome, sobreNome, salario);
		System.out.printf("Nome: %s %s Salário: R$ %.2f%n", nome, sobreNome, salario);

		String formatedText = String.format("Nome: %s %s Salário: R$ %.2f%n", nome, sobreNome, salario);

		System.out.println(formatedText);
	}
}
