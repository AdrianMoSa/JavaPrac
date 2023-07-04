/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.tipusvehicles;

/**
 *
 * @author ciclost
 */
public class Cotxe extends TransportPersones{
    
    private static final double PREU_PER_PLAZA = 1.5;
    
    public Cotxe(int numPlazas, String matricula, String model, int potencia, int cilindres) {
        super(numPlazas, matricula, model, potencia, cilindres, PREU_PER_PLAZA);
    }
}
