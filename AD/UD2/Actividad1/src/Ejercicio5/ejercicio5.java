/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Preténdese realizar a consulta dos datos dun produto. Pedirase ao usuario o identificador do produto
 * e amosaranse os seus datos. Se o stock actual está por debaixo do stock mínimo emitirase unha
 * mensaxe indicándoo.
 * @author david
 */
public class ejercicio5 {
    public static void main(String[] args) {
        
        String url = null;

        //COMPROBACION DE ARGUMENTOS
        if (args.length < 1) {
            System.out.println("Faltan argumentos");
            return;
        }

        //DEFINICION DE URL EN BASE AL ARGUMENTO RECIBIDO
        if (Integer.parseInt(args[0]) == 1) {
            url = "jdbc:mysql://192.168.56.103:3306/unidade2?user=usuario&password=abc123.";
        } else if (Integer.parseInt(args[0]) == 2) {
            url = "jdbc:sqlite://c:\\users\\davidcf\\Desktop\\unidade2.db";
        }

        //CONECTAMOS A LA BASE DE DATOS Y MOSTRAMOS POR PANTALLA EL RESULTADO
        Conexion.ConectarBD(url);
        if (Ejercicio5.Conexion.getCon() != null) {
            System.out.println("Conexion establecida");
        } else {
            System.out.println("Error de conexion");
        }

        //CONSULTA
        consultaStockProducto(Integer.parseInt(args[1]));
        
        
    }
    
    /**
     * Metodo que lanza una consulta a la BD para obtener los datos del producto
     * cuyo ID pasamos por argumento.
     * @param idProducto 
     */
    public static void consultaStockProducto(int idProducto){
        
        String consulta = "SELECT ID, DESCRIPCION, STOCKACTUAL, STOCKMINIMO, PVP FROM PRODUCTOS WHERE ID = ?";
        
        try (PreparedStatement stm = Conexion.getCon().prepareStatement(consulta)){
            
            stm.setInt(1, idProducto);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                System.out.println("ID: " + rs.getInt(1) + " DESCRIPCION: " + rs.getString(2) + " STOCKACTUAL: " + rs.getInt(3) + " STOCKMINIMO: " + rs.getInt(4) + " PVP: " + rs.getDouble(5));
                if(rs.getInt(3)<rs.getInt(4)){
                    System.out.println("El Stock actual está por debajo del mínimo.");
                }
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
