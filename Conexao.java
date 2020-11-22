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

    public static void inserirCliente(Connection conexao, int id, String nome, Date dtNascimento, String cpf, 
    int diasParaDevolucao) throws Exception {
        String clienteUm = "INSERT INTO cliente_um " + "(id, nome, dtnascimento, cpf, diasparadevolucao)" + "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement statement = conexao.prepareStatement(clienteUm);
            statement.setInt(1, id);
            statement.setString(2, nome);
           // statement.setDate(3, dtNascimento); ERRO NA DATA
            statement.setString(4, cpf);

            statement.execute();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    
    

    }

}
