/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteException;

/**
 * Fai un programa Java que encha as táboas
 * PRODUTOS e CLIENTES (os datos a insertar defínense no propio programa). O programa Java
 * recibe un argumento ao executalo dende a liña de comandos cxo valor é 1 ou 2. Se o valor é 1 debes
 * encher as táboas da base de daos de MySQL e se é 2 debes enchelas na base de datos de SQLite
 * @author davidcf
 */
public class ejercicio1 {

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
        if (Conexion.getCon() != null) {
            System.out.println("Conexion establecida");
        } else {
            System.out.println("Error de conexion");
        }

        //INTRODUCCION DE DATOS
        generarDatosClientes();
        generarDatosProductos();

    }

    /**
     * Metodo que genera los datos de los clientes a partir de unos arrays.
     * Realiza la consulta INSERT a la BD
     */
    public static void generarDatosClientes() {

        String[] nome = {"Pepe", "Manolo", "Roberto"};
        String[] enderezo = {"Calle Real, 14", "Calle Gomera, 53", "Avda Galicia, 4"};
        String[] poboacion = {"As Pontes", "Viveiro", "Pontecesures"};
        String[] telefono = {"111111111", "222222222", "333333333"};
        String[] nif = {"11111111A", "22222222B", "33333333C"};

        for (int i = 0; i < nome.length; i++) {

            String consulta = "INSERT INTO CLIENTES VALUES (?,?,?,?,?,?)";

            try ( PreparedStatement st = Conexion.getCon().prepareStatement(consulta)) {

                st.setInt(1, i);
                st.setString(2, nome[i]);
                st.setString(3, enderezo[i]);
                st.setString(4, poboacion[i]);
                st.setString(5, telefono[i]);
                st.setString(6, nif[i]);

                st.executeUpdate();

            } catch (SQLIntegrityConstraintViolationException | SQLiteException e) {
                System.out.println("Error de clave duplicada");
            }catch (SQLException ex) {
                Logger.getLogger(ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    /**
     * Metodo que genera los datos de los productos a partir de unos arrays.
     * Realiza la consulta INSERT a la BD
     */
    public static void generarDatosProductos() {

        String[] descripcion = {"Mando inalámbrico Xbox SE", "Mineral Camo Special Edition", "Xbox Elite Series 2 (blanco)"};
        int[] stockactual = {32, 63, 11};
        int[] stockminimo = {10, 10, 10};
        double[] pvp = {64, 99, 64, 99, 129, 99};

        for (int i = 0; i < descripcion.length; i++) {

            String consulta = "INSERT INTO PRODUCTOS VALUES (?,?,?,?,?)";

            try ( PreparedStatement st = Conexion.getCon().prepareStatement(consulta)) {

                st.setInt(1, i);
                st.setString(2, descripcion[i]);
                st.setInt(3, stockactual[i]);
                st.setInt(4, stockminimo[i]);
                st.setDouble(5, pvp[i]);

                st.executeUpdate();

            } catch (SQLIntegrityConstraintViolationException | SQLiteException e) {
                System.out.println("Error de clave duplicada");
            } catch (SQLException ex) {
                Logger.getLogger(ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
