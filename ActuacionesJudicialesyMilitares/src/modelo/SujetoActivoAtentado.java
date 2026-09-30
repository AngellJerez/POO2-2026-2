/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angel
 */
public class SujetoActivoAtentado extends Persona{
    
    private String estadoJuridico; //(indiciado, imputado, condenado)
    private String vinculacionEstructuraArmadaIlegal;
    
    

    public SujetoActivoAtentado() {
    }
    
    public SujetoActivoAtentado(String estadoJuridico, String vinculacionEstructuraArmadaIlegal) {
        this.estadoJuridico = estadoJuridico;
        this.vinculacionEstructuraArmadaIlegal = vinculacionEstructuraArmadaIlegal;
    }

    public SujetoActivoAtentado(String estadoJuridico, String vinculacionEstructuraArmadaIlegal, String dni, String fullName, String birthday) {
        super(dni, fullName, birthday);
        this.estadoJuridico = estadoJuridico;
        this.vinculacionEstructuraArmadaIlegal = vinculacionEstructuraArmadaIlegal;
    }
    
    
    
    
    //AVANZAR ESTADO JURIDICO ES EL MISMO SETTER DE ESTADO JURIDICO

    public String getEstadoJuridico() {
        return estadoJuridico;
    }

    public void setEstadoJuridico(String estadoJuridico) {
        this.estadoJuridico = estadoJuridico;
    }

    public String getVinculacionEstructuraArmadaIlegal() {
        return vinculacionEstructuraArmadaIlegal;
    }

    public void setVinculacionEstructuraArmadaIlegal(String vinculacionEstructuraArmadaIlegal) {
        this.vinculacionEstructuraArmadaIlegal = vinculacionEstructuraArmadaIlegal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    
    
    
}
