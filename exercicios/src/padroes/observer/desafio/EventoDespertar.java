package padroes.observer.desafio;

public class EventoDespertar {

	private boolean despertar;
	
	public EventoDespertar(boolean despertar) {
		this.despertar = despertar;
	}
	
	public boolean canDespertar() {
		return despertar;
	}
}
