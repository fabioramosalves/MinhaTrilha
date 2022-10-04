package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome : ");

        String nome = scanner.nextLine();

        System.out.println("Informe o cpf : ");

        String cpf = scanner.nextLine();

        String sql = """
                    INSERT INTO pessoas (nome,cpf) VALUES ( ? , ?);
                """;

        // prepareStatement é usado para evitar sql injection
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, cpf);

        boolean success = stmt.execute();

        conexao.close();
        scanner.close();

        System.out.println(!success ? "Insert executado com sucesso" : "Erro ao executar o comando");
    }
}
