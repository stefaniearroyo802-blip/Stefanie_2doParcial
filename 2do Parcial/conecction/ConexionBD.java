import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Corrección: era "com.mysql.cj.jdbc.Driver"
    final String DRIVER = "com.mysql.cj.jdbc.Driver"; 
    final String USR = "usr_jdbc";
    final String PSWD = "123456";
    final String URLBD = "jdbc:mysql://localhost:3306/alumno?useSSL=false&serverTimezone=UTC";

    protected Connection conn = null;

    public Connection optenerConexion() throws Exception{
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URLBD, USR, PSWD);     
        }
        catch(ClassNotFoundException cnfe){
            conn = null;
            System.out.println("Error en el Driver");
            cnfe.printStackTrace();
        }
        catch(SQLException sqle){
            conn = null;
            System.out.println("Error al obtener la conexion");
            sqle.printStackTrace();
        }
        return conn;
    }
}