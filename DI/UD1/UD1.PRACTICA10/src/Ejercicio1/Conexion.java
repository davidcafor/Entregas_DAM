/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidcf
 */
public class Conexion {
    
    public static Connection con;
    
    public static Connection conectarBD(){
        
        //CONEXION WINDOWS
        
        String url = "jdbc:mysql://192.168.56.101:3306/FIESTAS";
        String user = "usuario";
        String password = "Abc123..";
        
        //CONEXION MAC
        /*
        String url = "jdbc:mysql://localhost:3306/FIESTAS";
        String user = "root";
        String password = "";
        */
        try {
            
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            return con;
            
        } catch (SQLException ex) { 
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error en conexion: " + e);
        }
        return null;
    }
    
    public static Connection getCon(){
        return con;
    }
    
    public static void cerrarBD(){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
