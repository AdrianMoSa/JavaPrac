package UT_12_1;

import java.util.ArrayList;

public class Pila <Object>{

    protected ArrayList<Object> llista = new ArrayList<>();

    public Pila() {
        llista = new ArrayList<>();
    }
    
    public boolean estaBuida(){
        return llista.isEmpty();
    }
    
    public int getTamany(){
        return llista.size();
    }
    
    public Object cima(){
        return llista.get(getTamany() - 1);
    }
    
    public Object traure(){
        Object o = this.cima();
        llista.remove(o);
        return o;
    }
    
    public void afegir(Object o){
        llista.add(o);
    }
    
}
