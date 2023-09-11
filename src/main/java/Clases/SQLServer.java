package Clases;

import ConexionBD.CConexion;
import ConexionBD.ConexionSQLServer;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
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

    public void GuardarClienteMayorista(ClienteMayorista cliente, int prefClienteElegido) throws SQLException {

        CConexion objetoConexion = new CConexion();

        // Verificar si el cliente ya existe
        if (clienteYaExiste(cliente.getNroID())) {
            JOptionPane.showMessageDialog(null, "El cliente ya está registrado", "SIGCH", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO CLIENTES (ID_CLIENTE, TIPO_IDENTIFICACION, NOMBRES_CLIENTE, "
                + "APELLIDOS_CLIENTE, DIRECCION_CLIENTE, TELEFONO_CLIENTE, CORREO_CLIENTE, "
                + "FECHA_NACIMIENTO_CLIENTE, FECHA_INGRESO_CLIENTE, ESTADO_CLIENTE, NOMBRE_LOCAL, TELEFONO_ADICIONAL, DIRECCION_LOCAL, TIPO_CLIENTE) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
        String sql2 = "INSERT INTO PREFERENCIAS_CLIENTE (ID_CATEGORIA,  ID_CLIENTE) VALUES(?, ?)";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(sql);
            CallableStatement cs2 = objetoConexion.establecerConexion().prepareCall(sql2);
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
            cs.setString(14, cliente.getTipoCliente());

            switch (prefClienteElegido) {
                case 0:
                    cs2.setString(1, "1");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 1:
                    cs2.setString(1, "2");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 2:
                    cs2.setString(1, "3");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 3:
                    cs2.setString(1, "4");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 4:
                    cs2.setString(1, "5");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 5:
                    cs2.setString(1, "6");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 6:
                    cs2.setString(1, "7");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 7:
                    cs2.setString(1, "8");
                    cs2.setString(2, cliente.getNroID());
                    break;

                default:
                    throw new AssertionError();
            }

            cs.execute();
            cs2.execute();

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

    public void GuardarClienteParticular(ClienteParticular cliente, int prefClienteElegido) throws SQLException {

        CConexion objetoConexion = new CConexion();

        // Verificar si el cliente ya existe
        if (clienteYaExiste(cliente.getNroID())) {
            JOptionPane.showMessageDialog(null, "El cliente ya está registrado", "SIGCH", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO CLIENTES (ID_CLIENTE, TIPO_IDENTIFICACION, NOMBRES_CLIENTE, "
                + "APELLIDOS_CLIENTE, DIRECCION_CLIENTE, TELEFONO_CLIENTE, CORREO_CLIENTE, "
                + "FECHA_NACIMIENTO_CLIENTE, FECHA_INGRESO_CLIENTE, ESTADO_CLIENTE, TIPO_CLIENTE) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        String sql2 = "INSERT INTO PREFERENCIAS_CLIENTE (ID_CATEGORIA,  ID_CLIENTE) VALUES(?, ?)";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(sql);
            CallableStatement cs2 = objetoConexion.establecerConexion().prepareCall(sql2);
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
            cs.setString(11, cliente.getTipoCliente());

            switch (prefClienteElegido) {
                case 0:
                    cs2.setString(1, "1");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 1:
                    cs2.setString(1, "2");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 2:
                    cs2.setString(1, "3");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 3:
                    cs2.setString(1, "4");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 4:
                    cs2.setString(1, "5");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 5:
                    cs2.setString(1, "6");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 6:
                    cs2.setString(1, "7");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 7:
                    cs2.setString(1, "8");
                    cs2.setString(2, cliente.getNroID());
                    break;

                default:
                    throw new AssertionError();
            }

            cs.execute();
            cs2.execute();

            JOptionPane.showMessageDialog(null, "Cliente particular registrado con éxito", "SIGCH", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al guardar el cliente",
                    "SIGCH", JOptionPane.ERROR_MESSAGE);
            if (e.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "El cliente ingresado ya está registrado",
                        "SIGCH", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Método para verificar si el cliente ya existe
    private boolean clienteYaExiste(String nroID) throws SQLException {
        String sql = "SELECT 1 FROM CLIENTES WHERE ID_CLIENTE = ?";
        CConexion objetoConexion = new CConexion();

        try {
            PreparedStatement ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, nroID);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // Devuelve true si el cliente ya existe, false en caso contrario
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    private boolean productoYaExiste(String codProd) throws SQLException {
        String sql = "SELECT 1 FROM PRODUCTOS WHERE COD_PRODUCTO = ?";
        CConexion objetoConexion = new CConexion();

        try {
            PreparedStatement ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, codProd);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // Devuelve true si el cliente ya existe, false en caso contrario
        } catch (SQLException e) {
            System.err.println(e);
            return false;
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
        sql = "select  id_cliente, nombres_cliente, apellidos_cliente from clientes where estado_cliente = 1";
        String[] datos = new String[4];
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

    public void mostrarClientesActivos(JTable paramTablaClientes) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Número de cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Estado");

        paramTablaClientes.setModel(modelo);
        sql = "select  id_cliente, nombres_cliente, apellidos_cliente, estado_cliente from clientes where estado_cliente = 1";
        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = String.valueOf(rs.getString(4));
                modelo.addRow(datos);
            }
            paramTablaClientes.setModel(modelo);
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public void mostrarClientesInactivos(JTable paramTablaClientes) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Número de cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Estado");

        paramTablaClientes.setModel(modelo);
        sql = "select  id_cliente, nombres_cliente, apellidos_cliente,  estado_cliente from clientes where estado_cliente = 0";
        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = String.valueOf(rs.getString(4));
                modelo.addRow(datos);
            }
            paramTablaClientes.setModel(modelo);
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public void mostrarClientesPorNroCedula(JTable paramTablaClientes, String idCliente) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Número de cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");

        paramTablaClientes.setModel(modelo);

        // Modificar la consulta SQL para buscar por id_cliente
        sql = "SELECT id_cliente, nombres_cliente, apellidos_cliente FROM clientes WHERE id_cliente = ? AND ESTADO_CLIENTE = 1";

        String[] datos = new String[3];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, idCliente);
            ResultSet rs = ps.executeQuery();

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

    public void mostrarClientesPorTipo(JTable tabla, String tipoCliente) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Número de cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");

        tabla.setModel(modelo);

        sql = "SELECT id_cliente, nombres_cliente, apellidos_cliente FROM clientes WHERE tipo_cliente = ? AND ESTADO_CLIENTE = 1";
        try {
            PreparedStatement ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, tipoCliente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String idCliente = rs.getString(1);
                String nombres = rs.getString(2);
                String apellidos = rs.getString(3);
                modelo.addRow(new Object[]{idCliente, nombres, apellidos});
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al consultar clientes por tipo: " + e.getMessage());
        }
    }

    public void mostrarClientesPorPreferencia(JTable tabla, String nombreCategoria) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Número de cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");

        tabla.setModel(modelo);

        sql = "SELECT C.id_cliente, C.nombres_cliente, C.apellidos_cliente "
                + "FROM clientes C "
                + "JOIN preferencias_cliente P ON C.id_cliente = P.id_cliente "
                + "JOIN categorias_productos CP ON P.id_categoria = CP.id_categoria "
                + "WHERE CP.nombre_categoria = ? AND C.ESTADO_CLIENTE = 1";

        try {
            PreparedStatement ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, nombreCategoria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String idCliente = rs.getString(1);
                String nombres = rs.getString(2);
                String apellidos = rs.getString(3);
                modelo.addRow(new Object[]{idCliente, nombres, apellidos});
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al consultar clientes por preferencia: " + e.getMessage());
        }
    }

    public void mostrarClienteACambiarEstado(JTable tablaClientesActivos, JTable tablaClientesInactivos, String idCliente) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Número de cédula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Estado");

        if (buscarClienteEnTabla(tablaClientesActivos, modelo, idCliente)) {
            // Se encontró en la tabla de activos
            tablaClientesActivos.setModel(modelo);
        } else if (buscarClienteEnTabla(tablaClientesInactivos, modelo, idCliente)) {
            // Se encontró en la tabla de inactivos
            tablaClientesInactivos.setModel(modelo);
        } else {
            // No se encontró en ninguna tabla
            JOptionPane.showMessageDialog(null, "Cliente no encontrado en ninguna tabla");
        }
    }

    private boolean buscarClienteEnTabla(JTable tabla, DefaultTableModel modelo, String idCliente) {
        String[] datos = new String[4];

        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            String idEnTabla = tabla.getValueAt(fila, 0).toString();
            if (idEnTabla.equals(idCliente)) {
                // Encontrado en la tabla, agregar a modelo
                datos[0] = idEnTabla;
                datos[1] = tabla.getValueAt(fila, 1).toString();
                datos[2] = tabla.getValueAt(fila, 2).toString();
                datos[3] = tabla.getValueAt(fila, 3).toString();
                modelo.addRow(datos);
                return true;
            }
        }

        return false; // No se encontró en la tabla
    }

    public ClienteMayorista setearDatosCliente(String cedula) {
        CConexion objetoConexion = new CConexion();
        ClienteMayorista cliente = new ClienteMayorista();

        String sqlCliente = "SELECT * FROM CLIENTES WHERE ID_CLIENTE = ? AND ESTADO_CLIENTE = 1";
        String sqlCategorias = "SELECT CP.NOMBRE_CATEGORIA "
                + "FROM CLIENTES C "
                + "INNER JOIN PREFERENCIAS_CLIENTE PC ON C.ID_CLIENTE = PC.ID_CLIENTE "
                + "INNER JOIN CATEGORIAS_PRODUCTOS CP ON PC.ID_CATEGORIA = CP.ID_CATEGORIA "
                + "WHERE C.ID_CLIENTE = ? AND ESTADO_CLIENTE = 1";

        try {
            PreparedStatement psCliente = objetoConexion.establecerConexion().prepareStatement(sqlCliente);
            psCliente.setString(1, cedula);
            ResultSet rsCliente = psCliente.executeQuery();

            if (rsCliente.next()) {
                // Llena los datos del cliente con los valores obtenidos de la consulta principal
                cliente.setNroID(rsCliente.getString("ID_CLIENTE"));
                cliente.setTipoID(rsCliente.getString("TIPO_IDENTIFICACION"));
                cliente.setNombres(rsCliente.getString("NOMBRES_CLIENTE"));
                cliente.setApellidos(rsCliente.getString("APELLIDOS_CLIENTE"));
                cliente.setDireccion(rsCliente.getString("DIRECCION_CLIENTE"));
                cliente.setTelf(rsCliente.getString("TELEFONO_CLIENTE"));
                cliente.setCorreo(rsCliente.getString("CORREO_CLIENTE"));
                cliente.setFecha(rsCliente.getTimestamp("FECHA_NACIMIENTO_CLIENTE"));
                cliente.setEstadoCliente(rsCliente.getBoolean("ESTADO_CLIENTE"));
                cliente.setTipoCliente(rsCliente.getString("TIPO_CLIENTE"));
                cliente.setNomLocal(rsCliente.getString("NOMBRE_LOCAL"));
                cliente.setTelfLocal(rsCliente.getString("TELEFONO_ADICIONAL"));
                cliente.setDirLocal(rsCliente.getString("DIRECCION_LOCAL"));

                // Ahora, obtén la categoría de preferencia usando una segunda consulta
                PreparedStatement psCategorias = objetoConexion.establecerConexion().prepareStatement(sqlCategorias);
                psCategorias.setString(1, cedula);
                ResultSet rsCategorias = psCategorias.executeQuery();

                if (rsCategorias.next()) {
                    cliente.setPrefProd(rsCategorias.getString(1)); // Asigna la categoría de preferencia
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente");
        }

        return cliente;
    }

    public ClienteMayorista obtenerClientePorCedula2(String cedula) {
        CConexion objetoConexion = new CConexion();
        ClienteMayorista cliente = new ClienteMayorista();

        String sqlCliente = "SELECT * FROM CLIENTES WHERE ID_CLIENTE = ?";
        String sqlCategorias = "SELECT CP.NOMBRE_CATEGORIA "
                + "FROM CLIENTES C "
                + "INNER JOIN PREFERENCIAS_CLIENTE PC ON C.ID_CLIENTE = PC.ID_CLIENTE "
                + "INNER JOIN CATEGORIAS_PRODUCTOS CP ON PC.ID_CATEGORIA = CP.ID_CATEGORIA "
                + "WHERE C.ID_CLIENTE = ? AND ESTADO_CLIENTE = 1";

        try {
            PreparedStatement psCliente = objetoConexion.establecerConexion().prepareStatement(sqlCliente);
            psCliente.setString(1, cedula);
            ResultSet rsCliente = psCliente.executeQuery();

            if (rsCliente.next()) {
                // Llena los datos del cliente con los valores obtenidos de la consulta principal
                cliente.setNroID(rsCliente.getString("ID_CLIENTE"));
                cliente.setTipoID(rsCliente.getString("TIPO_IDENTIFICACION"));
                cliente.setNombres(rsCliente.getString("NOMBRES_CLIENTE"));
                cliente.setApellidos(rsCliente.getString("APELLIDOS_CLIENTE"));
                cliente.setDireccion(rsCliente.getString("DIRECCION_CLIENTE"));
                cliente.setTelf(rsCliente.getString("TELEFONO_CLIENTE"));
                cliente.setCorreo(rsCliente.getString("CORREO_CLIENTE"));
                cliente.setFecha(rsCliente.getTimestamp("FECHA_NACIMIENTO_CLIENTE"));
                cliente.setEstadoCliente(rsCliente.getBoolean("ESTADO_CLIENTE"));
                cliente.setTipoCliente(rsCliente.getString("TIPO_CLIENTE"));
                cliente.setNomLocal(rsCliente.getString("NOMBRE_LOCAL"));
                cliente.setTelfLocal(rsCliente.getString("TELEFONO_ADICIONAL"));
                cliente.setDirLocal(rsCliente.getString("DIRECCION_LOCAL"));

                // Ahora, obtén la categoría de preferencia usando una segunda consulta
                PreparedStatement psCategorias = objetoConexion.establecerConexion().prepareStatement(sqlCategorias);
                psCategorias.setString(1, cedula);
                ResultSet rsCategorias = psCategorias.executeQuery();

                if (rsCategorias.next()) {
                    cliente.setPrefProd(rsCategorias.getString(1)); // Asigna la categoría de preferencia
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente");
        }

        return cliente;
    }

    public boolean actualizarCliente(ClienteMayorista cliente, int prefClienteElegido) {
        CConexion objetoConexion = new CConexion();

        String sql = "UPDATE CLIENTES SET "
                + "DIRECCION_CLIENTE=?, "
                + "CORREO_CLIENTE=?, "
                + "TELEFONO_CLIENTE=?, "
                + "TIPO_CLIENTE=?, "
                + "NOMBRE_LOCAL=?, "
                + "TELEFONO_ADICIONAL=?, "
                + "DIRECCION_LOCAL=? "
                + "WHERE ID_CLIENTE=?";

        String sql2 = "UPDATE PREFERENCIAS_CLIENTE SET "
                + "ID_CATEGORIA=? "
                + "WHERE ID_CLIENTE=?";

        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement cs = conn.prepareStatement(sql);
            PreparedStatement cs2 = conn.prepareStatement(sql2);

            // Establecer los parámetros para la actualización del cliente
            cs.setString(1, cliente.getDireccion());
            cs.setString(2, cliente.getCorreo());
            cs.setString(3, cliente.getTelf());
            cs.setString(4, cliente.getTipoCliente());
            cs.setString(5, cliente.getNomLocal());
            cs.setString(6, cliente.getTelfLocal());
            cs.setString(7, cliente.getDirLocal());
            cs.setString(8, cliente.getNroID());

            switch (prefClienteElegido) {
                case 0:
                    cs2.setString(1, "1");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 1:
                    cs2.setString(1, "2");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 2:
                    cs2.setString(1, "3");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 3:
                    cs2.setString(1, "4");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 4:
                    cs2.setString(1, "5");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 5:
                    cs2.setString(1, "6");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 6:
                    cs2.setString(1, "7");
                    cs2.setString(2, cliente.getNroID());
                    break;
                case 7:
                    cs2.setString(1, "8");
                    cs2.setString(2, cliente.getNroID());
                    break;

                default:
                    throw new AssertionError();
            }

            int filasActualizadas1 = cs.executeUpdate();
            int filasActualizadas2 = cs2.executeUpdate();

            conn.close();

            return (filasActualizadas1 > 0) && (filasActualizadas2 > 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean cambiarEstadoCliente(ClienteMayorista cliente, boolean estadoCliente) {
        CConexion objetoConexion = new CConexion();

        String sql = "UPDATE CLIENTES SET "
                + "ESTADO_CLIENTE=? "
                + "WHERE ID_CLIENTE=?";
        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement cs = conn.prepareStatement(sql);
            // Establecer los parámetros para la actualización del cliente
            cs.setBoolean(1, cliente.isEstadoCliente());
            cs.setString(2, cliente.getNroID());
            int filasActualizadas1 = cs.executeUpdate();
            conn.close();
            return (filasActualizadas1 > 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean cambiarEstadoClienteActivo(ClienteMayorista cliente) {
        CConexion objetoConexion = new CConexion();

        String sql = "UPDATE CLIENTES SET "
                + "ESTADO_CLIENTE=1 "
                + "WHERE ID_CLIENTE=?";
        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement cs = conn.prepareStatement(sql);
            // Establecer los parámetros para la actualización del cliente
            cs.setString(1, cliente.getNroID());
            int filasActualizadas1 = cs.executeUpdate();
            conn.close();
            return (filasActualizadas1 > 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void guardarProducto(Producto producto, int catprodElegido) throws SQLException {
        CConexion objetoConexion = new CConexion();

        // Verificar si el cliente ya existe
        if (productoYaExiste(producto.getCodProducto())) {
            JOptionPane.showMessageDialog(null, "El producto ya está registrado", "SIGCH", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sql = "INSERT INTO PRODUCTOS (COD_PRODUCTO, NOMBRE_PRODUCTO, DESCRIPCION_PRODUCTO, PRECIO_UNIT, PESO_NETO, CANT_STOCK, CONT_CACAO, ESTADO_STOCK, ESTADO_PRODUCTO) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String sql2 = "INSERT INTO CAT_PROD (ID_CATEGORIA,  COD_PRODUCTO) VALUES(?, ?)";
        try {
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(sql);
            CallableStatement cs2 = objetoConexion.establecerConexion().prepareCall(sql2);
            cs.setString(1, producto.getCodProducto());
            cs.setString(2, producto.getNombreProducto());
            cs.setString(3, producto.getDescripcionProducto());
            cs.setDouble(4, producto.getPrecioUnit());
            cs.setDouble(5, producto.getPesoNeto());
            cs.setInt(6, producto.getCantStock());
            cs.setDouble(7, producto.getContCacao());
            cs.setBoolean(8, producto.isEstadoStock());
            cs.setBoolean(9, producto.isEstadoProducto());

            switch (catprodElegido) {
                case 0:
                    cs2.setString(1, "1");
                    cs2.setString(2, producto.getCodProducto());
                    break;
                case 1:
                    cs2.setString(1, "2");
                    cs2.setString(2, producto.getCodProducto());
                    break;
                case 2:
                    cs2.setString(1, "3");
                    cs2.setString(2, producto.getCodProducto());
                    break;
                case 3:
                    cs2.setString(1, "4");
                    cs2.setString(2, producto.getCodProducto());
                    break;
                case 4:
                    cs2.setString(1, "5");
                    cs2.setString(2, producto.getCodProducto());
                    break;
                case 5:
                    cs2.setString(1, "6");
                    cs2.setString(2, producto.getCodProducto());
                    break;
                case 6:
                    cs2.setString(1, "7");
                    cs2.setString(2, producto.getCodProducto());
                    break;
                case 7:
                    cs2.setString(1, "8");
                    cs2.setString(2, producto.getCodProducto());
                    break;

                default:
                    throw new AssertionError();
            }

            cs.execute();
            cs2.execute();
            JOptionPane.showMessageDialog(null, "Producto registrado con éxito", "SIGCH", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al guardar producto",
                    "SIGCH", JOptionPane.ERROR_MESSAGE);
            if (e.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "El producto ingresado ya está registrado",
                        "SIGCH", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarProductos(JTable paramTablaClientes) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad en stock");
        modelo.addColumn("Categoria");

        paramTablaClientes.setModel(modelo);
        sql = "SELECT p.cod_producto, p.nombre_producto, p.precio_unit, p.cant_stock, cp.NOMBRE_CATEGORIA "
                + "from productos p INNER JOIN cat_prod c ON p.cod_producto = c.cod_producto JOIN CATEGORIAS_PRODUCTOS cp "
                + "ON c.ID_CATEGORIA = cp.ID_CATEGORIA WHERE ESTADO_PRODUCTO = 1";
        String[] datos = new String[5];
        Statement st;

        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                // Formatea el valor de la columna "Precio" con dos decimales
                double precio = rs.getDouble(3);
                datos[2] = String.format("%.2f", precio);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            paramTablaClientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public Producto setearProducto(String codigoProducto) {
        CConexion objetoConexion = new CConexion();
        Producto producto = new Producto();

        String sql = "SELECT P.COD_PRODUCTO, P.NOMBRE_PRODUCTO, P.DESCRIPCION_PRODUCTO, "
                + "P.PRECIO_UNIT, P.PESO_NETO, P.CANT_STOCK, P.CONT_CACAO, "
                + "C.NOMBRE_CATEGORIA "
                + "FROM PRODUCTOS P "
                + "INNER JOIN CAT_PROD CP ON P.COD_PRODUCTO = CP.COD_PRODUCTO "
                + "INNER JOIN CATEGORIAS_PRODUCTOS C ON CP.ID_CATEGORIA = C.ID_CATEGORIA "
                + "WHERE P.COD_PRODUCTO = ? AND ESTADO_PRODUCTO = 1";

        String sqlCategoria = "SELECT cp.NOMBRE_CATEGORIA FROM PRODUCTOS p "
                + "INNER JOIN CAT_PROD c ON p.COD_PRODUCTO = c.COD_PRODUCTO "
                + "INNER JOIN CATEGORIAS_PRODUCTOS cp ON c.ID_CATEGORIA = cp.ID_CATEGORIA "
                + "WHERE p.COD_PRODUCTO = ? AND p.ESTADO_PRODUCTO = 1";

        try {
            Connection conn = objetoConexion.establecerConexion();

            // Consulta para obtener los datos del producto
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, codigoProducto);
            ResultSet rs = ps.executeQuery();

            // Consulta para obtener la categoría del producto
            PreparedStatement psCategoria = conn.prepareStatement(sqlCategoria);
            psCategoria.setString(1, codigoProducto);
            ResultSet rsCategoria = psCategoria.executeQuery();

            if (rs.next()) {
                producto.setCodProducto(rs.getString("COD_PRODUCTO"));
                producto.setNombreProducto(rs.getString("NOMBRE_PRODUCTO"));
                producto.setDescripcionProducto(rs.getString("DESCRIPCION_PRODUCTO"));
                producto.setPrecioUnit(rs.getDouble("PRECIO_UNIT"));
                producto.setPesoNeto(rs.getDouble("PESO_NETO"));
                producto.setCantStock(rs.getInt("CANT_STOCK"));
                producto.setContCacao(rs.getDouble("CONT_CACAO"));
                // Consulta y establece la categoría del producto
                if (rsCategoria.next()) {
                    producto.setCatProd(rsCategoria.getString("NOMBRE_CATEGORIA"));
                }
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return producto;
    }

    public void mostrarProductoBuscado(JTable tablaProductos, String codProd) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad en stock");
        modelo.addColumn("Categoría");

        tablaProductos.setModel(modelo);

        sql = "SELECT P.COD_PRODUCTO, P.NOMBRE_PRODUCTO, "
                + "P.PRECIO_UNIT, P.CANT_STOCK, "
                + "C.NOMBRE_CATEGORIA "
                + "FROM PRODUCTOS P "
                + "INNER JOIN CAT_PROD CP ON P.COD_PRODUCTO = CP.COD_PRODUCTO "
                + "INNER JOIN CATEGORIAS_PRODUCTOS C ON CP.ID_CATEGORIA = C.ID_CATEGORIA "
                + "WHERE P.COD_PRODUCTO = ? AND ESTADO_PRODUCTO = 1";

        String[] datos = new String[5];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, codProd);
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No se encontró el producto", "Error", JOptionPane.ERROR_MESSAGE);
                return; // No se encontró el producto, por lo que no se agrega ninguna fila
            }

            do {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);

                // Formatea el valor de la columna "Precio" con dos decimales
                double precio = rs.getDouble(3);
                datos[2] = String.format("%.2f", precio);

                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            } while (rs.next());

            tablaProductos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarProductosPorCategoria(JTable tablaProductos, String categoria) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad en stock");
        modelo.addColumn("Categoría");

        tablaProductos.setModel(modelo);

        sql = "SELECT P.COD_PRODUCTO, P.NOMBRE_PRODUCTO, P.PRECIO_UNIT, P.CANT_STOCK, C.NOMBRE_CATEGORIA "
                + "FROM PRODUCTOS P "
                + "INNER JOIN CAT_PROD CP ON P.COD_PRODUCTO = CP.COD_PRODUCTO "
                + "INNER JOIN CATEGORIAS_PRODUCTOS C ON CP.ID_CATEGORIA = C.ID_CATEGORIA "
                + "WHERE C.NOMBRE_CATEGORIA = ? AND P.ESTADO_PRODUCTO = 1";

        String[] datos = new String[5];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, categoria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                // Formatea el valor de la columna "Precio" con dos decimales
                double precio = rs.getDouble(3);
                datos[2] = String.format("%.2f", precio);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }

            tablaProductos.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al obtener los productos por categoría", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarProductosPorNombre(JTable tablaProductos, String nombreProducto) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad en stock");
        modelo.addColumn("Categoría");

        tablaProductos.setModel(modelo);

        sql = "SELECT P.COD_PRODUCTO, P.NOMBRE_PRODUCTO, P.PRECIO_UNIT, P.CANT_STOCK, C.NOMBRE_CATEGORIA "
                + "FROM PRODUCTOS P "
                + "INNER JOIN CAT_PROD CP ON P.COD_PRODUCTO = CP.COD_PRODUCTO "
                + "INNER JOIN CATEGORIAS_PRODUCTOS C ON CP.ID_CATEGORIA = C.ID_CATEGORIA "
                + "WHERE P.NOMBRE_PRODUCTO = ? AND P.ESTADO_PRODUCTO = 1";

        String[] datos = new String[5];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, nombreProducto);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                // Formatea el valor de la columna "Precio" con dos decimales
                double precio = rs.getDouble(3);
                datos[2] = String.format("%.2f", precio);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }

            tablaProductos.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al obtener los productos por nombre", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean actualizarProducto(Producto producto) {
        CConexion objetoConexion = new CConexion();

        String sql = "UPDATE PRODUCTOS SET "
                + "NOMBRE_PRODUCTO=?, "
                + "DESCRIPCION_PRODUCTO=?, "
                + "PRECIO_UNIT=?, "
                + "PESO_NETO=?, "
                + "CANT_STOCK=?, "
                + "CONT_CACAO=? "
                + "WHERE COD_PRODUCTO=? AND ESTADO_PRODUCTO = 1";

        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            // Establecer los parámetros para la actualización del producto
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcionProducto());
            ps.setDouble(3, producto.getPrecioUnit());
            ps.setDouble(4, producto.getPesoNeto());
            ps.setInt(5, producto.getCantStock());
            ps.setDouble(6, producto.getContCacao());
            ps.setString(7, producto.getCodProducto());

            int filasActualizadas = ps.executeUpdate();
            conn.close();

            return filasActualizadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void mostrarProductosActivos(JTable paramTablaClientes) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Estado");

        paramTablaClientes.setModel(modelo);
        sql = "SELECT cod_producto, nombre_producto, estado_producto from productos p WHERE ESTADO_PRODUCTO = 1";
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

    public void mostrarProductosInactivos(JTable paramTablaClientes) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Estado");

        paramTablaClientes.setModel(modelo);
        sql = "SELECT p.cod_producto, p.nombre_producto, p.estado_producto from productos p WHERE ESTADO_PRODUCTO = 0";
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

    public void mostrarProductoACambiarEstado(JTable tablaProdActivos, JTable tablaProdInactivos, String codProd) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Estado");

        if (buscarProductoEnTabla(tablaProdActivos, modelo, codProd)) {
            // Se encontró en la tabla de activos
            tablaProdActivos.setModel(modelo);
        } else if (buscarProductoEnTabla(tablaProdInactivos, modelo, codProd)) {
            // Se encontró en la tabla de inactivos
            tablaProdInactivos.setModel(modelo);
        } else {
            // No se encontró en ninguna tabla
            JOptionPane.showMessageDialog(null, "Producto no encontrado en ninguna tabla");
        }
    }

    private boolean buscarProductoEnTabla(JTable tabla, DefaultTableModel modelo, String codProd) {
        String[] datos = new String[3];

        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            String idEnTabla = tabla.getValueAt(fila, 0).toString();
            if (idEnTabla.equals(codProd)) {
                // Encontrado en la tabla, agregar a modelo
                datos[0] = idEnTabla;
                datos[1] = tabla.getValueAt(fila, 1).toString();
                datos[2] = tabla.getValueAt(fila, 2).toString();
                modelo.addRow(datos);
                return true;
            }
        }

        return false; // No se encontró en la tabla
    }

    public boolean cambiarEstadoProducto(Producto producto, boolean estadoProducto) {
        CConexion objetoConexion = new CConexion();

        String sql = "UPDATE PRODUCTOS SET "
                + "ESTADO_PRODUCTO=? "
                + "WHERE COD_PRODUCTO=?";
        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement cs = conn.prepareStatement(sql);
            // Establecer los parámetros para la actualización del cliente
            cs.setBoolean(1, producto.isEstadoProducto());
            cs.setString(2, producto.getCodProducto());
            int filasActualizadas1 = cs.executeUpdate();
            conn.close();
            return (filasActualizadas1 > 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Producto setearProducto2(String codigoProducto) {
        CConexion objetoConexion = new CConexion();
        Producto producto = new Producto();

        String sql = "SELECT P.COD_PRODUCTO, P.NOMBRE_PRODUCTO, P.DESCRIPCION_PRODUCTO, "
                + "P.PRECIO_UNIT, P.PESO_NETO, P.CANT_STOCK, P.CONT_CACAO, "
                + "C.NOMBRE_CATEGORIA "
                + "FROM PRODUCTOS P "
                + "INNER JOIN CAT_PROD CP ON P.COD_PRODUCTO = CP.COD_PRODUCTO "
                + "INNER JOIN CATEGORIAS_PRODUCTOS C ON CP.ID_CATEGORIA = C.ID_CATEGORIA "
                + "WHERE P.COD_PRODUCTO = ? AND ESTADO_PRODUCTO = 0";

        String sqlCategoria = "SELECT cp.NOMBRE_CATEGORIA FROM PRODUCTOS p "
                + "INNER JOIN CAT_PROD c ON p.COD_PRODUCTO = c.COD_PRODUCTO "
                + "INNER JOIN CATEGORIAS_PRODUCTOS cp ON c.ID_CATEGORIA = cp.ID_CATEGORIA "
                + "WHERE p.COD_PRODUCTO = ? AND p.ESTADO_PRODUCTO = 0";

        try {
            Connection conn = objetoConexion.establecerConexion();

            // Consulta para obtener los datos del producto
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, codigoProducto);
            ResultSet rs = ps.executeQuery();

            // Consulta para obtener la categoría del producto
            PreparedStatement psCategoria = conn.prepareStatement(sqlCategoria);
            psCategoria.setString(1, codigoProducto);
            ResultSet rsCategoria = psCategoria.executeQuery();

            if (rs.next()) {
                producto.setCodProducto(rs.getString("COD_PRODUCTO"));
                producto.setNombreProducto(rs.getString("NOMBRE_PRODUCTO"));
                producto.setDescripcionProducto(rs.getString("DESCRIPCION_PRODUCTO"));
                producto.setPrecioUnit(rs.getDouble("PRECIO_UNIT"));
                producto.setPesoNeto(rs.getDouble("PESO_NETO"));
                producto.setCantStock(rs.getInt("CANT_STOCK"));
                producto.setContCacao(rs.getDouble("CONT_CACAO"));
                // Consulta y establece la categoría del producto
                if (rsCategoria.next()) {
                    producto.setCatProd(rsCategoria.getString("NOMBRE_CATEGORIA"));
                }
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return producto;
    }

    public boolean cambiarProdActivo(Producto prod) {
        CConexion objetoConexion = new CConexion();

        String sql = "UPDATE PRODUCTOS SET "
                + "ESTADO_PRODUCTO=1 "
                + "WHERE COD_PRODUCTO=?";
        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement cs = conn.prepareStatement(sql);
            // Establecer los parámetros para la actualización del cliente
            cs.setString(1, prod.getCodProducto());
            int filasActualizadas1 = cs.executeUpdate();
            conn.close();
            return (filasActualizadas1 > 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean actualizarCantidadStock(String codigoProducto, int nuevaCantidadStock) {
        CConexion objetoConexion = new CConexion();

        String sql = "UPDATE PRODUCTOS SET CANT_STOCK = ? WHERE COD_PRODUCTO = ?";

        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement ps = conn.prepareStatement(sql);

            // Establecer los parámetros para la actualización de cantidad en stock
            ps.setInt(1, nuevaCantidadStock);
            ps.setString(2, codigoProducto);

            int filasActualizadas = ps.executeUpdate();
            conn.close();

            return filasActualizadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
            return false;
        }
    }

    public int obtenerStockProducto(String codigoProducto) {
        CConexion objetoConexion = new CConexion();
        String sql = "SELECT CANT_STOCK FROM PRODUCTOS WHERE COD_PRODUCTO = ?";
        int stock = 0;

        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, codigoProducto);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                stock = rs.getInt("CANT_STOCK");
            }

            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
        }

        return stock;
    }

    public String obtenerCodigoProductoPorNombre(String nombreProducto) {
        String codigoProducto = null;
        CConexion objetoConexion = new CConexion();
        Connection conn = objetoConexion.establecerConexion();

        try {
            String sql = "SELECT COD_PRODUCTO FROM PRODUCTOS WHERE NOMBRE_PRODUCTO = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombreProducto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                codigoProducto = rs.getString("COD_PRODUCTO");
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return codigoProducto;
    }

    public boolean guardarFactura(String idFactura, String idCliente, String idEmpleado, double montoTotal, List<String> codigosProductos) {
        CConexion objetoConexion = new CConexion();
        Connection conn = objetoConexion.establecerConexion();
        boolean exito = false;

        try {
            conn.setAutoCommit(false); // Deshabilitar la autoconfirmación

            // Inserción de la factura
            String sqlInsertFactura = "INSERT INTO FACTURA (ID_FACTURA, ID_CLIENTE, ID_EMPLEADO, FECHA_EMISION, ESTADO_FACTURA, MONTO_TOTAL) "
                    + "VALUES (?, ?, ?, GETDATE(), '1', ?)";
            PreparedStatement psInsertFactura = conn.prepareStatement(sqlInsertFactura);
            psInsertFactura.setString(1, idFactura);
            psInsertFactura.setString(2, idCliente);
            psInsertFactura.setString(3, idEmpleado);
            psInsertFactura.setDouble(4, montoTotal);
            psInsertFactura.executeUpdate();

            // Inserción de los detalles de la factura
            String sqlInsertDetalle = "INSERT INTO DETALLE_FACTURA (COD_PRODUCTO, ID_FACTURA) VALUES (?, ?)";
            PreparedStatement psInsertDetalle = conn.prepareStatement(sqlInsertDetalle);

            for (String codigoProducto : codigosProductos) {
                psInsertDetalle.setString(1, codigoProducto);
                psInsertDetalle.setString(2, idFactura);
                psInsertDetalle.addBatch(); // Agregar la consulta al lote
            }

            psInsertDetalle.executeBatch(); // Ejecutar el lote de inserción de detalles

            conn.commit(); // Confirmar la transacción
            exito = true;
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback(); // Revertir la transacción en caso de error
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                conn.setAutoCommit(true); // Habilitar la autoconfirmación nuevamente
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return exito;
    }

    public void mostrarFacturas(JTable tablaFacturas) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("ID de la factura");
        modelo.addColumn("Nombre del cliente");
        modelo.addColumn("Número de indetificacion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Valor total");

        tablaFacturas.setModel(modelo);
        sql = "SELECT F.ID_FACTURA, C.NOMBRES_CLIENTE, F.ID_CLIENTE, F.FECHA_EMISION, F.MONTO_TOTAL "
                + "FROM FACTURA F JOIN CLIENTES C ON F.ID_CLIENTE = C.ID_CLIENTE ";
        String[] datos = new String[5];
        Statement st;

        try {
            st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            tablaFacturas.setModel(modelo);
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se mostraron los registros");
        }
    }

    public Factura setearFactura(String idFactura) {
        CConexion objetoConexion = new CConexion();
        Factura factura = new Factura();

        String sqlFactura = "SELECT F.ID_FACTURA, F.ID_CLIENTE, F.ID_EMPLEADO, F.FECHA_EMISION, F.ESTADO_FACTURA, F.MONTO_TOTAL, C.NOMBRES_CLIENTE "
                + "FROM FACTURA F "
                + "JOIN CLIENTES C ON F.ID_CLIENTE = C.ID_CLIENTE "
                + "WHERE F.ID_FACTURA = ?";

        try {
            Connection conn = objetoConexion.establecerConexion();
            PreparedStatement ps = conn.prepareStatement(sqlFactura);
            ps.setString(1, idFactura);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                factura.setIdFactura(rs.getString("ID_FACTURA"));
                factura.setIdCliente(rs.getString("ID_CLIENTE"));
                factura.setIdEmpleado(rs.getString("ID_EMPLEADO"));
                factura.setFecha(rs.getTimestamp("FECHA_EMISION"));
                factura.setEstadoFactura(rs.getBoolean("ESTADO_FACTURA"));
                factura.setMontoTotal(rs.getDouble("MONTO_TOTAL"));
                factura.setNomCliente(rs.getString("NOMBRES_CLIENTE"));
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        return factura;
    }

    public void mostrarFacturasPorCliente(JTable tablaFacturas, String idCliente) {
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";

        modelo.addColumn("ID Factura");
        modelo.addColumn("Nombres Cliente");
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Fecha Emisión");
        modelo.addColumn("Monto Total");

        tablaFacturas.setModel(modelo);

        sql = "SELECT F.ID_FACTURA, C.NOMBRES_CLIENTE, F.ID_CLIENTE, F.FECHA_EMISION, F.MONTO_TOTAL "
                + "FROM FACTURA F "
                + "JOIN CLIENTES C ON F.ID_CLIENTE = C.ID_CLIENTE "
                + "WHERE F.ID_CLIENTE = ?";

        String[] datos = new String[5];
        PreparedStatement ps;

        try {
            ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, idCliente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString("ID_FACTURA");
                datos[1] = rs.getString("NOMBRES_CLIENTE");
                datos[2] = rs.getString("ID_CLIENTE");
                datos[3] = rs.getString("FECHA_EMISION");
                datos[4] = rs.getString("MONTO_TOTAL");
                modelo.addRow(datos);
            }

            tablaFacturas.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al obtener las facturas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
