package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import myClass.Util;

public class Map {

	public static void main(String[] args) {

		// foi criado um utilitario para printar a tela

		Stream<Integer> mapInt = Stream.of(10, 20, 30);
		mapInt.map(x -> x * x).forEach(Util.printOutInt);

		// ------------ exemplo da aula-------------------

		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(Util.printOutString);

		System.out.println("\n\nUsando composição...\n");

		marcas.stream()
			.map(Util.maiuscula)
			.map(Util.primeiraLetra)
			.map(Util::grito)
			.forEach(Util.printOutString);
	}
}
