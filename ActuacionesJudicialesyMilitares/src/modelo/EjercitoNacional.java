
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Docente
 */
public class EjercitoNacional {
    private String sigla;
    private String nombre;
    private String mision;
    private ArrayList<Novedad> novedades;
    private ArrayList<Militar> militares;

    public EjercitoNacional() {
    }

    public EjercitoNacional(String sigla, String nombre, String mision) {
        this.sigla = sigla;
        this.nombre = nombre;
        this.mision = mision;
        this.novedades = new ArrayList<>();
        this.militares = new ArrayList<>();
    }

    
    
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public ArrayList<Novedad> getNovedades() {
        return novedades;
    }

    public void setNovedades(ArrayList<Novedad> novedades) {
        this.novedades = novedades;
    }

    public ArrayList<Militar> getMilitares() {
        return militares;
    }

    public void setMilitares(ArrayList<Militar> militares) {
        this.militares = militares;
    }

   
    
    public void reportarNovedad(Novedad novedad){
        
     this.novedades.add(novedad);
        System.out.println("Novedad reportada: " + novedad.getNombre()
               + " - Clasificación: " + novedad.getClasificacion());
    
    }
    
    public void activarProtocoloSeguridad(){
        
        System.out.println("Protocolo de seguridad activado");
        
    }
    
}
