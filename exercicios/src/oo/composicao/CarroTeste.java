package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c = new Carro();

		System.out.println(c.estaLigado());

		c.ligar();
		System.out.println(c.estaLigado());

		System.out.println(c.motor.giros());

		c.portas.get(0).aberta = true;

		Porta p = c.portas.get(0);

		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();

		System.out.println(c.motor.giros());

		System.out.println(c.frear());
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();

		System.out.println(p.codigo + " " + p.aberta);

		System.out.println(c.portas.get(0).aberta);

		System.out.println(c.frear());

		System.out.println(c.motor.giros());

		// faltou encapsulamento
		// c.motor.fatorInjecao = -30;//gerará um valor inválido

		// relação bidirecional

		System.out.println(c.motor.carro.motor.carro.motor.carro.motor.giros());

	}
}
