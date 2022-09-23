package streamAPI;

public class Aluno {

	final String nome;
	final double nota;

	Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}
}
