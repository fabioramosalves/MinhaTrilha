package EstruturaDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// quarta -> 2 ...

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do dia: ");

		String diaSemana = scanner.next().trim();
		int dia = 0;

		if (diaSemana.equals("domingo")) {
			dia = 1;
		} else if (diaSemana.equalsIgnoreCase("segunda")) {
			dia = 2;
		} else if (diaSemana.equalsIgnoreCase("terça")) {
			dia = 2;
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			dia = 2;
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			dia = 2;
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			dia = 2;
		} else if (diaSemana.equalsIgnoreCase("sábado")) {
			dia = 2;
		} else {
			dia = 0;
			diaSemana = "Inválido";
		}

		System.out.println(diaSemana + " -> " + dia);

		scanner.close();
	}
}
