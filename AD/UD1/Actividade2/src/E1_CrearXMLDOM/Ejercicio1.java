package E1_CrearXMLDOM;

import java.io.EOFException;
import java.io.File;
import java.io.RandomAccessFile;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 * A partir dos datos do ficheiro Departamento.dat creado na
 * Actividade1_Entregar crea un ficheiro XML usando DOM.
 *
 * @author davidcf
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        File fichero = new File("./files/Departamento.dat");

        try {

            //Creamos unha instancia de DocumentBuilderFactory para construir o parser
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Creamos un documento vacío de nome document co nodo de nome Empregados e asignamos a versión do XML,
            //a interfaz DOMImplementation permite crear obxectos Document con nodo raíz
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Departamentos", null);
            document.setXmlVersion("1.0");

            //Vamos leyendo datos del archivo
            try ( RandomAccessFile raf = new RandomAccessFile(fichero, "r")) {

                int numDept;
                String nom, loc;
                char[] nombre = new char[10];
                char[] localidad = new char[10];

                for (int i = 0; i < fichero.length(); i++) {

                    numDept = raf.readInt();

                    if (numDept > 0) {
                        for (int j = 0; j < nombre.length; j++) {
                            nombre[j] = raf.readChar();
                        }

                        nom = new String(nombre).trim();

                        for (int j = 0; j < localidad.length; j++) {
                            localidad[j] = raf.readChar();
                        }

                        loc = new String(localidad).trim();

                        //Creamos o nodo departamento
                        Element raiz = document.createElement("departamento");
                        //Pegámolo á raíz do documento
                        document.getDocumentElement().appendChild(raiz);
                        //Engadimos numDept
                        creaElemento("numDept", String.valueOf(numDept), raiz, document);
                        //Engadimos nombre
                        creaElemento("nombre", nom, raiz, document);
                        //Engadimos localidad
                        creaElemento("localidad", loc, raiz, document);
                    }

                }

            } catch (EOFException ex) {
                System.out.println("Fin de lectura de fichero");
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

            //Creamos a fonte XML a partir do documento
            Source source = new DOMSource(document);
            //Creamos o resultado no ficheiro Departamento.xml
            Result result = new StreamResult("./files/Departamento.xml");
            //Obtemos un TransformerFactory
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            //Realizamos a transformación do documento a ficheiro
            transformer.transform(source, result);

            //Para mostrar o documento por pantalla podemos especificar como resultado o canal de saída System.out
            Result console = new StreamResult(System.out);
            transformer.transform(source, console);

        } catch (ParserConfigurationException | TransformerException | DOMException e) {
            System.out.println("Error: " + e);
        }

    }

    static void creaElemento(String datoDept, String datoValor, Element raiz, Document document) {
        //Engadimos datoCoche
        Element elem = document.createElement(datoDept);
        //Damos valor
        Text text = document.createTextNode(datoValor);
        //Pegamos o elemento fillo á raiz
        raiz.appendChild(elem);
        //Pegamos o valor
        elem.appendChild(text);

    }
}
