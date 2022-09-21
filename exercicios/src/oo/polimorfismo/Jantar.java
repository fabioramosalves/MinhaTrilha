package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(80);
		
		p1.commer(new Arroz(0.3));
		p1.commer(new Feijao(0.3));
		p1.commer(new Sorvete(0.3));
		
		System.out.println(p1.getPeso());
	}
}
