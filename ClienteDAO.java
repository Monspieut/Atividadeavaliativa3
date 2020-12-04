package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import models.Cliente;
import javax.swing.JOptionPane;

// 1.0 - Criando o método para cadastrar Veiculos Pesados

public class ClienteDAO extends models.Cliente {
    protected int id;
    protected String nome;
    protected String cpf;
    protected String email;
    protected String telefone;

    public void cadastrarCliente(ArrayList<Cliente> usuarios, Connection conexao) throws SQLException {
        Connection conn = (Connection) factory.Conexao.getConnection();
        PreparedStatement stmt = null;

        //Criando a inserção no banco de dados na tabela "cliente"

        String cadastroCliente = "INSERT INTO cliente (idCliente, nome, dtnascimento, cpf, diasparadevolucao) VALUES(?,?,?,?,?);";
        try {
            stmt = (PreparedStatement) conn.prepareStatement(cadastroCliente);
            stmt.setInt(1, getIdCliente());
            stmt.setString(2, getNome());
            stmt.setString(3, getDtnascimento());
            stmt.setString(4, getCpt());
            stmt.setInt(5, getDiasparadevolucao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com Sucesso", "Mensagem do Sistema",
                    JOptionPane.WARNING_MESSAGE);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            stmt.close();
        }

    }

    // Método para Listar os Clientes

    public static ArrayList<Cliente> listarTodosClientes() throws SQLException {
        Connection conn = (Connection) factory.Conexao.getConnection();

        String sql = "SELECT * FROM cliente";
        // ========= Método que faz a conexão =========
        PreparedStatement stmt = conn.prepareStatement(sql);

        // ========= Executar o select =========
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String dtnascimento = rs.getString("dtnascimento");
            String cpf = rs.getString("cpf");
            String diasparadevolucao = rs.getString("diasparadevolucao");

            System.out.println("Id :" + id + "\n" + "Nome :" + nome + "\n" + "dtnascimento :" + dtnascimento + "\n"
                    + "Cpf :" + cpf + "\n" + "Telefone :" + diasparadevolucao + "\n");
        }

        stmt.close();
        conn.close();
        return null;
    }

    // 4.0 Listando a quantidade de locações por cliente

    public static void qtdLocacaoCliente(Connection conexao, String cpf) throws Exception {
        String locacoesPorCliente = "SELECT SUM(*) FROM contas.locacao WHERE cpf = ?";
        try {
            PreparedStatement statement = conexao.prepareStatement(locacoesPorCliente);

            statement.setString(1, cpf);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
