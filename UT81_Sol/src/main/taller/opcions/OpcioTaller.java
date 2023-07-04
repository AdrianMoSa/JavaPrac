/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;
import main.taller.Taller;
import main.util.GestorIO;
import main.util.Interval;

/**
 *
 * @author ciclost
 */
public abstract class OpcioTaller extends Opcio{
    
    protected Taller taller;

    public OpcioTaller(String titol, Taller taller) {
        super(titol);
        this.taller = taller;
    }
    
    protected double getValorDouble(String nom, int min, int max) {
        
        GestorIO teclat = new GestorIO();
        boolean error;
        double valor;

        do {
            teclat.out("¿"+nom+"? ["+min+"-"+max+"]:");
            valor = teclat.inDouble();
            error = !new Interval(min, max).inclou(valor);
            if (error) {
                teclat.out("Error!!! Debe ser un valor " + nom + "válido");
            }
        } while (error);
        
        return valor;
    }
    
    protected int getValorInt(String nom, int min, int max) {
        
        GestorIO teclat = new GestorIO();
        boolean error;
        int valor;

        do {
            teclat.out("¿"+nom+"? ["+min+"-"+max+"]:");
            valor = teclat.inInt();
            error = !new Interval(min, max).inclou(valor);
            if (error) {
                teclat.out("Error! Deu ser un valor " + nom + "valid");
            }
        } while (error);
        
        return valor;
    }
    
    
    
}
