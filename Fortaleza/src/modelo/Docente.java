/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
abstract class Docente {
    
    protected String codigo;
    protected String nombreCompleto;
    protected String tituloAcademico;
    protected String Departamento;
    protected double salarioBasico;

    public Docente() {
    }

    
    
    
    
    public Docente(String codigo, String nombreCompleto, String tituloAcademico, String Departamento, double salarioBasico) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.tituloAcademico = tituloAcademico;
        this.Departamento = Departamento;
        this.salarioBasico = salarioBasico;
    }
    
    
    
    abstract void calcularSalario();
    
    
    abstract void imprimirInformacionDocente();
    
    
    abstract void imprimirTipoVinculacion();
    
    
    
}
