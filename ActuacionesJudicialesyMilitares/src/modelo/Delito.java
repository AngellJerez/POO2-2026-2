/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Docente
 */
public class Delito {
    private String nombre;
    private String articuloCP;

    public Delito() {
    }

    public Delito(String nombre, String articuloCP) {
        this.nombre = nombre;
        this.articuloCP = articuloCP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArticuloCP() {
        return articuloCP;
    }

    public void setArticuloCP(String articuloCP) {
        this.articuloCP = articuloCP;
    }
    
    public void mostrarDatos(){
    
    System.out.println("El nombre del delito es: " +this.getNombre());
    System.out.println("El codigo del articulo es: " +this.getArticuloCP());
        
    }
    
}
