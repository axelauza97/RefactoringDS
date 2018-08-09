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
public class FERefactorEmpresa {
    private int capital;

    public void Descontar(int valor){
    capital=capital-valor;
    }
    void main(){
        capital=5000;
        Descontar(50);
    }
}
