package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		// Wrapper de inteiros

		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		Integer inteiro = Integer.parseInt("1236");

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		System.out.println(inteiro);

		Float f = 123.10f;

		System.out.println(f.toString());

		Double d = 123456.10d;

		System.out.println(d.toString());

		// Wrapper de boolean

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		// Wrapper caracter

		Character c = '#';
		System.out.println(c.toString());

	}
}
