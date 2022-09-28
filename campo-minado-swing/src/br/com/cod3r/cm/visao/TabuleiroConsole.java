package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner scanner = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			while (continuar) {

				cicloDoJogo();

				System.out.println("Outra partida? (S/n) ");
				String resposta = scanner.nextLine();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}

		} catch (RuntimeException e) {
			System.out.println("Fim :)");
		} finally {
			scanner.close();
		}
	}

	private void cicloDoJogo() {

		try {
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro.toString());

				String digitado = capturarValorDigitado("Digite (linhas, colunas)");

				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
						.map(e -> Integer.parseInt(e.trim()))
						.iterator();

				digitado =	capturarValorDigitado("1 - Abrir ou 2 - DesMarcar");
				
				if("1".equalsIgnoreCase(digitado)) {
					tabuleiro.abrir(xy.next(),xy.next());
				}else if("2".equalsIgnoreCase(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(),xy.next());
				}
			}
			System.out.println(tabuleiro.toString());
			System.out.println("Você Ganhou!");
		} catch (RuntimeException e) {
			System.out.println(tabuleiro.toString());
			System.out.println("Você perdeu!");
		}
	}

	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String valorDigitado = scanner.nextLine();

		if ("sair".equalsIgnoreCase(valorDigitado)) {
			throw new RuntimeException();
		}

		return valorDigitado;
	}
}
