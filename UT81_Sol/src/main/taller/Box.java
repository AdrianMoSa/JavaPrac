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
public class Box {

    private int id;
    private FaseRevisio[] faseRevisio;

    private static final String[] TITOLS_FASES = new String[]{
        "1(Seguretat)",
        "2(Sistema eléctric)",
        "3(Fums)",
        "4(Frens i direcció)"
    };
    private static final int NUM_FASES = 4;

    public Box(int id) {
        this.id = id;
        this.faseRevisio = new FaseRevisio[NUM_FASES];
        for (int i = 0; i < this.faseRevisio.length; i++) {
            this.faseRevisio[i] = new FaseRevisio(TITOLS_FASES[i]);
        }
    }

    public boolean estaLliure() {
        return !this.faseRevisio[0].teVehicle();
    }

    private boolean esPrimeraFase(int indexFase) {
        return indexFase == 0;
    }

    public void afegir(Vehicle vehicle) {
        faseRevisio[0].assignar(vehicle);
    }

    public void passarVehiclesDeFase(CuaVehicles cuaPendents) {
        
        if (faseRevisio[faseRevisio.length - 1].teVehicle()) {
            faseRevisio[faseRevisio.length - 1].assignarVehicleA(cuaPendents);
        }
        
        for (int i = faseRevisio.length - 1; i > 0; i--) {
            if (!esPrimeraFase(i)) {
                this.faseRevisio[i - 1].assignarVehicleA(this.faseRevisio[i]);
            }
        }

        this.faseRevisio[0].desassignarVehicle();
    }

    public void mostrar() {
        GestorIO teclat = new GestorIO();
        teclat.out("\nBox:" + id + "\n----");
        for (FaseRevisio faseRevision : faseRevisio) {
            faseRevision.mostrar();
        }
    }
}
