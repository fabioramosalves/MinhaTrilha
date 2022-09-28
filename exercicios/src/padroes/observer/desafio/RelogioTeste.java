package padroes.observer.desafio;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class RelogioTeste {

	public static void main(String[] args) {

		Relogio relogio = new Relogio();

		relogio.registrarObservador(o -> {
			System.out.println("Despertando....");

			JFrame janela = new JFrame("Despertando...");
			janela.setVisible(true);
			janela.setSize(600, 200);
			janela.setLayout(new FlowLayout());
			janela.setLocationRelativeTo(null);// passando nulo centraliza conforme o computador
		
		});

		relogio.monitorar(new Despertar(13, 33, 0, DiaSemana.quarta));
	}
}
