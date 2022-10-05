package jdbc.desafioresposta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.FabricaConexao;
import jdbc.Pessoa;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa ");
        int codigo = entrada.nextInt();

        String select = "SELECT codigo, nome, cpf FROM pessoas where codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();

        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);

        ResultSet r = stmt.executeQuery();

        if (r.next()) {
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2), r.getString(3));

            System.out.println(p);
            entrada.nextLine();
            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine();
           
            stmt.close();

            stmt = conexao.prepareStatement(update);

            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            
            stmt.execute();

            stmt.close();
            entrada.close();
        }
    }
}
