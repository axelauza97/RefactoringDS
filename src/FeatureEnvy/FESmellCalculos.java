/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy;

/**
 *
 * @author Axel
 */
public class FESmellCalculos {
    private int capital;

    public FESmellCalculos(int capital) {
        this.capital = capital;
    }
    public void Descontar(int valor){
    capital=capital-valor;
    }
}
