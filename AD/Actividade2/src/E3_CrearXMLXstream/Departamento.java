
package E3_CrearXMLXstream;

/**
 *
 * @author davidcf
 */
public class Departamento {
    
    int numDept;
    String nombre;
    String localidad;

    public Departamento(int numDept, String nombre, String localidad) {
        this.numDept = numDept;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public int getNumDept() {
        return numDept;
    }

    public void setNumDept(int numDept) {
        this.numDept = numDept;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Departamento{" + "numDept=" + numDept + ", nombre=" + nombre + ", localidad=" + localidad + '}';
    }
    
    
    
}
