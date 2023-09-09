
package Interfaces;

import Clases.ClienteMayorista;
import Clases.Producto;
import Clases.SQLServer;
import ConexionBD.CConexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.table.DefaultTableModel;

public class jPCrearFactura extends javax.swing.JPanel {

    private int contBuscarProd = 0; // Inicializa un contador de clics
    jFBuscarClienteFactura cliente;
    jFBuscarProductoFactura productoSeleccionado;
    Producto producto;
    Object fila;
    SQLServer metodos;
    Date fechaActual = new Date();
    String codProd;
    int cantStockProd, flag;
    double totalPagar;

    public jPCrearFactura() {
        initComponents();
        productoSeleccionado = new jFBuscarProductoFactura();
        cliente = new jFBuscarClienteFactura();
        producto = new Producto();
        fila = new Object();
        metodos = new SQLServer();
        txtFechaFactura.setVisible(false);
        txtDescuento.setVisible(false);
        txtIva.setVisible(false);
        txtSubTotal.setVisible(false);
        txtTotalPagar.setVisible(false);
        lblDescuento.setVisible(false);
        lblFecha.setVisible(false);
        lblIVa.setVisible(false);
        lblSubtotal.setVisible(false);
        lblTotal.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        PanelDatos = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBuscarCliente = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFactura = new javax.swing.JTable();
        lblDescuento = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCantProdSel = new javax.swing.JTextField();
        lblIVa = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtFechaFactura = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        txtProdSelec = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        txtCliSeleccionado = new javax.swing.JTextField();
        btnProdSelMos = new javax.swing.JButton();
        btnCliSelMos = new javax.swing.JButton();
        btnAggProdFactura = new javax.swing.JButton();
        lblSubtotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        btnVisualizarFactura = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCrearFactura = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Crear factura");

        lblIconHeader.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\con_facturaHeader_1.png"));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeaderTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura"));

        lblBuscarCliente.setText("Busque el cliente a facturar:");

        jLabel5.setText("Buseque el producto a facturar:");

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
        jScrollPane1.setViewportView(jtFactura);

        lblDescuento.setText("Descuento(%):");

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad del producto:");

        txtCantProdSel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantProdSelKeyReleased(evt);
            }
        });

        lblIVa.setText("Iva aplicado(%):");

        lblTotal.setText("Total a pagar:");

        lblFecha.setText("Fecha de emision:");

        txtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagarActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar producto a agregar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar cliente a agregar");
        btnBuscarCliente.setActionCommand("Bucar cliente a agregar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnProdSelMos.setText("Visualizar producto seleccionado:");
        btnProdSelMos.setToolTipText("");
        btnProdSelMos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdSelMosActionPerformed(evt);
            }
        });

        btnCliSelMos.setText("Visualizar cliente seleccionado:");
        btnCliSelMos.setToolTipText("");
        btnCliSelMos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliSelMosActionPerformed(evt);
            }
        });

        btnAggProdFactura.setText("Agregar producto a la factura");
        btnAggProdFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggProdFacturaActionPerformed(evt);
            }
        });

        lblSubtotal.setText("Subtotal:");

        btnVisualizarFactura.setText("Visualizar factura");
        btnVisualizarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(lblBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(btnCliSelMos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnProdSelMos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(44, 44, 44)
                                                        .addComponent(txtCliSeleccionado))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtProdSelec)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel8))
                                                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                                            .addComponent(btnAggProdFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantProdSel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIVa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lblSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(btnVisualizarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarCliente)
                    .addComponent(btnBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliSelMos))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnBuscarProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCantProdSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdSelMos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAggProdFactura)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescuento)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha)
                    .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotal)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIVa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotal)
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnCrearFactura.setText("Crear factura");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearFactura)
                    .addComponent(btnCancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(PanelDatos);

        add(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        productoSeleccionado.limpiarDatosProducto();
        contBuscarProd++;
        if (contBuscarProd >= 2) {
            productoSeleccionado.setVisible(true);
            // Supongamos que tienes el código de producto y la nueva cantidad
            String codigoProducto = productoSeleccionado.getCodProd();
            flag = productoSeleccionado.getDatosProducto().getCantStock() - cantStockProd;
            if (flag < 0) {
                JOptionPane.showMessageDialog(null, "Sobrepasaste el stock del producto");
                return;
            }
            int nuevaCantidadStock = flag;
            // Llamar al método para actualizar la cantidad en stock
            boolean actualizado = metodos.actualizarCantidadStock(codigoProducto, nuevaCantidadStock);

            if (actualizado) {
                System.out.println("Cantidad en stock actualizada correctamente.");
                productoSeleccionado.limpiarDatosProducto();
            } else {
                System.out.println("Error al actualizar la cantidad en stock.");
            }
        }
        productoSeleccionado.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        // Obtener los datos necesarios, como ID de factura, ID de cliente, ID de empleado, monto total
        String idFactura = generarIDFacturaAleatorio(); // Reemplaza con el ID de factura real
        String idCliente = cliente.getCliente().getNroID(); // Reemplaza con el ID de cliente real
        String idEmpleado = "9999999999"; // Reemplaza con el ID de empleado real
        double montoTotal = totalPagar; // Reemplaza con el cálculo real

        // Los códigos de productos se obtuvieron previamente al agregar productos a la factura
        List<String> codigosProductos = obtenerCodigosProductosFactura();

        // Llamar al método para guardar la factura
        boolean facturaGuardada = metodos.guardarFactura(idFactura, idCliente, idEmpleado, montoTotal, codigosProductos);

        if (facturaGuardada) {
            JOptionPane.showMessageDialog(null, "Factura guardada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar la factura", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearFacturaActionPerformed


    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        cliente.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnProdSelMosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdSelMosActionPerformed
        if (productoSeleccionado.getNombProd() == null) {
            JOptionPane.showMessageDialog(null, "Primero debe buscar el producto a agregar");
        } else {
            String nomProd = productoSeleccionado.getNombProd();
            producto = metodos.setearProducto(codProd);
            System.out.println(nomProd);
            txtProdSelec.setText(nomProd);
        }
    }//GEN-LAST:event_btnProdSelMosActionPerformed

    private void btnCliSelMosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliSelMosActionPerformed
        String nomCli = cliente.getNomCli();
        txtCliSeleccionado.setText(nomCli);
    }//GEN-LAST:event_btnCliSelMosActionPerformed

    private void btnAggProdFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggProdFacturaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
        lblBuscarCliente.setVisible(false);
        btnBuscarCliente.setVisible(false);
        btnCliSelMos.setEnabled(false);
        btnCliSelMos.setText("Cliente seleccionado:");
        productoSeleccionado.setNombProd(null);
        String nomProd = txtProdSelec.getText();
        cantStockProd = Integer.valueOf(txtCantProdSel.getText());
        Double precioUnit = productoSeleccionado.datosProducto.getPrecioUnit();
        Double totalXProducto = precioUnit * cantStockProd;

        // Aquí debes llamar al método que obtiene el código del producto
        String codProducto = metodos.obtenerCodigoProductoPorNombre(nomProd);

        producto.setNombreProducto(nomProd);
        producto.setCantStock(cantStockProd);
        producto.setPrecioUnit(precioUnit);
        fila = new Object[]{codProducto, nomProd, cantStockProd, precioUnit, totalXProducto};
        modelo.addRow((Object[]) fila);
        jtFactura.setModel(modelo);
        txtProdSelec.setText("");
        txtCantProdSel.setText("");
        productoSeleccionado.limpiarDatosProducto();
    }//GEN-LAST:event_btnAggProdFacturaActionPerformed

    private void jtFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFacturaMouseClicked
    }//GEN-LAST:event_jtFacturaMouseClicked

    private void txtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPagarActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void txtCantProdSelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantProdSelKeyReleased
        if (Integer.parseInt(txtCantProdSel.getText()) > productoSeleccionado.getDatosProducto().getCantStock() && Integer.parseInt(txtCantProdSel.getText()) > 0) {
            JOptionPane.showMessageDialog(null, "Valor excedido de stock");
            txtProdSelec.setText("");
            txtCantProdSel.setText("");
            return;
        }
    }//GEN-LAST:event_txtCantProdSelKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Limpia las filas de la tabla manteniendo las columnas
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
        modelo.setRowCount(0);

        // Resto de tu código
        limpiarDatos();
        txtFechaFactura.setVisible(false);
        txtDescuento.setVisible(false);
        txtIva.setVisible(false);
        txtSubTotal.setVisible(false);
        txtTotalPagar.setVisible(false);
        lblDescuento.setVisible(false);
        lblFecha.setVisible(false);
        lblIVa.setVisible(false);
        lblSubtotal.setVisible(false);
        lblTotal.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVisualizarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarFacturaActionPerformed
        txtFechaFactura.setVisible(true);
        txtDescuento.setVisible(true);
        txtIva.setVisible(true);
        txtSubTotal.setVisible(true);
        txtTotalPagar.setVisible(true);
        lblDescuento.setVisible(true);
        lblFecha.setVisible(true);
        lblIVa.setVisible(true);
        lblSubtotal.setVisible(true);
        lblTotal.setVisible(true);

        // Crea un formato de fecha personalizado
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        // Formatea la fecha actual en el formato deseado
        String fechaFormateada = formatoFecha.format(fechaActual);
        txtFechaFactura.setText(fechaFormateada);
        txtIva.setText("12");
        txtDescuento.setText("0");

        // Calcula el total de la factura y lo muestra en el campo correspondiente
        double totalFactura = calcularTotalFactura();
        txtSubTotal.setText(String.valueOf(totalFactura));

        // Calcula el IVA
        double iva = calcularIVA(totalFactura, Double.parseDouble(txtDescuento.getText()));
        txtIva.setText(String.valueOf(iva));

        // Calcula el total a pagar, que incluye el IVA
        totalPagar = totalFactura + iva;
        txtTotalPagar.setText(String.valueOf(totalPagar));
    }//GEN-LAST:event_btnVisualizarFacturaActionPerformed

    public void limpiarDatos() {
        lblBuscarCliente.setVisible(true);
        btnBuscarCliente.setVisible(true);
        btnCliSelMos.setEnabled(true);
        btnCliSelMos.setText("Visualizar cliente seleccionado:");
        txtCantProdSel.setText("");
        txtCliSeleccionado.setText("");
        txtDescuento.setText("");
        txtFechaFactura.setText("");
        txtIva.setText("");
        txtProdSelec.setText("");
        txtSubTotal.setText("");
        txtTotalPagar.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
    }

    private double calcularIVA(double totalFactura, double descuento) {
        // Calcula el IVA del 12% sobre el total de la factura
        double iva = totalFactura * 0.12;

        // Aplica un descuento si es mayor que cero y menor o igual al total de la factura
        if (descuento > 0 && descuento <= totalFactura) {
            totalFactura -= descuento;
        }

        return iva;
    }

    private double calcularTotalFactura() {
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
        double totalFactura = 0.0;

        // Itera a través de las filas de la tabla
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            // Obtiene el valor de la columna que contiene el precio total por producto
            double totalXProducto = Double.parseDouble(modelo.getValueAt(fila, 3).toString());
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

    private List<String> obtenerCodigosProductosFactura() {
        DefaultTableModel modelo = (DefaultTableModel) jtFactura.getModel();
        List<String> codigosProductos = new ArrayList<>();

        // Aquí recorremos la tabla y obtenemos los códigos de productos de cada fila
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            String nombreProducto = modelo.getValueAt(fila, 1).toString(); // Suponiendo que la columna 1 contiene el nombre del producto
            String codigoProducto = metodos.obtenerCodigoProductoPorNombre(nombreProducto);
            codigosProductos.add(codigoProducto);
        }

        return codigosProductos;
    }

    //Getters and setters 
    public jFBuscarClienteFactura getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public JTextField getTxtCantProdSel() {
        return txtCantProdSel;
    }

    public void setTxtCantProdSel(JTextField txtCantProdSel) {
        this.txtCantProdSel = txtCantProdSel;
    }

    public JTextField getTxtCliSeleccionado() {
        return txtCliSeleccionado;
    }

    public void setTxtCliSeleccionado(String cliSelec) {
        txtCliSeleccionado.setText(cliSelec);
    }

    public JTextField getTxtDescuento() {
        return txtDescuento;
    }

    public void setTxtDescuento(JTextField txtDescuento) {
        this.txtDescuento = txtDescuento;
    }

    public JTextField getTxtFechaFactura() {
        return txtFechaFactura;
    }

    public void setTxtFechaFactura(JTextField txtFechaFactura) {
        this.txtFechaFactura = txtFechaFactura;
    }

    public JTextField getTxtIva() {
        return txtIva;
    }

    public void setTxtIva(JTextField txtIva) {
        this.txtIva = txtIva;
    }

    public JTextField getTxtProdSelec() {
        return txtProdSelec;
    }

    public void setTxtProdSelec(String ProdSelec) {
        this.txtProdSelec.setText(ProdSelec);
    }

    public JTextField getTxtTotalPagar() {
        return txtTotalPagar;
    }

    public void setTxtTotalPagar(JTextField txtTotalPagar) {
        this.txtTotalPagar = txtTotalPagar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JButton btnAggProdFactura;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCliSelMos;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnProdSelMos;
    private javax.swing.JButton btnVisualizarFactura;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtFactura;
    private javax.swing.JLabel lblBuscarCliente;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIVa;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtCantProdSel;
    private javax.swing.JTextField txtCliSeleccionado;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFechaFactura;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtProdSelec;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
