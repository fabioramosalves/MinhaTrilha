package exercicioModulo;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		int i = 1;
		while (i <= 10) {
		
			i++;
			int numero = scanner.nextInt();
		
			if(numero > result)
				result = numero;		
		}
		
		System.out.println(result);
		
		scanner.close();
	}
}
