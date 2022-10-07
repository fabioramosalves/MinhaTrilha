package desafio.heranca.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "F")
public class PessoaFisica extends Pessoa {

	private static final long serialVersionUID = 1L;

	private String cpf;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, String cpf) {
		this.setNome(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
