/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author USER
 */
public class MaterialProbatorio {
    
    private String objetoRecolectado;
    private String numeroEMP;
    private String estadoCadenaCustodia; //(clasificación preliminar,autoridad de desactivación, riesgo activo)
    private String fechaRecoleccion;

    public MaterialProbatorio(String objetoRecolectado, String numeroEMP, String estadoCadenaCustodia, String fechaRecoleccion) {
        this.objetoRecolectado = objetoRecolectado;
        this.numeroEMP = numeroEMP;
        this.estadoCadenaCustodia = estadoCadenaCustodia;
        this.fechaRecoleccion = fechaRecoleccion;
    }
    

    public MaterialProbatorio() {
    }

    public String getObjetoRecolectado() {
        return objetoRecolectado;
    }

    public void setObjetoRecolectado(String objetoRecolectado) {
        this.objetoRecolectado = objetoRecolectado;
    }

    public String getNumeroEMP() {
        return numeroEMP;
    }

    public void setNumeroEMP(String numeroEMP) {
        this.numeroEMP = numeroEMP;
    }

    public String getEstadoCadenaCustodia() {
        return estadoCadenaCustodia;
    }

    public void setEstadoCadenaCustodia(String estadoCadenaCustodia) {
        this.estadoCadenaCustodia = estadoCadenaCustodia;
    }

    public String getFechaRecoleccion() {
        return fechaRecoleccion;
    }

    public void setFechaRecoleccion(String fechaRecoleccion) {
        this.fechaRecoleccion = fechaRecoleccion;
    }
    
    
    
    

    
}
