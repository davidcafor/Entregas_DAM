/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author davidcf
 */
public class Reserva {
    
    int codReserva;
    LocalDate fecha;
    int sala;
    int invitados;
    String dniCliente;
    Cliente c;

    public Reserva() {
    }

    public Reserva(int codReserva, LocalDate fecha, int sala, int invitados, String dniCliente) {
        this.codReserva = codReserva;
        this.fecha = fecha;
        this.sala = sala;
        this.invitados = invitados;
        this.dniCliente = dniCliente;
    }

    public Reserva(int codReserva, LocalDate fecha, int sala, int invitados, String dniCliente, Cliente c) {
        this.codReserva = codReserva;
        this.fecha = fecha;
        this.sala = sala;
        this.invitados = invitados;
        this.dniCliente = dniCliente;
        this.c = c;
    }

    public Reserva(LocalDate fecha, int sala, int invitados, String dniCliente, Cliente c) {
        this.fecha = fecha;
        this.sala = sala;
        this.invitados = invitados;
        this.dniCliente = dniCliente;
        this.c = c;
    }
    
    
    

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

        
    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    @Override    
    public String toString(){
        return fecha + " - " + c.nombre + " " + c.apellido1 + " " + c.apellido2 + " - SALA " + (sala == 1 ? "AMARILLA" : "VIOLETA"); 
    }
    
    public String toStringSoloID() {
        return String.valueOf(codReserva);
    }
    
    
    
}
