
package E3_CrearXMLXstream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidcf
 */
public class ListaDepartamentos {
    
    private List<Departamento> listaDepartamentos = new ArrayList<>();
    
    //metodo para añadir departamentos
    public void addDepartamento(Departamento d){
        listaDepartamentos.add(d);
    }
    
    //metodo que devuelve lista de personas
    public List<Departamento> getListaDepartamentos(){
        return listaDepartamentos;
    }
    
    
}
