/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import main.util.GestorIO;

/**
 *
 * @author ciclost
 */
public abstract class Opcio {
    private String titol;

    public Opcio(String titulo) {
        this.titol = titulo;
    }

    public void mostrar(int numOpcio) {
        GestorIO teclat = new GestorIO();
        teclat.out("\n" + numOpcio + "." + titol);
    }
   
    
    public abstract void executar();
    
    
}
