/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class ExpedientePenal {
    
    private String numeroRadicado;
    private String estadoProcesal; //archivado / abierto / dividido
    private String fechaApertura;
    private Atentado atentado;

    public ExpedientePenal() {
    }

    public ExpedientePenal(String numeroRadicado, String estadoProcesal, String fechaApertura, Atentado atentado) {
        this.numeroRadicado = numeroRadicado;
        this.estadoProcesal = estadoProcesal;
        this.fechaApertura = fechaApertura;
        this.atentado = atentado;
    }
    
    

    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    public void setNumeroRadicado(String numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }

    public String getEstadoProcesal() {
        return estadoProcesal;
    }

    public void setEstadoProcesal(String estadoProcesal) {
        this.estadoProcesal = estadoProcesal;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Atentado getAtentado() {
        return atentado;
    }

    public void setAtentado(Atentado atentado) {
        this.atentado = atentado;
    }
    
    
    
   
    
    
}
