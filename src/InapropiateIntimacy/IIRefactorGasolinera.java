/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InapropiateIntimacy;

/**
 *
 * @author Axel
 */
public class IIRefactorGasolinera {
    IIRefactorAuto auto=new IIRefactorAuto("Super",500);
    void main(){
        int i=5;
        auto.setCantGasolina(i++);
    }
}
