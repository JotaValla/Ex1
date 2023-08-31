package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JFrame;

public class MenuGeneralEmpleados extends javax.swing.JFrame {


    public MenuGeneralEmpleados() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPHeader = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPMenuDropdown = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menusPanel = new javax.swing.JPanel();
        jPContenedor = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPHeader.setBackground(new java.awt.Color(34, 40, 49));
        jPHeader.setPreferredSize(new java.awt.Dimension(872, 70));

        jButton1.setText("Cambiar de usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHeaderLayout.createSequentialGroup()
                .addGap(0, 643, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        getContentPane().add(jPHeader, java.awt.BorderLayout.PAGE_START);

        jPMenuDropdown.setBackground(new java.awt.Color(57, 62, 70));
        jPMenuDropdown.setPreferredSize(new java.awt.Dimension(290, 495));

        jScrollPane1.setBackground(new java.awt.Color(57, 62, 70));
        jScrollPane1.setBorder(null);

        menusPanel.setBackground(new java.awt.Color(57, 62, 70));
        menusPanel.setLayout(new javax.swing.BoxLayout(menusPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menusPanel);

        javax.swing.GroupLayout jPMenuDropdownLayout = new javax.swing.GroupLayout(jPMenuDropdown);
        jPMenuDropdown.setLayout(jPMenuDropdownLayout);
        jPMenuDropdownLayout.setHorizontalGroup(
            jPMenuDropdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPMenuDropdownLayout.setVerticalGroup(
            jPMenuDropdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(jPMenuDropdown, java.awt.BorderLayout.LINE_START);

        jPContenedor.setBackground(new java.awt.Color(238, 238, 238));
        jPContenedor.setPreferredSize(new java.awt.Dimension(520, 0));

        pn_content.setBackground(new java.awt.Color(238, 238, 238));
        pn_content.setPreferredSize(new java.awt.Dimension(520, 453));
        pn_content.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPContenedorLayout = new javax.swing.GroupLayout(jPContenedor);
        jPContenedor.setLayout(jPContenedorLayout);
        jPContenedorLayout.setHorizontalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_content, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );
        jPContenedorLayout.setVerticalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_content, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        getContentPane().add(jPContenedor, java.awt.BorderLayout.CENTER);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(803, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_content.add(new PanelMenuPrincipal());
        pn_content.repaint();
        pn_content.revalidate();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MenuGeneralEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneralEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneralEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneralEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneralEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPContenedor;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPMenuDropdown;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel menusPanel;
    private javax.swing.JPanel pn_content;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconClientes = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\icon_clientes");
        ImageIcon iconFacturacion = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\icon_facturacion.png");
        ImageIcon iconInventario = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\img/icon_inventario.png");
        ImageIcon iconProveedores = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\img/icon_proveedores.png");

        ImageIcon iconBuscar = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\icon_buscar.png");
        ImageIcon iconAgregar = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\icon_agregar.png");
        ImageIcon iconActualizar = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\img\\icon_actualizar.png");

        MenuItem agregarCliente = new MenuItem(null, true, iconAgregar, "Agregar Cliente", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPAgregarCliente());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem buscarCliente = new MenuItem(null, true, iconBuscar, "Buscar Cliente", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPBuscarCliente());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem actualizarCliente = new MenuItem(null, true, iconActualizar, "Actualizar datos del cliente", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPActualizarCliente());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem menuClientes = new MenuItem(iconClientes, false, null, "Clientes", null, agregarCliente, buscarCliente, actualizarCliente);

        MenuItem crearFactura = new MenuItem(null, true, iconAgregar, "Crear Factura", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPCrearFactura());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem buscarFactura = new MenuItem(null, true, iconBuscar, "Buscar Factura", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPBuscarFactura());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem menuFacturacion = new MenuItem(iconFacturacion, false, null, "Facturación", null, crearFactura, buscarFactura);

        MenuItem agregarProducto = new MenuItem(null, true, iconAgregar, "Agregar Producto", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPAgregarProducto());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem buscarProducto = new MenuItem(null, true, iconBuscar, "Buscar Producto", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPBuscarProducto());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem actualizarProducto = new MenuItem(null, true, iconActualizar, "Actualizar datos del Producto", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPActualizarProducto());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem menuInventario = new MenuItem(iconInventario, false, null, "Inventario", null, agregarProducto, buscarProducto, actualizarProducto);

        MenuItem buscarProveedor = new MenuItem(null, true, iconBuscar, "Buscar Proveedor", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_content.removeAll();
                pn_content.add(new jPBuscarProveedor());
                pn_content.repaint();
                pn_content.revalidate();
            }
        });
        MenuItem menuProveedores = new MenuItem(iconProveedores, false, null, "Proveedores", null, buscarProveedor);

        addMenu(menuClientes, menuFacturacion, menuInventario, menuProveedores);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menusPanel.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menusPanel.revalidate();
    }

}
