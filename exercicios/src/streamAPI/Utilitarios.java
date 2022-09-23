package streamAPI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {

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
