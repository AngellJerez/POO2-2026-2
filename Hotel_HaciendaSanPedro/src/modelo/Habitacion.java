/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiantes
 */
public class Habitacion {
    
    private int numeroHabitacion; //PRIMARY
    private TipoHabitacion tipoHabitacion;  //SENCILLA, DOBLE, SUITE
    private double costo; //DEPENDE DEL TIPO
    private boolean esDisponible; 
    private int capacidad;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, TipoHabitacion tipoHabitacion, int costo, boolean esDisponible, int capacidad) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.costo = costo;
        this.esDisponible = esDisponible;
        this.capacidad = capacidad;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getEsDisponible() {
        return esDisponible;
    }

    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }

    @Override
    public String toString() {
        
        return "Habitacion #" + numeroHabitacion + 
               " [" + tipoHabitacion + 
               "] - Capacidad: " + capacidad + 
               " personas. - Costo: $" + costo + 
               " - Disponible: " + (esDisponible ? "Sí" : "No");
        
        
        
    }

    
    
    
    
    
    
}
