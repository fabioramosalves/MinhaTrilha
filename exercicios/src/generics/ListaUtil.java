package generics;

import java.util.List;

public class ListaUtil<T> {

	public static Object getUltimoObject(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	public static <T> T getUltimoGenerico(List<T> lista) {
		return lista.get(lista.size() - 1);
	}

	//apenas para verificar as possibilidades uso
	public static <A, B, C> C Teste(A a, B b) {
		C teste = null;
		return teste;
	}
}