package excecao;

import streamAPI.Aluno;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		try {
			System.out.println(7 / 1);
			imprimirAluno(a1);
		} catch (NullPointerException ex) {
			System.out.println("Ocorreu um erro: "+ ex);
		} catch (ArithmeticException ex) {
			System.out.println("Ocorreu um erro: "+ ex);
		}

		System.out.println("Fim :)");
	}

	public static void imprimirAluno(Aluno aluno) {

		System.out.println(aluno.getNome());
	}
}
