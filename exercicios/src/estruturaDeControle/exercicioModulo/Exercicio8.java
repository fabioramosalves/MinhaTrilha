package estruturaDeControle.exercicioModulo;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe uma palavra ");
		
	    String palavra = scanner.next(); 
	    
	    for(int i = 0; i < palavra.length(); i++) {
	    	System.out.print(palavra.charAt(i));
	    }
		
		scanner.close();
	}
}
