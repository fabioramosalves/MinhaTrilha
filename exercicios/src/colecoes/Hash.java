package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<>();

		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));

		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.hashCode());
		}

		System.out.println(resultado);
	}
}
