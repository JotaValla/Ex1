/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Clases.Producto;
import Clases.SQLServer;
import java.sql.SQLException;

import java.text.ParseException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class jPAgregarProducto extends javax.swing.JPanel {

    SQLServer metodosSQL;

    public jPAgregarProducto() {
        initComponents();
        metodosSQL = new SQLServer();
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
        jLabel1 = new javax.swing.JLabel();
        txtnomProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescProd = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPesoNeto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcboCatProd = new javax.swing.JComboBox<>();
        jSPCantStock = new javax.swing.JSpinner();
        jSPContCacao = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        btnAgg = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Agregar nuevo producto");

        lblIconHeader.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\icon_agregarProductoHeader.png"));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHeaderTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del producto"));

        jLabel1.setText("Nombre del producto:");

        txtnomProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomProdKeyReleased(evt);
            }
        });

        jLabel2.setText("Descripción del producto:");

        txtDescProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescProdKeyReleased(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        jLabel3.setText("Precio:$:");

        jLabel4.setText("Cantidad en stock:");

        jLabel8.setText("Peso neto (g):");

        txtPesoNeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesoNetoKeyReleased(evt);
            }
        });

        jLabel9.setText("Código del producto:");

        jLabel10.setText("Contenido de Cacao(%):");

        jLabel11.setText("Categoría del producto:");

        jcboCatProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));

        jSPCantStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSPCantStockKeyReleased(evt);
            }
        });

        jSPContCacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSPContCacaoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDescProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSPContCacao))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcboCatProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSPCantStock)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSPCantStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcboCatProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSPContCacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAgg.setText("Agregar ");
        btnAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggActionPerformed(evt);
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
                .addComponent(btnAgg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgg)
                    .addComponent(btnCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        mainPanel.add(PanelDatos);

        add(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggActionPerformed
        try {
            String codProd = txtCodProd.getText();
            String nomProd = txtnomProd.getText();
            String descProd = txtDescProd.getText();
            Double precioProd = Double.valueOf(txtPrecio.getText());
            Double pesoProd = Double.valueOf(txtPesoNeto.getText());
            Integer cantStock = Integer.valueOf(jSPCantStock.getValue().toString());
            Double contCacao = Double.valueOf(jSPContCacao.getValue().toString());
            String catProd = jcboCatProd.getSelectedItem().toString();
            int categoriaProd = jcboCatProd.getSelectedIndex();
            boolean estadoStock = true;
            boolean estadoProducto = true;

            // Ahora puedes crear un objeto ClienteParticular con los datos recopilados
            Producto producto = new Producto(codProd, nomProd, descProd, catProd, precioProd, pesoProd, cantStock, contCacao, estadoStock, estadoProducto);
            metodosSQL.guardarProducto(producto, categoriaProd);
            limpiarDatos();
        } catch (Exception ex) {
            Logger.getLogger(jPAgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAggActionPerformed

    private void txtnomProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomProdKeyReleased
        // Obtener el texto del JTextField
        String texto = txtnomProd.getText();

        // Usar una expresión regular para validar el texto
        if (!texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]*$")) {
            // Si el texto no coincide con la expresión regular, mostrar un mensaje de error
            mostrarMensajeError("Debe ingresar solo letras.");
            // Limpiar el JTextField o eliminar caracteres no válidos si es necesario
            txtnomProd.setText(texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]", ""));
        }
    }//GEN-LAST:event_txtnomProdKeyReleased

    private void txtDescProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescProdKeyReleased
        // Obtener el texto del JTextField
        String texto = txtDescProd.getText();

        // Usar una expresión regular para validar el texto
        if (!texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]*$")) {
            // Si el texto no coincide con la expresión regular, mostrar un mensaje de error
            mostrarMensajeError("Debe ingresar solo letras.");
            // Limpiar el JTextField o eliminar caracteres no válidos si es necesario
            txtDescProd.setText(texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]", ""));
        }
    }//GEN-LAST:event_txtDescProdKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        String texto = txtPrecio.getText();

        try {
            double precio = Double.parseDouble(texto);
            if (precio < 0) {
                mostrarMensajeError("El precio no puede ser negativo.");
                txtPrecio.setText(""); // Limpiar el campo si es negativo
            }
        } catch (NumberFormatException e) {
            mostrarMensajeError("Precio no válido. Debe ser un número.");
            txtPrecio.setText(""); // Limpiar el campo si no es un número válido
        }
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtPesoNetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoNetoKeyReleased
        String texto = txtPesoNeto.getText();

        try {
            double precio = Double.parseDouble(texto);
            if (precio < 0) {
                mostrarMensajeError("El peso no puede ser negativo.");
                txtPesoNeto.setText(""); // Limpiar el campo si es negativo
            }
        } catch (NumberFormatException e) {
            mostrarMensajeError("Peso neto no válido. Debe ser un número.");
            txtPesoNeto.setText(""); // Limpiar el campo si no es un número válido
        }
    }//GEN-LAST:event_txtPesoNetoKeyReleased

    private void jSPCantStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSPCantStockKeyReleased
        String texto = jSPCantStock.getValue().toString();

        try {
            int cantidad = Integer.parseInt(texto);
            if (cantidad <= 0) {
                mostrarMensajeError("La cantidad en stock debe ser mayor que 0.");
                jSPCantStock.setValue(""); // Limpiar el campo si es menor o igual a 0
            }
        } catch (NumberFormatException e) {
            mostrarMensajeError("Cantidad en stock no válida. Debe ser un número entero.");
            jSPCantStock.setValue(""); // Limpiar el campo si no es un número válido
        }
    }//GEN-LAST:event_jSPCantStockKeyReleased

    private void jSPContCacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSPContCacaoKeyReleased
        String texto = jSPContCacao.getValue().toString();

        try {
            int cantidad = Integer.parseInt(texto);
            if (cantidad <= 0) {
                mostrarMensajeError("La cantidad en stock debe ser mayor que 0.");
                jSPContCacao.setValue(""); // Limpiar el campo si es menor o igual a 0
            }
        } catch (NumberFormatException e) {
            mostrarMensajeError("Cantidad en stock no válida. Debe ser un número entero.");
            jSPContCacao.setValue(""); // Limpiar el campo si no es un número válido
        }
    }//GEN-LAST:event_jSPContCacaoKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void limpiarDatos() {
        txtnomProd.setText("");
        txtDescProd.setText("");
        txtPrecio.setText("");
        txtPesoNeto.setText("");
        txtCodProd.setText("");
        jSPCantStock.setValue(0);
        jSPContCacao.setValue(0);
        jcboCatProd.setSelectedIndex(0);
    }

    private void mostrarMensajeError(String mensaje) {
        // Puedes mostrar el mensaje de error en un JLabel o en una ventana emergente
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JButton btnAgg;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSPCantStock;
    private javax.swing.JSpinner jSPContCacao;
    private javax.swing.JComboBox<String> jcboCatProd;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtDescProd;
    private javax.swing.JTextField txtPesoNeto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtnomProd;
    // End of variables declaration//GEN-END:variables
}
