package fundamentos.operadores;

import java.util.Locale;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ler num1
		// Ler num2
		// + - * / %
		
		Locale.setDefault(Locale.US);

		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número").trim());
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número").trim());
		String operacao = JOptionPane.showInputDialog("Informe o primeiro número").trim();

		// minha lógica
		// double result = operacao.equals("+") ? num1 + num2
		// : operacao.equals("-") ? num1 - num2
		// : operacao.equals("*") ? num1 * num2
		// : operacao.equals("/") ? num1 / num2
		// : operacao.equals("%") ? num1 % num2 : 0.0d;

		double result = operacao.equals("+") ? num1 + num2 : 0;
		result = operacao.equals("-") ? num1 - num2 : result;
		result = operacao.equals("*") ? num1 * num2 : result;
		result = operacao.equals("/") ? num1 / num2 : result;
		result = operacao.equals("%") ? num1 % num2 : result;

		JOptionPane.showConfirmDialog(null, String.format("%.2f %s %.2f = %.5f", num1, operacao, num2, result));
	}
}
