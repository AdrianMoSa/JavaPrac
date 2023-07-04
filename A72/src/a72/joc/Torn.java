/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a72.joc;

/**
 *
 * @author ciclost
 */
public class Torn {

    private int valor;
    public Torn() {
        this.valor=(int)Math.random()*2;
    }
    
    public int toca(){
        return valor;
    }
    public int noToca(){
        if (valor==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void cambiar(){
        if(valor==0){
            valor=1;
        }
        else{
            valor=0;
        }
    }
}
