/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.table.DefaultTableModel;

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
        lstProfesiones.setModel(modeloLista);
        modeloTabla = (DefaultTableModel) tblTrabajadores.getModel();
        //cargarDatos();
        //tblTrabajadores.setDefaultEditor(Object.class, null);
        
        //Evento VALUE CHANGED
        tblTrabajadores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting() == false & tblTrabajadores.getSelectedRow() != -1){
                    
                    Trabajador t = (Trabajador) modeloTabla.getValueAt(tblTrabajadores.getSelectedRow(), 0);
                    
                    txtArea.setText("DATOS DEL TRABAJADOR\n"
                    + "DNI: " + t.getDNI() + "\n"
                    + "NOME: " + t.getNombre() + "\n"
                    + "APELLIDO 1: " + t.getApellido1()+ "\n"
                    + "APELLIDO 2: " + t.getApellido2()+ "\n"
                    + "PROVINCIA: " + t.getProvincia()+ "\n"
                    + "PROFESION: " + t.getProfesion());
                }
            }
        });        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmbProvincias = new javax.swing.JComboBox<>();
        btnEliminarProv = new javax.swing.JButton();
        txtProvincia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProfesiones = new javax.swing.JList<>();
        txtProfesion = new javax.swing.JTextField();
        btnEliminarProfes = new javax.swing.JButton();
        btnAnadirProfes = new javax.swing.JButton();
        btnAnadirTrabajador = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();
        btnEliminarTrabajador = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnCerrarAplicacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Indentificación del trabajador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.setLayout(null);

        jLabel1.setText("DNI");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(11, 37, 47, 16);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(11, 65, 65, 16);

        jLabel3.setText("Apellido 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(11, 93, 65, 16);

        jLabel4.setText("Apellido 2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(11, 121, 65, 16);
        jPanel1.add(txtDNI);
        txtDNI.setBounds(94, 34, 372, 22);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(94, 62, 372, 22);
        jPanel1.add(txtApellido1);
        txtApellido1.setBounds(94, 90, 372, 22);
        jPanel1.add(txtApellido2);
        txtApellido2.setBounds(94, 118, 372, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 480, 160);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Provincia del trabajador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel2.setLayout(null);

        jPanel2.add(cmbProvincias);
        cmbProvincias.setBounds(11, 33, 295, 22);

        btnEliminarProv.setText("Eliminar provincia");
        btnEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProvActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarProv);
        btnEliminarProv.setBounds(324, 33, 140, 22);
        jPanel2.add(txtProvincia);
        txtProvincia.setBounds(11, 67, 295, 22);

        jButton1.setText("Añadir provincia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(324, 67, 140, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 190, 480, 110);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profesión del trabajador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel3.setLayout(null);

        lstProfesiones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstProfesiones);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(11, 25, 290, 111);
        jPanel3.add(txtProfesion);
        txtProfesion.setBounds(10, 150, 291, 22);

        btnEliminarProfes.setText("Eliminar profesión");
        btnEliminarProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProfesActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarProfes);
        btnEliminarProfes.setBounds(320, 30, 140, 22);

        btnAnadirProfes.setText("Añadir profesión");
        btnAnadirProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirProfesActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnadirProfes);
        btnAnadirProfes.setBounds(320, 150, 140, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 330, 480, 200);

        btnAnadirTrabajador.setText("Añadir trabajador");
        btnAnadirTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnadirTrabajador);
        btnAnadirTrabajador.setBounds(10, 550, 480, 22);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trabajadores disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel4.setLayout(null);

        tblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre completo", "Provincia", "Profesión"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTrabajadores.setFocusable(false);
        tblTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrabajadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTrabajadores);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 460, 190);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(510, 30, 480, 230);

        btnEliminarTrabajador.setText("Eliminar trabajador");
        btnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTrabajador);
        btnEliminarTrabajador.setBounds(510, 270, 480, 22);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle del trabajador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel5.setLayout(null);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane3.setViewportView(txtArea);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(11, 25, 438, 164);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(520, 330, 460, 200);

        btnCerrarAplicacion.setText("Cerrar aplicacion");
        btnCerrarAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarAplicacion);
        btnCerrarAplicacion.setBounds(520, 550, 460, 22);

        setSize(new java.awt.Dimension(1020, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirTrabajadorActionPerformed
        // TODO add your handling code here:
        
        //VERIFICAMOS DATOS DE ENTRADA CORRECTOS
        if(txtDNI.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe indicar un DNI");
            return;
        }
        
        //COMPROBAMOS QUE EL DNI NO ESTE DADO DE ALTA        
        for (int i = 0; i < tblTrabajadores.getRowCount(); i++) {
            Trabajador t = (Trabajador) modeloTabla.getValueAt(i, 0);
            if(t.getDNI().equalsIgnoreCase(txtDNI.getText())){
                JOptionPane.showMessageDialog(this, "El DNI ya existe");
                return;
            }
        }
        
        if(txtNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe indicar un nombre");
            return;
        }
        
        if(txtApellido1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe indicar un apellido");
            return;
        }
        
        if(txtApellido2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe indicar un apellido");
            return;
        }        
        
        //VERIFICAMOS SE HA SELECCIONADO UNA PROVINCIA
        
        if(cmbProvincias.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una provincia");
            return;
        }
        
        //VERIFICAMOS SE HA SELECCIONADO UNA PROFESION
        
        if(lstProfesiones.getSelectedValue()==null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una profesion");
            return;
        }
        
        //CREAMOS TRABAJADOR
        
        Trabajador t = new Trabajador(txtDNI.getText(), txtNombre.getText(), txtApellido1.getText(), txtApellido2.getText(), cmbProvincias.getSelectedItem().toString(), lstProfesiones.getSelectedValue());
        listaTrabajadores.add(t);
        
        //AÑADIMOS A TABLA
        
        int numFilas = modeloTabla.getRowCount(); //guardamos el nº filas de la tabla
        modeloTabla.setRowCount(numFilas+1); //añadimos una nueva fila
        modeloTabla.setValueAt(t, numFilas, 0);
        modeloTabla.setValueAt(t.provincia, modeloTabla.getRowCount()-1, 1);
        modeloTabla.setValueAt(t.profesion, modeloTabla.getRowCount()-1, 2);

        limpiarDatos();
        
        
    }//GEN-LAST:event_btnAnadirTrabajadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(txtProvincia.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe indicar una provincia para añadirla");
        }else{
            cmbProvincias.addItem(txtProvincia.getText().toUpperCase());
            txtProvincia.setText("");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvActionPerformed
        // TODO add your handling code here:
        
        if(cmbProvincias.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Debe indicar una provincia a eliminar");
        }else{
            cmbProvincias.removeItem(cmbProvincias.getSelectedItem());
        }
    }//GEN-LAST:event_btnEliminarProvActionPerformed

    private void btnAnadirProfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirProfesActionPerformed
        // TODO add your handling code here:
        
        if(txtProfesion.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe indicar una profesion a añadir");
        }else{
            modeloLista.addElement(txtProfesion.getText().toUpperCase());
            txtProfesion.setText("");
        }
        
        
    }//GEN-LAST:event_btnAnadirProfesActionPerformed

    private void btnEliminarProfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProfesActionPerformed
        // TODO add your handling code here:
        
        if(modeloLista.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay profesiones a eliminar");
        }else{
            
            if(lstProfesiones.getSelectedIndex()<0){
                JOptionPane.showMessageDialog(this, "Debes seleccionar una profesion");
            }else{
                modeloLista.removeElementAt(lstProfesiones.getSelectedIndex());
            } 
        }
        
        
        
    }//GEN-LAST:event_btnEliminarProfesActionPerformed

    private void btnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTrabajadorActionPerformed
        // TODO add your handling code here:
        
        if(tblTrabajadores.getSelectedRow()<0){
            JOptionPane.showMessageDialog(this, "Debes selecionar un elemento");
        }else{
            Trabajador t = (Trabajador) modeloTabla.getValueAt(tblTrabajadores.getSelectedRow(), 0);
            modeloTabla.removeRow(tblTrabajadores.getSelectedRow());
            
            txtArea.setText("");
       }
        
    }//GEN-LAST:event_btnEliminarTrabajadorActionPerformed

    private void tblTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrabajadoresMouseClicked
        // TODO add your handling code here:
        
        Trabajador t = (Trabajador) modeloTabla.getValueAt(tblTrabajadores.getSelectedRow(), 0);
        int contador = 0;
        StringBuilder sb = new StringBuilder();
        
        if(evt.getClickCount()==2){    
            for (Trabajador t1 : listaTrabajadores) {
                if(t.provincia.equalsIgnoreCase(t1.provincia)){
                    contador++;
                    sb.append(t1.nombre + " " + t1.apellido1 + " " + t1.apellido2 + "\n");
                }
            }
            
            sb = new StringBuilder("Nº DE TRABAJADORES: " + contador + "\n" + sb.toString());
            
            JOptionPane.showMessageDialog(this, sb);
            
        }
        
    }//GEN-LAST:event_tblTrabajadoresMouseClicked

    private void btnCerrarAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAplicacionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarAplicacionActionPerformed

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
    
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    
    List<Trabajador> listaTrabajadores = new ArrayList<>();
    
    private void cargarDatos(){
        cmbProvincias.addItem("A CORUÑA");
        cmbProvincias.addItem("LUGO");
        
        modeloLista.addElement("CARPINTERO");
        modeloLista.addElement("ELECTRICISTA");
    }
    
    private void limpiarDatos(){
        txtDNI.setText("");
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirProfes;
    private javax.swing.JButton btnAnadirTrabajador;
    private javax.swing.JButton btnCerrarAplicacion;
    private javax.swing.JButton btnEliminarProfes;
    private javax.swing.JButton btnEliminarProv;
    private javax.swing.JButton btnEliminarTrabajador;
    private javax.swing.JComboBox<String> cmbProvincias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstProfesiones;
    private javax.swing.JTable tblTrabajadores;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProfesion;
    private javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables
}
