package estruturaDeControle.exercicioModulo;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/** 2. Criar um programa informa se o ano atual é um ano bissexto; */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o ano ");
		int valor = scanner.nextInt();

		//minha lógica
		//if ((valor % 4 == 0 && !(valor % 100 == 0)) || !(valor % 4 == 0) && valor % 400 == 0) {
		
		//lógica resultado do exercicio
		if(valor %4 ==0 && ((valor % 100 !=0 || valor %400 == 0))) {

			System.out.printf("%d é bissesto ", valor);
		} else
			System.out.printf("%d não é bissesto ", valor);

		scanner.close();
	}
}
