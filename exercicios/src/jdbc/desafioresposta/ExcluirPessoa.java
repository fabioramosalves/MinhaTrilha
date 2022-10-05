package jdbc.desafioresposta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.FabricaConexao;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código para excluir ");
        int codigo = entrada.nextInt();

        String sql = "DELETE FROM pessoas WHERE codigo = ? ";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, codigo);

        int linhasAfetadas = stmt.executeUpdate();
        if (linhasAfetadas > 0) {
            System.out.printf("%s Pessoa(s) excluida com sucesso!!", linhasAfetadas);
        } else {
            System.out.println("Nenhum resultado retornado");
        }

        conexao.close();
        stmt.close();
        entrada.close();
    }
}
