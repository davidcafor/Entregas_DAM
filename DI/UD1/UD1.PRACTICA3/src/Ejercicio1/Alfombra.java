/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 * Clase definicion Alfombra
 * @author davidcf
 */
public class Alfombra {
    
    String modelo;
    String cor;
    int ancho;
    int alto;

    public Alfombra(String modelo, String cor, int ancho, int alto) {
        this.modelo = modelo;
        this.cor = cor;
        this.ancho = ancho;
        this.alto = alto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "MODELO: " + modelo + " - COR: " + cor;
    }
    
    
}
