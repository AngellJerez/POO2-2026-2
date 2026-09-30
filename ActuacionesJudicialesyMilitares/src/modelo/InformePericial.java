/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;


/**
 *
 * @author USER
 */
public class InformePericial {
    
    private String NombrePerito;
    private String conclusionTecnica;
    private String fechaDictamen;
    private ArrayList<MaterialProbatorio> materialesRecolectados;

    public InformePericial() {
    }

    public InformePericial(String NombrePerito, String conclusionTecnica, String fechaDictamen) {
        this.NombrePerito = NombrePerito;
        this.conclusionTecnica = conclusionTecnica;
        this.fechaDictamen = fechaDictamen;
        this.materialesRecolectados = new ArrayList<>();
    }

    public String getNombrePerito() {
        return NombrePerito;
    }

    public void setNombrePerito(String NombrePerito) {
        this.NombrePerito = NombrePerito;
    }

    public String getConclusionTecnica() {
        return conclusionTecnica;
    }

    public void setConclusionTecnica(String conclusionTecnica) {
        this.conclusionTecnica = conclusionTecnica;
    }

    public String getFechaDictamen() {
        return fechaDictamen;
    }

    public void setFechaDictamen(String fechaDictamen) {
        this.fechaDictamen = fechaDictamen;
    }

    public ArrayList<MaterialProbatorio> getMaterialesRecolectados() {
        return materialesRecolectados;
    }

    public void setMaterialesRecolectados(ArrayList<MaterialProbatorio> materialesRecolectados) {
        this.materialesRecolectados = materialesRecolectados;
    }

    
    
}
