package Interfaces;

import Clases.ClienteMayorista;
import Clases.ClienteParticular;
import Clases.SQLServer;

public class jPBuscarCliente extends javax.swing.JPanel {

    SQLServer metodos;
    jFAgregarClienteMayorista mayorista;
    ClienteMayorista clienteSeleccionado;

    public jPBuscarCliente() {
        initComponents();
        mayorista = new jFAgregarClienteMayorista();
        btnMostrarDatosMayorista.setVisible(false);
        metodos = new SQLServer();
        metodos.mostrarClientes(jtClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCedulaABuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarClienteEspecifico = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnomCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnApCli = new javax.swing.JTextField();
        txtNumID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumCont = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFechNaCli = new javax.swing.JTextField();
        txtDirDomi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcorrCli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcboPrefCli = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jcbTipoCli = new javax.swing.JComboBox<>();
        btnMostrarDatosMayorista = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Buscar cliente");

        lblIconHeader.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\icon_buscarHeader.png"));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 739, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda del cliente"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Ingrese el número de cédula del cliente a buscar:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel4.add(txtCedulaABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 170, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 490, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarClienteEspecifico.setText("Buscar cliente");
        btnBuscarClienteEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteEspecificoActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarClienteEspecifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 24, 113, -1));

        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 24, 113, -1));

        jButton3.setText("Exportar lista");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 24, 113, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 490, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla clientes"));

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número de cédula", "Nombres", "Apellidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtClientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 990, 180));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel1.setText("Nombres:");

        txtnomCli.setEditable(false);
        txtnomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomCliActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos:");

        txtnApCli.setEditable(false);

        txtNumID.setEditable(false);

        jLabel3.setText("Número de identificación:");

        jLabel4.setText("Número de contacto:");

        txtNumCont.setEditable(false);

        jLabel8.setText("Fecha de nacimiento:");

        txtFechNaCli.setEditable(false);

        txtDirDomi.setEditable(false);

        jLabel9.setText("Dirección de domicilio:");

        txtcorrCli.setEditable(false);

        jLabel10.setText("Correo electrónico:");

        jLabel11.setText("Preferencia productos:");

        jcboPrefCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));
        jcboPrefCli.setEnabled(false);

        jLabel12.setText("Tipo cliente:");

        jcbTipoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Particular" }));
        jcbTipoCli.setEnabled(false);

        btnMostrarDatosMayorista.setText("Mostrar datos de mayorista");
        btnMostrarDatosMayorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDatosMayoristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnApCli, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumID, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumCont, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcorrCli, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechNaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDirDomi, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jcbTipoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMostrarDatosMayorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcboPrefCli, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnApCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorrCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechNaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jcboPrefCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jcbTipoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarDatosMayorista)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 990, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomCliActionPerformed
        // TODO add your handling code here:z
    }//GEN-LAST:event_txtnomCliActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        int filaSeleccionada = jtClientes.getSelectedRow();
        int tipoClienteIndice;
        if (filaSeleccionada >= 0) {
            String nroCedulaSeleccionada = jtClientes.getValueAt(filaSeleccionada, 0).toString();
            SQLServer sqlServer = new SQLServer();
            clienteSeleccionado = sqlServer.obtenerClientePorCedula(nroCedulaSeleccionada);

            // Llena los campos con los datos del cliente obtenidos
            txtnomCli.setText(clienteSeleccionado.getNombres());
            txtnApCli.setText(clienteSeleccionado.getApellidos());
            txtDirDomi.setText(clienteSeleccionado.getDireccion());
            txtFechNaCli.setText(clienteSeleccionado.getFecha().toString());
            txtcorrCli.setText(clienteSeleccionado.getCorreo());
            txtNumCont.setText(clienteSeleccionado.getTelf());
            txtNumID.setText(clienteSeleccionado.getNroID());
            if (clienteSeleccionado.getTipoCliente().equals("Mayorista")) {
                tipoClienteIndice = 0;
                btnMostrarDatosMayorista.setVisible(true);

            } else {
                tipoClienteIndice = 1;
                btnMostrarDatosMayorista.setVisible(false);
            }
            System.out.println(clienteSeleccionado.getTipoCliente());

            jcbTipoCli.setSelectedIndex(tipoClienteIndice);
            jcboPrefCli.setSelectedItem(clienteSeleccionado.getPrefProd());
        }
    }//GEN-LAST:event_jtClientesMouseClicked

    private void btnBuscarClienteEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteEspecificoActionPerformed
        metodos.mostrarClientesPorNroCedula(jtClientes, txtCedulaABuscar.getText());
        limpiarDatosCliente();
    }//GEN-LAST:event_btnBuscarClienteEspecificoActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        limpiarDatosCliente();
        btnMostrarDatosMayorista.setVisible(false);
        metodos.mostrarClientes(jtClientes);
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed

    private void btnMostrarDatosMayoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDatosMayoristaActionPerformed
        mayorista.setVisible(true);
        mayorista.getTxtDirLocal().setEditable(false);
        mayorista.getTxtTelfLocal().setEditable(false);
        mayorista.getTxtnomLocal().setEditable(false);
        mayorista.getBtnCancelar().setVisible(false);
        mayorista.setTxtnomLocal(clienteSeleccionado.getNomLocal());
        mayorista.setTxtTelfLocal(clienteSeleccionado.getTelfLocal());
        mayorista.setTxtDirLocal(clienteSeleccionado.getDirLocal());
    }//GEN-LAST:event_btnMostrarDatosMayoristaActionPerformed
    public void limpiarDatosCliente() {
        txtNumID.setText("");
        txtnomCli.setText("");
        txtnApCli.setText("");
        txtDirDomi.setText("");
        txtcorrCli.setText("");
        txtCedulaABuscar.setText("");
        txtFechNaCli.setText("");
        txtNumCont.setText("");
        jcbTipoCli.setSelectedIndex(0);
        jcboPrefCli.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarClienteEspecifico;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JButton btnMostrarDatosMayorista;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoCli;
    private javax.swing.JComboBox<String> jcboPrefCli;
    private javax.swing.JTable jtClientes;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtCedulaABuscar;
    private javax.swing.JTextField txtDirDomi;
    private javax.swing.JTextField txtFechNaCli;
    private javax.swing.JTextField txtNumCont;
    private javax.swing.JTextField txtNumID;
    private javax.swing.JTextField txtcorrCli;
    private javax.swing.JTextField txtnApCli;
    private javax.swing.JTextField txtnomCli;
    // End of variables declaration//GEN-END:variables
}
