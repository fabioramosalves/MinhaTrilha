package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		var u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Ana julia"));
		lista.add(new Usuario("Beatriz"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Manuela"));
		lista.add(new Usuario("Adriana"));
		lista.add(new Usuario("Adriana"));
		lista.add(new Usuario("Adriana"));
		
		System.out.println(lista.get(3));// Acesso pelo índice
		
		lista.remove(1);
		lista.remove(new Usuario("Adriana"));
		lista.remove(new Usuario("Adriana"));
		
		System.out.println(lista.contains(new Usuario("Adriana"))); //comparando com equals e hashCode
		System.out.println(lista.contains(u1));// mesmo endereço de memória true
		
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
	}
}
