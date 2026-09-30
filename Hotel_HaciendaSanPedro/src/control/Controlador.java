/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Habitacion;
import modelo.Reserva;
import modelo.TipoHabitacion;
import vista.Registro;

/**
 *
 * @author angel
 */
public class Controlador {
    
    private Registro vista;
    
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Cliente> clientes;
    private ArrayList<Reserva> reservas;

    public Controlador(Registro vista) {
        this.vista = vista;
        this.habitaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
        
        
        for(int i = 0; i<5; i++){
            Habitacion habitacion = new Habitacion(i, TipoHabitacion.SENCILLA, 40000, true, 2);
            habitaciones.add(habitacion);
        }
        for(int i = 5; i<10; i++){
            Habitacion habitacion = new Habitacion(i, TipoHabitacion.DOBLE, 60000, true, 4);
            habitaciones.add(habitacion);
        }
        for(int i = 10; i<13; i++){
            Habitacion habitacion = new Habitacion(i, TipoHabitacion.SUITE, 80000, true, 2);
            habitaciones.add(habitacion);
        }
        
        
        vista.getBtnRegistrar().addActionListener(e -> registrarCliente());
        vista.getBtnReserva().addActionListener(e -> añadirReserva());
        vista.getBtnListarReservas().addActionListener(e -> listarReservaHuesped());
        vista.getBtnListarHabitaciones().addActionListener(e -> listarHabitacionesDisponibles());
        vista.getBtnEstadoHabitacion().addActionListener(e -> cambiarEstadoHabitacion());
        
    }
    
    
    
    public void registrarCliente(){
        
        String nombre = vista.getTxtNombre().getText();
        String numeroIndentificacion = vista.getTxtIdentificacion().getText();
        String edad = vista.getTxtEdad().getText();
        
        if(!numeroIndentificacion.matches("\\d+")){
        mostrarMensaje("El numero de identificacion solo puede ser numerico");
        return;
        }

        if(!edad.matches("\\d+")){
        mostrarMensaje("La edad solo puede ser numerica");
        return;
        }
        
        if(existeCliente(numeroIndentificacion)==null){
            
            Cliente cliente = new Cliente(nombre, numeroIndentificacion, Integer.parseInt(edad));
        
            this.clientes.add(cliente);
        
            mostrarMensaje("Registro del cliente " + nombre + " exitoso");
        } else {
            
            mostrarMensaje("El cliente ya se encontraba registrado");
            
        }
        
        
        
        
        
    }
    
    public void añadirReserva(){
        
        String numeroIdentificacion = vista.getTxtIdentificacionReservar().getText();
        
        if(!numeroIdentificacion.matches("\\d+")){
        mostrarMensaje("El numero de identificacion solo puede ser numerico");
        return;
        }
        
        Cliente cliente = null;
        
        for(int i = 0; i<clientes.size(); i++){
            
            if(numeroIdentificacion.equals(clientes.get(i).getNumeroIdentificacion())){
                
                cliente = clientes.get(i);
                break;
            }
        } 
        
        if(cliente==null){
            mostrarMensaje("El cliente no se encontró en el registro");
            return;
        }
        
        String cantidadHabitaciones = vista.getTxtCantidadHabitaciones().getText();
        
        if(!cantidadHabitaciones.matches("\\d+")){
        mostrarMensaje("El numero de habitaciones solo puede ser numerico");
        return;
        }
        
        String tipoHabitacion = vista.getCboTipoHabitacion().getSelectedItem().toString();
        
        
        
        if(Integer.parseInt(cantidadHabitaciones) > getCantidadHabitacionesDisponiblesPorTipo(tipoHabitacion)){
            
            mostrarMensaje("No hay la cantidad de habitaciones disponible");
            return;
        }
        
        
        
        Reserva reserva = new Reserva(cliente, tipoHabitacion, Integer.parseInt(cantidadHabitaciones));
        
        reservas.add(reserva);
        
        String habitacionesReserva = "";
        int cantidadHabitacionesInt = Integer.parseInt(cantidadHabitaciones);
        
        for(int o = 0; o<habitaciones.size(); o++){
            
            if(habitaciones.get(o).getTipoHabitacion().toString().equals(tipoHabitacion) && habitaciones.get(o).getEsDisponible() == true){
                habitaciones.get(o).setEsDisponible(false);
                cantidadHabitacionesInt = cantidadHabitacionesInt -1;
                habitacionesReserva = habitacionesReserva + habitaciones.get(o).getNumeroHabitacion() + "---";
            }
            
            if(cantidadHabitacionesInt==0){
                break;
            }
            
        }
        
        
        mostrarMensaje("Reservacion exitosa, sus habitaciones son: " + habitacionesReserva);
        
    }
    
    public void listarReservaHuesped(){
        
        String numeroIdentificacion = vista.txtIdentificacionListarReservas.getText();
        
        if(!numeroIdentificacion.matches("\\d+")){
            mostrarMensaje("El numero de identificacion debe ser numerico");
            return;
        }
        
        Cliente cliente = null;
        
        for(int i = 0; i<clientes.size(); i++){
            
            if(numeroIdentificacion.equals(clientes.get(i).getNumeroIdentificacion())){
                
                cliente = clientes.get(i);
                break;
            }
        } 
        
        if(cliente==null){
            mostrarMensaje("El cliente no se encontró en el registro");
            return;
        }
        
        String texto = "";
        
        for(int i = 0; i< reservas.size(); i++){
            
            if(reservas.get(i).getCliente() == cliente){
                
                texto = texto + reservas.get(i).toString();
                
                texto = texto + "\n";
                texto = texto + "--------------------";
                texto = texto + "\n";
                
            }
            
        }
        
        if(texto.equals("")){
            mostrarMensaje("El Cliente " + cliente.getNombre() + " aun no cuenta con reservaciones");
        } else {
            mostrarMensaje(texto);
        }
        
        
        
    }
    
    public void listarHabitacionesDisponibles(){
        String texto = "";
        
        if(habitaciones.size() == 0){
            mostrarMensaje("No hay habitaciones registradas");
            return;
        }
        
        for(int i = 0; i<habitaciones.size(); i++){
            
            if(habitaciones.get(i).getEsDisponible() == true){
                
                texto = texto + habitaciones.get(i).toString();
                texto = texto + "\n";
                texto = texto + "--------------------";
                texto = texto + "\n";
            }
            
        }
        
        mostrarMensaje(texto);
    }
    
    public void cambiarEstadoHabitacion(){
        
        String numeroHabitacion = vista.txtNumeroHabitacion.getText();
        
        if(!numeroHabitacion.matches("\\d+")){
            mostrarMensaje("El numero de habitacion debe ser numerico");
            return;
        }
        
        
        for(int i = 0; i<habitaciones.size(); i++){
            
            if(habitaciones.get(i).getNumeroHabitacion() == Integer.parseInt(numeroHabitacion)){
                
                if(habitaciones.get(i).getEsDisponible() == true){
                    habitaciones.get(i).setEsDisponible(false);
                    mostrarMensaje("La habitacion: " + numeroHabitacion + " se actualizó a NO DISPONIBLE");
                    return;
                }
                
                if(habitaciones.get(i).getEsDisponible() == false){
                    habitaciones.get(i).setEsDisponible(true);
                    mostrarMensaje("La habitacion: " + numeroHabitacion + " se actualizó a DISPONIBLE");
                    return;
                }
                
            }
            
        }
        
        mostrarMensaje("La habitacion " + numeroHabitacion + " no se encontró en el registro de habitaciones");
        
    }
    
    public int getCantidadHabitacionesDisponiblesPorTipo(String tipo){
        int cantidadHabitaciones = 0;
        
        for(int i = 0; i<habitaciones.size(); i++){
            
            if(habitaciones.get(i).getEsDisponible()==true && habitaciones.get(i).getTipoHabitacion().toString().equals(tipo)){
                
                cantidadHabitaciones = cantidadHabitaciones + 1;
                
            }
            
            
        }
        
        return cantidadHabitaciones;
    }
    
    
    //METODOS NO ACTION LISTENER
    
    public void mostrarMensaje(String mensaje){
        
        vista.getTextPane_Visualizar().setText(mensaje);
        
    }
    
    public Cliente existeCliente(String numeroIdentificacion){
        
        Cliente cliente = null;
        
        for(int i = 0; i<clientes.size(); i++){
            
            if(numeroIdentificacion.equals(clientes.get(i).getNumeroIdentificacion())){
                
                cliente = clientes.get(i);
                break;
            }
        }
        
        
        return cliente;
    }
    
    
    
}
    
    

