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
public class Camio extends TransportCarrega {
    
    private static final double PERCENTATGE_PREU_BASE = 0.2;
    private static final int FIX = 40;
    private static final int EXCES_POTENCIA = 20;
    
    public Camio(double pma, String matricula, String model, int potencia, int cilindres) {
        super(pma, matricula, model, potencia, cilindres);
    }

    @Override
    public double calcularPreu() {
        double Camio = super.calcularPreu();
        
        Camio += FIX + this.preciBase() * PERCENTATGE_PREU_BASE;
        
        if (this.potencia > 2000) {
            Camio += EXCES_POTENCIA;
        }
        
        return Camio;
    }
    
}
