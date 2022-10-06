/*
Realiza un programa que permita eliminar un departamento.
O programa recibe dende a liña de comandos o número de departamento a eliminar.
Se o departamento non existe visualiza unha mensaxe indicándoo. Visualiza tamén
o número total de departamentos que existen no ficheiro.
 */
package a;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio3 {

    public static void main(String[] args) {

        //Declaración de fichero
        File fichero = new File("C:\\Users\\davidcf\\Desktop\\Departamento.dat");
        //Scanner necesario para leer de teclado
        Scanner sc = new Scanner(System.in);
        //Variables necesarias
        int contador = 0, idEliminar, id, pos = 0;
        int size = Integer.BYTES + 2 * (10 * Character.BYTES); //tamaño que ocupa una entrada en bytes (numDept, nombre, localidad)

        //Comprobacion de que el fichero existe, sino se crea.
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Abrimos el escritor de acceso aleatorio en modo RW
        try ( RandomAccessFile raf = new RandomAccessFile(fichero, "rw")) {

            //Pedimos ID a eliminar
            System.out.println("Indica el id a eliminar");
            idEliminar = sc.nextInt();

            //Ponemos el puntero una posición antes del ID a eliminar
            raf.seek(size * (idEliminar - 1));

            //Si el puntero está fuera del tamaño total del archivo, el ID no existe
            if (fichero.length() < raf.getFilePointer()) {
                System.out.println("ID a eliminar no existe");
            } else {

                //Leo el ID en esa posición
                id = raf.readInt();

                //Si el ID = 0, esa posición no va tener datos para eliminar
                if (id == 0) {
                    System.out.println("El ID no existe");
                } else {
                    //Si el ID existe y es el correcto, muevo el puntero a la posicion anterior al ID para sobreescribir
                    raf.seek(raf.getFilePointer() - Integer.BYTES);

                    //Si el ID es -1 es que ya está eliminado, no dejo que se elimine de nuevo
                    if (id < 0) {
                        System.out.println("El departamento ya se ha elminado");
                    } else {
                        //Si llega hasta aqui, todo está bien y elimina el registro.
                        raf.writeInt(-1);
                    }
                }

            }

            //GENERAR UN CONTADOR DE REGISTROS VALIDOS
            //Pongo la agua al comienzo
            raf.seek(0);

            //Mientras que la aguja este dentro del fichero
            while (fichero.length() > raf.getFilePointer()) {

                //Lee el ID y lo almacena
                id = raf.readInt();

                //Si el ID es mayor a 0 (tiene datos) = incrementa un valor del contador
                if (id > 0) {
                    contador++;
                }

                //Como solo leo los ID's .. muevo la aguja para saltarme los 2 Strings.
                raf.seek((2 * (10 * Character.BYTES)) + raf.getFilePointer());
            }

            //PRINT del contador
            System.out.println("Numero de departamentos: " + contador);

            //Metodo lectura del fichero para comprobación
            //leerFicheroAleatorio(fichero);
        } catch (InputMismatchException e) {
            System.out.println("El ID debe ser numérico");
        } catch (IOException ex) {
            Logger.getLogger(ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    /**
     * Metodo de comprobación para visualizar si se ha borrado correctamente.
     *
     * @param fichero
     */
    public static void leerFicheroAleatorio(File fichero) {

        //Declaracion variables
        int dept, pos = 0;
        char[] nombre = new char[10];
        char[] localidad = new char[10];
        String nom, loc;

        //Abrimos lector de acceso aleatorio, modo Read.
        try ( RandomAccessFile raf = new RandomAccessFile(fichero, "r")) {

            while (true) {
                //Posicion lectura a 0
                raf.seek(pos);
                //Leemos datos a variables
                dept = raf.readInt();
                for (int i = 0; i < nombre.length; i++) {
                    nombre[i] = raf.readChar();
                }
                nom = new String(nombre).trim();
                for (int i = 0; i < localidad.length; i++) {
                    localidad[i] = raf.readChar();
                }
                loc = new String(localidad).trim();

                //recolocacion aguja tras cada lectura
                pos += Integer.BYTES + 2 * (10 * Character.BYTES);

                //Print de los datos leidos
                System.out.println(dept + " - " + nom + " - " + loc);
            }

        } catch (EOFException e) {
            System.out.println("----------------");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
