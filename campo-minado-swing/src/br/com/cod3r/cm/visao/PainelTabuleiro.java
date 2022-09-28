package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	public PainelTabuleiro(Tabuleiro tabuleiro) {

		GridLayout grid = new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas());

		setLayout(grid);

		tabuleiro.paraCadaCampo(c-> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(c->{
			// TODO criar a implementação
		});
	}
}
