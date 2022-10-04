package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasLike {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Informe o nome: ");

        String filtro = scanner.nextLine();

        String sql = """
                SELECT * FROM pessoas where nome like ?;
                """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + filtro + "%");

        ResultSet result = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (result.next()) {
            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            String cpf = result.getString("cpf");

            pessoas.add(new Pessoa(codigo, nome, cpf));
        }

        for (Pessoa pessoa : pessoas) {
            System.out.printf("Código: %s Nome: %s CPF: %S \n", pessoa.getCodigo(), pessoa.getNome(), pessoa.getCpf());
        }

        scanner.close();
        conexao.close();
    }
}
