package lambdas.intefaceFuncional;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = p -> p % 2 == 0 ? "Par" : "Impar";
	
		Function<String, String> oResultadoE = n -> "O resultado é: " + n;
		
		Function<String, String> empolgado = n -> n + "!!!" ;
		
		Function<String, String> duvida = n -> n + "???" ;
		
		String resultadoFinalEmpolgado = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(22);
		
		String resultadoFinalDuvida = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(22);
		
		System.out.println(parOuImpar.apply(3));
		System.out.println(parOuImpar.apply(4));

		System.out.println(resultadoFinalEmpolgado);
		System.out.println(resultadoFinalDuvida);
	}
}