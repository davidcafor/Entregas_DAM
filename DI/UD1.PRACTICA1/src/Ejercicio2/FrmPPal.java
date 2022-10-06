package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class FrmPPal extends javax.swing.JFrame {

    List<Persona> personas = new ArrayList<>();
    JCheckBox[] licencias;

    //METODO LIMPIAR
    public void limpiarDatos() {
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        btnGroupSexo.clearSelection();
        btnGroupTitulacion.clearSelection();
        chkA.setSelected(false);
        chkB.setSelected(false);
        chkC.setSelected(false);
        chkD.setSelected(false);
        chkE.setSelected(false);
    }

    /**
     * Creates new form FrmPPal
     */
    public FrmPPal() {
        initComponents();

        //Definiendo valores checkbuttons
        rdoHombre.setActionCommand("Hombre");
        rdoMujer.setActionCommand("Mujer");
        rdoNinguna.setActionCommand("Ninguna");
        rdoEso.setActionCommand("ESO");
        rdoBachillerato.setActionCommand("Bachillerato");
        rdoFp.setActionCommand("FP");
        rdoUniversitaria.setActionCommand("Universitaria");
        rdoOtra.setActionCommand("Otra");

        licencias = new JCheckBox[]{chkA, chkB, chkC, chkD, chkE};

        System.out.println("LISTADO PERSONAS\n"
                + personas.toString());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        btnGroupTitulacion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        pnlSexo = new javax.swing.JPanel();
        rdoHombre = new javax.swing.JRadioButton();
        rdoMujer = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        chkA = new javax.swing.JCheckBox();
        chkB = new javax.swing.JCheckBox();
        chkC = new javax.swing.JCheckBox();
        chkD = new javax.swing.JCheckBox();
        chkE = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rdoNinguna = new javax.swing.JRadioButton();
        rdoEso = new javax.swing.JRadioButton();
        rdoBachillerato = new javax.swing.JRadioButton();
        rdoFp = new javax.swing.JRadioButton();
        rdoUniversitaria = new javax.swing.JRadioButton();
        rdoOtra = new javax.swing.JRadioButton();
        txtOtraTitulacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("DNI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 40, 16);

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 60, 16);

        jLabel3.setText("Apellido 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 70, 16);

        jLabel4.setText("Apellido 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 70, 16);
        getContentPane().add(txtDni);
        txtDni.setBounds(110, 20, 200, 22);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(110, 50, 200, 22);
        getContentPane().add(txtApellido1);
        txtApellido1.setBounds(110, 80, 200, 22);
        getContentPane().add(txtApellido2);
        txtApellido2.setBounds(110, 110, 200, 22);

        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        pnlSexo.setLayout(null);

        btnGroupSexo.add(rdoHombre);
        rdoHombre.setText("Hombre");
        pnlSexo.add(rdoHombre);
        rdoHombre.setBounds(30, 40, 98, 20);

        btnGroupSexo.add(rdoMujer);
        rdoMujer.setText("Mujer");
        pnlSexo.add(rdoMujer);
        rdoMujer.setBounds(30, 70, 54, 20);

        getContentPane().add(pnlSexo);
        pnlSexo.setBounds(340, 20, 290, 110);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permiso conducir", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        chkA.setText("A");

        chkB.setText("B");

        chkC.setText("C");

        chkD.setText("D");

        chkE.setText("E");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 170, 290, 200);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Titulación máxima", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        btnGroupTitulacion.add(rdoNinguna);
        rdoNinguna.setText("Ninguna");

        btnGroupTitulacion.add(rdoEso);
        rdoEso.setText("ESO");

        btnGroupTitulacion.add(rdoBachillerato);
        rdoBachillerato.setText("Bachillerato");

        btnGroupTitulacion.add(rdoFp);
        rdoFp.setText("FP");

        btnGroupTitulacion.add(rdoUniversitaria);
        rdoUniversitaria.setText("Universitaria");

        btnGroupTitulacion.add(rdoOtra);
        rdoOtra.setText("Otra");
        rdoOtra.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdoOtraStateChanged(evt);
            }
        });

        txtOtraTitulacion.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdoOtra)
                        .addGap(30, 30, 30)
                        .addComponent(txtOtraTitulacion, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoBachillerato)
                            .addComponent(rdoFp)
                            .addComponent(rdoUniversitaria)
                            .addComponent(rdoNinguna, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoEso, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoNinguna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoEso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoBachillerato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoFp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoUniversitaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoOtra)
                    .addComponent(txtOtraTitulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(340, 170, 290, 200);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(20, 390, 120, 22);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(170, 390, 120, 22);
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(320, 390, 310, 22);

        setSize(new java.awt.Dimension(666, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        //VALIDACION TOTAL
        //StringBuilder sb = new StringBuilder("Se han encontrado los siguientes errores\n");
        //boolean formularioOK = true;
        ButtonModel bmSexo = btnGroupSexo.getSelection();
        ButtonModel bmTitulacion = btnGroupTitulacion.getSelection();
        List<String> licenciasSele = new ArrayList<>();

        if (txtDni.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta indicar el DNI");
            return;
        }

        for (Persona p : personas) {
            if (txtDni.getText().equals(p.getDni())) {
                JOptionPane.showMessageDialog(this, "El DNI ya existe en el registro");
                return;
            }
        }

        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta indicar el nombre");
            return;
        }

        if (!txtNombre.getText().matches("[A-Za-zÀ-ÿ '-]*")) {
            JOptionPane.showMessageDialog(this, "El nombre contiene caracteres no validos");
            return;
        }

        if (txtApellido1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta indicar el primer apellido");
            return;
        }
        
        if (!txtApellido1.getText().matches("[A-Za-zÀ-ÿ '-]*")) {
            JOptionPane.showMessageDialog(this, "El apellido 1 contiene caracteres no validos");
            return;
        }
        
        if (txtApellido2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta indicar el segundo apellido");
            return;
        }
        
        if (!txtApellido2.getText().matches("[A-Za-zÀ-ÿ '-]*")) {
            JOptionPane.showMessageDialog(this, "El apellido 2 contiene caracteres no validos");
            return;
        }
        
        if (bmSexo == null) {
            JOptionPane.showMessageDialog(this, "Falta seleccionar Sexo");
            return;
        }
        if (bmTitulacion == null) {
            JOptionPane.showMessageDialog(this, "Falta seleccionar titulación");
            return;
        }

        //COMPRUEBO LICENCIAS SELECCIONADAS Y GUARDO EN ARRAY
        for (JCheckBox licencia : licencias) {
            if (licencia.isSelected()) {
                licenciasSele.add(licencia.getActionCommand());
            }
        }

        //COMPROBACION CASILLA OTRA
        if (rdoOtra.isSelected()) {
            if (txtOtraTitulacion.getText().trim().isBlank()) {
                JOptionPane.showMessageDialog(this, "Debes rellenar el cuadro Otra");
                return;
            } else {
                rdoOtra.setActionCommand(txtOtraTitulacion.getText().trim());
            }
        }

        //CREAMOS PERSONA
        Persona p;

        if (rdoOtra.isSelected()) {
            p = new Persona(txtDni.getText().trim(), txtNombre.getText().trim(), txtApellido1.getText().trim(), txtApellido2.getText().trim(), btnGroupSexo.getSelection().getActionCommand(), licenciasSele, txtOtraTitulacion.getText().trim());
        } else {
            p = new Persona(txtDni.getText().trim(), txtNombre.getText().trim(), txtApellido1.getText().trim(), txtApellido2.getText().trim(), btnGroupSexo.getSelection().getActionCommand(), licenciasSele, btnGroupTitulacion.getSelection().getActionCommand());
        }

        personas.add(p);

        System.out.println("Has sido dado de alta correctamente");

        System.out.println("LISTADO PERSONAS\n"
                + personas.toString());

        limpiarDatos();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void rdoOtraStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdoOtraStateChanged
        // TODO add your handling code here:
        //CHECK OTRA HABILITA CAMPO
        if (rdoOtra.isSelected()) {
            txtOtraTitulacion.setEnabled(true);
        } else {
            txtOtraTitulacion.setEnabled(false);
            txtOtraTitulacion.setText("");
        }

    }//GEN-LAST:event_rdoOtraStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        limpiarDatos();
        boolean noExiste = true;

        if (txtBuscar.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(this, "- Debe indicar un DNI");
        } else {
            for (Persona p : personas) {
                if (txtBuscar.getText().trim().equals(p.getDni())) {

                    noExiste = false;

                    //RELLENO CAMPOS COMUNES
                    txtDni.setText(p.getDni());
                    txtNombre.setText(p.getNombre());
                    txtApellido1.setText(p.getApellido1());
                    txtApellido2.setText(p.getApellido2());

                    //RELLENO SEXO
                    if (p.getSexo().equalsIgnoreCase(rdoHombre.getActionCommand())) {
                        rdoHombre.doClick();
                    } else {
                        rdoMujer.doClick();
                    }

                    //RELLENO ESTUDIOS
                    switch (p.getTitulacion().toLowerCase()) {
                        case "ninguna" -> {
                            rdoNinguna.doClick();
                        }
                        case "eso" -> {
                            rdoEso.doClick();
                        }
                        case "bachilerato" -> {
                            rdoBachillerato.doClick();
                        }
                        case "fp" -> {
                            rdoFp.doClick();
                        }
                        case "universitaria" -> {
                            rdoUniversitaria.doClick();
                        }

                        default -> {
                            rdoOtra.doClick();
                            txtOtraTitulacion.setText(p.getTitulacion());
                        }

                    }

                    //RELLENO LICENCIAS
                    for (JCheckBox lic : licencias) {
                        if (p.getPermiso().contains(lic.getText())) {
                            lic.doClick();
                        }
                    }

                }

            }

            if (noExiste) {
                JOptionPane.showMessageDialog(this, "El ID no existe");
            }

        }

        txtBuscar.setText("");


    }//GEN-LAST:event_btnBuscarActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPPal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.ButtonGroup btnGroupTitulacion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkA;
    private javax.swing.JCheckBox chkB;
    private javax.swing.JCheckBox chkC;
    private javax.swing.JCheckBox chkD;
    private javax.swing.JCheckBox chkE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JRadioButton rdoBachillerato;
    private javax.swing.JRadioButton rdoEso;
    private javax.swing.JRadioButton rdoFp;
    private javax.swing.JRadioButton rdoHombre;
    private javax.swing.JRadioButton rdoMujer;
    private javax.swing.JRadioButton rdoNinguna;
    private javax.swing.JRadioButton rdoOtra;
    private javax.swing.JRadioButton rdoUniversitaria;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOtraTitulacion;
    // End of variables declaration//GEN-END:variables
}