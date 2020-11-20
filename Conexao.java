import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Conexao {
    public static Connection getConnection() throws Exception{
        try{
       
        final String URL = "jdbc:mysql://localhost:3306/teste";  
        final String USER = "root";
        final String PASSWORD = "";

        return DriverManager.getConnection(URL, USER, PASSWORD);
    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }   
}
