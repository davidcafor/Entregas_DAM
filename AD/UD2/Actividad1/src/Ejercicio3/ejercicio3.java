/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Preténdese realizar un listado das ventas dun cliente. O programa recibe dous argumentos dende a
 * liña de comandos , o primeiro indica a base de datos da que se consultarán as ventas e o segundo o
 * identificador do cliente cuxas ventas vanse consultar. O programa debe visualizar a seguinte
 * información:
 * @author davidcf
 */
public class ejercicio3 {
    public static void main(String[] args) {
        
        String url = null;
        
        //COMPROBACION ARGUMENTOS
        if(args.length<2){
            System.out.println("Faltan argumentos");
            return;
        }
        
        //DEFINICION DE URL EN BASE AL ARGUMENTO RECIBIDO
        if(Integer.parseInt(args[0])==1){
            url = "jdbc:mysql://192.168.56.103:3306/unidade2?user=usuario&password=abc123.";
        }else if(Integer.parseInt(args[0])==2){
            url = "jdbc:sqlite://c:\\users\\davidcf\\Desktop\\unidade2.db";
        }
        
        //CONECTAMOS A LA BASE DE DATOS Y MOSTRAMOS POR PANTALLA EL RESULTADO
        Conexion.ConectarBD(url);
        if(Conexion.getCon()!=null){
            System.out.println("Conexion establecida");
        }else{
            System.out.println("Error de conexion");
            return;
        }
        
        //CONSULTAS
        infoTabla(args);
        
    }
    
    /**
     * Metodo que realiza una consulta para obtener la información de todas las ventas 
     * realizadas por un cliente cuyo ID pasamos por argumentos.
     * @param args 
     */
    public static void infoTabla(String args[]){
        
        try (Statement st = Conexion.getCon().createStatement()){
            
            String consulta = "SELECT * FROM VENTAS INNER JOIN CLIENTES ON CLIENTES.ID INNER JOIN PRODUCTOS ON PRODUCTOS.ID = VENTAS.IDPRODUCTO = VENTAS.IDCLIENTE where CLIENTES.ID = " + args[1] + " ORDER BY IDVENTA";
            ResultSet rs = st.executeQuery(consulta);

            
            double importe, importeTotal = 0;
            int numVentas=0;
            boolean cliente = false;
            
            while(rs.next()){
                if(!cliente){
                    System.out.println("Ventas do cliente: " + rs.getString(7));
                    cliente = true;
                }
                
                importe = rs.getInt(5)*rs.getDouble(16);
                System.out.println("Venta: " + rs.getInt(1) + " Data venta: " + rs.getDate(2) + " Producto: " + rs.getString(13) + " Cantidade: " + rs.getInt(5) + " PVP: " + rs.getDouble(16) + " Importe: " + importe);
                numVentas++;
                importeTotal += importe;
            }
            
            System.out.println("Numero total de ventas: " + numVentas + "\nImporte total: " + importeTotal);
                       
            
        } catch (SQLException ex) {
            Logger.getLogger(ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }
}
