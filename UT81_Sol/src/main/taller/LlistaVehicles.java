/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;

import java.util.Arrays;
import main.taller.tipusvehicles.Vehicle;
import main.util.GestorIO;

/**
 *
 * @author ciclost
 */
public class LlistaVehicles {
    
    protected Vehicle[] vehicles;
    
    public LlistaVehicles() {
        
        vehicles = new Vehicle[0];
    }

    public void afegir(Vehicle vehicle) {
        vehicles = Arrays.copyOf(vehicles, vehicles.length + 1);
        vehicles[vehicles.length - 1] = vehicle;
    }
    
    public boolean estaBuida() {
        return this.vehicles.length == 0;
    }

    public void mostrarPreu() {
        GestorIO teclat= new GestorIO();
        double preuTotal = 0;
        
        for (Vehicle vehicle : vehicles) {
            double preu = vehicle.calcularPreu();
            new GestorIO().out("\nVehicle: " + vehicle + " Preu: " + preu);
            preuTotal+= preu;
        }
        
        teclat.out("\nTotal: " + preuTotal);
    }
    
    public boolean teMatricula(String matricula){
        for(Vehicle v: vehicles){
            if(v.teEsta(matricula)){
                return true;
            }
        }
        return false;
    }
    
    
}
