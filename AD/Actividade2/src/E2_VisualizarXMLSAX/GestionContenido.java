
package E2_VisualizarXMLSAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Clase que extiende DefaultHandler para personalizar
 * los campos del XML que queremos visualizar
 * @author davidcf
 */
public class GestionContenido extends DefaultHandler{
    
    public GestionContenido(){
        super();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String dept = new String(ch, start, length);
        //Eliminamos saltos de linea
        dept=dept.replaceAll("[\t\n]", "");
        System.out.println("\t" + dept);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("<" + localName + ">");
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("</" + localName + ">");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Fin de documento");
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Comienzo de documento\n");
    }
    
    
    
}
