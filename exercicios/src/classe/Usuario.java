package classe;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {

		if (!(objeto instanceof Usuario)) return false;

		Usuario outro = (Usuario) objeto;
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);

		return nomeIgual && emailIgual;
	}
	
	// O hashCode será abordado em outra aula!
	public int hashCode() {
		return 0;
	}
}
