package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

    public static void main(String[] args) throws SQLException{
        Connection conexao = FabricaConexao.getConexao();
        
        String sql = "SELECT * FROM pessoas";
        
        Statement stmt = conexao.createStatement();
        
        ResultSet resultado =  stmt.executeQuery(sql);
        
       List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()) {
           int codigo = resultado.getInt("codigo");
           String nome = resultado.getString("nome");
           String cpf = resultado.getString("cpf");
           
           pessoas.add(new Pessoa(codigo, nome, cpf));
        }
        
        for (Pessoa pessoa : pessoas) {
            
            System.out.printf("Código: %s Nome: %s CPF: %S \n",  pessoa.getCodigo(), pessoa.getNome(),pessoa.getCpf());
        }
        
        conexao.close();
        stmt.close();
    }
}
