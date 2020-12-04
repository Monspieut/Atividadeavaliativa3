package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import models.Veiculosleves;

// 2.1 - Criando o método para cadastrar Veiculos Pesados

public class VeiculosLeveDAO extends models.Veiculosleves {

    public VeiculosLeveDAO(int idVeiculoLeve, String cor, String marca, String modelo, int ano,
            double valorParaLocacao) {
        super(idVeiculoLeve, cor, marca, modelo, ano, valorParaLocacao);

    }

    public static void cadastrarVeiculoLeve(Veiculosleves veiculosleves) throws SQLException {

        Connection conn = (Connection) factory.Conexao.getConnection();
        PreparedStatement stmt = null;

          //Criando a inserção no banco de dados na tabela "veiculos.leve"

        String cadastroVeiculLeve = "INSERT INTO contas.veiculosleve"
                + "(idVeiculoPesado, marca, modelo, ano, valorParaLocacao, cor)" + "VALUES(?,?,?,?,?,?)";

        try {
            stmt = (PreparedStatement) conn.prepareStatement(cadastroVeiculLeve);

            stmt.setString(1, veiculosleves.getMarca());
            stmt.setString(2, veiculosleves.getModelo());
            stmt.setString(3, veiculosleves.getModelo());
            stmt.setInt(4, veiculosleves.getAno());
            stmt.setDouble(5, veiculosleves.getValorParaLocacao());
            stmt.setString(6, veiculosleves.getCor());

            stmt.execute();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            stmt.close();
        }
    }

    // 5.1 - Listar Veiculos Leves

    public static void listarVeiculosLeves(Connection conexao, int idVeiculoLeve, String marca, String modelo,
            String ano, Double valorParaLocacao, String cor) throws Exception {
        String listaVeiculosLeves = "SELECT SUM(*) FROM contas.veiculosleve";
        try {
            PreparedStatement statement = conexao.prepareStatement(listaVeiculosLeves);

            statement.setInt(1, idVeiculoLeve);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setString(4, ano);
            statement.setDouble(5, valorParaLocacao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

	public static ArrayList<Veiculosleves> listarVeiculosLeves() {
		return null;
	}

}
