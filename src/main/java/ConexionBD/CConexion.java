
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConexion {
    
    Connection conectar = null;
    String usuario = "sa";
    String contrasenia = "Parkour27";
    String bd = "P1SIGCH";
    String ip = "localhost";
    String puerto = "1433";
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cadenaConexion = "jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+bd+";"
                                                    +"encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadenaConexion,usuario,contrasenia);   
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se conecto correctamente a la base de datos");
        }
        return conectar;
    }
    
}
