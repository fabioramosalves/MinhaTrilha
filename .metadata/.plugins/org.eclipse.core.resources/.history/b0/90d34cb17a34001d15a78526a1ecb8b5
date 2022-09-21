package classe;

import java.util.Locale;

public class Jantar {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Pessoa p1 = new Pessoa("Fabio", 80);
		
		System.out.printf("%s %s Kg\n", p1.nome, p1.peso );
		
		var c1 = new Comida("Feijoada", 0.55d);
		var c2 = new Comida("Carne", 0.25d);
		var c3 = new Comida("Arroz", 0.35d);
		
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		
		System.out.printf("%s %.2f Kg\n", p1.nome, p1.peso );
	}
}
