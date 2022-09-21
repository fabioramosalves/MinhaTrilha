package oo.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		Carro civic = new Civic();
		Carro carro = new Carro();

		carro.acelerar();
		ferrari.acelerar();
		civic.acelerar();
		ferrari.frear();
		carro.frear();
		carro.frear();
		
		System.out.println("Carro " + carro.velocidadeAtual);
		System.out.println("Ferrari " + ferrari.velocidadeAtual);
		System.out.println("Civic " + civic.velocidadeAtual);
	}
}
