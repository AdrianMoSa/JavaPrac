/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import main.taller.Box;
import main.taller.Taller;
import main.util.GestorIO;


/**
 *
 * @author ciclost
 */
public class ReclamacioVehicle extends OpcioTaller {

    public ReclamacioVehicle(Taller taller) {
        super("Introduieix nou vehícle al box", taller);
    }

    @Override
    public void executar() {
        GestorIO teclat = new GestorIO();
        if (!taller.getColaInicial().estaBuida()) {
            Box box = taller.getBox();

            if (box.estaLliure()) {
                box.afegir(taller.getColaInicial().saca());
                teclat.out("Vehícle introduit al box correctament");
            } else {
                teclat.out("Error! No es pot introduir el vehícle, hi ha un en la primera fase del box");
            }
        } else {
            teclat.out("Error! En la cola no hi ha vehícule");
        }
    }
    
    

}
