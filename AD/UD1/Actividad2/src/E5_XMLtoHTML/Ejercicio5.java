
package E5_XMLtoHTML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Crea unha plantilla XML para dar unha representación ao
 * ficheiro xml de departamentos e realiza un programa Java
 * para transformalo.
 * @author davidcf
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        String hojaEstilo = "./files/departamentosPlantilla.xsl";
        String datosDept = "./files/departamentos.xml";
        File pagHTML = new File("./files/deptweb.html");
        
        try (FileOutputStream fos = new FileOutputStream(pagHTML)){
            
            Source estilos = new StreamSource(hojaEstilo);
            Source datos = new StreamSource(datosDept);
            Result result = new StreamResult(fos);
            
            Transformer transformer = TransformerFactory.newInstance().newTransformer(estilos);
            
            transformer.transform(datos, result);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
}
