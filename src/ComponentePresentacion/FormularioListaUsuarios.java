package ComponentePresentacion;
import ComponenteClase.Usuario;
import ComponenteNegocio.NegocioUsuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 * @author Richard
 * @version 1.0
 * 
 * @author Mamani Bedregal
 * @version 2.0
 * 
 * @author Mamani Bedregal
 * @version 2.1
 */
public class FormularioListaUsuarios extends javax.swing.JDialog {
    private DefaultTableModel tablaUsuario= new DefaultTableModel();
    private FormularioUsuario formularioUsuario = new FormularioUsuario();
    private TableRowSorter rowSorter;
    
    public FormularioListaUsuarios(final FormularioUsuario formularioUsuario, boolean modal) {
        super(formularioUsuario, modal);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
         String listaTituloTabla[]={"ID","USUARIO","EMPLEADO","TIPO DE USUARIO"};
        tablaUsuario.setColumnIdentifiers(listaTituloTabla);
        try{
            NegocioUsuario usuarioNegocio = new NegocioUsuario();
            for(Usuario usuario : usuarioNegocio.mostrarUsuario()){
                String datoTabla[]={String.valueOf(usuario.getIdUsuario()),usuario.getNombreUsuario(),String.valueOf(usuario.getEmpleado().getApellido()), usuario.getTipoUsuario()};
                tablaUsuario.addRow(datoTabla);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
        
        this.formularioUsuario = formularioUsuario;
        jUsuario.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                final int fila = jUsuario.rowAtPoint(e.getPoint());
                final int columna = jUsuario.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    try {
                        NegocioUsuario usuarioNegocio =  new NegocioUsuario();
                        Usuario usuario = usuarioNegocio.buscarUsuario(Integer.parseInt(String.valueOf(tablaUsuario.getValueAt(fila, 0))));
                        formularioUsuario.txtID.setText(String.valueOf(usuario.getIdUsuario()));
                        formularioUsuario.txtNombreUsuario.setText(usuario.getNombreUsuario());
                        formularioUsuario.txtPassU.setText(usuario.getContrasenaUsuario());
                        formularioUsuario.cboEmpleadoU.setEnabled(true);
                        formularioUsuario.cboTipoUsuario.setEnabled(true);
                        for (int i = 0; i < formularioUsuario.cboEmpleadoU.getModel().getSize(); i++) {
                            Object object = (Object)formularioUsuario.cboEmpleadoU.getModel().getElementAt(i);
                            if(object.toString().equals(usuario.getEmpleado().getApellido())){
                                formularioUsuario.cboEmpleadoU.setSelectedItem(object);
                            }                       
                        }
                        for (int i = 0; i < formularioUsuario.cboTipoUsuario.getModel().getSize(); i++) {
                            Object object = (Object)formularioUsuario.cboTipoUsuario.getModel().getElementAt(i);
                            if(object.toString().equals(usuario.getTipoUsuario())){
                                formularioUsuario.cboTipoUsuario.setSelectedItem(object);
                            }                       
                        }
                        formularioUsuario.btnEditarU.setEnabled(true);
                        formularioUsuario.btnEliminarU.setEnabled(true);
                        formularioUsuario.btnCancelarU.setEnabled(true);
                        formularioUsuario.txtPassU.setEnabled(true);
                        formularioUsuario.txtPassU.setEditable(true);
                        formularioUsuario.txtNombreUsuario.setEnabled(true);
                        formularioUsuario.txtNombreUsuario.setEditable(true);
                        formularioUsuario.btnNuevoU.setEnabled(false);

                    } catch (SQLException ex) {
                        JOptionPane.showConfirmDialog(null, "Error BD: " + ex.getMessage());
                    }

                }
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUsuario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtbuscarVen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 105, 138));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE USUARIOS");

        jUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jUsuario.setModel(tablaUsuario);
        jUsuario.setGridColor(new java.awt.Color(247, 254, 255));
        jScrollPane1.setViewportView(jUsuario);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Texto a buscar:");

        txtbuscarVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarVenKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarVen)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbuscarVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarVenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarVenKeyTyped
        txtbuscarVen.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + txtbuscarVen.getText()));
            }

        });

        rowSorter = new TableRowSorter(tablaUsuario);
        jUsuario.setRowSorter(rowSorter);
    }//GEN-LAST:event_txtbuscarVenKeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioListaUsuarios dialog = new FormularioListaUsuarios(null, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jUsuario;
    private javax.swing.JTextField txtbuscarVen;
    // End of variables declaration//GEN-END:variables

}