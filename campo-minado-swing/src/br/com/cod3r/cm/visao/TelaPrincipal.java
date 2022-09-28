package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	TelaPrincipal() {

		Tabuleiro tabuleiro = new Tabuleiro(15, 15, 4);

		setTitle("Campo Minado");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		this.add(new PainelTabuleiro(tabuleiro));
	}

	public static void main(String[] args) {

		new TelaPrincipal();
	}
}
