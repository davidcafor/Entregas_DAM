/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio1;

import com.mysql.cj.result.LocalDateTimeValueFactory;
import java.awt.Window;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;

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

        //CONECTAR BASE DATOS
        Conexion.conectarBD();
        if (Conexion.getCon() != null) {
            System.out.println("Conexión establecida");
        } else {
            System.out.println("Fallo en la conexion");
        }

        //Asigno el modelo creado a mano en la tabla al DefaultTableModel y llamo al metodo CARGARTABLA
        modeloTabla = (DefaultTableModel) tblFiestas.getModel();
        cargarTabla();

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
        tblFiestas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGestion = new javax.swing.JMenu();
        menuFiestas = new javax.swing.JMenu();
        menuFiestasAlta = new javax.swing.JMenuItem();
        menuFiestasBaja = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        menuClientesAlta = new javax.swing.JMenuItem();
        menuClientesBaja = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UD1.PRACTICA10");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        tblFiestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Fiesta", "Fecha", "Sala", "Cliente", "Num. Invitados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFiestas);

        getContentPane().add(jScrollPane1);

        menuGestion.setText("Gestion");

        menuFiestas.setText("Fiestas");

        menuFiestasAlta.setText("Alta");
        menuFiestasAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFiestasAltaActionPerformed(evt);
            }
        });
        menuFiestas.add(menuFiestasAlta);

        menuFiestasBaja.setText("Baja");
        menuFiestasBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFiestasBajaActionPerformed(evt);
            }
        });
        menuFiestas.add(menuFiestasBaja);

        menuGestion.add(menuFiestas);

        menuClientes.setText("Clientes");

        menuClientesAlta.setText("Alta");
        menuClientesAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesAltaActionPerformed(evt);
            }
        });
        menuClientes.add(menuClientesAlta);

        menuClientesBaja.setText("Baja");
        menuClientesBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesBajaActionPerformed(evt);
            }
        });
        menuClientes.add(menuClientesBaja);

        menuGestion.add(menuClientes);

        jMenuBar1.add(menuGestion);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1040, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesBajaActionPerformed
        // Limito la creacion de 1 ventana a la vez de este tipo
        if (contadorBajaCliente < 1) {
            BajaCliente ventanaBajaCliente = new BajaCliente(this, false);
            ventanaBajaCliente.setVisible(true);
            listaVentanas.add(ventanaBajaCliente);
            contadorBajaCliente++;
        }
    }//GEN-LAST:event_menuClientesBajaActionPerformed

    private void menuFiestasAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFiestasAltaActionPerformed
        // Limito la creacion de 1 ventana a la vez de este tipo
        if (contadorNuevoFiesta < 1) {
            NuevaFiesta ventanaNuevaFiesta = new NuevaFiesta(this, false);
            ventanaNuevaFiesta.setVisible(true);
            listaVentanas.add(ventanaNuevaFiesta);
            contadorNuevoFiesta++;
        }
    }//GEN-LAST:event_menuFiestasAltaActionPerformed

    private void menuClientesAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesAltaActionPerformed
        // Aqui no limito, porque de esta puede haber varias
        NuevoCliente ventanaNuevoCliente = new NuevoCliente(this, false);
        ventanaNuevoCliente.setVisible(true);
        listaVentanas.add(ventanaNuevoCliente);
    }//GEN-LAST:event_menuClientesAltaActionPerformed

    private void menuFiestasBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFiestasBajaActionPerformed
        // Limito la creacion de 1 ventana a la vez de este tipo
        if(contadorBajaFiesta<1){
            BajaFiesta VentanaBajaFiesta = new BajaFiesta(this, false);
            VentanaBajaFiesta.setVisible(true);
            listaVentanas.add(VentanaBajaFiesta);
            contadorBajaFiesta++;
        }
    }//GEN-LAST:event_menuFiestasBajaActionPerformed

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

    //Creamos un objeto de la clase DefaultTableModel al que aplicaremos el modelo creado a mano en el InitComponents
    private DefaultTableModel modeloTabla = new DefaultTableModel();

    
    //Metodo para cargar la tabla con los datos de una consulta a la BD
    public void cargarTabla() {

        //SENTENCIA
        Statement sentencia;

        try {

            modeloTabla.setRowCount(0);

            sentencia = Conexion.getCon().createStatement();
            String consulta = "SELECT * FROM CLIENTES INNER JOIN RESERVAS ON CLIENTES.dniCliente = RESERVAS.dniCliente ORDER BY codReserva";
            ResultSet rs = sentencia.executeQuery(consulta);
            while (rs.next()) {
                Cliente c = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                LocalDate date = LocalDate.parse(rs.getString(7));
                Reserva r = new Reserva(rs.getInt(6), date, rs.getInt(8), rs.getInt(9), rs.getString(10), c);

                //añadimos a tabla
                int numFilas = modeloTabla.getRowCount();
                modeloTabla.setRowCount(numFilas + 1);
                modeloTabla.setValueAt(r.codReserva, numFilas, 0);
                modeloTabla.setValueAt(r.fecha, modeloTabla.getRowCount() - 1, 1);
                modeloTabla.setValueAt((r.sala == 1 ? "AMARILLA" : "VIOLETA"), modeloTabla.getRowCount() - 1, 2);
                modeloTabla.setValueAt(r.c.toStringSoloNombreApel(), modeloTabla.getRowCount() - 1, 3);
                modeloTabla.setValueAt(r.invitados, modeloTabla.getRowCount() - 1, 4);
            }

        } catch (SQLException e) {
            System.out.println("Error Cargando Reservas SQL: " + e);
        } catch (Exception e) {
            System.out.println("Error Cargando Reservas Principal: " + e);
        }

    }

    //Contadores necesarios para limitar las ventanas
    int contadorBajaCliente = 0;
    int contadorNuevoFiesta = 0;
    int contadorBajaFiesta = 0;

    public void actualizarCombosAltaFiestaBajaCliente(){
        for (JDialog v : listaVentanas) {
            if(v instanceof NuevaFiesta){
                ((NuevaFiesta)v).cargarComboClientes();
            }else if(v instanceof BajaCliente){
                ((BajaCliente)v).cargarComboClientes();
            }
        }
    }
    
    List<JDialog> listaVentanas = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem menuClientesAlta;
    private javax.swing.JMenuItem menuClientesBaja;
    private javax.swing.JMenu menuFiestas;
    private javax.swing.JMenuItem menuFiestasAlta;
    private javax.swing.JMenuItem menuFiestasBaja;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JTable tblFiestas;
    // End of variables declaration//GEN-END:variables
}
