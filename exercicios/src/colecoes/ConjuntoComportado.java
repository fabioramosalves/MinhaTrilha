package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// nao ordenado
		// Set<String> lista = new HashSet<>(); //operador diamante

		// ordenado
		SortedSet<String> lista = new TreeSet<>(); // operador diamante

		lista.add("D");
		lista.add("A");
		lista.add("b");
		lista.add("C");

		System.out.println(lista.size());
		System.out.println(lista);

		System.out.println(lista.remove("A"));

		System.out.println(lista);

		for (String string : lista) {
			System.out.println(string);
		}
		
		Set<Integer> lista1 = new HashSet<>(); //operador diamante

		lista1.add(5);
		lista1.add(1);
		lista1.add(2);
		lista1.add(4);
		lista1.add(3);
		
		System.out.println(lista1.size());
		System.out.println(lista1);
	}
}
