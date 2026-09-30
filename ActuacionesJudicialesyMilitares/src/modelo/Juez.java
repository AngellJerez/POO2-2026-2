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
public class Juez extends FuncionarioPublico {
    
    private ArrayList<SentenciaCondenatoria> sentencias;

    public Juez() {
    }

    public Juez(String cargo, String entidad, String dni, String fullName, String birthday) {
        super(cargo, entidad, dni, fullName, birthday);
        this.sentencias = new ArrayList<>();
    }

    


    
    
    
    

    public ArrayList<SentenciaCondenatoria> getSentencias() {
        return sentencias;
    }

    public void setSentencias(ArrayList<SentenciaCondenatoria> sentencias) {
        this.sentencias = sentencias;
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

    
    
    
    
    
    
    public void emitirSentencia(String tipoSentencia, int añosCondena, SujetoActivoAtentado sentenciado){
        SentenciaCondenatoria sentencia = new SentenciaCondenatoria(tipoSentencia, this, añosCondena, sentenciado);
        sentenciado.setEstadoJuridico("Sentenciado: " + tipoSentencia);
        this.sentencias.add(sentencia);
    }
    
}
