/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class RegistroExplosivo {
   private String clasificacionPreliminar;
   private String autoridadResponsableDesactivacion;
   private boolean riesgoActivo;

    public RegistroExplosivo(String clasificacionPreliminar, String autoridadResponsableDesactivacion, boolean riesgoActivo) {
        this.clasificacionPreliminar = clasificacionPreliminar;
        this.autoridadResponsableDesactivacion = autoridadResponsableDesactivacion;
        this.riesgoActivo = riesgoActivo;
    }

    public RegistroExplosivo() {
    }

    public String getClasificacionPreliminar() {
        return clasificacionPreliminar;
    }

    public void setClasificacionPreliminar(String clasificacionPreliminar) {
        this.clasificacionPreliminar = clasificacionPreliminar;
    }

    public String getAutoridadResponsableDesactivacion() {
        return autoridadResponsableDesactivacion;
    }

    public void setAutoridadResponsableDesactivacion(String autoridadResponsableDesactivacion) {
        this.autoridadResponsableDesactivacion = autoridadResponsableDesactivacion;
    }

    public boolean isRiesgoActivo() {
        return riesgoActivo;
    }

    public void setRiesgoActivo(boolean riesgoActivo) {
        this.riesgoActivo = riesgoActivo;
    }
   
   
}
