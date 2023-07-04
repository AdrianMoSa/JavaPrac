package UT_12_1;

import java.util.ArrayList;

public class Cua {

    protected ArrayList<Object> llista = new ArrayList<>();

    public Cua() {
        llista = new ArrayList<>();
    }
    
    public boolean estaBuida(){
        return llista.isEmpty();
    }
    
    public int getTamany(){
        return llista.size();
    }
    
    public Object primer(){
        return llista.get(0);
    }
    
    public Object traure(){
        Object o = llista.get(getTamany() - 1);
        llista.remove(o);
        return o;
    }
    
    public void afegir(Object o){
        llista.add(o);
    }
}
