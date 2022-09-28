package br.com.cod3r.cm.visao;
import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, EventoMouse {

	private final Color BG_PADRAO = new Color(184,184,184);
	private final Color BG_MARCAR = new Color(8,179,247);
	private final Color BG_EXPLODIR = new Color(189,66,68);
	private final Color TEXTO_VERDE = new Color(0,100,0);
	
	private Campo campo;
		
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		this.setBackground(BG_PADRAO);
		

		addMouseListener(this);
		
		setBorder(BorderFactory.createBevelBorder(1));
		
		campo.registrarObservador(this);
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
	}

	private void aplicarEstiloPadrao() {
		this.setBackground(BG_PADRAO);
	}

	private void aplicarEstiloExplodir() {
		this.setBackground(BG_EXPLODIR);
	}

	private void aplicarEstiloMarcar() {
		this.setBackground(BG_MARCAR);
	}

	private void aplicarEstiloAbrir() {
		this.setBackground(TEXTO_VERDE);
	}

	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			System.out.println("Botao esquerdo!");
		}else {
			System.out.println("outro botão!");
		}
	}
}