package myClass;

import java.security.SecureRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Util {

	private Util() {
	}
	
	public final static String generateRandomPassword(int len) {
		// intervalo ASCII – alfanumérico (0-9, a-z, A-Z)
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		// cada iteração do loop escolhe aleatoriamente um caractere do dado
		// intervalo ASCII e o anexa à instância `StringBuilder`

		for (int i = 0; i < len; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		return sb.toString();
	}
	
	

	public final static UnaryOperator<String> maiuscula = str -> str.toUpperCase();
	
	public final static UnaryOperator<String> minuscula = str -> str.toLowerCase();
	
	public final static UnaryOperator<String> primeiraLetra = str -> str.charAt(0) + "";

	public final static String grito(String n) {
		return n + "!!!";
	}

	public final static Consumer<String> printOutString = System.out::print;

	public final static Consumer<Integer> printOutInt = System.out::print;

	public final static Consumer<Integer> printlnOutInt = System.out::println;

	
	//------------------StreamAPI DesafioMap.java-------------------------
	public final static Function<Integer, String> intToBinary = number -> Integer.toBinaryString(number);

	public final static UnaryOperator<String> revertString = text -> new StringBuilder(text).reverse().toString();

	public final static Function<String, Integer> convertBynaryToInt = number -> Integer.parseInt(number, 2);
}
