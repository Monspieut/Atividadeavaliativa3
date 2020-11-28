import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;

public class Conexao {
    public static Connection getConnection() throws Exception {
        try {

            final String URL = "jdbc:mysql://localhost:3306/contas";
            final String USER = "root";
            final String PASSWORD = "";

            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 1.0 - Criar cadastro de cliente

    public static void cadastrarCliente(Connection conexao, int id, String nome, Date dtNascimento, String cpf,
            int diasParaDevolucao) throws Exception {
        String cadastroCliente = "INSERT INTO cliente " + "(id, nome, dtnascimento, cpf, diasparadevolucao)"
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = conexao.prepareStatement(cadastroCliente);

            statement.setString(2, nome);
            statement.setDate(3, (java.sql.Date) dtNascimento);
            statement.setString(4, cpf);
            statement.setInt(5, diasParaDevolucao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    // Listar a quantidade de locações por cliente

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

    // 2.1 - Cadastrar Veiculos Leves

    public static void cadastrarVeiculoLeve(Connection conexao, String marca, String modelo, String ano,
            double valorParaLocacao, int idVeiculoLeve, String cor) throws Exception {
        String cadastroVeiculoLeve = "INSERT INTO contas.veiculoleve"
                + "(idVeiculoLeve, marca, modelo, ano, valorParaLocacao, cor)" + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conexao.prepareStatement(cadastroVeiculoLeve);

            statement.setInt(1, idVeiculoLeve);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setString(4, ano);
            statement.setDouble(5, valorParaLocacao);
            statement.setString(6, cor);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    // 2.2 - Cadastrar Veiculos Pesados

    public static void cadastrarVeiculoPesado(Connection conexao, String marca, String modelo, String ano,
            double valorParaLocacao, int idVeiculoPesado, String restricoes) throws Exception {
        String cadastroVeiculoPesado = "INSERT INTO contas.veiculopesado"
                + "(idVeiculoPesado, marca, modelo, ano, valorParaLocacao, restricoes)" + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conexao.prepareStatement(cadastroVeiculoPesado);

            statement.setInt(1, idVeiculoPesado);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setString(4, ano);
            statement.setDouble(5, valorParaLocacao);
            statement.setString(6, restricoes);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    // 3.0 - Cadastrar Locações

    public static void cadastrarLocacoes(Connection conexao, int idDaLocacao, int idDocliente, Date dtLocacao,
            Date dtDevolucao) throws Exception {
        String locacoes = "INSERT INTO contas.locacao " + "(idDaLocacao, idDocliente, idLocacao, dtDevolucao)"
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement statement = conexao.prepareStatement(locacoes);

            statement.setInt(1, idDaLocacao);
            statement.setInt(2, idDocliente);
            statement.setDate(3, (java.sql.Date) dtLocacao);
            statement.setDate(4, (java.sql.Date) dtDevolucao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    // 4.0 - Listagem de clientes

    public static void listarClientes(Connection conexao, int idCliente, String nome, Date dtNascimento, String cpf,
            int diasParaDevolucao) throws Exception {
        String listarClientes = "SELECT SUM(*) FROM contas.cliente";
        try {
            PreparedStatement statement = conexao.prepareStatement(listarClientes);

            statement.setInt(1, idCliente);
            statement.setString(2, nome);
            statement.setDate(3, (java.sql.Date) dtNascimento);
            statement.setString(4, cpf);
            statement.setInt(5, diasParaDevolucao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
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
    // Listar Veiculos Pesados

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

    // 6.0 - Listagem das Locaçoes

    public static void listarLocacoes(Connection conexao, int idDaLocacao, int idDocliente, Date dtLocacao,
            Date dtDevolucao) throws Exception {
        String listaLocacoes = "SELECT SUM(*) FROM contas.locacao";
        try {
            PreparedStatement statement = conexao.prepareStatement(listaLocacoes);

            statement.setInt(1, idDaLocacao);
            statement.setInt(2, idDocliente);
            statement.setDate(3, (java.sql.Date) dtLocacao);
            statement.setDate(4, (java.sql.Date) dtDevolucao);

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
