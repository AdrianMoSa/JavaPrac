/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import main.taller.Taller;
import main.util.GestorIO;


/**
 *
 * @author ciclost
 */
public class PasDeFase extends OpcioTaller {

    public PasDeFase(Taller taller) {
        super("Pas de fase vehícles en box", taller);
        this.taller = taller;
    }

    @Override
    public void executar() {
        GestorIO teclat = new GestorIO();
        taller.getBox().passarVehiclesDeFase(taller.getColaPendents());
        teclat.out("Vehicles cambiats de fase correctament");
    }
}
