package br.com.cod3er.visao;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public interface EventoMouse extends MouseListener {

    public void mousePressed(MouseEvent e);
    
    default public void mouseClicked(MouseEvent e) {}

    default public void mouseReleased(MouseEvent e){}

    default public void mouseEntered(MouseEvent e){}

    default public void mouseExited(MouseEvent e){}
}
