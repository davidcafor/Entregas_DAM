/*
Realiza un programa que cree un ficheiro binario para gardar os datos
de departamentos, dalle o nome Departamento.dat. Introduce varios
departamentos. Os datos por cada departamento son: Número de
departamento: enteiro, Nome: String e Localidade: String.
*/

package a;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ejercicio1 {
    public static void main(String[] args) {
        
        //Declaracion de fichero
        File fichero = new File("C:\\Users\\davidcf\\Desktop\\Departamento.dat");
        
        //Si fichero no existe se crea
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Abrimos escritor de acceso aleatorio en modo RW
        try (RandomAccessFile raf = new RandomAccessFile(fichero, "rw")){
            
            //Declaración datos
            int[] numDept = {10, 20, 30};
            String[] nombre = {"RRHH", "INFORMATICA", "COMPRAS"};
            String[] localidad = {"A Coruna", "Lugo", "Ourense"};
            StringBuilder sb,sb2;
            int size = Integer.BYTES+2*(10*Character.BYTES); //tamaño que ocupa una entrada en bytes (numDept, nombre, localidad)
            
            
            //Bucle del tamaño de numDept para escribir a archivo
            for (int i = 0; i < numDept.length; i++) {
                raf.seek(size*(numDept[i]-1)); // posicionamos el puntero una posicion antes del ID
                raf.writeInt(numDept[i]);
                sb = new StringBuilder(nombre[i]);
                sb.setLength(10);
                raf.writeChars(sb.toString());
                sb2 = new StringBuilder(localidad[i]);
                sb2.setLength(10);
                raf.writeChars(sb2.toString());
            }
            
            //Metodo de prueba para ver que esta bien escrito
            //leerFicheroAleatorio(fichero);
            
        } catch (IOException ex) {
            Logger.getLogger(ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }        
    }
    
    /**
     * Metodo de comprobación para visualizar
     * si se ha escrito correctamente.
     * @param fichero 
     */
    
    public static void leerFicheroAleatorio(File fichero){
        
        //Declaracion variables
        int dept, pos=0;
        char[] nombre = new char[10];
        char[] localidad = new char[10];
        String nom, loc;
        
        //Abrimos lector de acceso aleatorio, modo Read.
        try (RandomAccessFile raf = new RandomAccessFile(fichero, "r")){
            
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
                pos+= Integer.BYTES + 2*(10*Character.BYTES);
                
                //Print de los datos leidos
                System.out.println(dept + " - " + nom + " - " + loc);
            }
        
        } catch (EOFException e){
            System.out.println("----------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
