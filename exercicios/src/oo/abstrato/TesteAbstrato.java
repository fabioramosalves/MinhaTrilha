package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {

		Animal a = new Cachorro();
		Mamifero m = new Cachorro();

		System.out.println("Animal " + a.mover());
		System.out.println("Animal " + a.respirar());

		System.out.println("Mamífero " + m.mover());
		System.out.println("Mamífero " + m.mamar());
		System.out.println("Mamífero " + m.respirar());
	}
}
