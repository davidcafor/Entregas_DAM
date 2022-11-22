
package E4_LecturaXMLXstream;

import E3_CrearXMLXstream.Departamento;
import E3_CrearXMLXstream.ListaDepartamentos;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.io.File;
import java.util.List;

/**
 * A partir do documento XML xerado anteriormente
 * realiza a lectura utilizando XStream.
 * @author davidcf
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        XStream XStreamObject = new XStream();
        
        XStreamObject.addPermission(AnyTypePermission.ANY);
        //cambiar nombre y etiquetas
        XStreamObject.alias("Departamentos", ListaDepartamentos.class);
        XStreamObject.alias("Departamento", Departamento.class);
        //eliminar etiqueta lista(atributo de la clase ListaPersonas)
        XStreamObject.addImplicitCollection(ListaDepartamentos.class, "listaDepartamentos");
        
        try {
            
            ListaDepartamentos listado = (ListaDepartamentos) XStreamObject.fromXML(new File("./files/Departamentos.xml"));           
            List<Departamento> listaDepartamento = listado.getListaDepartamentos();
            
            
            
            for (Departamento d : listaDepartamento) {
                System.out.println(d);
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
