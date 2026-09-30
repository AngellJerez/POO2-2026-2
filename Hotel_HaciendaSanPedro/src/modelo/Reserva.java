/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiantes
 */
public class Reserva {
    
    private Cliente cliente;
    private String tipoHabitacion;
    private int cantidadHabitaciones;
    private double totalPagar;
    private String numeroRegistro;

    public Reserva() {
    }

    public Reserva(Cliente cliente, String tipoHabitacion, int cantidadHabitaciones) {
        
        if(cliente == null){
            throw new IllegalArgumentException("La persona no puede ir vacia");
        }
        if(tipoHabitacion.isEmpty()){
            throw new IllegalArgumentException("Tipo de habitacion incorrecto");
        }
        if(cantidadHabitaciones <= 0){
            throw new IllegalArgumentException("La cantidad de habitaciones debe ser mayor que 0");
        }
        
        this.cliente = cliente;
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        calcularTotal();
        calcularCodigoDeRegistro();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
    
    
    public void calcularCodigoDeRegistro(){
        //DESCOMPONER STRING Y ASIGNARLO A LA VARIABLE
        
        String numeroIdentificacion = cliente.getNumeroIdentificacion();
        
        String ultimosCuatro = numeroIdentificacion.substring(numeroIdentificacion.length()-4);
        
        this.numeroRegistro = ultimosCuatro;
        
    }
    
    public void calcularTotal(){
        
        double total = 0;
        
        if(tipoHabitacion.equalsIgnoreCase("sencilla")){
            total = cantidadHabitaciones * 40000;
        }
        
        if(tipoHabitacion.equalsIgnoreCase("doble")){
            total = cantidadHabitaciones * 60000;
        }
        
        if(tipoHabitacion.equalsIgnoreCase("suite")){
            total = cantidadHabitaciones * 80000;
        }
        
        
        
        this.totalPagar = total;
    }

    @Override
    public String toString() {
        String reserva = "Tipo de habitacion: " + tipoHabitacion +
                         "Cantidad de habitaciones" + cantidadHabitaciones +
                         "Total a pagar: " + totalPagar +
                         "Numero de registro" + numeroRegistro;
        
        
        return reserva;
    }
    
}
