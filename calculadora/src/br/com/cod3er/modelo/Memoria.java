package br.com.cod3er.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private enum TipoComando {
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRG, SINAL
	};

	private static final Memoria instancia = new Memoria();
	private String textoAtual = "";
	private String textoBuffer = "";
	private boolean substituir = false;
	private TipoComando ultimaOperacao = null;

	private List<MemoriaObservador> observadores = new ArrayList<>();

	public void adicinarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public Memoria() {
	}

	public static Memoria getInstancia() {
		return instancia;
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	public void processarComando(String texto) {

		TipoComando tipoComando = detectarTipoComando(texto);

		if (tipoComando == null)
			return;

		if (tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;

		} else if (tipoComando == TipoComando.SINAL 
				&& !textoAtual.isEmpty() && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		}else if (tipoComando == TipoComando.SINAL 
				&& !textoAtual.isEmpty() && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual;
		} else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRG) {
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;
		} else {
			substituir = true;
			textoAtual = obterResultadoOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}

		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

	private String obterResultadoOperacao() {

		if (ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL)
			return textoAtual;

		double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));

		double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));

		double resultado = 0;

		if (ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;
		}
		if (ultimaOperacao == TipoComando.SUB) {
			resultado = numeroBuffer - numeroAtual;
		}
		if (ultimaOperacao == TipoComando.DIV) {
			resultado = numeroBuffer / numeroAtual;
		}
		if (ultimaOperacao == TipoComando.MULT) {
			resultado = numeroBuffer * numeroAtual;
		}

		String resultadoString = (resultado + "").replace(".", ",");

		boolean inteiro = resultadoString.endsWith(",0");

		var total = inteiro ? resultadoString.replace(",0", "") : resultadoString;
		System.out.println(total);

		return total;
	}

	private TipoComando detectarTipoComando(String texto) {

		if (textoAtual.isEmpty() && texto.equals("0"))
			return null;

		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {

			if ("AC".equals(texto))
				return TipoComando.ZERAR;

			if ("/".equals(texto))
				return TipoComando.DIV;

			if ("x".equals(texto))
				return TipoComando.MULT;

			if (",".equals(texto) && !textoAtual.contains(","))
				return TipoComando.VIRG;

			if ("-".equals(texto))
				return TipoComando.SUB;

			if ("+".equals(texto))
				return TipoComando.SOMA;

			if ("=".equals(texto))
				return TipoComando.IGUAL;

			if ("±".equals(texto))
				return TipoComando.SINAL;
		}

		return null;
	}
}
