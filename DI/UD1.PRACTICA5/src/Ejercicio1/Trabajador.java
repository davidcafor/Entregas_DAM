package Ejercicio1;

/**
 * Clase trabajador
 * @author davidcf
 */
public class Trabajador {
    
    String DNI;
    String nombre;
    String apellido1;
    String apellido2;
    String provincia;
    String profesion;

    public Trabajador(String DNI, String nombre, String apellido1, String apellido2, String provincia, String profesion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.provincia = provincia;
        this.profesion = profesion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    
    
    
    
}
