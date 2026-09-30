/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Docente
 */
public class Militar extends Persona {
    private String grado;
    private String unidadAsignada;
    private String estadoTrasElHecho; // estado tras el hecho

    public Militar() {
    }

    public Militar(String dni, String fullName, String birthday,String grado, String unidadAsignada, String estadoTrasElHecho) {
        super(dni,fullName,birthday);
        this.grado = grado;
        this.unidadAsignada = unidadAsignada;
        this.estadoTrasElHecho = estadoTrasElHecho;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getUnidadAsignada() {
        return unidadAsignada;
    }

    public void setUnidadAsignada(String unidadAsignada) {
        this.unidadAsignada = unidadAsignada;
    }

    public String getEstadoTrasElHecho() {
        return estadoTrasElHecho;
    }

    public void setEstadoTrasElHecho(String estadoTrasElHecho) {
        this.estadoTrasElHecho = estadoTrasElHecho;
    }
    
    
    
    
    
}
