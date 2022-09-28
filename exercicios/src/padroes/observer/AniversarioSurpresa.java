package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {

		Porteiro porteiro = new Porteiro();

		/*
		 * Como temos um ainterface funcional nem é preciso implementar a classe
		 * namorada pois podemos utilizar a expressão lambda
		 * 
		 */
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservadores(namorada);

		porteiro.registrarObservadores(e -> {
			System.out.println("Surpresa via lambda!");
			System.out.println("Ocorreu em: " + e.getMomento());
		});

		porteiro.monitorar();
	}
}
