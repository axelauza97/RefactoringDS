/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass;

/**
 *
 * @author Axel
 */
public class DCRefactorAuto {
    private String Gasolina;
    private int combustible;

    public DCRefactorAuto(String Gasolina, int combustible) {
        this.Gasolina = Gasolina;
        this.combustible = combustible;
    }

    public String getGasolina() {
        return Gasolina;
    }

    public void setGasolina(String Gasolina) {
        this.Gasolina = Gasolina;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
}
