/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Ocacional extends Docente {

    public Ocacional() {
    }

    public Ocacional(String codigo, String nombreCompleto, String tituloAcademico, String Departamento, double salarioBasico) {
        super(codigo, nombreCompleto, tituloAcademico, Departamento, salarioBasico);
    }

    
    @Override
    public void calcularSalario(){
        
        double salarioMensual = salarioBasico;
        System.out.println("Salario Mensual: " + salarioMensual);
    }
    
    @Override
    public void imprimirInformacionDocente(){
        
        
        String informacion = "";
        
        informacion = "\n codigo de docente: " + codigo + 
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
        
        System.out.println(this.getNombreCompleto() + " es Docente ocacional");
        
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

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }
    
    
    
    
}
