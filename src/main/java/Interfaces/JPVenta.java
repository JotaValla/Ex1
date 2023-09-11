/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Clases.Producto;
import Clases.SQLServer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JPVenta extends javax.swing.JPanel {

    SQLServer metodos;

    jFBuscarProductoFactura factura;
    Producto datosProducto;
    int cantStockProd;
    Object fila;
    private Set<String> productosEnFactura = new HashSet<>();
    jFBuscarClienteFactura cliente = new jFBuscarClienteFactura();
    String codProducto;
    Date fechaActual = new Date();

    public JPVenta() {
        initComponents();

        metodos = new SQLServer();
        factura = new jFBuscarProductoFactura();
        datosProducto = new Producto();
        metodos.mostrarProductos(jtProductos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomApeCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumIDCli = new javax.swing.JTextField();
        lblFiltroCod = new javax.swing.JLabel();
        txtCodProdBuscar = new javax.swing.JTextField();
        btnBuscarProd = new javax.swing.JButton();
        btnCancelarProd = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCantProdSelecc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFactura = new javax.swing.JTable();
        btnCrearFactura = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        txtSubTotal = new javax.swing.JTextField();
        lblSubtotal = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        lblDescuento = new javax.swing.JLabel();
        txtFechaFactura = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        lblIVa = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();

        jLabel1.setText("Apellidos y Nombres:");

        jLabel2.setText("Número de identificacion:");

        lblFiltroCod.setText("Ingrese el código del producto a buscar:");

        btnBuscarProd.setText("Buscar producto");
        btnBuscarProd.setActionCommand("Consultar producto");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        btnCancelarProd.setText("Cancelar");

        btnBuscarCliente.setText("Consultar clientes");
        btnBuscarCliente.setActionCommand("Bucar cliente a agregar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad del producto:");

        txtCantProdSelecc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantProdSeleccKeyReleased(evt);
            }
        });

        jtFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad","P.Unitario","Total"
            }
        ) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false; // Puedes cambiar esto si deseas permitir edición en algunas celdas
            }
        });
        jtFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFacturaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtFactura);

        btnCrearFactura.setText("Crear Factura");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código del producto", "Nombre del producto", "Precio", "Cantidad en stock", "Categoría"
            }
        ));
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtProductos);

        lblSubtotal.setText("Subtotal:");

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });

        lblDescuento.setText("Descuento(%):");

        lblFecha.setText("Fecha de emision:");

        lblTotal.setText("Total a pagar:");

        txtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagarActionPerformed(evt);
            }
        });

        lblIVa.setText("Iva aplicado(%):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(lblFiltroCod, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodProdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCancelarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCantProdSelecc))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrearFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIVa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lblSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(txtNomApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltroCod)
                    .addComponent(txtCodProdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantProdSelecc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescuento)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha)
                    .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotal)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIVa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        metodos.mostrarProductoBuscado(jtProductos, txtCodProdBuscar.getText());
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

        cliente.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void jtFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFacturaMouseClicked

    }//GEN-LAST:event_jtFacturaMouseClicked

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int selectedRow = jtProductos.getSelectedRow();
        if (selectedRow >= 0) {
            txtCantProdSelecc.setText(jtProductos.getValueAt(selectedRow, 3).toString());
            factura.setCodProd(jtProductos.getValueAt(selectedRow, 0).toString());
            factura.setNombProd(jtProductos.getValueAt(selectedRow, 1).toString());
            // Llamar al método setearProducto para obtener los datos del producto
            datosProducto = metodos.setearProducto(jtProductos.getValueAt(selectedRow, 0).toString());

        }
    }//GEN-LAST:event_jtProductosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
        String nomProd = datosProducto.getNombreProducto();
        cantStockProd = Integer.parseInt(txtCantProdSelecc.getText());
        Double precioUnit = datosProducto.getPrecioUnit();
        Double totalXProducto = precioUnit * cantStockProd;

        // Obtener el código del producto
        codProducto = metodos.obtenerCodigoProductoPorNombre(nomProd);

        // Verificar si el producto ya ha sido agregado a la factura
        if (productosEnFactura.contains(codProducto)) {
            JOptionPane.showMessageDialog(null, "El producto ya ha sido agregado a la factura.");
        } else {
            // Agregar el producto a la factura y al conjunto de productos en la factura
            fila = new Object[]{codProducto, nomProd, cantStockProd, String.format("%.2f", precioUnit), String.format("%.2f", totalXProducto)};
            modelo.addRow((Object[]) fila);
            jtFactura.setModel(modelo);
            productosEnFactura.add(codProducto); // Agregar el código del producto a la factura
            JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantProdSeleccKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantProdSeleccKeyReleased
        if (Integer.parseInt(txtCantProdSelecc.getText()) > datosProducto.getCantStock()) {
            JOptionPane.showMessageDialog(null, "Valor excedido de stock");
            return;
        } else if (Integer.parseInt(txtCantProdSelecc.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "Valor no valido");
            return;
        }
    }//GEN-LAST:event_txtCantProdSeleccKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNomApeCli.setEnabled(false);
        txtNumIDCli.setEnabled(false);
        btnBuscarCliente.setEnabled(false);
        txtNomApeCli.setText("");
        txtNumIDCli.setText("");
        txtCantProdSelecc.setText("");
        metodos.mostrarProductos(jtProductos);
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPagarActionPerformed

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        String idFactura = generarIDFacturaAleatorio(); // Reemplaza con el ID de factura real
        String idCliente = txtNumIDCli.getText(); // Reemplaza con el ID de cliente real
        String idEmpleado = "9999999999"; // Reemplaza con el ID de empleado real

        DefaultTableModel facturaModel = (DefaultTableModel) jtFactura.getModel();
        DefaultTableModel productosModel = (DefaultTableModel) jtProductos.getModel();

        List<String> codigosProductos = new ArrayList<>();

        boolean facturaGuardada = true; // Inicialmente suponemos que la factura se guarda con éxito

        for (int fila = 0; fila < facturaModel.getRowCount(); fila++) {
            String codProducto = (String) facturaModel.getValueAt(fila, 0); // Obtener el código del producto
            int cantidadVendida = (int) facturaModel.getValueAt(fila, 2); // Obtener la cantidad vendida

            // Actualizar el stock en la tabla de productos
            for (int i = 0; i < productosModel.getRowCount(); i++) {
                String codigoEnTabla = (String) productosModel.getValueAt(i, 0);
                if (codProducto.equals(codigoEnTabla)) {
                    int stockActual = Integer.parseInt(productosModel.getValueAt(i, 3).toString());
                    int nuevoStock = stockActual - cantidadVendida;

                    if (nuevoStock < 0) {
                        facturaGuardada = false; // No hay suficiente stock para la venta
                        break; // Salir del bucle
                    } else {
                        productosModel.setValueAt(nuevoStock, i, 3); // Actualizar el stock en la tabla de productos visualmente
                        codigosProductos.add(codProducto);

                        // Llamar al método para actualizar el stock en la base de datos
                        boolean actualizado = metodos.actualizarCantidadStock(codProducto, nuevoStock);
                        if (!actualizado) {
                            facturaGuardada = false; // Si no se puede actualizar en la base de datos, marcar como fallido
                        }
                    }
                }
            }
        }

        productosModel.fireTableDataChanged(); // Actualizar la tabla de productos visualmente

        if (facturaGuardada) {
            // Obtener el monto total de la factura
            double montoTotal = calcularTotalFactura();
            double montoIVA = montoTotal + (montoTotal * 0.12); // Calcula el IVA (12%)

            // Actualizar campos JTextField
            txtSubTotal.setText(String.format("%.2f", montoTotal));
            txtTotalPagar.setText(String.format("%.2f", montoIVA));
            txtIva.setText("12");
            txtDescuento.setText("0");
            // Crea un formato de fecha personalizado
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            // Formatea la fecha actual en el formato deseado
            String fechaFormateada = formatoFecha.format(fechaActual);
            txtFechaFactura.setText(fechaFormateada);

            // Llamar al método para guardar la factura
            boolean facturaGuardadaFinal = metodos.guardarFactura(idFactura, idCliente, idEmpleado, montoIVA, codigosProductos);

            if (facturaGuardadaFinal) {
                JOptionPane.showMessageDialog(null, "Factura guardada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar la factura", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock para completar la venta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearFacturaActionPerformed

    //METODOS APARTE
    private double calcularTotalFactura() {
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
        double totalFactura = 0.0;

        // Itera a través de las filas de la tabla
        for (int fila1 = 0; fila1 < modelo.getRowCount(); fila1++) {
            // Obtiene el valor de la columna que contiene el precio total por producto
            String totalXProductoStr = ((String) modelo.getValueAt(fila1, 4)).replace(",", ".");
            double totalXProducto = Double.parseDouble(totalXProductoStr);
            // Suma el precio total al total de la factura
            totalFactura += totalXProducto;
        }

        return totalFactura;
    }

    private String generarIDFacturaAleatorio() {
        // Caracteres válidos para el ID de factura (letras mayúsculas y números)
        String caracteresValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Longitud máxima del ID de factura
        int longitudMaxima = 6;

        Random rand = new Random();
        StringBuilder idFacturaBuilder = new StringBuilder();

        for (int i = 0; i < longitudMaxima; i++) {
            // Generar un índice aleatorio dentro de la longitud de caracteresValidos
            int indiceAleatorio = rand.nextInt(caracteresValidos.length());
            // Obtener el carácter correspondiente al índice aleatorio y agregarlo al ID de factura
            char caracterAleatorio = caracteresValidos.charAt(indiceAleatorio);
            idFacturaBuilder.append(caracterAleatorio);
        }

        return idFacturaBuilder.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnCancelarProd;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtFactura;
    private javax.swing.JTable jtProductos;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFiltroCod;
    private javax.swing.JLabel lblIVa;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantProdSelecc;
    private javax.swing.JTextField txtCodProdBuscar;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFechaFactura;
    private javax.swing.JTextField txtIva;
    public static javax.swing.JTextField txtNomApeCli;
    public static javax.swing.JTextField txtNumIDCli;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
