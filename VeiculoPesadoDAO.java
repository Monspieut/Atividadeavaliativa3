package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import models.Veiculospesados;

     // 2.2 - Criando o método para cadastrar Veiculos Pesados

public class VeiculoPesadoDAO extends models.Veiculospesados {

    public VeiculoPesadoDAO(int idVeiculoPesado, String restricoes, String marca, String modelo, int ano,
            double valorParaLocacao) {
        super(idVeiculoPesado, restricoes, marca, modelo, ano, valorParaLocacao);

    }

    public static void cadastrarVeiculoPesado(Veiculospesados veiculospesados) throws SQLException {

        Connection conn = (Connection) factory.Conexao.getConnection();
        PreparedStatement stmt = null;

          //Criando a inserção no banco de dados na tabela "veiculo.pesado"

        String cadastroVeiculoPesado = "INSERT INTO contas.veiculopesado"
                + "(idVeiculoPesado, marca, modelo, ano, valorParaLocacao, restricoes)" + "VALUES(?,?,?,?,?,?)";

        try {
            stmt = (PreparedStatement) conn.prepareStatement(cadastroVeiculoPesado);

            stmt.setString(1, veiculospesados.getMarca());
            stmt.setString(2, veiculospesados.getModelo());
            stmt.setString(3, veiculospesados.getModelo());
            stmt.setInt(4, veiculospesados.getAno());
            stmt.setDouble(5, veiculospesados.getValorParaLocacao());
            stmt.setString(6, veiculospesados.getRestricoes());

            stmt.execute();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            stmt.close();
        }
    }

    // 5.2 Listando Veiculos Pesados

    public static void listarVeiculoPesados(Connection conexao, int idVeiculoPesado, String marca, String modelo,
            String ano, Double valorParaLocacao, String restricoes) throws Exception {
        String listaVeiculosPesados = "SELECT SUM(*) FROM contas.veiculospesado";
        try {
            PreparedStatement statement = conexao.prepareStatement(listaVeiculosPesados);

            statement.setInt(1, idVeiculoPesado);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setString(4, ano);
            statement.setDouble(5, valorParaLocacao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

	public static ArrayList<Veiculospesados> listarVeiculoPesados() {
		return null;
	}
}
