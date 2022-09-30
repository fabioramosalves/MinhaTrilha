package padroes.observer.desafio;
import java.util.ArrayList;
import java.util.List;


public class Relogio {

	private List<ObservadorEventoDespertar> observadores = new ArrayList<>();

	Relogio() {
		
	}

	public void registrarObservador(ObservadorEventoDespertar observador) {
		observadores.add(observador);
	}

	public void monitorar(Despertar despertar) {
		
		while (!despertar.deveDespertar()) {}
		
		observadores.forEach(o -> o.despertar(new EventoDespertar(true)));
	}
}
