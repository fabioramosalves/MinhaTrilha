package exercicioModulo;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/**
		 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		 * 10 e é par;
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		int valor = scanner.nextInt();
		
		if(valor >= 0 && valor <= 10) {
			String resultado = valor % 2 == 0 ? "é": "não é";
			System.out.printf("%d é válido e %s par", valor, resultado);
		}
		else {
			System.out.printf("%s não é válido: ", valor);
		}
		
		scanner.close();
	}
}
