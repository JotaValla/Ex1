package Interfaces;

import Clases.ClienteMayorista;
import Clases.ClienteParticular;
import Clases.SQLServer;
import javax.swing.JOptionPane;

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
        limpiarDatosCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panelHeader1 = new javax.swing.JPanel();
        lblHeaderTitle1 = new javax.swing.JLabel();
        lblIconHeader1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblFiltroID1 = new javax.swing.JLabel();
        txtCedulaABuscar1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnBuscarClienteEspecifico1 = new javax.swing.JButton();
        btnLimpiarDatos1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtnomCli1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtnApCli1 = new javax.swing.JTextField();
        txtNumID1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumCont1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtFechNaCli1 = new javax.swing.JTextField();
        txtDirDomi1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtcorrCli1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jcboPrefCli1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jcbTipoCli1 = new javax.swing.JComboBox<>();
        btnMostrarDatosMayorista1 = new javax.swing.JButton();
        pnlFiltro1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        panelHeader = new javax.swing.JPanel();
        lblHeaderTitle = new javax.swing.JLabel();
        lblIconHeader = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblFiltroID = new javax.swing.JLabel();
        txtCedulaABuscar = new javax.swing.JTextField();
        lblFiltroTipo = new javax.swing.JLabel();
        jcbFiltroTipoCli = new javax.swing.JComboBox<>();
        lblFiltroPref = new javax.swing.JLabel();
        jcbFiltroPrefCli = new javax.swing.JComboBox<>();
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
        pnlFiltro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbFiltroMain = new javax.swing.JComboBox<>();

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeaderTitle1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeaderTitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderTitle1.setText("Buscar cliente");

        lblIconHeader1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\img\\icon_buscarHeader.png"));

        javax.swing.GroupLayout panelHeader1Layout = new javax.swing.GroupLayout(panelHeader1);
        panelHeader1.setLayout(panelHeader1Layout);
        panelHeader1Layout.setHorizontalGroup(
            panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeader1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lblIconHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeaderTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        panelHeader1Layout.setVerticalGroup(
            panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeader1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelHeader1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblHeaderTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(panelHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 739, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda del cliente"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFiltroID1.setText("Ingrese el número de cédula del cliente a buscar:");
        jPanel6.add(lblFiltroID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel6.add(txtCedulaABuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 170, -1));

        jLabel13.setText("Eliga el tipo de cliente a filtrar:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Particular" }));
        jPanel6.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, -1));

        jLabel14.setText("Eliga la preferencia de producto a filtrar:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 170, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 490, 140));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarClienteEspecifico1.setText("Buscar cliente");
        btnBuscarClienteEspecifico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteEspecifico1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnBuscarClienteEspecifico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 113, -1));

        btnLimpiarDatos1.setText("Limpiar datos");
        btnLimpiarDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatos1ActionPerformed(evt);
            }
        });
        jPanel7.add(btnLimpiarDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 113, -1));

        jButton4.setText("Exportar lista");
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 113, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, 140, 130));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla clientes"));

        jtClientes1.setModel(new javax.swing.table.DefaultTableModel(
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
        jtClientes1.setEnabled(false);
        jtClientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientes1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtClientes1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 990, 180));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel15.setText("Nombres:");

        txtnomCli1.setEditable(false);
        txtnomCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomCli1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Apellidos:");

        txtnApCli1.setEditable(false);

        txtNumID1.setEditable(false);

        jLabel17.setText("Número de identificación:");

        jLabel18.setText("Número de contacto:");

        txtNumCont1.setEditable(false);

        jLabel19.setText("Fecha de nacimiento:");

        txtFechNaCli1.setEditable(false);

        txtDirDomi1.setEditable(false);

        jLabel20.setText("Dirección de domicilio:");

        txtcorrCli1.setEditable(false);

        jLabel21.setText("Correo electrónico:");

        jLabel22.setText("Preferencia productos:");

        jcboPrefCli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));
        jcboPrefCli1.setEnabled(false);
        jcboPrefCli1.setFocusable(false);

        jLabel23.setText("Tipo cliente:");

        jcbTipoCli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Particular" }));
        jcbTipoCli1.setEnabled(false);

        btnMostrarDatosMayorista1.setText("Mostrar datos de mayorista");
        btnMostrarDatosMayorista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDatosMayorista1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnApCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumID1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtNumCont1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcorrCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechNaCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtDirDomi1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jcbTipoCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMostrarDatosMayorista1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcboPrefCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnApCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCont1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorrCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechNaCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirDomi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jcboPrefCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jcbTipoCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarDatosMayorista1)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 990, 250));

        pnlFiltro1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de busqueda"));

        jLabel24.setText("Seleccione mediante que filtro desea buscar:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número de identificación", "Tipo de cliente", "Preferencia de cliente" }));

        javax.swing.GroupLayout pnlFiltro1Layout = new javax.swing.GroupLayout(pnlFiltro1);
        pnlFiltro1.setLayout(pnlFiltro1Layout);
        pnlFiltro1Layout.setHorizontalGroup(
            pnlFiltro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFiltro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlFiltro1Layout.setVerticalGroup(
            pnlFiltro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.add(pnlFiltro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 310, 110));

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

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 739, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda del cliente"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFiltroID.setText("Ingrese el número de identificación del cliente a buscar:");
        jPanel4.add(lblFiltroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtCedulaABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaABuscarKeyReleased(evt);
            }
        });
        jPanel4.add(txtCedulaABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 170, -1));

        lblFiltroTipo.setText("Eliga el tipo de cliente a filtrar:");
        jPanel4.add(lblFiltroTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jcbFiltroTipoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Particular" }));
        jPanel4.add(jcbFiltroTipoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 170, -1));

        lblFiltroPref.setText("Eliga la preferencia de producto a filtrar:");
        jPanel4.add(lblFiltroPref, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, -1));

        jcbFiltroPrefCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));
        jcbFiltroPrefCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroPrefCliActionPerformed(evt);
            }
        });
        jPanel4.add(jcbFiltroPrefCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 170, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 510, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarClienteEspecifico.setText("Buscar cliente");
        btnBuscarClienteEspecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteEspecificoActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarClienteEspecifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 113, -1));

        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 113, -1));

        jButton3.setText("Exportar lista");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 113, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 190, 160));

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 990, 180));

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

        jLabel11.setText("Preferencia de productos:");

        jcboPrefCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolate y confitería", "Bebidas de cacao", "Productos en polvo", "Aceites", "Repostería", "Artesanales", "Orgánicos", "Decoración" }));
        jcboPrefCli.setEnabled(false);
        jcboPrefCli.setFocusable(false);

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarDatosMayorista, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbTipoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jcboPrefCli, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarDatosMayorista)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 990, 250));

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
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFiltroMain, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        add(pnlFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 260, 120));
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

    private void btnBuscarClienteEspecifico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteEspecifico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteEspecifico1ActionPerformed

    private void btnLimpiarDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarDatos1ActionPerformed

    private void jtClientes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientes1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtClientes1MouseClicked

    private void txtnomCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomCli1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomCli1ActionPerformed

    private void btnMostrarDatosMayorista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDatosMayorista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarDatosMayorista1ActionPerformed

    private void jcbFiltroPrefCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroPrefCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFiltroPrefCliActionPerformed

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
    private javax.swing.JButton btnBuscarClienteEspecifico;
    private javax.swing.JButton btnBuscarClienteEspecifico1;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JButton btnLimpiarDatos1;
    private javax.swing.JButton btnMostrarDatosMayorista;
    private javax.swing.JButton btnMostrarDatosMayorista1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbFiltroMain;
    private javax.swing.JComboBox<String> jcbFiltroPrefCli;
    private javax.swing.JComboBox<String> jcbFiltroTipoCli;
    private javax.swing.JComboBox<String> jcbTipoCli;
    private javax.swing.JComboBox<String> jcbTipoCli1;
    private javax.swing.JComboBox<String> jcboPrefCli;
    private javax.swing.JComboBox<String> jcboPrefCli1;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTable jtClientes1;
    private javax.swing.JLabel lblFiltroID;
    private javax.swing.JLabel lblFiltroID1;
    private javax.swing.JLabel lblFiltroPref;
    private javax.swing.JLabel lblFiltroTipo;
    private javax.swing.JLabel lblHeaderTitle;
    private javax.swing.JLabel lblHeaderTitle1;
    private javax.swing.JLabel lblIconHeader;
    private javax.swing.JLabel lblIconHeader1;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelHeader1;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JPanel pnlFiltro1;
    private javax.swing.JTextField txtCedulaABuscar;
    private javax.swing.JTextField txtCedulaABuscar1;
    private javax.swing.JTextField txtDirDomi;
    private javax.swing.JTextField txtDirDomi1;
    private javax.swing.JTextField txtFechNaCli;
    private javax.swing.JTextField txtFechNaCli1;
    private javax.swing.JTextField txtNumCont;
    private javax.swing.JTextField txtNumCont1;
    private javax.swing.JTextField txtNumID;
    private javax.swing.JTextField txtNumID1;
    private javax.swing.JTextField txtcorrCli;
    private javax.swing.JTextField txtcorrCli1;
    private javax.swing.JTextField txtnApCli;
    private javax.swing.JTextField txtnApCli1;
    private javax.swing.JTextField txtnomCli;
    private javax.swing.JTextField txtnomCli1;
    // End of variables declaration//GEN-END:variables
}
