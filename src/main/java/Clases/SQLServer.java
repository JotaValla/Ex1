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

    public void guardarProducto(Producto producto, int catprodElegido) {
        CConexion objetoConexion = new CConexion();

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
                datos[2] = rs.getString(3);
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
        System.out.println(producto.getCatProd());
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
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            } while (rs.next());

            tablaProductos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el producto", "Error", JOptionPane.ERROR_MESSAGE);
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

}
