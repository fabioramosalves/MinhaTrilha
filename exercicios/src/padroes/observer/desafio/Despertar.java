package padroes.observer.desafio;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Despertar {

	private final int hora;
	private final int minuto;
	private final int segundo;
	private final DiaSemana diaSemana;

	private final static Map<Integer, DiaSemana> diaSemanaList = new HashMap<>();

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public DiaSemana getDiaSemana() {
		return diaSemana;
	}

	public void preencherDiaSamana() {
		diaSemanaList.put(1, DiaSemana.domingo);
		diaSemanaList.put(2, DiaSemana.segunda);
		diaSemanaList.put(3, DiaSemana.terca);
		diaSemanaList.put(4, DiaSemana.quarta);
		diaSemanaList.put(5, DiaSemana.quinta);
		diaSemanaList.put(6, DiaSemana.sexta);
		diaSemanaList.put(7, DiaSemana.sabado);
	}

	Despertar(int hora, int minuto, int segundo, DiaSemana diaSemana) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		this.diaSemana = diaSemana;
		preencherDiaSamana();
	}

	public boolean deveDespertar() {

		Date date = new Date();

		var time = LocalDateTime.now();
		boolean compareHora = time.getHour() == this.getHora();
		boolean compareMinuto = time.getMinute() == this.getMinuto();
		boolean compareSegundo = time.getSecond() == this.getSegundo();

		return compareHora && compareMinuto && compareSegundo && compareDia(date);
	}

	private static boolean compareDia(Date date) {
		Calendar rightNow = Calendar.getInstance();
		int hour = rightNow.get(Calendar.DAY_OF_WEEK);
		return diaSemanaList.keySet().contains(hour);
	}
}
