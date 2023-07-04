package UT_12_1;

import java.util.ArrayList;
import util.Intervalo;

public class CuaTest {

    public static void main(String[] args) {

        //        ArrayList<Cua> o = new ArrayList<>();
        ArrayList<Object> o = new ArrayList<>();
        //Proves de Cua
        Cua c1 = new Cua();
        c1.afegir("Prova cua");
        c1.afegir(new Intervalo(1,2));
        c1.afegir(false);
        System.out.println("Esta buit? "+c1.estaBuida());
        System.out.println("Tamany: "+c1.getTamany());
        System.out.println("Primer element: "+c1.primer());
        System.out.println("Eliminar el ultim element: "+c1.traure());
        
        for(int i=0; i<c1.getTamany(); i++){
            System.out.println(c1);
        }

//        for(Cua element: o){
//            System.out.println(o);
//        }
    }
    
}
