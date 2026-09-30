/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author angel
 */
public class SentenciaCondenatoria {
    
    private String tipoSentencia; //condenatoria o absolutoria
    private Juez dictador;
    private int añosCondena;
    private SujetoActivoAtentado sentenciado;

    public SentenciaCondenatoria(String tipoSentencia, Juez dictador, int añosCondena, SujetoActivoAtentado sentenciado) {
        this.tipoSentencia = tipoSentencia;
        this.dictador = dictador;
        this.añosCondena = añosCondena;
        this.sentenciado = sentenciado;
    }

    public String getTipoSentencia() {
        return tipoSentencia;
    }

    public void setTipoSentencia(String tipoSentencia) {
        this.tipoSentencia = tipoSentencia;
    }

    public Juez getDictador() {
        return dictador;
    }

    public void setDictador(Juez dictador) {
        this.dictador = dictador;
    }

    public int getAñosCondena() {
        return añosCondena;
    }

    public void setAñosCondena(int añosCondena) {
        this.añosCondena = añosCondena;
    }

    public SujetoActivoAtentado getSentenciado() {
        return sentenciado;
    }

    public void setSentenciado(SujetoActivoAtentado sentenciado) {
        this.sentenciado = sentenciado;
    }
    
    
    
    
    
}
