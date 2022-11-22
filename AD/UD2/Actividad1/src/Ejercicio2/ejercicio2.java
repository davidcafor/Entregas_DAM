/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Partindo das táboas anteriores, realiza un programa Java para insertar ventas na táboa VENTAS. O
 * programa recibe varios parámetros dende a liña de comandos:
 * Unha vez insertada a fila na táboa visualizar unha mensaxe indicándoo. Se non se poido realizar a
 * nserción visualizar o motivo (non existe o cliente, non existe o produto, cantidade menor ou igual a
 * 0, …).
 * Executa o programa e inserta varias ventas nas distintas bases de datos.
 * @author davidcf
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        
        String url = null;

        //COMPROBACION DE ARGUMENTOS
        if (args.length < 5) {
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
        if (Ejercicio2.Conexion.getCon() != null) {
            System.out.println("Conexion establecida");
        } else {
            System.out.println("Error de conexion");
        }
        
        //COMPROBACIONES
        comprobaciones(args);

    }
    
    /**
     * Metodo que comprueba uno a uno las restricciones solicitadas
     * mediante consultas. Si todo esta OK lanza el metodo que genera la consulta.
     * @param args 
     */
    public static void comprobaciones(String[] args){
        
        boolean comprobacionesOK = true;
        
        //O identificador de venta non debe existir na táboa VENTAS
        
        try (Statement st = Conexion.getCon().createStatement()){
            
            String consulta = "SELECT * FROM VENTAS WHERE IDVENTA = " + args[1];
            
            ResultSet rs = st.executeQuery(consulta);
            
            if(rs.next()){
                System.out.println("El ID de venta ya existe en la tabla Ventas");
                comprobacionesOK = false;
                
            }
            
        } catch (Exception e) {
            System.out.println("Error ID Ventas: " + e);
        }
        
        //O identificador de cliente debe existir na táboa CLIENTES
        
        try (Statement st = Conexion.getCon().createStatement()){
            
            String consulta = "SELECT * FROM CLIENTES WHERE ID = " + args[2];
            ResultSet rs = st.executeQuery(consulta);
            
            if(!rs.next()){
                System.out.println("El ID de cliente no existe en la tabla Clientes");
                comprobacionesOK = false;
            }
            
        } catch (Exception e) {
            System.out.println("Error ID Clientes: "+ e);
        }
        
        //O identificador de produto debe existir na táboa PRODUTOS
        
        try (Statement st = Conexion.getCon().createStatement()){
            
            String consulta = "SELECT * FROM PRODUCTOS WHERE ID = " + args[3];
            ResultSet rs = st.executeQuery(consulta);
            
            if(!rs.next()){
                System.out.println("El ID de producto no existe en la tabla Producto");
                comprobacionesOK = false;
            }
            
        } catch (Exception e) {
            System.out.println("Error ID Producto: "+ e);
        }
        
        //A cantidade debe ser maior que 0
        
        if(Integer.parseInt(args[4])<=0){
            System.out.println("La cantidad debe ser mayor a 0");
            comprobacionesOK = false;
        }
        
        
        //LANZO CONSULTA
        if(comprobacionesOK){        
            if(Integer.parseInt(args[0])==1){
                consultaINSERT(args);
            }else if(Integer.parseInt(args[0])==2){
                consultaINSERTSQLITE(args);
            }
        }

    }
    
    /**
     * Metodo que realiza una venta en la BD de MySQL mediante los datos obtenidos
     * por argumentos.
     * @param args 
     */
    public static void consultaINSERT(String[] args){
                
        //Date fecha = new java.sql.Date(new java.util.Date().getTime());
        
        String consulta = "INSERT INTO VENTAS (IDVENTA, DATAVENTA, IDCLIENTE, IDPRODUCTO, CANTIDADE) VALUES (?,?,?,?,?)";  
                
        try (PreparedStatement st = Conexion.getCon().prepareStatement(consulta)){
            
            st.setInt(1, Integer.parseInt(args[1]));
            //st.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
            st.setDate(2, Date.valueOf(LocalDate.now()));
            st.setInt(3, Integer.parseInt(args[2]));
            st.setInt(4, Integer.parseInt(args[3]));
            st.setInt(5, Integer.parseInt(args[4]));
                      
            st.executeUpdate();

            System.out.println("Consulta ingresada correctamente");
            
        } catch (SQLException ex) {
            Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error INSERT: " + e);
        }
        
    }
    
    /**
     * Metodo que realiza una venta en la BD de SQLITE mediante los datos obtenidos
     * por argumentos.
     * @param args 
     */
    public static void consultaINSERTSQLITE(String[] args){
        
        try (Statement st = Conexion.getCon().createStatement()){
            
            String consulta = "INSERT INTO VENTAS (IDVENTA, DATAVENTA, IDCLIENTE, IDPRODUCTO, CANTIDADE) VALUES ( " + args[1] + ", " + Date.valueOf(LocalDate.now()) + ", " + args[2] + ", " +args[3] + ", " +args[4] + " )";
            
            st.executeUpdate(consulta);
            
            System.out.println("Consulta ingresada correctamente");
            
        } catch (SQLException ex) {
            Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
