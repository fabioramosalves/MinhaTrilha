package classe.desafio;

import java.util.Locale;

public class Jantar {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Pessoa p1 = new Pessoa("Fabio", 99.0d);
		
		System.out.printf(p1.apresentar());
		
		var c1 = new Comida("Feijoada", 0.5533d);
		var c2 = new Comida("Carne", 0.2544d);
		var c3 = new Comida("Arroz", 0.3522d);
		
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		
		System.out.printf(p1.apresentar());
	}
}
