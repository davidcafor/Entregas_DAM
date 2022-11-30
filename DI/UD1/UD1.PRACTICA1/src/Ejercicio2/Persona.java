package Ejercicio2;

import Ejercicio1.*;
import java.util.List;

public class Persona {
    
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String sexo;
    private List<String> permiso;
    private String titulacion;

    
    //CONSTRUCTORES
    
    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, String sexo, List<String> permiso, String titulacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.permiso = permiso;
        this.titulacion = titulacion;
    }
    
    //GETTER & SETTER

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<String> getPermiso() {
        return permiso;
    }

    public void setPermiso(List<String> permiso) {
        this.permiso = permiso;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "DNI=" + dni + ", Nombre=" + nombre + " " + apellido1 + " " + apellido2 + ", Sexo=" + sexo + ", Permiso=" + permiso + ", Titulacion=" + titulacion;
    }
    
    
}
