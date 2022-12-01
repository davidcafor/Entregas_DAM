package Vista;
import Controlador.Conexion;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author davidcf
 */
public class FrmPPal extends javax.swing.JFrame {

    //Referencia al lugar donde estan los informes
    private String directorioInformes;

    /**
     * Creates new form FrmPPal
     */
    public FrmPPal() {
        initComponents();
        directorioInformes = ".\\src\\Informes";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEJ1 = new javax.swing.JButton();
        btnEJ2 = new javax.swing.JButton();
        btnEJ3 = new javax.swing.JButton();
        btnEJ4 = new javax.swing.JButton();
        btnEJ5 = new javax.swing.JButton();
        btnEJ6 = new javax.swing.JButton();
        btnEJ7 = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        minEdad = new javax.swing.JTextField();
        maxEdad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInicial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UD3.PRACTICA1_DAVID_CARDENA");
        setResizable(false);
        getContentPane().setLayout(null);

        btnEJ1.setText("EJERCICIO 1");
        btnEJ1.setMinimumSize(new java.awt.Dimension(75, 22));
        btnEJ1.setPreferredSize(new java.awt.Dimension(75, 22));
        btnEJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEJ1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEJ1);
        btnEJ1.setBounds(10, 20, 158, 60);

        btnEJ2.setText("EJERCICIO 2");
        btnEJ2.setMaximumSize(new java.awt.Dimension(75, 22));
        btnEJ2.setMinimumSize(new java.awt.Dimension(75, 22));
        btnEJ2.setPreferredSize(new java.awt.Dimension(75, 22));
        btnEJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEJ2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEJ2);
        btnEJ2.setBounds(190, 20, 158, 60);

        btnEJ3.setText("EJERCICIO 3");
        btnEJ3.setMaximumSize(new java.awt.Dimension(75, 22));
        btnEJ3.setMinimumSize(new java.awt.Dimension(75, 22));
        btnEJ3.setPreferredSize(new java.awt.Dimension(75, 22));
        btnEJ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEJ3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEJ3);
        btnEJ3.setBounds(370, 20, 158, 60);

        btnEJ4.setText("EJERCICIO 4");
        btnEJ4.setMaximumSize(new java.awt.Dimension(75, 22));
        btnEJ4.setMinimumSize(new java.awt.Dimension(75, 22));
        btnEJ4.setPreferredSize(new java.awt.Dimension(75, 22));
        btnEJ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEJ4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEJ4);
        btnEJ4.setBounds(340, 130, 158, 30);

        btnEJ5.setText("EJERCICIO 5");
        btnEJ5.setMaximumSize(new java.awt.Dimension(75, 22));
        btnEJ5.setMinimumSize(new java.awt.Dimension(75, 22));
        btnEJ5.setPreferredSize(new java.awt.Dimension(75, 22));
        btnEJ5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEJ5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEJ5);
        btnEJ5.setBounds(380, 210, 110, 30);

        btnEJ6.setText("EJERCICIO 6");
        btnEJ6.setMaximumSize(new java.awt.Dimension(75, 22));
        btnEJ6.setMinimumSize(new java.awt.Dimension(75, 22));
        btnEJ6.setPreferredSize(new java.awt.Dimension(75, 22));
        btnEJ6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEJ6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEJ6);
        btnEJ6.setBounds(320, 290, 158, 30);

        btnEJ7.setText("EJERCICIO 7");
        btnEJ7.setMaximumSize(new java.awt.Dimension(75, 22));
        btnEJ7.setMinimumSize(new java.awt.Dimension(75, 22));
        btnEJ7.setPreferredSize(new java.awt.Dimension(75, 22));
        btnEJ7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEJ7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEJ7);
        btnEJ7.setBounds(190, 370, 158, 50);
        getContentPane().add(txtDNI);
        txtDNI.setBounds(120, 130, 180, 30);
        getContentPane().add(minEdad);
        minEdad.setBounds(120, 210, 64, 30);
        getContentPane().add(maxEdad);
        maxEdad.setBounds(270, 210, 64, 30);

        jLabel1.setText("DNI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 140, 37, 16);

        jLabel2.setText("Edad min");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 220, 60, 16);

        jLabel3.setText("Edad max");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 220, 60, 16);

        jLabel4.setText("Inicial Apellido a buscar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 300, 150, 16);
        getContentPane().add(txtInicial);
        txtInicial.setBounds(220, 290, 64, 30);

        setSize(new java.awt.Dimension(563, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEJ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEJ3ActionPerformed
        // TODO add your handling code here:
        String informeJRXML = directorioInformes.concat("\\Ejercicio3.jrxml");
        HashMap parametros = new HashMap();
        parametros.put("Encabezado", "David Cardeña Formoso");

        Conexion.conectarBD();
        if (Conexion.getCon() != null) {
            System.out.println("Conexion establecida...");
        } else {
            System.out.println("Error de conexion a BD");
            return;
        }

        try {
            //COMPILANDO INFORME
            System.out.println("Compilando..." + informeJRXML);
            JasperReport jasperReport = JasperCompileManager.compileReport(informeJRXML);

            //RELLENO DEL INFORME
            System.out.println("Rellenando...");
            JasperPrint impresion = JasperFillManager.fillReport(jasperReport, parametros, Conexion.getCon());
            System.out.println("Informe relleno!");

            //VISUALIZACION DEL INFORME
            int numPaginasInforme = impresion.getPages().size();

            if (numPaginasInforme == 0) {
                JOptionPane.showMessageDialog(this, "No hay registros que cumplan los criterios indicados");
            } else {
                JasperViewer.viewReport(impresion, false);
            }
        } catch (Exception e) {
            System.out.println("Error en ej3" + e);
        } finally {
            if (Conexion.getCon() != null) {
                Conexion.cerrarBD();
            }
        }
    }//GEN-LAST:event_btnEJ3ActionPerformed

    private void btnEJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEJ2ActionPerformed
        // TODO add your handling code here:
        String informeJRXML = directorioInformes.concat("\\Ejercicio2.jrxml");
        HashMap parametros = new HashMap();
        parametros.put("Encabezado", "David Cardeña Formoso");

        Conexion.conectarBD();
        if (Conexion.getCon() != null) {
            System.out.println("Conexion establecida...");
        } else {
            System.out.println("Error de conexion a BD");
            return;
        }

        try {
            //COMPILANDO INFORME
            System.out.println("Compilando..." + informeJRXML);
            JasperReport jasperReport = JasperCompileManager.compileReport(informeJRXML);

            //RELLENO DEL INFORME
            System.out.println("Rellenando...");
            JasperPrint impresion = JasperFillManager.fillReport(jasperReport, parametros, Conexion.getCon());
            System.out.println("Informe relleno!");

            //VISUALIZACION DEL INFORME
            int numPaginasInforme = impresion.getPages().size();

            if (numPaginasInforme == 0) {
                JOptionPane.showMessageDialog(this, "No hay registros que cumplan los criterios indicados");
            } else {
                JasperViewer.viewReport(impresion, false);
            }
        } catch (Exception e) {
            System.out.println("Error en ej2" + e);
        } finally {
            if (Conexion.getCon() != null) {
                Conexion.cerrarBD();
            }
        }

    }//GEN-LAST:event_btnEJ2ActionPerformed

    private void btnEJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEJ1ActionPerformed
        // TODO add your handling code here:

        String informeJRXML = directorioInformes.concat("\\Ejercicio1.jrxml");
        HashMap parametros = new HashMap();
        parametros.put("Encabezado", "David Cardena Formoso");

        Conexion.conectarBD();
        if (Conexion.getCon() != null) {
            System.out.println("Conexion establecida...");
        } else {
            System.out.println("Error de conexion a Base de datos");
            return;
        }

        try {

            //COMPILANDO INFORME
            System.out.println("Compilando..." + informeJRXML);
            JasperReport jasperReport = JasperCompileManager.compileReport(informeJRXML);

            //RELLENO DEL INFORME
            System.out.println("Rellenando...");
            JasperPrint impresion = JasperFillManager.fillReport(jasperReport, parametros, Conexion.getCon());
            System.out.println("Informe relleno!");

            //VISUALIZACION DEL INFORME
            int numPaginasInforme = impresion.getPages().size();

            if (numPaginasInforme == 0) {
                JOptionPane.showMessageDialog(this, "No hay registros que cumplan los criterios indicados");
            } else {
                JasperViewer.viewReport(impresion, false);
            }

        } catch (Exception e) {
            System.out.println("Error en ej1: " + e);
        } finally {
            if (Conexion.getCon() != null) {
                Conexion.cerrarBD();
            }
        }

    }//GEN-LAST:event_btnEJ1ActionPerformed

    private void btnEJ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEJ4ActionPerformed
        // TODO add your handling code here:
        if (txtDNI.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes introducir un DNI para filtrar");
        } else {
            String informeJRXML = directorioInformes.concat("\\Ejercicio4.jrxml");
            HashMap parametros = new HashMap();
            parametros.put("Encabezado", "David Cardena Formoso");
            parametros.put("Dni", txtDNI.getText().trim());

            Conexion.conectarBD();
            if (Conexion.getCon() != null) {
                System.out.println("Conexion establecida...");
            } else {
                System.out.println("Error de conexion a Base de datos");
                return;
            }

            try {

                //COMPILANDO INFORME
                System.out.println("Compilando..." + informeJRXML);
                JasperReport jasperReport = JasperCompileManager.compileReport(informeJRXML);

                //RELLENO DEL INFORME
                System.out.println("Rellenando...");
                JasperPrint impresion = JasperFillManager.fillReport(jasperReport, parametros, Conexion.getCon());
                System.out.println("Informe relleno!");

                //VISUALIZACION DEL INFORME
                int numPaginasInforme = impresion.getPages().size();

                if (numPaginasInforme == 0) {
                    JOptionPane.showMessageDialog(this, "No hay registros que cumplan los criterios indicados");
                } else {
                    JasperViewer.viewReport(impresion, false);
                }
                
                //LIMPIAR DATOS
                txtDNI.setText("");

            } catch (Exception e) {
                System.out.println("Error en ej4: " + e);
            } finally {
                if (Conexion.getCon() != null) {
                    Conexion.cerrarBD();
                }
            }
        }
    }//GEN-LAST:event_btnEJ4ActionPerformed

    private void btnEJ5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEJ5ActionPerformed
        // TODO add your handling code here:
        if (minEdad.getText().trim().isEmpty() || maxEdad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes introducir un rango de edad para filtrar");
        } else {
            String informeJRXML = directorioInformes.concat("\\Ejercicio5.jrxml");
            HashMap parametros = new HashMap();
            parametros.put("Encabezado", "David Cardena Formoso");
            parametros.put("minEdad", minEdad.getText().trim());
            parametros.put("maxEdad", maxEdad.getText().trim());

            Conexion.conectarBD();
            if (Conexion.getCon() != null) {
                System.out.println("Conexion establecida...");
            } else {
                System.out.println("Error de conexion a Base de datos");
                return;
            }

            try {

                //COMPILANDO INFORME
                System.out.println("Compilando..." + informeJRXML);
                JasperReport jasperReport = JasperCompileManager.compileReport(informeJRXML);

                //RELLENO DEL INFORME
                System.out.println("Rellenando...");
                JasperPrint impresion = JasperFillManager.fillReport(jasperReport, parametros, Conexion.getCon());
                System.out.println("Informe relleno!");

                //VISUALIZACION DEL INFORME
                int numPaginasInforme = impresion.getPages().size();

                if (numPaginasInforme == 0) {
                    JOptionPane.showMessageDialog(this, "No hay registros que cumplan los criterios indicados");
                } else {
                    JasperViewer.viewReport(impresion, false);
                }
                
                //LIMPIAR DATOS
                minEdad.setText("");
                maxEdad.setText("");

            } catch (Exception e) {
                System.out.println("Error en ej5: " + e);
            } finally {
                if (Conexion.getCon() != null) {
                    Conexion.cerrarBD();
                }
            }
        }
    }//GEN-LAST:event_btnEJ5ActionPerformed

    private void btnEJ6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEJ6ActionPerformed
        // TODO add your handling code here:
        if (txtInicial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes introducir un rango de edad para filtrar");
        } else {
            String informeJRXML = directorioInformes.concat("\\Ejercicio6.jrxml");
            HashMap parametros = new HashMap();
            parametros.put("Encabezado", "David Cardena Formoso");
            parametros.put("InicialBuscar", txtInicial.getText().trim());

            Conexion.conectarBD();
            if (Conexion.getCon() != null) {
                System.out.println("Conexion establecida...");
            } else {
                System.out.println("Error de conexion a Base de datos");
                return;
            }

            try {

                //COMPILANDO INFORME
                System.out.println("Compilando..." + informeJRXML);
                JasperReport jasperReport = JasperCompileManager.compileReport(informeJRXML);

                //RELLENO DEL INFORME
                System.out.println("Rellenando...");
                JasperPrint impresion = JasperFillManager.fillReport(jasperReport, parametros, Conexion.getCon());
                System.out.println("Informe relleno!");

                //VISUALIZACION DEL INFORME
                int numPaginasInforme = impresion.getPages().size();

                if (numPaginasInforme == 0) {
                    JOptionPane.showMessageDialog(this, "No hay registros que cumplan los criterios indicados");
                } else {
                    JasperViewer.viewReport(impresion, false);
                }
                
                txtInicial.setText("");

            } catch (Exception e) {
                System.out.println("Error en ej5: " + e);
            } finally {
                if (Conexion.getCon() != null) {
                    Conexion.cerrarBD();
                }
            }
        }
    }//GEN-LAST:event_btnEJ6ActionPerformed

    private void btnEJ7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEJ7ActionPerformed
        // TODO add your handling code here:

        try {

            String informeJRXML = directorioInformes.concat("\\Ejercicio7.jrxml");
            InputStream okResource = this.getClass().getResourceAsStream("../Imagenes/ok.png");
            InputStream koResource = this.getClass().getResourceAsStream("../Imagenes/ko.png");
            Image okImagen = ImageIO.read(okResource);
            Image koImagen = ImageIO.read(koResource);

            HashMap parametros = new HashMap();
            parametros.put("Encabezado", "David Cardeña Formoso");
            parametros.put("OK", okImagen);
            parametros.put("KO", koImagen);
            
            Conexion.conectarBD();
            if (Conexion.getCon() != null) {
                System.out.println("Conexion establecida...");
            } else {
                System.out.println("Error de conexion a Base de datos");
                return;
            }
            
            //COMPILANDO INFORME
            System.out.println("Compilando..." + informeJRXML);
            JasperReport jasperReport =  JasperCompileManager.compileReport(informeJRXML);
            System.out.println("Informe compilado...");
            
            //RELLENO DE INFORME
            System.out.println("Rellenando...");
            JasperPrint impresion = JasperFillManager.fillReport(jasperReport, parametros, Conexion.getCon());
            System.out.println("Informe relleno!");
            
            //VISUALIZACION DEL INFORME
                int numPaginasInforme = impresion.getPages().size();

                if (numPaginasInforme == 0) {
                    JOptionPane.showMessageDialog(this, "No hay registros que cumplan los criterios indicados");
                } else {
                    JasperViewer.viewReport(impresion, false);
                }
                

        } catch (IOException ex) {
            
            Logger.getLogger(FrmPPal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(FrmPPal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en Ej7 " + e);
        } finally {
            if(Conexion.getCon()!=null){
                Conexion.cerrarBD();
            }
        }

    }//GEN-LAST:event_btnEJ7ActionPerformed

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
    private javax.swing.JButton btnEJ1;
    private javax.swing.JButton btnEJ2;
    private javax.swing.JButton btnEJ3;
    private javax.swing.JButton btnEJ4;
    private javax.swing.JButton btnEJ5;
    private javax.swing.JButton btnEJ6;
    private javax.swing.JButton btnEJ7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField maxEdad;
    private javax.swing.JTextField minEdad;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtInicial;
    // End of variables declaration//GEN-END:variables
}