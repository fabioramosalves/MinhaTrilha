package padroes.observer.desafio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Relogio {

	private List<ObservadorEventoDespertar> observadores = new ArrayList<>();

	private static Map<Integer, DiaSemana> diaSemana = new HashMap<>();

	Relogio() {
		
	}

	public void registrarObservador(ObservadorEventoDespertar observador) {
		observadores.add(observador);
	}

	public void monitorar(Despertar despertar) {
		
		while (!despertar.deveDespertar()) {}
		
		observadores.stream().forEach(o -> o.despertar(new EventoDespertar(true)));
	}
}
