/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;




/**
 *
 * @author Docente
 */
public class Atentado extends Suceso {
    
    private String municipio;
    private ArrayList<Delito> delitos;
    private FuncionarioPublico funcionarioACargo;
    private EscenaDelHecho escenaDelHecho;

    public Atentado() {
    }

    public Atentado(String municipio, EscenaDelHecho escenaDelHecho, String fecha) {
        super(fecha);
        this.municipio = municipio;
        this.delitos = new ArrayList<>();
        this.funcionarioACargo = null;
        this.escenaDelHecho = escenaDelHecho;
    }


    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public ArrayList<Delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delito> delitos) {
        this.delitos = delitos;
    }

    public FuncionarioPublico getFuncionarioACargo() {
        return funcionarioACargo;
    }

    public void setFuncionarioACargo(FuncionarioPublico funcionarioACargo) {
        this.funcionarioACargo = funcionarioACargo;
    }

    
    
    
    public void calificarDelito(Delito delito){
     this.delitos.add(delito);
        System.out.println("Delito calificado: " + delito.getNombre()
                + " (Art. " + delito.getArticuloCP() + ")");//Calificar delito es asignar el nombre del delito conforme al articulo de codico penal (articuloCP)
    
        
    }
    
}
