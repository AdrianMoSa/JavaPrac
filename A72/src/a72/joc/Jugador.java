/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a72.joc;

import a72.joc.enums.EstatCasella;
import a72.joc.Tauler;
import a72.util.GestorIO;

/**
 *
 * @author ciclost
 */
public class Jugador {
    GestorIO teclat= new GestorIO();
    private EstatCasella color;

    public Jugador(EstatCasella color) {
        this.color = color;
    }
    public void cantarVictoria(){
       ;
       teclat.out("El jugador "+this.color+" ha guanyat la partida");
    }
    public String errorPosada(Tauler tauler, Coordenada coordenada){
     if(tauler.estaOcupada(coordenada)){
        return "La coordenada esta ocupada";
    }
     else{
     return null;
     }
    }
    public Coordenada recollirCoordenadaPosadaValida(Tauler tauler){
    Coordenada c1=new Coordenada();
    do{
    c1.recollir();
    }
    while(errorPosada(tauler, c1)!=null);
    return c1;
    
    }
    public void posarFitxa(Tauler tauler){
        
        teclat.out("Posa el jugador amb "+this.color+" ");
        tauler.posarFitxa(recollirCoordenadaPosadaValida(tauler), color);
        
    }
   
    
}
