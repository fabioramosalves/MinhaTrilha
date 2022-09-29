package br.com.cod3er.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		
		setVisible(true);
		setTitle("Calculadora");
		setSize(450, 450);		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		organizarLayout();
	}
	
	private void organizarLayout() {
		
		setLayout(new BorderLayout());
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60));
		
		this.add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		
		this.add(teclado,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}

}
