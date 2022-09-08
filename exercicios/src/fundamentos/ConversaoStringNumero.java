package fundamentos;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("digite o primeiro número");

		String valor2 = JOptionPane.showInputDialog("digite o segundo número");

		System.out.println(valor1 + " " + valor2);

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);

		double soma = numero1 + numero2;

		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);

		/*
		 * alguns resultados não dá a precição exata é um resultado
		 * aproximado devido algorigimo do calculo binário
		 * 7.9 8.3 Soma é 16.200000000000003 Média é 8.100000000000001
		 * BigDecimal 
		 */
		
		

	}
}
