package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador += numero;

		// como não inicializou o valor ele não será Interger será Optional<Integer>
		Integer totalOptional = nums.stream().reduce(soma).get();
		System.out.println(totalOptional);

		// como inicializou o valor (identity) ele não será Optional seráo Integer
		Integer totalInteger = nums.parallelStream().reduce(0, soma);
		System.out.println(totalInteger);

		// como inicializou o valor (identity) ele não será Optional seráo Integer
		// se utilizar o paralelleStream ocorrerá erro na
		// soma pois ele inicializara com 10 toda a iteração
		Integer totalIntegerComValorParallelStream = nums.parallelStream().reduce(10, soma);
		System.out.println(totalIntegerComValorParallelStream);

		// então se vc for iniciar o valor diferente de zero utilizar o stream(), pois
		//ele inicializará apenas na primeira iteração gerando a soma corretamente
		Integer totalIntegerComValor = nums.stream().reduce(10, soma);
		System.out.println(totalIntegerComValor);
		
		
		//Resultado foi um Opciona<Integer> ...
		//Se o resultado estiver presente ele executa o println
		nums.stream()
		 .filter(n -> n > 5)
		 .reduce(soma)
		 .ifPresent(System.out::println); //resutado 30	
	}
}
