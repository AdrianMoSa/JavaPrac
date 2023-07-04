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
public abstract class TransportCarrega extends Vehicle{
    
    private double pma;

    private static final int INCREMENT_PRECI_MENYS_10_CILINDRES = 3;
    private static final int INCREMENT_PRECI_MES_10_CILINDRES = 3;
    
    public TransportCarrega(double pma, String matricula, String model, int potencia, int cilindres) {
        super(matricula, model, potencia, cilindres);
        this.pma = pma;
    }
    
    public TransportCarrega(double pma, String matricula, String model, int cilindres) {
        super(matricula, model, cilindres);
        this.pma = pma;
    }

    @Override
    public double calcularPreu() {
        double preci = super.calcularPreu(); 
        
        if (this.cilindres < 10) {
            preci += INCREMENT_PRECI_MENYS_10_CILINDRES * pma;
        }
        else {
            preci += INCREMENT_PRECI_MES_10_CILINDRES * pma; 
        }
        
        return preci;
    }
    
    
    
}
