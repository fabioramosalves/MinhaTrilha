package oo.heranca;

public class Jogador {

	private int vida = 100;
	private int x;
	
	public int getX() {
		return x;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	private int y;

	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean andar(Direcao direcao) {

		switch (direcao) {
		case Norte:
			y++;
			break;
		case Sul:
			y--;
			break;
		case Leste:
			x++;
			break;
		case Oeste:
			x--;
			break;
		}

		return true;
	}

	protected boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1 && oponente.vida > 0) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0 && oponente.vida > 0) {
			oponente.vida -= 10;
			return true;
		}

		return true;
	}
	
	public String getCoordenadas() {
		return String.format("x -> %d, y -> %d \n", x, y);
	}
}
