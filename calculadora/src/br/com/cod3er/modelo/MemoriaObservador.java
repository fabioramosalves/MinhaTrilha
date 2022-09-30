package br.com.cod3er.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	public void valorAlterado(String novoValor);
}