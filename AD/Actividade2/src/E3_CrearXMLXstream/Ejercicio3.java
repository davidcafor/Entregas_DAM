package E3_CrearXMLXstream;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A partir do ficheiro de obxectos Departamento crea un documento XML
 * utilizando a libraría XStream.
 *
 * @author davidcf
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        ListaDepartamentos listaDept = new ListaDepartamentos();

        //LEEMOS DATOS MEDIANTE ACCESO ALEATORIO Y AÑADIMOS OBJETOS A LISTA
        leerFicheroDat(listaDept);

        //ESCRIBIR LISTA A XML USANDO XSTREAM
        escribirXML(listaDept);
    }

    public static void leerFicheroDat(ListaDepartamentos listaDept) {

        File fichero = new File("./files/Departamento.dat");

        try ( RandomAccessFile raf = new RandomAccessFile(fichero, "r")) {
            
            int numDept;
            String nom, loc;
            char[] nombre = new char[10];
            char[] localidad = new char[10];

            while (raf.getFilePointer() < fichero.length()) {
                numDept = raf.readInt();

                if (numDept > 0) {

                    

                    for (int i = 0; i < nombre.length; i++) {
                        nombre[i] = raf.readChar();
                    }

                    nom = new String(nombre).trim();

                    for (int j = 0; j < localidad.length; j++) {
                        localidad[j] = raf.readChar();
                    }

                    loc = new String(localidad).trim();

                    Departamento d = new Departamento(numDept, nom, loc);
                    listaDept.addDepartamento(d);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void escribirXML(ListaDepartamentos listado) {

        try {

            XStream XStreamObject = new XStream();

            //cambiar nombre y etiquetas
            XStreamObject.alias("Departamentos", ListaDepartamentos.class);
            XStreamObject.alias("Departamento", Departamento.class);
            //eliminar etiqueta lista(atributo de la clase ListaPersonas)
            XStreamObject.addImplicitCollection(ListaDepartamentos.class, "listaDepartamentos");

            XStreamObject.toXML(listado, new FileOutputStream("./files/Departamentos.xml"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
