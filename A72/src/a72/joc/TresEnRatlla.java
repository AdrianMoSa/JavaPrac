/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a72.joc;

import a72.joc.enums.EstatCasella;
import a72.joc.Jugador;



/**
 *
 * @author ciclost
 */
public class TresEnRatlla {
    private Tauler tauler;
    private Jugador[] jugador;
    private Torn torn;
    public TresEnRatlla() {
        tauler=new Tauler();
        jugador=new Jugador[2];
        jugador[0]=new Jugador(EstatCasella.XS);
        jugador[1]=new Jugador(EstatCasella.OS);
        torn=new Torn();
        
    }
    
    public void Jugar(){
        do{
            while(!this.tauler.estaPle()){
            this.tauler.buidar();
            }
            
            this.tauler.mostrar();
            torn.toca();
          if(torn.toca()==0){
              jugador[0].posarFitxa(tauler);
              
          }
          else if(torn.toca()==1){
              jugador[1].posarFitxa(tauler);
          }
           torn.cambiar();
            
        }
        while(this.tauler.hiHaTresEnRatlla());
        jugador[torn.toca()].cantarVictoria();
    }
    public static void main(String[] args) {
        TresEnRatlla t1=new TresEnRatlla();
        t1.Jugar();
        
    }
    
}
