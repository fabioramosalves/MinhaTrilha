package lambdas.intefaceFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		Supplier<Object> umObject = () -> Arrays.asList("Bia", "Lia", "Gui");
		System.out.println(umObject.get());

		//melhor ser mais específico
		Supplier<List<String>> umLista = () -> Arrays.asList("Bia", "Lia", "Gui");
		System.out.println(umLista.get());
	}
}
