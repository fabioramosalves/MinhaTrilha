package br.com.cod3r.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, EventoMouse {

	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);

	private Campo campo;

	public BotaoCampo(Campo campo) {
		this.campo = campo;
		this.setBackground(BG_PADRAO);

		setOpaque(true);

		setBorder(BorderFactory.createBevelBorder(1));

		addMouseListener(this);
		campo.registrarObservador(this);
	}

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1) {
			campo.abrir();
		} else {
			campo.alternarMarcacao();
		}
	}

	@Override
	public void eventoOcorreu(Campo c, CampoEvento e) {

		switch (e) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
		}
		
		SwingUtilities.invokeLater(() -> {
			repaint();
			validate();
		});
		
	}

	private void aplicarEstiloPadrao() {
		this.setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(1));
		setText("");
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.WHITE);
		setText("X");
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCAR);
		setForeground(Color.BLACK);
		setText("M");
	}

	private void aplicarEstiloAbrir() {

		setBorder(BorderFactory.createLineBorder(Color.GRAY));

		if (campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			setText("*");
			return;
		}

		setBackground(BG_PADRAO);

		switch (campo.minasNaVizinhanca()) {
		case 1:
			setForeground(TEXTO_VERDE);
			break;
		case 2:
			setForeground(Color.BLUE);
			break;
		case 3:
			setForeground(Color.YELLOW);
			break;
		case 4:
		case 5:
		case 6:
			setForeground(Color.RED);
			break;
		default:
			setForeground(Color.PINK);
			break;
		}

		String valor = !campo.vizinhacaSegura() ? campo.minasNaVizinhanca() + "" : "";

		setText(valor);
	}
}