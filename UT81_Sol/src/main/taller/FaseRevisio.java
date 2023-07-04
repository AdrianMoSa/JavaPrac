/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;

import main.taller.tipusvehicles.Vehicle;
import main.util.GestorIO;

/**
 *
 * @author ciclost
 */
class FaseRevisio {
    
    private String nom;
    private Vehicle vehicle;
    
    public FaseRevisio(String nombre) {
        this.nom = nombre;
        this.vehicle = null;
    }
   
    public boolean teVehicle() {
        return vehicle != null;
    }

    public void assignar(Vehicle vehicle) {
        assert vehicle != null;
        this.vehicle = vehicle;
    }
    
    public void desassignarVehicle() {
        this.vehicle = null;
    }
    
    public void mostrar() {
        GestorIO teclat = new GestorIO();
        teclat.out("\nFase " + nom + ": ");
        
        if (vehicle != null)
            teclat.out(vehicle);
        else
            teclat.out("Buit");
    }

    public void assignarVehicleA(FaseRevisio faseRevisio) {
       faseRevisio.vehicle = this.vehicle;
       this.desassignarVehicle();
    }
    
    public void assignarVehicleA(CuaVehicles cua) {
       cua.afegir(this.vehicle);
       this.desassignarVehicle();
    }
}