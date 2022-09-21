package oo.abstrato;

public abstract class Mamifero extends Animal {

	public abstract String mamar();

	// metodo final não pode ser sobrescrito na subclasse
	public final String mover() {
		// TODO Auto-generated method stub
		return "Saindo do lugar";
	}
}
