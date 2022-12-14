package fundamentos.exerciciosModulo;

import java.util.Locale;
import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
	    Locale.setDefault(Locale.US);
	    
		double IMC, peso, altura;
		String classificacao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		peso = scanner.nextDouble();
		
		System.out.println("Digite o altura: ");
		altura = scanner.nextDouble();
		
		IMC = peso/Math.pow(altura, 2);
			
		if(IMC < 18.5) {
		 classificacao = "MAGREZA";
		}
		else if(IMC <= 24.9) {
			 classificacao = "NORMAL";
		}
		else if(IMC <= 29.9) {
			 classificacao = "SOBREPESO";
		}
		else if(IMC <= 39.9) {
			 classificacao = "OBESIDADE";
		}
		else {
			classificacao = "OBESIDADE GRAVE";
		}
		
		System.out.printf("IMC: %.2f - Classificação: %s", IMC, classificacao);
		
		scanner.close();
	}
}
