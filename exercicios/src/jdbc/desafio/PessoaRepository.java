package jdbc.desafio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Pessoa;

public class PessoaRepository {

    private final String INSERT_PESSOA_SQL = "INSERT INTO pessoas (nome,cpf) VALUES (? , ?);";
    private final String UPDATE_PESSOA_SQL = "UPDATE pessoas SET nome = ?, cpf = ? WHERE codigo = ?";;
    private final String GET_PESSOAS_SQL = "SELECT * FROM pessoas;";
    private final String GET_PESSOA_BY_ID_SQL = "SELECT * FROM pessoas WHERE codigo = ?";
    private final String GET_PESSOA_BY_NAME_SQL = "SELECT * FROM pessoas WHERE nome LIKE ?";
    private final String DELETE_PESSOA_SQL = "DELETE FROM pessoas WHERE codigo = ?";

    public List<Pessoa> getPessoas() {

        List<Pessoa> pessoas = new ArrayList<>();
        Statement stmt = null;
        Connection connection = DataBaseConnection.getConnection();
        try {

            stmt = connection.createStatement();

            ResultSet resultado = stmt.executeQuery(GET_PESSOAS_SQL);

            while (resultado.next()) {

                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                String cpf = resultado.getString("cpf");

                pessoas.add(new Pessoa(codigo, nome, cpf));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection, stmt);
        }

        return pessoas;
    }

    public Pessoa getPessoaByCodigo(int id) {

        List<Pessoa> pessoas = new ArrayList<>();
        PreparedStatement stmt = null;
        Connection connection = DataBaseConnection.getConnection();
        try {
            stmt = connection.prepareStatement(GET_PESSOA_BY_ID_SQL);
            stmt.setInt(1, id);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                String cpf = resultado.getString("cpf");

                pessoas.add(new Pessoa(codigo, nome, cpf));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection, stmt);
        }

        return pessoas.stream().findFirst().isPresent() ? pessoas.stream().findFirst().get() : null;
    }

    public List<Pessoa> getPessoaByName(String name) {

        List<Pessoa> pessoas = new ArrayList<>();
        PreparedStatement stmt = null;
        Connection connection = DataBaseConnection.getConnection();
        try {
            stmt = connection.prepareStatement(GET_PESSOA_BY_NAME_SQL);
            stmt.setString(1, "%" + name + "%");

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {

                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                String cpf = resultado.getString("cpf");

                pessoas.add(new Pessoa(codigo, nome, cpf));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection, stmt);
        }

        return pessoas;
    }

    public boolean updatePessoa(Pessoa pessoa) {

        boolean success = false;
        PreparedStatement stmt = null;
        Connection connection = DataBaseConnection.getConnection();
        try {
            connection = DataBaseConnection.getConnection();
            stmt = connection.prepareStatement(UPDATE_PESSOA_SQL);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setInt(3, pessoa.getCodigo());

            success = !stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection, stmt);
        }
        return success;
    }

    public boolean addPessoa(Pessoa pessoa) {

        boolean success = false;
        PreparedStatement stmt = null;
        Connection connection = DataBaseConnection.getConnection();
        try {
            connection = DataBaseConnection.getConnection();
            stmt = connection.prepareStatement(INSERT_PESSOA_SQL);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());

            success = !stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection, stmt);
        }
        return success;
    }

    public boolean deletePessoa(Pessoa pessoa) {

        boolean success = false;
        PreparedStatement stmt = null;
        Connection connection = DataBaseConnection.getConnection();
        try {
            connection = DataBaseConnection.getConnection();
            stmt = connection.prepareStatement(DELETE_PESSOA_SQL);
            stmt.setInt(1, pessoa.getCodigo());

            success = !stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection, stmt);
        }
        return success;
    }

    private void closeConnection(Connection connection, Statement stmt) {
        try {
            connection.close();
            stmt.close();
        } catch (Exception e) {
        }
    }

    private void closeConnection(Connection connection, PreparedStatement stmt) {
        try {
            connection.close();
            stmt.close();
        } catch (Exception e) {
        }
    }
}