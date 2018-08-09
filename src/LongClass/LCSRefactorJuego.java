/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongClass;

import static LongClass.LCRefactorIngresoDatos.ingresarDatos;

/**
 *
 * @author Axel
 */
public class LCSRefactorJuego {
    String nombre = null;
    void ComenzarJuego(){
        ingresarDatos();
        PresentacionInfo();
        //CODIGO QUE DA COMIENZO A UN JUEGO X    
    }
    
    
    private void PresentacionInfo(){
        
        System.out.println("NOMBRE PARTICIPANTE 1 "+nombre);
        System.out.println("NOMBRE PARTICIPANTE 2 "+nombre);
        System.out.println("NOMBRE PARTICIPANTE 3 "+nombre);
        System.out.println("NOMBRE PARTICIPANTE 4 "+nombre);
        System.out.println("NOMBRE PARTICIPANTE 5 "+nombre);
        
    }
}
