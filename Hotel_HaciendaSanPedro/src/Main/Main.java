package Main;

import control.Controlador;
import vista.Registro;

/**
 *
 * @author angel
 */
public class Main {
    
    
    
    public static void main(String[] args){
        
        Registro vista = new Registro();
        Controlador controlador = new Controlador(vista);
        
        vista.setVisible(true);
        
    }
    
    
}
