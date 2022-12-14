package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public boolean isAr() {
		return ligarAr;
	}

	public void setLigarAr(boolean ligarAr) {
		this.ligarAr = ligarAr;
	}
	
	public void setAr(boolean ligarAr) {
		this.ligarAr = ligarAr;
	}

	public void ligarAr() {
		ligarAr = true;
	}

	public void desligarAr() {
		ligarAr = false;
	}

	public void ligarTurbo() {
		ligarTurbo = true;
	}

	public void desligarTurbo() {
		ligarTurbo = false;
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}
		return 15;
	}

	@Override
	public boolean acelerar() {
		if (this.VELOCIDADE_MAXIMA > this.velocidadeAtual) {
			this.velocidadeAtual += getDelta();
			return true;
		} else {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
			return false;
		}
	}
}
