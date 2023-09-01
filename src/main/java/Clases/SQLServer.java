package Clases;

import ConexionBD.CConexion;
import ConexionBD.ConexionSQLServer;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SQLServer {

    public static int IVA = 0;
    static ConexionSQLServer connect;
    static Statement statement;
    static ResultSet resultset, resultset2;
    static PreparedStatement preparedS;
    static PreparedStatement preparedS2;

    public void GuardarClienteMayorista(ClienteMayorista cliente) throws SQLException {

        CConexion objetoConexion = new CConexion();

        String sql = "INSERT INTO CLIENTES (ID_CLIENTE, TIPO_IDENTIFICACION, NOMBRES_CLIENTE, "
                + "APELLIDOS_CLIENTE, DIRECCION_CLIENTE, TELEFONO_CLIENTE, CORREO_CLIENTE, "
                + "FECHA_NACIMIENTO_CLIENTE, FECHA_INGRESO_CLIENTE, ESTADO_CLIENTE, NOMBRE_LOCAL, TELEFONO_ADICIONAL, DIRECCION_LOCAL) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(sql);
            cs.setString(1, cliente.getNroID());
            cs.setString(2, cliente.getTipoID());
            cs.setString(3, cliente.getNombres());
            cs.setString(4, cliente.getApellidos());
            cs.setString(5, cliente.getDireccion());
            cs.setString(6, cliente.getTelf());
            cs.setString(7, cliente.getCorreo());
            cs.setTimestamp(8, cliente.getFecha());
            cs.setTimestamp(9, Timestamp.valueOf(LocalDateTime.now()));
            cs.setBoolean(10, cliente.isEstadoCliente());
            cs.setString(11, cliente.getNomLocal());
            cs.setString(12, cliente.getTelfLocal());
            cs.setString(13, cliente.getDirLocal());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Cliente mayorista registrado con éxito", "SIGCH", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al guardar cliente",
                    "SIGCH", JOptionPane.ERROR_MESSAGE);
            if (e.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "El cliente ingresado ya está registrado",
                        "SIGCH", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

     public void GuardarClienteParticular(ClienteParticular cliente) throws SQLException {

        CConexion objetoConexion = new CConexion();

        String sql = "INSERT INTO CLIENTES (ID_CLIENTE, TIPO_IDENTIFICACION, NOMBRES_CLIENTE, "
                + "APELLIDOS_CLIENTE, DIRECCION_CLIENTE, TELEFONO_CLIENTE, CORREO_CLIENTE, "
                + "FECHA_NACIMIENTO_CLIENTE, FECHA_INGRESO_CLIENTE, ESTADO_CLIENTE) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(sql);
            cs.setString(1, cliente.getNroID());
            cs.setString(2, cliente.getTipoID());
            cs.setString(3, cliente.getNombres());
            cs.setString(4, cliente.getApellidos());
            cs.setString(5, cliente.getDireccion());
            cs.setString(6, cliente.getTelf());
            cs.setString(7, cliente.getCorreo());
            cs.setTimestamp(8, cliente.getFecha());
            cs.setTimestamp(9, Timestamp.valueOf(LocalDateTime.now()));
            cs.setBoolean(10, cliente.isEstadoCliente());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Cliente registrado con éxito", "SIGCH", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al guardar cliente",
                    "SIGCH", JOptionPane.ERROR_MESSAGE);
            if (e.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "El cliente ingresado ya está registrado",
                        "SIGCH", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void mostrarClientes(JTable paramTablaClientes) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Número de cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");

        paramTablaClientes.setModel(modelo);
        sql = "select  id_cliente, nombres_cliente, apellidos_cliente from clientes";
        String[] datos = new String[3];
        Statement st;

        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            paramTablaClientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public ClienteParticular obtenerClientePorCedula(String cedula) {
        CConexion objetoConexion = new CConexion();
        ClienteParticular cliente = new ClienteParticular();

        String sql = "SELECT * FROM CLIENTES WHERE ID_CLIENTE = ?";
        try {
            PreparedStatement ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Llena los datos del cliente con los valores obtenidos de la consulta
                cliente.setNroID(rs.getString("ID_CLIENTE"));
                cliente.setTipoID(rs.getString("TIPO_IDENTIFICACION"));
                cliente.setNombres(rs.getString("NOMBRES_CLIENTE"));
                cliente.setApellidos(rs.getString("APELLIDOS_CLIENTE"));
                cliente.setDireccion(rs.getString("DIRECCION_CLIENTE"));
                cliente.setTelf(rs.getString("TELEFONO_CLIENTE"));
                cliente.setCorreo(rs.getString("CORREO_CLIENTE"));
                cliente.setFecha(rs.getTimestamp("FECHA_NACIMIENTO_CLIENTE"));
                cliente.setEstadoCliente(rs.getBoolean("ESTADO_CLIENTE"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente");
        }

        return cliente;
    }

}
