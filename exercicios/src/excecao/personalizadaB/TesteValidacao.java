package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacao {

	public static void main(String[] args) 
			throws StringVaziaException, NumeroForaIntervaloException  {

		try {
			Aluno aluno = new Aluno("F", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e);
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e);
		}
		
		Validar.aluno(null);

		System.out.println("Fim :) ");
	}
}
