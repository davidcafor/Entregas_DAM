
/**
 * Clase Trabajador
 * @author davidcf
 */
public class Trabajador {
    
    String nombre;
    String apellido;
    String localidad;
    String cargo;

    public Trabajador(String nombre, String apellido, String localidad, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return cargo.toUpperCase() + ": " + nombre + " " + apellido;
    }
    
    
    
    
}
