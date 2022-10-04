package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException{
        
       Connection conexao = FabricaConexao.getConexao();
        
        Statement statement = conexao.createStatement();
        
        statement.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        
        //statement.execute("DROP DATABASE IF EXISTS curso_java");
        
        conexao.close();
    }
}
