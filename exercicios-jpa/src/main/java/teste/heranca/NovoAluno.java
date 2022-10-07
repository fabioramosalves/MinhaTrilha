package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "João");
		Aluno aluno2 = new AlunoBolsista(321L, "Marcos", 1000);
		
		alunoDAO.beginTransaction()
		.update(aluno1)
		.commitTransaction();
		
		alunoDAO.beginTransaction()
		.update(aluno2)
		.commitTransaction();
		
		alunoDAO.close();
		
		
	}
}
