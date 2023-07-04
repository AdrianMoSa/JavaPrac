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
public class Microbus extends TransportPersones {
    
    private static final double PREU_PER_PLAZA = 2;
    
    public Microbus(int numPlazas, String matricula, String model, int cilindres) {
        super(numPlazas, matricula, model, cilindres, 0, PREU_PER_PLAZA);
    }

    @Override
    public double calcularPreu() {
        return super.calcularPreu();
    }
}
