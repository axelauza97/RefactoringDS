/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongClass;
import java.util.Scanner; 
/**
 *
 * @author Axel
 */
public class LCSmell {
    String[] nombre;
    public void ComenzarJuego(String nombre[]){
        this.nombre=nombre;
        //CODIGO QUE PIDE INGRESO DE DATOS
        Scanner teclado = new Scanner(System.in);
        
        //CODIGO DE PRESENTAR DATOS
        System.out.println("NOMBRE PARTICIPANTE 1 "+nombre[0]);
        System.out.println("NOMBRE PARTICIPANTE 2 "+nombre[1]);
        System.out.println("NOMBRE PARTICIPANTE 3 "+nombre[2]);
        System.out.println("NOMBRE PARTICIPANTE 4 "+nombre[3]);
        System.out.println("NOMBRE PARTICIPANTE 5 "+nombre[4]);
        //CODIGO QUE DA COMIENZO A UN JUEGO X
        
    }
}
