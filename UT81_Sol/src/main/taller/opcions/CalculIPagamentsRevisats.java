/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import main.taller.LlistaVehicles;
import main.taller.Taller;
import main.taller.tipusvehicles.Vehicle;
import main.util.GestorIO;

/**
 *
 * @author ciclost
 */
public class CalculIPagamentsRevisats extends Opcio {

    private Taller taller;
    private LlistaVehicles vehiculosFinalizados;
    
    public CalculIPagamentsRevisats(Taller taller, LlistaVehicles vehiclesFinalitzats) {
        super("Calcular i pagar vehíckes revisats");
        this.taller = taller;
        this.vehiculosFinalizados = vehiclesFinalitzats;
    }

    @Override
    public void executar() {
        
        GestorIO teclat = new GestorIO();
        
        if (!taller.getColaPendents().estaBuida()) {
            Vehicle vehicle = taller.getColaPendents().saca();
            teclat.out("\nEl vehícle " + vehicle + " ha pagat " + vehicle.calcularPreu());
            this.vehiculosFinalizados.afegir(vehicle);
        } else {
            teclat.out("No hi ha vehícules en la cola de pendents de pago");
        }
    }
    
}
