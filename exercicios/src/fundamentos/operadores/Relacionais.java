package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 97;

		int b = 'a';

		System.out.println(a == b);

		System.out.println('\u0061'); // caractere unicode

		System.err.println(3 >= 4);
		System.err.println(3 <= 4);

		System.out.println(3 != 4);

		double nota = 7.3;

		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;

		System.out.println("Tem desconto? " + temDesconto);

	}
}