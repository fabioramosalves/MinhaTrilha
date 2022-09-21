package oo.heranca;

public class Monstro extends Jogador {

	public Monstro() {
		this(0, 0);
	}

	public Monstro(int x, int y) {
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente) {
		return super.atacar(oponente);
	}
}