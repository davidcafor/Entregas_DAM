
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;


/**
 *
 * @author davidcf
 */
public class FrmPPal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPPal
     */
    public FrmPPal() {
        initComponents();
        //Definicion elemento raiz para crear tabla
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("CUADRILLAS");
        modeloArbol = new DefaultTreeModel(raiz);
        treeTrabajadores.setModel(modeloArbol);
        treeTrabajadores.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        //Asociamos tabla y modelo
        modeloTabla = (DefaultTableModel) tblTrabajadores.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        treeTrabajadores = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        btnLocalidad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnAltaEmpleado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbLocalidades = new javax.swing.JComboBox<>();
        btnTrabajadores = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(treeTrabajadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 370, 480);

        jLabel1.setText("Localidad");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 10, 60, 16);
        getContentPane().add(txtLocalidad);
        txtLocalidad.setBounds(470, 10, 150, 22);

        btnLocalidad.setText("Alta Localidad");
        btnLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnLocalidad);
        btnLocalidad.setBounds(630, 10, 160, 22);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setLayout(null);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 60, 16);

        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 60, 16);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(70, 30, 190, 22);
        jPanel1.add(txtApellido);
        txtApellido.setBounds(70, 60, 190, 22);

        btnAltaEmpleado.setText("Alta");
        btnAltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAltaEmpleado);
        btnAltaEmpleado.setBounds(270, 30, 100, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(400, 50, 390, 110);

        jLabel4.setText("Localidades");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 180, 80, 16);

        getContentPane().add(cmbLocalidades);
        cmbLocalidades.setBounds(480, 180, 160, 22);

        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrabajadores);
        btnTrabajadores.setBounds(660, 180, 130, 22);

        tblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTrabajadores);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(400, 230, 390, 260);

        setSize(new java.awt.Dimension(816, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalidadActionPerformed
        // TODO add your handling code here:

        if (txtLocalidad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes indicar una localidad");
        } else {
            //Añadimos la localidad al combo y creamos elemento de arbol con ella.
            cmbLocalidades.addItem(txtLocalidad.getText().trim().toUpperCase());
            DefaultMutableTreeNode nodoLocalidad = new DefaultMutableTreeNode("LOCALIDAD: " + txtLocalidad.getText().trim().toUpperCase());
            DefaultTreeModel arbol = (DefaultTreeModel) treeTrabajadores.getModel();
            arbol.insertNodeInto(nodoLocalidad, (DefaultMutableTreeNode) modeloArbol.getRoot(), ((DefaultMutableTreeNode) modeloArbol.getRoot()).getChildCount());
            //marcamos por defecto el elemento creado en el arbol
            treeTrabajadores.scrollPathToVisible(new TreePath(nodoLocalidad.getPath()));
            treeTrabajadores.setSelectionPath(new TreePath(nodoLocalidad.getPath()));
            //limpiar datos
            txtLocalidad.setText("");
        }

    }//GEN-LAST:event_btnLocalidadActionPerformed

    private void btnAltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaEmpleadoActionPerformed
        // TODO add your handling code here:

        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes indicar un nombre");
            return;
        }
        if (txtApellido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes indicar un apellido");
            return;
        }

        //Usamos el nodo seleccionado para saber saber a que nivel del arbol pertenece
        DefaultTreeModel arbol = (DefaultTreeModel) treeTrabajadores.getModel();
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) treeTrabajadores.getLastSelectedPathComponent();

        //En base al nivel del arbol creamos el tipo de trabajador
        if (nodoSeleccionado != null) {
            int nivelArbol = nodoSeleccionado.getLevel();

            switch (nivelArbol) {

                case 0 -> {
                    JOptionPane.showMessageDialog(this, "El empleado no puede colgar de la raiz");
                }
                case 1 -> {
 
                    //si el nivel arbol es 1 y no hay más de un elemento de este tipo ... lo creamos.
                    if (nodoSeleccionado.getChildCount() < 1) {
                        //SI EL NODO SELECCIONADO ES HIJO DE CUADRILLAS -> ES UNA LOCALIDAD -> ES JEFE Y EL NUMERO DE JEFE POR PROVINCIA ES 0 O 1
                        Trabajador p = new Trabajador(txtNombre.getText().trim(), txtApellido.getText().trim(), nodoSeleccionado.getUserObject().toString().substring(11), "JEFE");
                        DefaultMutableTreeNode nodoJefe = new DefaultMutableTreeNode(p);
                        arbol.insertNodeInto(nodoJefe, nodoSeleccionado, nodoSeleccionado.getChildCount());
                        treeTrabajadores.scrollPathToVisible(new TreePath(nodoJefe.getPath()));
                        treeTrabajadores.setSelectionPath(new TreePath(nodoJefe.getPath()));
                        listaTrabajadores.add(p);
                        txtNombre.setText("");
                        txtApellido.setText("");
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Solo puede haber un Jefe por Provincia");
                        return;
                    }
                }
                case 2 -> {
                    String localidad = (nodoSeleccionado.getParent()).toString();
                    //1º oficial
                    Trabajador p = new Trabajador(txtNombre.getText().trim(), txtApellido.getText().trim(), localidad.substring(11), "1º OFICIAL");
                    DefaultMutableTreeNode nodoPrOfi = new DefaultMutableTreeNode(p);
                    arbol.insertNodeInto(nodoPrOfi, nodoSeleccionado, nodoSeleccionado.getChildCount());
                    treeTrabajadores.scrollPathToVisible(new TreePath(nodoPrOfi.getPath()));
                    treeTrabajadores.setSelectionPath(new TreePath(nodoPrOfi.getPath()));
                    listaTrabajadores.add(p);
                    txtNombre.setText("");
                    txtApellido.setText("");
                }
                case 3 -> {
                    String localidad = ((nodoSeleccionado.getParent()).getParent()).toString();
                    //2º oficial
                    Trabajador p = new Trabajador(txtNombre.getText().trim(), txtApellido.getText().trim(), localidad.substring(11), "2º OFICIAL");
                    DefaultMutableTreeNode nodoSegOfi = new DefaultMutableTreeNode(p);
                    arbol.insertNodeInto(nodoSegOfi, nodoSeleccionado, nodoSeleccionado.getChildCount());
                    treeTrabajadores.scrollPathToVisible(new TreePath(nodoSegOfi.getPath()));
                    treeTrabajadores.setSelectionPath(new TreePath(nodoSegOfi.getPath()));
                    listaTrabajadores.add(p);
                    txtNombre.setText("");
                    txtApellido.setText("");
                }
                default -> {
                    JOptionPane.showMessageDialog(this, "No se pueden añadir más categorias de oficiales");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debes seleccionar un nodo");
        }



    }//GEN-LAST:event_btnAltaEmpleadoActionPerformed

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        // TODO add your handling code here:
        
        if(cmbLocalidades.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debes seleccionar una localidad");
            return;
        }
        
        //primero borramos
        modeloTabla.setRowCount(0);
        
        for (Trabajador t : listaTrabajadores) {
            if(t.localidad.equalsIgnoreCase((String) cmbLocalidades.getSelectedItem())){
                //segundo cargar tabla
                int numFilas = modeloTabla.getRowCount();
                modeloTabla.setRowCount(numFilas+1);
                modeloTabla.setValueAt(t.nombre, numFilas, 0);
                modeloTabla.setValueAt(t.apellido, numFilas, 1);
                modeloTabla.setValueAt(t.cargo, numFilas, 2);
            }
        }
        
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPPal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPPal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPPal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPPal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPPal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaEmpleado;
    private javax.swing.JButton btnLocalidad;
    private javax.swing.JButton btnTrabajadores;
    private javax.swing.JComboBox<String> cmbLocalidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTrabajadores;
    private javax.swing.JTree treeTrabajadores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private DefaultTreeModel modeloArbol;
    private List<Trabajador> listaTrabajadores = new ArrayList<>();
    private DefaultTableModel modeloTabla = new DefaultTableModel();
   
}

//PASOS CREAR ARBOL
/*
1. CREAR MODELO VACIO
2. CREAR DEFAULT MUTABLE TREE
3. RESERVAR ESPACIO DEFAULT TREE MODEL con NODO RAIZ
4. LIGAR MODELO CON TABLA

 */