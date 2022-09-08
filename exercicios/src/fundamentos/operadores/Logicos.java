package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1 );
		System.out.println(!condicao2 );
		
		//tabela verdade E
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//tabela verdade Ou
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//tabela verdade Ou exclusivo
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//tabela verdade operador unario not
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!false);
		System.out.println(!!true);
	}
}
