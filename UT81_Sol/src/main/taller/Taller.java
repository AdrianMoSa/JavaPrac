/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller;
import main.util.GestorIO;
import main.util.Interval;


/**
 *
 * @author ciclost
 */
public class Taller {
    
    private Box[] boxes;
    private CuaVehicles colaInicial;
    private CuaVehicles colaPendentsPagament;

    public static final int NUM_BOXES = 6;
    
    public Taller() {
        
        this.boxes = new Box[NUM_BOXES];
        for (int i = 0; i < boxes.length; i++) {
            this.boxes[i] = new Box(i + 1);
        }
        
        this.colaInicial= new CuaVehicles();
        this.colaPendentsPagament = new CuaVehicles();
    }

    public Box[] getBoxes() {
        return boxes;
    }

    public CuaVehicles getColaInicial() {
        return colaInicial;
    }
    
    public CuaVehicles getColaPendents() {
        return colaPendentsPagament;
    }
    
    public Box getBox() {
        GestorIO teclat = new GestorIO();
        int numBox;
        boolean error;
        do {
            teclat.out("¿Nombre de box? [1-"+Taller.NUM_BOXES+"]:");
            numBox = teclat.inInt();
            error = !new Interval(1,Taller.NUM_BOXES).inclou(numBox);
            if (error){
                teclat.out("Error! Deu de ser un nombre de box valid");
            }
        } while(error);
        return boxes[numBox - 1];
    }
    
    public void mostrarBoxes() {
        for (Box box : boxes) {
            box.mostrar();
        }
    }
}
