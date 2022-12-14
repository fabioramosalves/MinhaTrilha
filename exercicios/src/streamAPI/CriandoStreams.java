package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<Object> print = System.out::print;
		//Consumer<Integer> println = System.out::println;

		Stream<String> liguagens = Stream.of("Java ", "C++ ", "C# ", "JavaScript ", "Ruby\n");

		liguagens.forEach(print);// Laço interno!!!

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);

		Arrays.stream(maisLangs, 1, 3).forEach(print);

		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");

		outrasLangs.stream().forEach(print);

		outrasLangs.parallelStream().forEach(print);

		// gerando Sream de forma infinita

		// Stream.generate(() -> "A").forEach(print);
		//Stream.iterate(0, n -> n + 1).forEach(println);
	}
}
