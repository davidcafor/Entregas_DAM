/*
Realiza programa que permita modificar os datos dun departamento.
O programa recibe dende a liña de comandos o número de departamento a modificar,
o novo nome do departamento e a nova localidade. Se o departamento non existe
visualiza unha mensaxe indicándoo. Visualiza tamén os datos antigos do departamento
e os novos datos.
 */
package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio2 {

    public static void main(String[] args) {

        //Declaracion de fichero
        File fichero = new File("C:\\Users\\davidcf\\Desktop\\Departamento.dat");
        //Scanner necesario para leer de teclado
        Scanner sc = new Scanner(System.in);

        //Comprobación si el fichero existe, sino se crea
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Abrimos el escritor de acceso aleatorio en modo RW
        try ( RandomAccessFile raf = new RandomAccessFile(fichero, "rw")) {

            //Variables necesarias para lectura
            int id, idBuscar;
            String dept, loc, departamentoOld, localizacionOld;
            StringBuilder sb, sb2;
            char[] dptChar = new char[10];
            char[] locChar = new char[10];
            int size = Integer.BYTES + 2 * (10 * Character.BYTES); //tamaño que ocupa una entrada en bytes (numDept, nombre, localidad)

            System.out.println("Indica el ID del departamento a modificar");
            idBuscar = sc.nextInt();

            //posicionamos aguja una posición antes del ID a buscar
            raf.seek(size * (idBuscar - 1));

            //si la aguja está fuera del fichero, Error.
            if (fichero.length() < raf.getFilePointer()) {
                System.out.println("El ID no existe");
            }

            //Leo el ID de la posición
            id = raf.readInt();

            //Si es mayor a 0 quiere decir que existe y procedo a leer y almacenar
            if (id > 0) {
                for (int i = 0; i < 10; i++) {
                    dptChar[i] = raf.readChar();
                }
                departamentoOld = new String(dptChar);

                for (int i = 0; i < 10; i++) {
                    locChar[i] = raf.readChar();
                }
                localizacionOld = new String(locChar);

                //Una vez leidos los campos actuales, muevo la aguja al primer string para sobreescribir
                raf.seek(raf.getFilePointer() - 2 * (10 * Character.BYTES));

                //Pedimos nuevos datos por teclado
                System.out.println("Indica el nuevo nombre");
                dept = sc.next();

                //Machaco nuevo dato
                sb = new StringBuilder(dept);
                sb.setLength(10);
                raf.writeChars(sb.toString());

                //Pedimos nuevos datos por teclado
                System.out.println("Indica la nueva localidad");
                loc = sc.next();

                //Machaco el nuevo dato
                sb2 = new StringBuilder(loc);
                sb2.setLength(10);
                raf.writeChars(sb2.toString());

                //Print por consola de los datos modificados (antiguos y nuevos)
                System.out.println("Registro modificado");
                System.out.println("Valores viejos: " + id + " - " + departamentoOld + " - " + localizacionOld);
                System.out.println("Valores nuevos: " + id + " - " + sb.toString().trim() + " - " + sb2.toString().trim());
            }else{
                System.out.println("El ID no existe");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) { 
            System.out.println("Error: " + ex);
        } catch (InputMismatchException ex) {
            System.out.println("Debes introducir un ID numérico");
        }
    }
}
