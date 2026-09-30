/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author USER
 */
public class FuncionarioPublico  extends Persona{
    private String cargo;
    private String entidad;
    private boolean investiduraCertificada;

    public FuncionarioPublico() {
    }


    public FuncionarioPublico(String cargo, String entidad, String dni, String fullName, String birthday) {
        super(dni, fullName, birthday);
        this.cargo = cargo;
        this.entidad = entidad;
        certificarInvestidura();
        
    }
    

    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    
    public boolean certificarInvestidura() {
        // La investidura solo se certifica si el funcionario
        // ya tiene cargo y entidad asignados (art. 123 CN)
        if (this.cargo != null && !this.cargo.isEmpty()
                && this.entidad != null && !this.entidad.isEmpty()) {
            this.investiduraCertificada = true;
            System.out.println("Investidura certificada: " + this.cargo + " - " + this.entidad);
        } else {
            this.investiduraCertificada = false;
            System.out.println("No se pudo certificar la investidura: faltan datos de cargo o entidad.");
        }
        return this.investiduraCertificada;
    }

    
}
