package Interfaces;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class jFAgregarClienteMayorista extends javax.swing.JFrame {

    String nomLocal;
    String telfLocal;
    String dirLocal;

    public jFAgregarClienteMayorista() {
        initComponents();
        nomLocal = "";
        telfLocal = "";
        dirLocal = "";
        setLocationRelativeTo(this);
        limpiarDatos(); 
    }

    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    public String getTelfLocal() {
        return telfLocal;
    }

    public void setTelfLocal(String telfLocal) {
        this.telfLocal = telfLocal;
    }

    public String getDirLocal() {
        return dirLocal;
    }

    public void setDirLocal(String dirLocal) {
        this.dirLocal = dirLocal;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnLimpiarDatos() {
        return btnLimpiarDatos;
    }

    public void setBtnLimpiarDatos(JButton btnLimpiarDatos) {
        this.btnLimpiarDatos = btnLimpiarDatos;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JTextField getTxtDirLocal() {
        return txtDirLocal;
    }

    public void setTxtDirLocal(String txtDirLocal) {
        this.txtDirLocal.setText(txtDirLocal);
    }

    public JTextField getTxtTelfLocal() {
        return txtTelfLocal;
    }

    public void setTxtTelfLocal(String txtTelfLocal) {
        this.txtTelfLocal.setText(txtTelfLocal);
    }

    public JTextField getTxtnomLocal() {
        return txtnomLocal;
    }

    public void setTxtnomLocal(String txtnomLocal) {
        this.txtnomLocal.setText(txtnomLocal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDirLocal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelfLocal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnomLocal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnLimpiarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDirLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirLocalKeyReleased(evt);
            }
        });

        jLabel3.setText("Dirección del local mayorista:");

        txtTelfLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelfLocalKeyReleased(evt);
            }
        });

        jLabel2.setText("Teléfono adicional de contacto:");

        txtnomLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomLocalKeyReleased(evt);
            }
        });

        jLabel1.setText("Nombre del local mayorista:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnLimpiarDatos.setText("Limpiar datos");
        btnLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDirLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnomLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnomLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelfLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtDirLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarDatos)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        nomLocal = txtnomLocal.getText();
        telfLocal = txtTelfLocal.getText();
        dirLocal = txtDirLocal.getText();
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDatosActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarDatosActionPerformed

    private void txtnomLocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomLocalKeyReleased
// Obtener el texto del JTextField
        String texto = txtnomLocal.getText();

        // Usar una expresión regular para validar el texto
        if (!texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]*$")) {
            // Si el texto no coincide con la expresión regular, mostrar un mensaje de error
            mostrarMensajeError("Debe ingresar solo letras, espacios y vocales con tildes.");
            // Limpiar el JTextField o eliminar caracteres no válidos si es necesario
            txtnomLocal.setText(texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]", ""));
        }
    }//GEN-LAST:event_txtnomLocalKeyReleased

    private void txtTelfLocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelfLocalKeyReleased
        // Obtener el texto del JTextField
        String texto = txtTelfLocal.getText();

        // Validar que solo se ingresen dígitos numéricos y que no exceda los 10 dígitos
        if (!texto.matches("\\d{0,10}")) {
            // Si no cumple con la validación, mostrar un mensaje de error
            mostrarMensajeError("El número de contacto debe contener hasta 10 dígitos numéricos.");
            // Limpiar el JTextField o eliminar caracteres no válidos si es necesario
            txtTelfLocal.setText(texto.replaceAll("[^0-9]", ""));
        }
    }//GEN-LAST:event_txtTelfLocalKeyReleased

    private void txtDirLocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirLocalKeyReleased
        // Obtener el texto del JTextField
        String texto = txtDirLocal.getText();

        // Limitar la longitud máxima a 200 caracteres
        if (texto.length() > 200) {
            // Si se supera la longitud máxima, mostrar un mensaje de error
            mostrarMensajeError("La dirección no puede superar los 200 caracteres.");
            // Recortar el texto a 200 caracteres
            txtDirLocal.setText(texto.substring(0, 200));
        }

        // Usar una expresión regular para validar el texto permitiendo caracteres especiales
        if (!texto.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ: \\-#./\\s]*$")) {
            // Si el texto no coincide con la expresión regular, mostrar un mensaje de error
            mostrarMensajeError("La dirección contiene caracteres no válidos.");
            // Limpiar el JTextField o eliminar caracteres no válidos si es necesario
            txtDirLocal.setText(texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ: -#./\\s]", ""));
        }
    }//GEN-LAST:event_txtDirLocalKeyReleased

    private void mostrarMensajeError(String mensaje) {
        // Puedes mostrar el mensaje de error en un JLabel o en una ventana emergente
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void limpiarDatos() {
        txtnomLocal.setText("");
        txtDirLocal.setText("");
        txtTelfLocal.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFAgregarClienteMayorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDirLocal;
    private javax.swing.JTextField txtTelfLocal;
    private javax.swing.JTextField txtnomLocal;
    // End of variables declaration//GEN-END:variables
}
