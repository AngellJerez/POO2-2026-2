/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiantes
 */
public class Cliente {
    
    private String nombre;
    private String numeroIdentificacion;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String numeroIdentificacion, int edad) {
        
        if(esMayorEdad(edad)==false){
            throw new IllegalArgumentException("El cliente debe ser mayo de 18 años");
        }
        
        if(numeroIdentificacionValido(numeroIdentificacion)== false){
            throw new IllegalArgumentException("El numero de identificacion es muy corto");
        }
        
        
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public boolean esMayorEdad(int edad){
        
        if(edad>18){
            return true;
        }else {
            return false;
        }
        
    }
    
    
    public boolean numeroIdentificacionValido(String numeroIdentificacion){
        
        if(numeroIdentificacion != null && numeroIdentificacion.length()>=4){
            return true;
        } else {
            return false;
        }
        
    }
    
    
}
