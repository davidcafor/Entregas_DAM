/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidcf
 */
public class Conexion {
    
    public static Connection con;
    
    public static Connection ConectarBD(String url){
        
        //String usuario = "usuario";
        //String password = "abc123.";
        
        try {
            
            con = DriverManager.getConnection(url);
            return con;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return null;
    }
    
    public static Connection getCon(){
        return con;
    }
    
    public static void CerrarConexion(){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
