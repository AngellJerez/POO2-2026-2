/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actuacionesjudicialesymilitares;

import java.util.List;
import modelo.Atentado;
import modelo.Delito;
import modelo.EjercitoNacional;
import modelo.EscenaDelHecho;
import modelo.ExpedientePenal;
import modelo.Fiscalia;
import modelo.FuncionarioPublico;
import modelo.InformePericial;
import modelo.Juez;
import modelo.MaterialProbatorio;
import modelo.Militar;
import modelo.Novedad;
import modelo.SujetoActivoAtentado;

/**
 *
 * @author Docente
 */
public class ActuacionesJudicialesyMilitares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SE CREA EL EJERCITO
        EjercitoNacional ejercitoNacionalDeColombia = new EjercitoNacional("EJC", "EJERCITO NACIONAL DE COLOMBIA", "defensa de la soberanía, la independencia, la integridad del territorio nacional y el orden constitucional.");

        
        //SE LE AÑADEN DOS MILITARES AL EJERCITO
        ejercitoNacionalDeColombia.getMilitares().add(new Militar("1948367939", "Francisco Medina", "04/03/2002", "Sargento Segundo", "Batallón de Infantería No. 27 Huila", "Herido leve"));
        ejercitoNacionalDeColombia.getMilitares().add(new Militar("5968309446", "Pablo Pierro", "18/11/1990", "Sargento", "Batallón de Infantería No. 27 Huila", "Normal"));
        
        //SE REPORTA UNA NOVEDAD
        ejercitoNacionalDeColombia.reportarNovedad(new Novedad("Media", "Francisco Medina herido en combate"));
        
        //FISCALIA CREADA
        Fiscalia fiscalia = new Fiscalia();
        
        //FISCAL Y JUEZ REGISTRADOS
        fiscalia.getFuncionarios().add(new FuncionarioPublico("Fiscal", "Fiscalia General de la Nacion", "28934797473", "Dra Maria Rodriguez", "05/08/2000"));
        
        //JUEZ REGISTRADO
        Juez juez = new Juez("Juez", "Rama Judicial del poder publico", "1030404050", "Dr. Mario Fernandez", "01/05/1994");
        
        //OCURRE EL ATENTADO
        Atentado atentado = new Atentado("Neiva", new EscenaDelHecho("-1.546346, 1.6345345"), "23/12/2026");
        
        //SE AGREGAN DELITOS AL ATENTADO
        atentado.getDelitos().add(new Delito("Terrorismo", "123"));
        atentado.getDelitos().add(new Delito("Homicidio", "456"));
        atentado.getDelitos().add(new Delito("Porte ilegal de armas", "789"));
        
        
        //SE HACE EL INFORME PERICIAL
        InformePericial informe = new InformePericial("Perito Martin Mendez", "Muestra positiva para amonio", "20/05/2026");
        
        //SE ENCUENTRA EL MATERIA PROBATORIO (EL/LOS EXPLOSIVOS) AL INFORME PERICIAL
        informe.getMaterialesRecolectados().add(new MaterialProbatorio("Bomba casera", "EMP-2026-041-HUILA-001", "Clasificacion preliminar", "15/04/2026"));
        
        //CAUSANTE DEL ATENTADO
        SujetoActivoAtentado criminal = new SujetoActivoAtentado("indiciado", "Grupo armado los reboltosos", "41872398742", "Alberto Jimenez (Alias: el malo)", "15/03/2003");
        
        
        //SE GUARDA EL EXPEDIENTE DE LO OCURRIDO
        ExpedientePenal expediente = new ExpedientePenal("E104", "ABIERTO", "24/12/2026", atentado);
        
        
        //EL JUEZ EMITE LA SENTENCIA
        juez.emitirSentencia("Condenatoria", 50, criminal);
        
    }
    
}
