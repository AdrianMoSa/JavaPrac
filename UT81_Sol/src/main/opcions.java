/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.taller.opcions.Opcio;
import main.util.GestorIO;
import main.util.Interval;

/**
 *
 * @author ciclost
 */
class opcions {
    
    private Opcio[] opcions;
    private int numOpcions;

    public opcions() {
        this.opcions = new Opcio[50];
        this.numOpcions = 0;
    }
    
    public void afeggir(Opcio opcion) {
        opcions[numOpcions] = opcion;
        numOpcions++;
    }
    
    public void mostrar(){
        for (int i= 0; i < numOpcions;i++) {
            opcions[i].mostrar(i+1);
        }
    }
    
    public Opcio getOpcio() {
        GestorIO teclat = new GestorIO();
        int opcio;
        boolean error;
        do {
            teclat.out("\nOpción? [1-"+numOpcions+"]: ");
            opcio = teclat.inInt();
            error = !new Interval(1, numOpcions).inclou(opcio);
            if (error){
                teclat.out("Error! La opcio deu ser entre 1 y "+ numOpcions);
            }
        } while (error);
        return opcions[opcio-1];
    }
    
    
    
}
