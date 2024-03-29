/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVIDCF
 */
public class FrmPPal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPPal
     */
    public FrmPPal() {
        initComponents();
        cargarProvincias((ArrayList<Provincia>) listaProvincias);
        cargarComboProvincia(listaProvincias);
        cargarComboLocalidad(cmbProvincia);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbProvincia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbLocalidad = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        rdoEliminar = new javax.swing.JRadioButton();
        rdoModificar = new javax.swing.JRadioButton();
        rdoNueva = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel1.setText("Provincia");

        cmbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinciaActionPerformed(evt);
            }
        });

        jLabel2.setText("Localidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbProvincia, 0, 413, Short.MAX_VALUE)
                    .addComponent(cmbLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 540, 140);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion informacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        buttonGroup1.add(rdoEliminar);
        rdoEliminar.setText("Eliminar localidad seleccionada");

        buttonGroup1.add(rdoModificar);
        rdoModificar.setText("Modificar localidad seleccionada");
        rdoModificar.setEnabled(false);

        buttonGroup1.add(rdoNueva);
        rdoNueva.setText("Nueva localidad");

        jLabel3.setText("Localidad");

        btnEjecutar.setText("EJECUTAR");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtLocalidad))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoModificar)
                            .addComponent(rdoNueva)
                            .addComponent(rdoEliminar))
                        .addGap(69, 69, 69)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdoEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(rdoModificar)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNueva))
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 170, 540, 210);

        setSize(new java.awt.Dimension(582, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:

        if (buttonGroup1.getSelection() == null) {
            //Sino hay nada seleccionado error!
            JOptionPane.showMessageDialog(this, "Debes seleccionar una opción");
        } else if (rdoEliminar.isSelected()) {
            //Si se selecciona eliminar localidad
            if (cmbLocalidad.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Debes indicar una localidad a eliminar");
            } else {
                Provincia p = (Provincia) cmbProvincia.getSelectedItem();
                p.getLocalidades().remove(cmbLocalidad.getSelectedItem().toString());

                cargarComboLocalidad(cmbProvincia);
            }

        } else if (rdoNueva.isSelected()) {
            //Si se selecciona nueva localidad
            if (txtLocalidad.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debes indicar una localidad a añadir");
            } else {
                Provincia p = (Provincia) cmbProvincia.getSelectedItem();
                if (p != null) {

                    //Comprobamos si existe ya la localidad
                    if (existeNuevaLocalidad(p, txtLocalidad.getText())) {     
                        JOptionPane.showMessageDialog(this, "Ya existe dicha localidad");
                    } else {
                        //Sino existe se añade
                        p.getLocalidades().add(txtLocalidad.getText());
                        cargarComboLocalidad(cmbProvincia);
                        txtLocalidad.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Debes indicar una Provincia");
                }

            }
        }

    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void cmbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaActionPerformed
        // TODO add your handling code here:

        //Al clicar en Provincia carga Localidades
        cargarComboLocalidad(cmbProvincia);
    }//GEN-LAST:event_cmbProvinciaActionPerformed

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

    List<Provincia> listaProvincias = new ArrayList<>();

    public static void cargarProvincias(ArrayList<Provincia> listaProvincias) {
        listaProvincias.add(new Provincia("A Coruña"));
        listaProvincias.add(new Provincia("Lugo"));
        listaProvincias.add(new Provincia("Ourense"));
        listaProvincias.add(new Provincia("Pontevedra"));
    }

    public void cargarComboProvincia(List<Provincia> listaProvincias) {
        for (Provincia p : listaProvincias) {
            cmbProvincia.addItem(p);
        }
    }

    public void cargarComboLocalidad(JComboBox cmbProvincia) {

        cmbLocalidad.removeAllItems();

        Provincia p = (Provincia) cmbProvincia.getSelectedItem();

        if (p != null) {
            List<String> localidades = p.getLocalidades();

            for (String l : localidades) {
                cmbLocalidad.addItem(l);
            }
        }
    }

    public static boolean existeNuevaLocalidad(Provincia p, String nuevaLocalidad) {

               
        List<String> listaLocalidades = p.getLocalidades();

        for (String loc : listaLocalidades) {
            if (loc.equalsIgnoreCase(nuevaLocalidad)) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbLocalidad;
    private javax.swing.JComboBox<Provincia> cmbProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdoEliminar;
    private javax.swing.JRadioButton rdoModificar;
    private javax.swing.JRadioButton rdoNueva;
    private javax.swing.JTextField txtLocalidad;
    // End of variables declaration//GEN-END:variables
}
