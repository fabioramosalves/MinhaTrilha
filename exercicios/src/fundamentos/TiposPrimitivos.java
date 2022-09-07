package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// informação do funcionario

		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 5_234_845_223L; //L maiúsculo para informar que long
			
		//tipos numérico com ponto flutuante
		
		float salario = 11_445.44F; //literal float
		
		double vendasAcumuladas = 2_991_737_103.01;		
		
		boolean estaDeFerias = false;
		
		estaDeFerias = true;
		
		char status = 'S';
		
		char unicode = '\u2661';	
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2 );
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status " + status);
		System.out.println("unicode " + unicode );	
	}
}
