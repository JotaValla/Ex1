package Interfaces;

import Clases.ClienteMayorista;
import Clases.ClienteParticular;
import Clases.SQLServer;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class jPActualizarCliente extends javax.swing.JPanel {

    SQLServer metodos;
    jFAgregarClienteMayorista mayorista;
    ClienteMayorista clienteSeleccionado;
    String nombreLocalActualizado, telLocalAct, dirLocalAct;

    public jPActualizarCliente() {
        initComponents();
        mayorista = new jFAgregarClienteMayorista();
        btnModificarMayorista.setVisible(false);
        btnCambiarParticular.setVisible(false);
        btnCambiarMayorista.setVisible(false);
        metodos = new SQLServer();
        metodos.mostrarClientes(jtClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarClienteEspecifico = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();
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
        btnModificarMayorista = new javax.swing.JButton();
        btnActualizarDatos = new javax.swing.JButton();
        btnCambiarMayorista = new javax.swing.JButton();
        btnCambiarParticular = new javax.swing.JButton();
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle.setText("Actualizar cliente");

        lblIconHeader.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\icon_actualizarHeader.png"));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblIconHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblHeaderTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 739, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarClienteEspecifico.setText("Buscar cliente");
        btnBuscarClienteEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteEspecificoActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarClienteEspecifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 180, 130));

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

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 990, 180));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel1.setText("Nombres:");

        txtnomCli.setEditable(false);
        txtnomCli.setOpaque(true);
        txtnomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomCliActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos:");

        txtnApCli.setEditable(false);
        txtnApCli.setOpaque(true);

        txtNumID.setEditable(false);
        txtNumID.setOpaque(true);

        jLabel3.setText("Número de identificación:");

        jLabel4.setText("Número de contacto:");

        txtNumCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumContKeyReleased(evt);
            }
        });

        jLabel8.setText("Fecha de nacimiento:");

        txtFechNaCli.setEditable(false);
        txtFechNaCli.setOpaque(true);

        txtDirDomi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirDomiKeyReleased(evt);
            }
        });

        jLabel9.setText("Dirección de domicilio:");

        txtcorrCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorrCliActionPerformed(evt);
            }
        });

        jLabel10.setText("Correo electrónico:");

        jLabel11.setText("Preferencia productos:");

        jcboPrefCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));

        jLabel12.setText("Tipo cliente:");

        jcbTipoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Particular" }));
        jcbTipoCli.setEnabled(false);
        jcbTipoCli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoCliItemStateChanged(evt);
            }
        });
        jcbTipoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoCliActionPerformed(evt);
            }
        });

        btnModificarMayorista.setText("Modificar datos de mayorista");
        btnModificarMayorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMayoristaActionPerformed(evt);
            }
        });

        btnActualizarDatos.setText("Actualizar datos del cliente");
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        btnCambiarMayorista.setText("Cambiar a mayorista");
        btnCambiarMayorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarMayoristaActionPerformed(evt);
            }
        });

        btnCambiarParticular.setText("Cambiar a particular");
        btnCambiarParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarParticularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDirDomi, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(btnActualizarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCambiarMayorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jcbTipoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnModificarMayorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcboPrefCli, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCambiarParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarMayorista)
                    .addComponent(btnActualizarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarMayorista)
                    .addComponent(btnCambiarParticular))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 990, 300));

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
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbFiltroMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(pnlFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 290, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda del cliente"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFiltroID.setText("Ingrese el número de cédula del cliente a buscar:");
        jPanel4.add(lblFiltroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtCedulaABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaABuscarKeyReleased(evt);
            }
        });
        jPanel4.add(txtCedulaABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 170, -1));

        lblFiltroTipo.setText("Eliga el tipo de cliente a filtrar:");
        jPanel4.add(lblFiltroTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jcbFiltroTipoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Particular" }));
        jPanel4.add(jcbFiltroTipoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 170, -1));

        lblFiltroPref.setText("Eliga la preferencia de producto a filtrar:");
        jPanel4.add(lblFiltroPref, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, -1));

        jcbFiltroPrefCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));
        jcbFiltroPrefCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroPrefCliActionPerformed(evt);
            }
        });
        jPanel4.add(jcbFiltroPrefCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 170, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 480, 160));
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
            clienteSeleccionado = sqlServer.setearDatosCliente(nroCedulaSeleccionada);

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
                btnModificarMayorista.setVisible(true);
                btnCambiarParticular.setVisible(true);
                btnCambiarMayorista.setVisible(false);
            } else {
                tipoClienteIndice = 1;
                btnModificarMayorista.setVisible(false);
                btnCambiarMayorista.setVisible(true);
                btnCambiarParticular.setVisible(false);
            }
            System.out.println(clienteSeleccionado.getTipoCliente());

            jcbTipoCli.setSelectedIndex(tipoClienteIndice);
            jcboPrefCli.setSelectedItem(clienteSeleccionado.getPrefProd());
        }
    }//GEN-LAST:event_jtClientesMouseClicked

    private void btnModificarMayoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMayoristaActionPerformed
        mayorista.setVisible(true);
        mayorista.getTxtnomLocal().setEditable(false);
        mayorista.setTxtnomLocal(clienteSeleccionado.getNomLocal());
        mayorista.setTxtTelfLocal(clienteSeleccionado.getTelfLocal());
        mayorista.setTxtDirLocal(clienteSeleccionado.getDirLocal());
        System.out.println(mayorista.getTxtnomLocal().getText());
        System.out.println(mayorista.getTxtTelfLocal().getText());
        System.out.println(mayorista.getTxtDirLocal().getText());
    }//GEN-LAST:event_btnModificarMayoristaActionPerformed

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed
        // Verificar si hubo un cambio en el tipo de cliente
        System.out.println(mayorista.getNomLocal());
        System.out.println(mayorista.getDirLocal());
        System.out.println(mayorista.getTelfLocal());
        int prefCli = jcboPrefCli.getSelectedIndex();

        // Obtén el texto ingresado en el textField
        String correo = txtcorrCli.getText();

        // Expresión regular para verificar un correo electrónico gradualmente
        String regex = "^[A-Za-z0-9+_.-]*@[A-Za-z0-9+_.-]*$";

        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);

        // Verifica si el correo coincide con el patrón
        if (!pattern.matcher(correo).matches()) {
            mostrarMensajeError("Correo electrónico no válido.");
            return;
        }

        if (jcbTipoCli.getSelectedItem().equals("Mayorista")) {
            clienteSeleccionado.setNomLocal(mayorista.getNomLocal());
            clienteSeleccionado.setTelfLocal(mayorista.getTelfLocal());
            clienteSeleccionado.setDirLocal(mayorista.getDirLocal());
            String nuevaPref = jcboPrefCli.getSelectedItem().toString();
            if (!clienteSeleccionado.getPrefProd().equals(nuevaPref)) {
                clienteSeleccionado.setPrefProd(nuevaPref);
            }
            clienteSeleccionado.setTelf(txtNumCont.getText());
            clienteSeleccionado.setCorreo(txtcorrCli.getText());
            clienteSeleccionado.setDireccion(txtDirDomi.getText());
            if (metodos.actualizarCliente(clienteSeleccionado, prefCli)) {
                JOptionPane.showMessageDialog(this, "Cliente actualizado con éxito");
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (jcbTipoCli.getSelectedItem().equals("Particular")) {
            String nuevaPref = jcboPrefCli.getSelectedItem().toString();
            if (!clienteSeleccionado.getPrefProd().equals(nuevaPref)) {
                clienteSeleccionado.setPrefProd(nuevaPref);
            }
            clienteSeleccionado.setTelf(txtNumCont.getText());
            clienteSeleccionado.setCorreo(txtcorrCli.getText());
            clienteSeleccionado.setDireccion(txtDirDomi.getText());
            if (metodos.actualizarCliente(clienteSeleccionado, prefCli)) {
                JOptionPane.showMessageDialog(this, "Cliente actualizado con éxito", "Actualizar datos de un cliente", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void jcbTipoCliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoCliItemStateChanged

    }//GEN-LAST:event_jcbTipoCliItemStateChanged

    private void jcbTipoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoCliActionPerformed

    }//GEN-LAST:event_jcbTipoCliActionPerformed

    private void btnCambiarParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarParticularActionPerformed

        int opcionSeleccionada = JOptionPane.showConfirmDialog(
                null, // Componente padre (en este caso, puedes usar null)
                "¿Está seguro de que desea cambiar el tipo de cliente a particular?\nTenga en cuenta que los datos de mayorista se eliminarán del sistema",
                "Cambiar tipo de cliente", // Título del cuadro de diálogo
                JOptionPane.OK_CANCEL_OPTION, // Opciones de botones (confirmar y cancelar)
                JOptionPane.INFORMATION_MESSAGE // Icono de información
        );

        if (opcionSeleccionada == JOptionPane.OK_OPTION) {
            clienteSeleccionado.setNomLocal("NULL");
            clienteSeleccionado.setTelfLocal("NULL");
            clienteSeleccionado.setDirLocal("NULL");
            clienteSeleccionado.setTipoCliente("Particular");
            JOptionPane.showMessageDialog(null, "Tipo de cliente cambiado correctamente, para visualizar el cambio de click en actualizar datos del cliente", "Cambio de cliente", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCambiarParticularActionPerformed

    private void btnCambiarMayoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarMayoristaActionPerformed
        mayorista.limpiarDatos();
        mayorista.setVisible(true);
        mayorista.getTxtnomLocal().setEditable(true);
        clienteSeleccionado.setNomLocal(mayorista.getNomLocal());
        clienteSeleccionado.setTelfLocal(mayorista.getTelfLocal());
        clienteSeleccionado.setDirLocal(mayorista.getDirLocal());
        clienteSeleccionado.setTipoCliente("Mayorista");
        jcbTipoCli.setSelectedIndex(0);

    }//GEN-LAST:event_btnCambiarMayoristaActionPerformed

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

    private void jcbFiltroPrefCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroPrefCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFiltroPrefCliActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        limpiarDatosCliente();
        btnModificarMayorista.setVisible(false);
        metodos.mostrarClientes(jtClientes);
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed

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
    }//GEN-LAST:event_btnBuscarClienteEspecificoActionPerformed

    private void txtCedulaABuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaABuscarKeyReleased
        String texto = txtCedulaABuscar.getText();

        // Validar para hasta 10 dígitos numéricos
        if (!texto.matches("\\d{0,10}")) {
            mostrarMensajeError("Debe ingresar hasta 10 dígitos numéricos.");
            txtCedulaABuscar.setText(""); // Limpiar el campo
        }
    }//GEN-LAST:event_txtCedulaABuscarKeyReleased

    private void txtNumContKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumContKeyReleased
        // Obtener el texto del JTextField
        String texto = txtNumCont.getText();

        // Validar que solo se ingresen dígitos numéricos y que no exceda los 10 dígitos
        if (!texto.matches("\\d{0,10}")) {
            // Si no cumple con la validación, mostrar un mensaje de error
            mostrarMensajeError("El número de contacto debe contener hasta 10 dígitos numéricos.");
            // Limpiar el JTextField o eliminar caracteres no válidos si es necesario
            txtNumCont.setText(texto.replaceAll("[^0-9]", ""));
        }
    }//GEN-LAST:event_txtNumContKeyReleased

    private void txtDirDomiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirDomiKeyReleased
        // Obtener el texto del JTextField
        String texto = txtDirDomi.getText();

        // Limitar la longitud máxima a 200 caracteres
        if (texto.length() > 200) {
            // Si se supera la longitud máxima, mostrar un mensaje de error
            mostrarMensajeError("La dirección no puede superar los 200 caracteres.");
            // Recortar el texto a 200 caracteres
            txtDirDomi.setText(texto.substring(0, 200));
        }

        // Usar una expresión regular para validar el texto permitiendo caracteres especiales
        if (!texto.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ: \\-#./\\s]*$")) {
            // Si el texto no coincide con la expresión regular, mostrar un mensaje de error
            mostrarMensajeError("La dirección contiene caracteres no válidos.");
            // Limpiar el JTextField o eliminar caracteres no válidos si es necesario
            txtDirDomi.setText(texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ: -#./\\s]", ""));
        }
    }//GEN-LAST:event_txtDirDomiKeyReleased

    private void txtcorrCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorrCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorrCliActionPerformed
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
        btnModificarMayorista.setVisible(false);
        btnCambiarParticular.setVisible(false);
        btnCambiarMayorista.setVisible(false);
        lblFiltroTipo.setVisible(false);
        lblFiltroPref.setVisible(false);
        jcbFiltroPrefCli.setVisible(false);
        jcbFiltroTipoCli.setVisible(false);
    }

    private void mostrarMensajeError(String mensaje) {
        // Puedes mostrar el mensaje de error en un JLabel o en una ventana emergente
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JButton btnBuscarClienteEspecifico;
    private javax.swing.JButton btnCambiarMayorista;
    private javax.swing.JButton btnCambiarParticular;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JButton btnModificarMayorista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbFiltroMain;
    private javax.swing.JComboBox<String> jcbFiltroPrefCli;
    private javax.swing.JComboBox<String> jcbFiltroTipoCli;
    private javax.swing.JComboBox<String> jcbTipoCli;
    private javax.swing.JComboBox<String> jcboPrefCli;
    private javax.swing.JTable jtClientes;
    private javax.swing.JLabel lblFiltroID;
    private javax.swing.JLabel lblFiltroPref;
    private javax.swing.JLabel lblFiltroTipo;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel pnlFiltro;
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
