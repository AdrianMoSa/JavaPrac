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
public abstract class TransportPersones extends Vehicle{
    
    private static final int INCREMENT_PER_POTENCIA = 10;
    
    protected int numPlaces;
    
    private double preuPerPlaza;

    public TransportPersones(int numPlaces, String matricula, String model, int potencia, int cilindres, double preciPerPlaza) {
        super(matricula, model, potencia, cilindres);
        this.numPlaces = numPlaces;
        this.preuPerPlaza = preciPerPlaza;
    }
    
    public TransportPersones(int numPlazas, String matricula, String model, int cilindres) {
        super(matricula, model, cilindres);
        this.numPlaces = numPlazas;
    }

    @Override
    public double calcularPreu() {
        
        double preci = super.calcularPreu();
        
        if (this.numPlaces > 3) {
            preci += (this.numPlaces - 3) * preuPerPlaza;
        }
        
        if (this.potencia > 1200) {
            preci += INCREMENT_PER_POTENCIA;
        }
        
        return preci;
    }
    
    
}
