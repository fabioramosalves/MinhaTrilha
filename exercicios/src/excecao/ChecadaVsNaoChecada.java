package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e);
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Fim :)");

	}

	//Exeção NÃO checada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro \"RuntimeException\"");
	}

	//Exeção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro \"Exception\"");
	}
}
