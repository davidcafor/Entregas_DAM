package E2_VisualizarXMLSAX;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * A partir do ficheiro XML xerado anteriormente
 * visualiza o seu contido utilizando SAX.
 * @author davidcf
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        try {
            
            XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
            //Instanciar objeto GestionContenido
            GestionContenido gestor = new GestionContenido();
            procesadorXML.setContentHandler(gestor);
            //Definir el fichero del que se van leer los datos
            InputSource fileXML = new InputSource("./files/Departamento.xml");
            //Parseamos
            procesadorXML.parse(fileXML);
            
        } catch (SAXException | IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
}
