package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calculo = (x, y) -> {
			return x + y;
		};
		System.out.println(calculo.executar(3, 5));

		calculo = (x, y) -> x - y; // return de forma implícita (sem as chaves)
		System.out.println(calculo.executar(3, 5));

		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(3, 5));

		calculo = (x, y) -> x / y;
		System.out.println(calculo.executar(3, 5));

		// utilização de interface funcional com metodos default
		System.out.println(calculo.legal());
		// utilização de interface funcional com metodos estáticos
		System.out.println(Calculo.muitoLegal());
	}
}
