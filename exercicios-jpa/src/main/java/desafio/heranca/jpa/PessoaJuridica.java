package desafio.heranca.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "J")
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = 1L;

	private String cnpj;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, String cnpj) {
		this.setNome(nome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
