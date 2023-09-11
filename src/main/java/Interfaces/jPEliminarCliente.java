package Interfaces;

import Clases.ClienteMayorista;
import Clases.SQLServer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jPEliminarCliente extends javax.swing.JPanel {

    SQLServer metodos;
    ClienteMayorista clienteSeleccionado;

    public jPEliminarCliente() {
        initComponents();
        metodos = new SQLServer();
        metodos.mostrarClientesActivos(jtbClientesActivos);
        metodos.mostrarClientesInactivos(jtbClientesInactivos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarCli = new javax.swing.JButton();
        btnLimpiarCli = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbClientesActivos = new javax.swing.JTable();
        btnCambiarEstadoActivo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbClientesInactivos = new javax.swing.JTable();
        btnInactivarCliente = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Cambiar estado cliente");

        lblIconHeader.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\icon_eliminarHeader.png"));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(lblIconHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 739, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda del cliente"));

        jLabel5.setText("Ingrese el número de identificación del cliente a eliminar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 610, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnBuscarCli.setText("Buscar cliente");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });

        btnLimpiarCli.setText("Limpiar datos");
        btnLimpiarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLimpiarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarCli)
                    .addComponent(btnBuscarCli))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 370, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de clientes activos"));

        jtbClientesActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número de cédula", "Nombres", "Apellidos", "Estado"
            }
        ));
        jtbClientesActivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbClientesActivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbClientesActivos);

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

        btnCambiarEstadoActivo.setText("Activar cliente");
        btnCambiarEstadoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoActivoActionPerformed(evt);
            }
        });
        add(btnCambiarEstadoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 670, 180, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de clientes inactivos"));

        jtbClientesInactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número de cédula", "Nombres", "Apellidos", "Estado"
            }
        ));
        jtbClientesInactivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbClientesInactivosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbClientesInactivos);

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

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        btnInactivarCliente.setText("Inactivar cliente");
        btnInactivarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarClienteActionPerformed(evt);
            }
        });
        add(btnInactivarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
        metodos.mostrarClienteACambiarEstado(jtbClientesActivos, jtbClientesInactivos, txtBuscarCliente.getText());
    }//GEN-LAST:event_btnBuscarCliActionPerformed

    private void jtbClientesActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbClientesActivosMouseClicked
        int filaSeleccionada = jtbClientesActivos.getSelectedRow();
        int tipoClienteIndice;
        if (filaSeleccionada >= 0) {
            String nroCedulaSeleccionada = jtbClientesActivos.getValueAt(filaSeleccionada, 0).toString();
            SQLServer sqlServer = new SQLServer();
            clienteSeleccionado = sqlServer.setearDatosCliente(nroCedulaSeleccionada);
        }
    }//GEN-LAST:event_jtbClientesActivosMouseClicked

    private void jtbClientesInactivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbClientesInactivosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbClientesInactivosMouseClicked

    private void btnInactivarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarClienteActionPerformed
        // Obtener el cliente seleccionado
        int filaSeleccionada = jtbClientesActivos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String nroCedulaSeleccionada = jtbClientesActivos.getValueAt(filaSeleccionada, 0).toString();
            ClienteMayorista clienteSeleccionado = metodos.setearDatosCliente(nroCedulaSeleccionada);

            // Obtener el estado actual del cliente
            boolean estadoActual = clienteSeleccionado.isEstadoCliente();

            // Cambiar el estado del cliente
            clienteSeleccionado.setEstadoCliente(!estadoActual);
            System.out.println(clienteSeleccionado.isEstadoCliente());
            // Actualizar el estado del cliente en la base de datos
            metodos.cambiarEstadoCliente(clienteSeleccionado, clienteSeleccionado.isEstadoCliente());

            // Actualizar la tabla de clientes
            jtbClientesActivos.setValueAt(clienteSeleccionado.isEstadoCliente(), filaSeleccionada, 3);
            JOptionPane.showMessageDialog(null, "Estado de cliente cambiado correctamente", "Cambio de estado de un cliente", JOptionPane.INFORMATION_MESSAGE);
            metodos.mostrarClientesActivos(jtbClientesActivos);
            metodos.mostrarClientesInactivos(jtbClientesInactivos);
        }
    }//GEN-LAST:event_btnInactivarClienteActionPerformed

    private void btnCambiarEstadoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoActivoActionPerformed
        // Obtener el cliente seleccionado
        int filaSeleccionada = jtbClientesInactivos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String nroCedulaSeleccionada = jtbClientesInactivos.getValueAt(filaSeleccionada, 0).toString();
            ClienteMayorista clienteSeleccionado = metodos.obtenerClientePorCedula2(nroCedulaSeleccionada);

            // Obtener el estado actual del cliente
            boolean estadoActual = clienteSeleccionado.isEstadoCliente();

            // Cambiar el estado del cliente
            clienteSeleccionado.setEstadoCliente(!estadoActual);
            System.out.println(clienteSeleccionado.isEstadoCliente());
            // Actualizar el estado del cliente en la base de datos
            metodos.cambiarEstadoClienteActivo(clienteSeleccionado);

            // Actualizar la tabla de clientes
            jtbClientesInactivos.setValueAt(clienteSeleccionado.isEstadoCliente(), filaSeleccionada, 3);
            JOptionPane.showMessageDialog(null, "Estado de cliente cambiado correctamente", "Cambio de estado de un cliente", JOptionPane.INFORMATION_MESSAGE);
            metodos.mostrarClientesActivos(jtbClientesActivos);
            metodos.mostrarClientesInactivos(jtbClientesInactivos);
        }
    }//GEN-LAST:event_btnCambiarEstadoActivoActionPerformed


    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed
        limpiarDatosCliente();
    }//GEN-LAST:event_btnLimpiarCliActionPerformed

    public void limpiarDatosCliente() {
        txtBuscarCliente.setText("");
        metodos.mostrarClientesActivos(jtbClientesActivos);
        metodos.mostrarClientesInactivos(jtbClientesInactivos);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnCambiarEstadoActivo;
    private javax.swing.JButton btnInactivarCliente;
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbClientesActivos;
    private javax.swing.JTable jtbClientesInactivos;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables
}
