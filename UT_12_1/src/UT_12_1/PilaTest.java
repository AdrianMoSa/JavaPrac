package UT_12_1;

import java.util.ArrayList;
import util.Intervalo;

public class PilaTest {

    public static void main(String[] args) {

//        ArrayList<Pila> o = new ArrayList<>();
        ArrayList<Object> o = new ArrayList<>();
        //Proves de pila
        Pila p1 = new Pila();
        p1.afegir("Prova pila");
        p1.afegir(new Intervalo(1,2));
        p1.afegir(false);
        System.out.println("Esta buit? "+p1.estaBuida());
        System.out.println("Tamany: "+p1.getTamany());
        System.out.println("Ultim element: "+p1.cima());
        System.out.println("Eliminar el ultim element: "+p1.traure());
        
        for(int i=0; i<p1.getTamany(); i++){
            System.out.println(p1);
        }


    }
    
    // 3 - Treballant amb una llista de Objects no es pot controlar el tipues de dada de cada element que forma un ArrayList perque es necesita el metode toString amb tots el tipus de dades per a mostrar cualquier element.
   
}