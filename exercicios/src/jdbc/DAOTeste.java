package jdbc;

import jdbc.desafio.PessoaRepository;

public class DAOTeste {

    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome,cpf) values (?,?) ";
        dao.incluir(sql, "João da Silva","01234567890");
        dao.incluir(sql, "Doria da Fonseca","6549879877");
        dao.incluir(sql, "Ana Julia ","85232198754");

        dao.close();

        PessoaRepository pessoa = new PessoaRepository();

        var pessoas = pessoa.getPessoas();

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
