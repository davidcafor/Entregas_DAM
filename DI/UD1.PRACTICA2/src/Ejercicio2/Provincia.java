/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Definicion clase Provincia
 * @author DAVIDCF
 */
public class Provincia {
    
    String nombre;
    List<String> localidades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.localidades = new ArrayList<>(); //crea lista vacia
    }
    
    public Provincia(String nombre, List<String> localidades) {
        this.nombre = nombre;
        this.localidades = localidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<String> localidades) {
        this.localidades = localidades;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
