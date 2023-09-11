package Interfaces;

import Clases.ClienteMayorista;
import Clases.SQLServer;
import javax.swing.JOptionPane;

public class jFBuscarClienteFactura extends javax.swing.JFrame {

    String nomCli, codCli;
    ClienteMayorista cliente;
    SQLServer metodos;

    public jFBuscarClienteFactura() {
        initComponents();
        setLocationRelativeTo(this);
        metodos = new SQLServer();
        metodos.mostrarClientes(jtClientes);
        cliente = new ClienteMayorista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAggCliente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnBuscarClienteEspecifico = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        pnlFiltro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbFiltroMain = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        lblFiltroID = new javax.swing.JLabel();
        txtCedulaABuscar = new javax.swing.JTextField();
        lblFiltroTipo = new javax.swing.JLabel();
        jcbFiltroTipoCli = new javax.swing.JComboBox<>();
        lblFiltroPref = new javax.swing.JLabel();
        jcbFiltroPrefCli = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnAggCliente.setText("Agregar cliente");
        btnAggCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggClienteActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar datos");

        btnBuscarClienteEspecifico.setText("Buscar cliente");
        btnBuscarClienteEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteEspecificoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAggCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarClienteEspecifico, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAggCliente)
                .addGap(12, 12, 12)
                .addComponent(btnBuscarClienteEspecifico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de clientes"));

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
        ));
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

        pnlFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de busqueda"));

        jLabel6.setText("Seleccione mediante que filtro desea buscar:");

        jcbFiltroMain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número de identificación", "Tipo de cliente", "Preferencia de cliente" }));
        jcbFiltroMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jcbFiltroMain, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbFiltroMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda del cliente"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFiltroID.setText("Ingrese el número de cédula del cliente a buscar:");
        jPanel4.add(lblFiltroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtCedulaABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaABuscarKeyReleased(evt);
            }
        });
        jPanel4.add(txtCedulaABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 170, -1));

        lblFiltroTipo.setText("Eliga el tipo de cliente a filtrar:");
        jPanel4.add(lblFiltroTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jcbFiltroTipoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Particular" }));
        jPanel4.add(jcbFiltroTipoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 170, -1));

        lblFiltroPref.setText("Eliga la preferencia de producto a filtrar:");
        jPanel4.add(lblFiltroPref, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, -1));

        jcbFiltroPrefCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));
        jcbFiltroPrefCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroPrefCliActionPerformed(evt);
            }
        });
        jPanel4.add(jcbFiltroPrefCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAggClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggClienteActionPerformed
        JPVenta.txtNomApeCli.setEnabled(false);
        JPVenta.txtNumIDCli.setEnabled(false);
        JPVenta.btnBuscarCliente.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnAggClienteActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        int filaSeleccionada = jtClientes.getSelectedRow();
        if (filaSeleccionada >= 0) {
            JPVenta.txtNomApeCli.setText(jtClientes.getValueAt(filaSeleccionada, 1).toString());
            JPVenta.txtNumIDCli.setText(jtClientes.getValueAt(filaSeleccionada, 0).toString());
            cliente = metodos.setearDatosCliente(codCli);
        }
    }//GEN-LAST:event_jtClientesMouseClicked

    private void jcbFiltroMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroMainActionPerformed
        switch (jcbFiltroMain.getSelectedIndex()) {
            case 0:
                lblFiltroID.setVisible(true);
                txtCedulaABuscar.setVisible(true);
                lblFiltroTipo.setVisible(false);
                lblFiltroPref.setVisible(false);
                jcbFiltroPrefCli.setVisible(false);
                jcbFiltroTipoCli.setVisible(false);
                break;
            case 1:
                lblFiltroID.setVisible(false);
                txtCedulaABuscar.setVisible(false);
                lblFiltroTipo.setVisible(true);
                lblFiltroPref.setVisible(false);
                jcbFiltroPrefCli.setVisible(false);
                jcbFiltroTipoCli.setVisible(true);
                break;
            case 2:
                lblFiltroID.setVisible(false);
                txtCedulaABuscar.setVisible(false);
                lblFiltroTipo.setVisible(false);
                lblFiltroPref.setVisible(true);
                jcbFiltroPrefCli.setVisible(true);
                jcbFiltroTipoCli.setVisible(false);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jcbFiltroMainActionPerformed

    private void txtCedulaABuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaABuscarKeyReleased

        String texto = txtCedulaABuscar.getText();

        // Validar para hasta 10 dígitos numéricos
        if (!texto.matches("\\d{0,10}")) {
            mostrarMensajeError("Debe ingresar hasta 10 dígitos numéricos.");
            txtCedulaABuscar.setText(""); // Limpiar el campo
        }
    }//GEN-LAST:event_txtCedulaABuscarKeyReleased

    private void jcbFiltroPrefCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroPrefCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFiltroPrefCliActionPerformed

    private void btnBuscarClienteEspecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteEspecificoActionPerformed
        switch (jcbFiltroMain.getSelectedIndex()) {
            case 0:
                metodos.mostrarClientesPorNroCedula(jtClientes, txtCedulaABuscar.getText());
                limpiarDatosCliente();
                break;
            case 1:
                metodos.mostrarClientesPorTipo(jtClientes, jcbFiltroTipoCli.getSelectedItem().toString());
                limpiarDatosCliente();
                break;
            case 2:
                metodos.mostrarClientesPorPreferencia(jtClientes, jcbFiltroPrefCli.getSelectedItem().toString());
                limpiarDatosCliente();
                break;
            default:
                throw new AssertionError();
        }

        //        metodos.mostrarClientesPorNroCedula(jtClientes, txtCedulaABuscar.getText());
        //        limpiarDatosCliente();
    }//GEN-LAST:event_btnBuscarClienteEspecificoActionPerformed

    public void limpiarDatosCliente() {
        txtCedulaABuscar.setText("");
        lblFiltroTipo.setVisible(false);
        lblFiltroPref.setVisible(false);
        jcbFiltroPrefCli.setVisible(false);
        jcbFiltroTipoCli.setVisible(false);
    }

    private void mostrarMensajeError(String mensaje) {
        // Puedes mostrar el mensaje de error en un JLabel o en una ventana emergente
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public ClienteMayorista getCliente() {
        return cliente;
    }

    public void setCliente(ClienteMayorista cliente) {
        this.cliente = cliente;
    }

    public String getCodCli() {
        return codCli;
    }

    public void setCodCli(String codCli) {
        this.codCli = codCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFBuscarClienteFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFBuscarClienteFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFBuscarClienteFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFBuscarClienteFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFBuscarClienteFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggCliente;
    private javax.swing.JButton btnBuscarClienteEspecifico;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbFiltroMain;
    private javax.swing.JComboBox<String> jcbFiltroPrefCli;
    private javax.swing.JComboBox<String> jcbFiltroTipoCli;
    private javax.swing.JTable jtClientes;
    private javax.swing.JLabel lblFiltroID;
    private javax.swing.JLabel lblFiltroPref;
    private javax.swing.JLabel lblFiltroTipo;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JTextField txtCedulaABuscar;
    // End of variables declaration//GEN-END:variables
}
