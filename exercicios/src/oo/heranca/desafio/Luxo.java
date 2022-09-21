package oo.heranca.desafio;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	// default não é obrigatorio a implementação na classe que implementa
	default int velocidadeDoAr() {
		return 1;
	}
}
