/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Planta extends Docente {
    
    private int numeroPuntosSalariales;
    private String categoria;
    private String numeroResolucionNombramiento;
    private String fechaNombramiento;
    private double valorPuntoSalarial;

    public Planta() {
    }

    public Planta(int numeroPuntosSalariales, String categoria, String numeroResolucionNombramiento, String fechaNombramiento, double valorPuntoSalarial, String codigo, String nombreCompleto, String tituloAcademico, String Departamento, double salarioBasico) {
        super(codigo, nombreCompleto, tituloAcademico, Departamento, salarioBasico);
        this.numeroPuntosSalariales = numeroPuntosSalariales;
        this.categoria = categoria;
        this.numeroResolucionNombramiento = numeroResolucionNombramiento;
        this.fechaNombramiento = fechaNombramiento;
        this.valorPuntoSalarial = valorPuntoSalarial;
    }

    


    

    @Override
    public void calcularSalario(){
        
        double salarioMensual = 0;
        
        salarioMensual = salarioBasico + (numeroPuntosSalariales * valorPuntoSalarial);
        System.out.println("Salario Mensual: " + salarioMensual);
    }
    
    
    @Override
    public void imprimirInformacionDocente(){
        
        
        String informacion = "";
        
        informacion = "\n numero de puntos salariales: " + numeroPuntosSalariales + 
                      "\n categoria: " + categoria + 
                      "\n numero de resolucion de nombramiento: " + numeroResolucionNombramiento + 
                      "\n fecha de nombramiento: " + fechaNombramiento + 
                      "\n valor de puntos salariales: " + valorPuntoSalarial + 
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
        
        System.out.println(this.getNombreCompleto() + " es Docente de planta");
        
    }
    
    

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getNumeroPuntosSalariales() {
        return numeroPuntosSalariales;
    }

    public void setNumeroPuntosSalariales(int numeroPuntosSalariales) {
        this.numeroPuntosSalariales = numeroPuntosSalariales;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumeroResolucionNombramiento() {
        return numeroResolucionNombramiento;
    }

    public void setNumeroResolucionNombramiento(String numeroResolucionNombramiento) {
        this.numeroResolucionNombramiento = numeroResolucionNombramiento;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
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
