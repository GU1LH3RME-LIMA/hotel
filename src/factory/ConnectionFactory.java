
package factory;

/**
 *
 * @author Fernando Moreira
 */
import java.sql.*;

public class ConnectionFactory {
     Connection conn = null;
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelando","root","");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);

        }
    }
     public void desconectar(){
      conn = null;
   }
}
