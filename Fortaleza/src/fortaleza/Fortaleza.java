/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fortaleza;

import modelo.Catedratico;
import modelo.Ocacional;
import modelo.Planta;

/**
 *
 * @author estudiante
 */
public class Fortaleza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Catedratico catedratico = new Catedratico("2093", 20, 20000, "1152323", "Pedro", "senior", "Ciencias", 200000);
        Ocacional ocacional = new Ocacional("3033", "Juan", "doctor", "Programacion", 300000);
        Planta planta = new Planta(5, "profesorado", "3312", "23 marzo 1998", 24 ,"123456", "Martin", "pregrado", "contabilidad", 500000);
        
        
        catedratico.imprimirTipoVinculacion();
        catedratico.calcularSalario();
        catedratico.imprimirInformacionDocente();
        
        
        ocacional.imprimirTipoVinculacion();
        ocacional.calcularSalario();
        ocacional.imprimirInformacionDocente();
        
        planta.imprimirTipoVinculacion();
        planta.calcularSalario();
        planta.imprimirInformacionDocente();
        
        
        
    }
    
}
