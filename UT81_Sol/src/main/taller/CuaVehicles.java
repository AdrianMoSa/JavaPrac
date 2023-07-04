/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;

import main.taller.tipusvehicles.Vehicle;
import java.util.Arrays;
import main.util.GestorIO;

/**
 *
 * @author ciclost
 */
public class CuaVehicles extends LlistaVehicles{
    
    public CuaVehicles() {
        
        super();
    }
    
    public Vehicle saca() {
        assert !estaBuida();
        
        Vehicle vehicle = vehicles[0];
        
        for (int i = 1; i < vehicles.length; i++) {
            this.vehicles[i-1] = this.vehicles[i];
        }
        
        vehicles = Arrays.copyOf(vehicles, vehicles.length - 1);
        
        return vehicle;
    }
    
    public void mostrar() {
        GestorIO gestorIO = new GestorIO();
        if (!this.estaBuida()){
            gestorIO.out("\nCua Inicial:");
            for (Vehicle vehicle : vehicles) {
                gestorIO.out("\n"+vehicle);
            }
        }
    }
    
}
