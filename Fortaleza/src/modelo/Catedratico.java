/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Catedratico extends Docente {
    
    
    private String numeroDeContratoSemestral;
    private int numeroHorasSemanales;
    private double valorHora;
    
    
    @Override
    public void calcularSalario(){
        
        double salarioMensual = 0;
        
        salarioMensual = numeroHorasSemanales * numeroHorasSemanales;
        System.out.println("Salario Mensual: " + salarioMensual);
        
    }
    
    
    @Override
    public void imprimirInformacionDocente(){
        
        
        String informacion = "";
        
        informacion = "\n numero de contrato semestral: " + numeroDeContratoSemestral + 
                      "\n numero de horas semanales: " + numeroHorasSemanales + 
                      "\n valor pagado por hora: " + valorHora + 
                      "\n codigo de docente: " + codigo + 
                      "\n nombre completo: " + nombreCompleto +
                      "\n titulo academico: " + tituloAcademico +
                      "\n departamento: " + Departamento + 
                      "\n salario basico: " + salarioBasico;
        
        System.out.println(informacion);
        System.out.println("");
        System.out.println("-----------------------");
        
    }
    
    @Override
    public void imprimirTipoVinculacion(){
        
        System.out.println(this.getNombreCompleto() + " es Docente catedratico");
        
    }
    
    

    public Catedratico(String numeroDeContratoSemestral, int numeroHorasSemanales, double valorHora, String codigo, String nombreCompleto, String tituloAcademico, String Departamento, double salarioBasico) {
        super(codigo, nombreCompleto, tituloAcademico, Departamento, salarioBasico);
        this.numeroDeContratoSemestral = numeroDeContratoSemestral;
        this.numeroHorasSemanales = numeroHorasSemanales;
        this.valorHora = valorHora;
    }

    

    public Catedratico() {
    }

    public String getNumeroDeContratoSemestral() {
        return numeroDeContratoSemestral;
    }

    public void setNumeroDeContratoSemestral(String numeroDeContratoSemestral) {
        this.numeroDeContratoSemestral = numeroDeContratoSemestral;
    }

    public int getNumeroHorasSemanales() {
        return numeroHorasSemanales;
    }

    public void setNumeroHorasSemanales(int numeroHorasSemanales) {
        this.numeroHorasSemanales = numeroHorasSemanales;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
    
    
    
    
    
}
