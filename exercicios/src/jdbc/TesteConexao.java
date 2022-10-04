package jdbc;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        
        FabricaConexao.getConexao();    
        System.out.println("Conexao efetuada com sucesso");
        FabricaConexao.getConexao().close();
    }
}
