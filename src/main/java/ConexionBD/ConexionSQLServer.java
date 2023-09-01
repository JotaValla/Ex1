package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionSQLServer {

    static Connection con = null;
    static Statement st;

    public static Connection getConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=P1SIGCH;"
                    + "encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String password = "Parkour27";
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "NO FUE POSIBLE CONECTARSE \n " + e);
            return null;
        }
    }

    public static Statement getStatement() throws SQLException {
        Statement st = null;
        st = getConexion().createStatement();
        return st;
    }

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        PreparedStatement ps = getConexion().prepareStatement(sql);
        return ps;
    }

    public static ResultSet getResultSet(String sql) throws SQLException {
        ResultSet rs = null;
        rs = getStatement().executeQuery(sql);
        return rs;
    }

    public static void Cerrar(Connection cn) throws SQLException {
        cn.close();
    }

    public static void Cerrar(PreparedStatement ps) throws SQLException {
        ps.close();
    }

    public static void Cerrar(ResultSet rs) throws SQLException {
        rs.close();
    }
}
