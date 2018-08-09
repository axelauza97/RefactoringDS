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
public class IIRefactorAuto {
    private String TipoGasolina;
    private int CantGasolina;

    public IIRefactorAuto(String TipoGasolina, int CantGasolina) {
        this.TipoGasolina = TipoGasolina;
        this.CantGasolina = CantGasolina;
    }

    public String getTipoGasolina() {
        return TipoGasolina;
    }

    public void setTipoGasolina(String TipoGasolina) {
        this.TipoGasolina = TipoGasolina;
    }

    public int getCantGasolina() {
        return CantGasolina;
    }

    public void setCantGasolina(int CantGasolina) {
        this.CantGasolina = CantGasolina;
    }
    
}
