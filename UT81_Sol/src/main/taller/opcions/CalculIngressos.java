/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import main.taller.LlistaVehicles;
import main.util.GestorIO;

/**
 *
 * @author ciclost
 */
public class CalculIngressos extends Opcio {

    private LlistaVehicles vehiclesFinalitzats;
    
    public CalculIngressos(LlistaVehicles vehiclesFinalitzats) {
        super("Cálcul de ingressos");
        this.vehiclesFinalitzats = vehiclesFinalitzats;
    }

    @Override
    public void executar() {
        GestorIO teclat = new GestorIO();
        if (!this.vehiclesFinalitzats.estaBuida()) {
            this.vehiclesFinalitzats.mostrarPreu();
        } else {
            teclat.out("No hi ha vehícles que hi hallan pasat la revisio");
        }
    }
}
