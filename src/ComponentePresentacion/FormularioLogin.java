package ComponentePresentacion;

import ComponenteClase.Caja;
import ComponenteClase.Usuario;
import ComponenteNegocio.NegocioCaja;
import ComponenteNegocio.NegocioUsuario;
import java.net.UnknownHostException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 * @author Richard
 * @version 1.0
 * 
 * @author Mamani Bedregal
 * @version 2.0
 */
public abstract class FormularioLogin extends javax.swing.JFrame {

    private NegocioUsuario usuarioNegocio = new NegocioUsuario();
    
    public FormularioLogin() {
        this.setUndecorated(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new ComponentePresentacion.FormularioPanelFondoLogin();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        botonIngresar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("PASSWORD:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("USUARIO:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        txtClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtClave.setPreferredSize(new java.awt.Dimension(105, 21));
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 10);
        jPanel1.add(txtClave, gridBagConstraints);

        botonIngresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 7, 0);
        jPanel1.add(botonIngresar, gridBagConstraints);

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 7, 0);
        jPanel1.add(botonSalir, gridBagConstraints);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtUsuario.setPreferredSize(new java.awt.Dimension(105, 21));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 10);
        jPanel1.add(txtUsuario, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtUsuarioActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_botonSalirActionPerformed

    @SuppressWarnings("static-access")
    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // TODO add your handling code here:
        final String textoUsuario = txtUsuario.getText();
        final String textoContrasena = new String(txtClave.getPassword());
        if(!textoUsuario.isEmpty() && !textoContrasena.isEmpty())
        {
           try {
                final Usuario usuario = usuarioNegocio.buscarUsuarioNombre(textoUsuario);
                if(usuario != null)
                {
                    if (textoUsuario.equals(usuario.getNombreUsuario()) && textoContrasena.equals(usuario.getContrasenaUsuario())) {
                        FormularioMenu formularioMenu = new FormularioMenu() {};
                        formularioMenu.lblNombresUsuario.setText(usuario.getEmpleado().getApellido().toUpperCase().trim() + ", " + usuario.getEmpleado().getNombre().trim());
                        formularioMenu.tipoUsuario = usuario.getTipoUsuario();
                        formularioMenu.idEmpleado = usuario.getEmpleado().getNumeroEmpleado();
                        java.net.InetAddress nombrePC = null;
                        try {
                            nombrePC = java.net.InetAddress.getLocalHost();
                        } catch (UnknownHostException ex) {
                        }
                        NegocioCaja negocioCaja = new NegocioCaja();
                        Caja caja = negocioCaja.buscarCajaNombre(nombrePC.getHostName());
                        if(caja.getIdCaja()==0){
                            JOptionPane.showMessageDialog(this, "Esta PC no está registrada como Caja.", "Verificar", JOptionPane.ERROR_MESSAGE); 
                            return;
                        }
                        else{
                            formularioMenu.nombreCaja = nombrePC.getHostName();
                            formularioMenu.idCaja = caja.getIdCaja();
                            formularioMenu.setVisible(true);
                            this.dispose();
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Datos incorrectos: verifique su nombre de usuario y contraseña.", "Datos no válidos", JOptionPane.ERROR_MESSAGE);      
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "El usuario no existe.", 
                                        "", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error BD: " + ex.getMessage());
            } 
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese Usuario y contraseña.", 
                                        "Error: Ingrese sus datos de usuario", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new FormularioLogin() {
                }.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
