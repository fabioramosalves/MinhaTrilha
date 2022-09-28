package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++; // a = a + 1;
		a--; // a = a - 1;

		++b; // b = b + 1;
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);

		// precedencia de operadores faz com que esta expressão seja verdadeira
		// o operador posfixado tem precedencia menor que o prefixado
		System.out.println(++a == b--);

		System.out.println(a);
		System.out.println(b);
	}
}
