package classe;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!!"));

		String s2 = Math.random() > 0.5 ? "valor" : null; //random para simular erro;

		//objetos nulos devem ser tratados para evitar erro de java.lang.NullPointerException
		if (s2 != null)
			System.out.println(s2.concat(" ?????")); // java.lang.NullPointerException 
	}
}