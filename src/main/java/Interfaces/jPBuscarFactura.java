package Interfaces;

import Clases.Factura;
import Clases.Producto;
import Clases.SQLServer;

public class jPBuscarFactura extends javax.swing.JPanel {

    SQLServer metodos;

    public jPBuscarFactura() {
        initComponents();
        metodos = new SQLServer();
        metodos.mostrarFacturas(jtFactura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtIDClienteBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarFactura = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDFactura = new javax.swing.JTextField();
        txtIdClientee = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomCli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFechaEmision = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValorFactura = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFactura = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Buscar Factura");

        lblIconHeader.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\icon_buscarHeader.png"));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Factura"));

        jLabel5.setText("Ingrese el número de ID del cliente para buscar facturas asociadas:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtIDClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDClienteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 610, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnBuscarFactura.setText("Buscar factura");
        btnBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFacturaActionPerformed(evt);
            }
        });

        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBuscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscarFactura))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLimpiarDatos)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 370, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la factura"));

        jLabel1.setText("ID:");

        txtIDFactura.setEditable(false);
        txtIDFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFacturaActionPerformed(evt);
            }
        });

        txtIdClientee.setEditable(false);

        jLabel8.setText("Fecha de emisión de la factura:");

        txtNomCli.setEditable(false);

        jLabel10.setText("Número de identificación del cliente:");

        txtFechaEmision.setEditable(false);

        jLabel11.setText("Cliente:");

        jLabel9.setText("Valor con iva de la factura ($):");

        txtValorFactura.setEditable(false);

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
                            .addComponent(txtIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdClientee, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorFactura)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdClientee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtValorFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 990, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de facturas"));

        jtFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "C.C ", "Fecha", "Valor"
            }
        ));
        jtFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtFactura);

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 990, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDFacturaActionPerformed

    }//GEN-LAST:event_txtIDFacturaActionPerformed

    private void btnBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFacturaActionPerformed
        metodos.mostrarFacturasPorCliente(jtFactura, txtIDClienteBuscar.getText());
    }//GEN-LAST:event_btnBuscarFacturaActionPerformed

    private void jtFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtFacturaMouseClicked
        int filaSeleccionada = jtFactura.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String codFactSelec = jtFactura.getValueAt(filaSeleccionada, 0).toString();

            // Llamar al método setearProducto para obtener los datos del producto
            Factura factSeleccionada = metodos.setearFactura(codFactSelec);

            // Establecer los datos del producto en los campos de texto
            txtIDFactura.setText(factSeleccionada.getIdFactura());
            txtFechaEmision.setText(factSeleccionada.getFecha().toString());
            txtIdClientee.setText(factSeleccionada.getIdCliente());
            txtNomCli.setText(String.valueOf(factSeleccionada.getNomCliente()));
            txtValorFactura.setText(String.valueOf(factSeleccionada.getMontoTotal()));

        }
    }//GEN-LAST:event_jtFacturaMouseClicked

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        txtFechaEmision.setText("");
        txtIDClienteBuscar.setText("");
        txtIDFactura.setText("");
        txtIdClientee.setText("");
        txtNomCli.setText("");
        txtValorFactura.setText("");
        metodos.mostrarFacturas(jtFactura);
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFactura;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtFactura;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtFechaEmision;
    private javax.swing.JTextField txtIDClienteBuscar;
    private javax.swing.JTextField txtIDFactura;
    private javax.swing.JTextField txtIdClientee;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtValorFactura;
    // End of variables declaration//GEN-END:variables
}
