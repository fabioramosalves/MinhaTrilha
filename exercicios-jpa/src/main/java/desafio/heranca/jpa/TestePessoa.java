package desafio.heranca.jpa;

import java.util.List;

import infra.DAO;

public class TestePessoa {

	public static void main(String[] args) {

		DAO<Pessoa> dao = new DAO<>(Pessoa.class);

		Pessoa pessoaFisica = new PessoaFisica("Fabio", "260.592.248-06");
		Pessoa pessoaJuridica = new PessoaJuridica("Despegar", "05.712.546/0001-99");

		dao.addAtomic(pessoaFisica).addAtomic(pessoaJuridica);

		List<Pessoa> pessoas = dao.getAll();

		pessoas.forEach(p -> System.out.println(p.getNome()));

		dao.close();
	}
}
