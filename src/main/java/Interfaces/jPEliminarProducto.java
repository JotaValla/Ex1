package Interfaces;

import Clases.ClienteMayorista;
import Clases.Producto;
import Clases.SQLServer;

/**
 *
 * @author User
 */
public class jPEliminarProducto extends javax.swing.JPanel {

    /**
     * Creates new form jPAgregarCliente
     */
    SQLServer metodos;
    Producto producto;

    public jPEliminarProducto() {
        initComponents();
        metodos = new SQLServer();
        metodos.mostrarProductosActivos(jtProductosActivos);
        metodos.mostrarProductosInactivos(jtProductosInactivos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodProdBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductosActivos = new javax.swing.JTable();
        btnCambiarActivo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductosInactivos = new javax.swing.JTable();
        btnInactivas = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Cambiar estado del producto");

        lblIconHeader.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\icon_eliminarHeader.png"));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 739, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda del producto"));

        jLabel5.setText("Ingrese el código del producto a cambiar de estado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodProdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 610, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnBuscar.setText("Buscar producto");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar datos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnBuscar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 370, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de productos activos"));

        jtProductosActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código del producto", "Nombre del producto", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtProductosActivos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 990, 180));

        btnCambiarActivo.setText("Activar producto");
        btnCambiarActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActivoActionPerformed(evt);
            }
        });
        add(btnCambiarActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 190, 30));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de productos inactivos"));

        jtProductosInactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código del producto", "Nombre del producto", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jtProductosInactivos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        btnInactivas.setText("Inactivar producto");
        btnInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivasActionPerformed(evt);
            }
        });
        add(btnInactivas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
        metodos.mostrarProductosActivos(jtProductosActivos);
        metodos.mostrarProductosInactivos(jtProductosInactivos);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        metodos.mostrarProductoACambiarEstado(jtProductosActivos, jtProductosInactivos, txtCodProdBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivasActionPerformed
        // Obtener el cliente seleccionado
        int filaSeleccionada = jtProductosActivos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String codProdBuscar = jtProductosActivos.getValueAt(filaSeleccionada, 0).toString();
            Producto prodSeleccionado = metodos.setearProducto(codProdBuscar);

            // Obtener el estado actual del cliente
            boolean estadoActual = prodSeleccionado.isEstadoProducto();
            // Cambiar el estado del cliente
            prodSeleccionado.setEstadoProducto(estadoActual);
            System.out.println(prodSeleccionado.isEstadoProducto());
            // Actualizar el estado del cliente en la base de datos
            metodos.cambiarEstadoProducto(prodSeleccionado, prodSeleccionado.isEstadoProducto());

            // Actualizar la tabla de clientes
            jtProductosActivos.setValueAt(prodSeleccionado.isEstadoProducto(), filaSeleccionada, 2);
        }
        metodos.mostrarProductosActivos(jtProductosActivos);
        metodos.mostrarProductosInactivos(jtProductosInactivos);
    }//GEN-LAST:event_btnInactivasActionPerformed

    private void btnCambiarActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActivoActionPerformed
        // Obtener el cliente seleccionado
        int filaSeleccionada = jtProductosInactivos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String codProdSeleccionado = jtProductosInactivos.getValueAt(filaSeleccionada, 0).toString();
            Producto prodSeleccionado = metodos.setearProducto2(codProdSeleccionado);

            // Obtener el estado actual del cliente
            boolean estadoActual = prodSeleccionado.isEstadoProducto();
            System.out.println(estadoActual);
            // Cambiar el estado del cliente
            prodSeleccionado.setEstadoProducto(!estadoActual);
            System.out.println(prodSeleccionado.isEstadoProducto());
            // Actualizar el estado del cliente en la base de datos
            metodos.cambiarProdActivo(prodSeleccionado);

            // Actualizar la tabla de clientes
            jtProductosInactivos.setValueAt(prodSeleccionado.isEstadoProducto(), filaSeleccionada, 2);
        }
        metodos.mostrarProductosActivos(jtProductosActivos);
        metodos.mostrarProductosInactivos(jtProductosInactivos);
    }//GEN-LAST:event_btnCambiarActivoActionPerformed

    public void limpiarDatos() {
        txtCodProdBuscar.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCambiarActivo;
    private javax.swing.JButton btnInactivas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtProductosActivos;
    private javax.swing.JTable jtProductosInactivos;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtCodProdBuscar;
    // End of variables declaration//GEN-END:variables
}
