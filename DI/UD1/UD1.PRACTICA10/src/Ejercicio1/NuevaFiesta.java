/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ejercicio1;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author davidcf
 */
public class NuevaFiesta extends javax.swing.JDialog {

    /**
     * Creates new form NuevaFiesta
     */
    public NuevaFiesta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarComboAnoMes();
        cargarComboDia(Integer.parseInt(cmbMes.getSelectedItem().toString()));
        cargarComboClientes();
        
        //Inicializo el spinner con limite a 15 por ser SALA AMARILLA
        SpinnerModel sm = new SpinnerNumberModel(1, 0, 15, 1); //default value,lower bound,upper bound,increment by
        spnComensales.setModel(sm);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuSalaAmarilla = new javax.swing.JMenuItem();
        menuSalaVioleta = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbDias = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbAno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnComensales = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        menuSalaAmarilla.setText("AMARILLA");
        menuSalaAmarilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalaAmarillaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuSalaAmarilla);

        menuSalaVioleta.setText("VIOLETA");
        menuSalaVioleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalaVioletaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuSalaVioleta);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva fiesta");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Fecha de celebración:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 130, 16);

        jLabel2.setText("Dia");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 20, 30, 16);

        jLabel3.setText("Mes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 20, 40, 16);

        getContentPane().add(cmbDias);
        cmbDias.setBounds(210, 20, 72, 22);

        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMes);
        cmbMes.setBounds(350, 20, 110, 22);

        jLabel4.setText("Año");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 20, 40, 16);

        getContentPane().add(cmbAno);
        cmbAno.setBounds(520, 20, 100, 22);

        jLabel5.setText("Sala");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 50, 16);

        lblSala.setText("AMARILLA");
        lblSala.setComponentPopupMenu(jPopupMenu1);
        getContentPane().add(lblSala);
        lblSala.setBounds(70, 70, 90, 20);

        jLabel7.setText("Comensales");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 70, 80, 16);

        spnComensales.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(spnComensales);
        spnComensales.setBounds(260, 70, 64, 22);

        jLabel8.setText("Cliente");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 70, 50, 16);

        getContentPane().add(cmbClientes);
        cmbClientes.setBounds(390, 70, 230, 22);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(200, 120, 80, 22);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(300, 120, 80, 22);

        setSize(new java.awt.Dimension(661, 202));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        // TODO add your handling code here:
        cmbDias.removeAllItems();
        cargarComboDia(Integer.parseInt(cmbMes.getSelectedItem().toString()));
    }//GEN-LAST:event_cmbMesActionPerformed

    private void menuSalaAmarillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalaAmarillaActionPerformed
        // TODO add your handling code here:
        lblSala.setText("AMARILLA");
        
        //Si se seleciona la sala AMARILLA se limita el spinner a 15 de máximo.
        SpinnerModel sm = new SpinnerNumberModel(1, 0, 15, 1); //default value,lower bound,upper bound,increment by
        spnComensales.setModel(sm);
    }//GEN-LAST:event_menuSalaAmarillaActionPerformed

    private void menuSalaVioletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalaVioletaActionPerformed
        // TODO add your handling code here:
        lblSala.setText("VIOLETA");
        
        //Si se selecciona la sala VIOLETA se limita el spinner a 30 de máximo
        SpinnerModel sm = new SpinnerNumberModel(1, 0, 30, 1); //default value,lower bound,upper bound,increment by
        spnComensales.setModel(sm);
    }//GEN-LAST:event_menuSalaVioletaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        //COMPROBACIONES
        
                
        //CREACION VARIABLES Y OBJETOS
        
        LocalDate date = LocalDate.of(Integer.parseInt(cmbAno.getSelectedItem().toString()), Integer.parseInt(cmbMes.getSelectedItem().toString()), Integer.parseInt(cmbDias.getSelectedItem().toString()));
        Cliente c = (Cliente) cmbClientes.getSelectedItem();                
        Reserva r = new Reserva(date, (lblSala.getText().equals("AMARILLA") ? 1 : 2), Integer.parseInt(spnComensales.getValue().toString()), c.dniCliente, c);
        
        //CONSULTA
        
        //Esta consulta comprueba si hay más de una reserva en la misma sala y misma fecha (EVITAR DUPLICADOS)
        Statement sentencia;
        try {
            
            sentencia = Conexion.getCon().createStatement();
            String consulta = "SELECT count(*) FROM RESERVAS WHERE sala = " + r.sala + " AND fecha = '" + r.fecha.toString() + "'";
            ResultSet rs = sentencia.executeQuery(consulta);
            rs.next(); //posiciona en la posicion del resultado
            
            if(rs.getInt(1) != 0){
                JOptionPane.showMessageDialog(this, "No puede haber 2 fiestas en la misma sala el mismo dia");
                return;
            } 
 
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error Nueva Fiesta: " + e);
        } catch (Exception e) {
            System.out.println("Error Nueva Fiesta General: " + e);
        }
        
        
        //Esta consulta ya es para insertar los datos recogidos del formulario a la BD
        Statement sentencia1;
        try {

            sentencia1 = Conexion.getCon().createStatement();
            String consulta1 = "INSERT INTO RESERVAS (fecha, sala, invitados, dniCliente) VALUES ('" + date.toString() + "', " + r.sala + ", " + r.invitados + ", '" + c.dniCliente + "')";           
            sentencia1.executeUpdate(consulta1);
            
            //Una vez insertado en la base de datos, cargamos de nuevo la tabla.
            ((FrmPPal)getOwner()).cargarTabla();
           
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error Nueva Fiesta: " + e);
        } catch (Exception e) {
            System.out.println("Error Nueva Fiesta General: " + e);
        }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ((FrmPPal)getOwner()).contadorNuevoFiesta--;
        ((FrmPPal)getOwner()).listaVentanas.remove(this);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ((FrmPPal)getOwner()).contadorNuevoFiesta--;
        ((FrmPPal)getOwner()).listaVentanas.remove(this);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(NuevaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevaFiesta dialog = new NuevaFiesta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    //Cargo el combo de meses y años, no tiene limitaciones
    private void cargarComboAnoMes() {
        for (int i = 2022; i < 2100; i++) {
            cmbAno.addItem(i);
        }
        for (int i = 1; i <= 12; i++) {
            cmbMes.addItem(i);
        }
    }

    //Cargo el combo de dias que depende de los meses de 30 o 31 y si el año es bisiesto en Feberero 28 o 29.
    private void cargarComboDia(int mes) {

        int fin = 0;

        switch (mes) {
            case 1,3,5,7,8,10,12 -> {
                fin = 31;
            }
            case 4,6,9,11 -> {
                fin = 30;
            }
            case 2 -> {
                if (Integer.parseInt(cmbAno.getSelectedItem().toString()) % 4 == 0) {
                    fin = 28;
                }else{
                    fin = 29;
                }
            }
        }

        for (int i = 1; i <= fin; i++) {
            cmbDias.addItem(i);
        }

    }
    
    //Metodo que carga el combo de los clientes a través de una consulta sentilla a BD
    public void cargarComboClientes() {

        Statement sentencia;

        try {

            cmbClientes.removeAllItems();

            sentencia = Conexion.getCon().createStatement();
            String consulta = "SELECT * FROM CLIENTES";
            ResultSet rs = sentencia.executeQuery(consulta);
            while (rs.next()) {
                Cliente c = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                cmbClientes.addItem(c);
            }

        } catch (SQLException e) {
            System.out.println("Error Baja Cliente: " + e);
        } catch (Exception e) {
            System.out.println("Error Baja Cliente: " + e);
        } 

    }
    
    JComboBox<Cliente> getCombo(){
        return cmbClientes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<Integer> cmbAno;
    private javax.swing.JComboBox<Cliente> cmbClientes;
    private javax.swing.JComboBox<Integer> cmbDias;
    private javax.swing.JComboBox<Integer> cmbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblSala;
    private javax.swing.JMenuItem menuSalaAmarilla;
    private javax.swing.JMenuItem menuSalaVioleta;
    private javax.swing.JSpinner spnComensales;
    // End of variables declaration//GEN-END:variables
}
