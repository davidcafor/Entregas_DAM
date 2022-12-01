/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ejercicio1;

import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author davidcf
 */
public class BajaFiesta extends javax.swing.JDialog {

    /**
     * Creates new form BajaFiesta
     */
    public BajaFiesta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmbFiestas = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar fiesta");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setText("Fiestas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 40, 50, 17);

        getContentPane().add(cmbFiestas);
        cmbFiestas.setBounds(100, 40, 380, 23);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(500, 40, 90, 23);

        setSize(new java.awt.Dimension(645, 144));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Cuando se cierra la ventana reduzco en una unidad el contador de la ventana (solo puede haber 1 activa)
        ((FrmPPal)getOwner()).contadorBajaFiesta--;
        ((FrmPPal)getOwner()).listaVentanas.remove(this);
    }//GEN-LAST:event_formWindowClosing

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        // COMPRUEBO QUE HAYA ELEMENTOS SELECCIONADOS EN EL COMBO Y DE SER ASÍ LANZO UNA CONSULTA A LA BD PARA ELIMINAR LA RESERVA SELECCIONADA
        
        if(cmbFiestas.getSelectedItem()!=null){     
            
            Reserva r = (Reserva) cmbFiestas.getSelectedItem();
            
            try (Statement sentencia = Conexion.getCon().createStatement()){
                
                String consulta = "DELETE FROM RESERVAS WHERE codReserva = " + r.codReserva;
                sentencia.executeUpdate(consulta);
                
                cargarCombo();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(BajaFiesta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Debes seleccionar una Reserva a eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(BajaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BajaFiesta dialog = new BajaFiesta(new javax.swing.JFrame(), true);
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
    
    //METODO PARA CARGAR EL COMBO DE RESERVAS EN BASE A UNA CONSULTA A LA BD.
    private void cargarCombo(){
        
        cmbFiestas.removeAllItems();
        
        try {
            
            Statement st = Conexion.getCon().createStatement();
            String consulta = "SELECT * FROM RESERVAS INNER JOIN CLIENTES WHERE RESERVAS.dniCliente = CLIENTES.dniCliente";
            ResultSet rs = st.executeQuery(consulta);
            while(rs.next()){
                Cliente c = new Cliente(rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                LocalDate date = LocalDate.parse(rs.getString(2));
                //Reserva r = new Reserva(date, rs.getInt(3), rs.getInt(4), rs.getString(5), c);
                Reserva r = new Reserva(rs.getInt(1), date, rs.getInt(3), rs.getInt(4), rs.getString(5), c);
                cmbFiestas.addItem(r);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BajaFiesta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            
            //SI LA CONSULTA VA BIEN, RECARGO LA TABLA EN EL FINALLY
            
            ((FrmPPal)getOwner()).cargarTabla();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Reserva> cmbFiestas;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
