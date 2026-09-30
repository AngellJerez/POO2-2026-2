/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;


/**
 *
 * @author angel
 */
public class Fiscalia {
    
    private ArrayList<FuncionarioPublico> funcionarios;
    private ArrayList<Atentado> atentados;

    public Fiscalia() {
        this.funcionarios = new ArrayList<>();
        this.atentados = new ArrayList<>();
        
    }
    

    public ArrayList<FuncionarioPublico> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<FuncionarioPublico> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Atentado> getAtentados() {
        return atentados;
    }

    public void setAtentados(ArrayList<Atentado> atentados) {
        this.atentados = atentados;
    }
    
    
    
    
    
    public void asignarCaso(FuncionarioPublico fiscal, Atentado atentado){
        
        atentado.setFuncionarioACargo(fiscal);
        
    }
    
}
