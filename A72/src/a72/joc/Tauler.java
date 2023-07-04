/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a72.joc;

import a72.joc.enums.EstatCasella;
import a72.joc.Coordenada;
import a72.util.GestorIO;
/**
 *
 * @author ciclost
 */
public class Tauler {
    private EstatCasella [][] caselles;
    private final static int DIMENSIO=3;

    public Tauler() {
        caselles=new EstatCasella[DIMENSIO][DIMENSIO];
        buidar();
    }
    public boolean hiHaTresEnRatlla(EstatCasella estatCasella){
   
     for(int i=0;i<caselles.length;i++){
        if(caselles[i][i].equals(estatCasella.OS)||caselles[i][i].equals(estatCasella.XS)){
            return true;
        }
        for(int j=0;j<caselles[i].length;j++){
            if(caselles[i][j].equals(estatCasella.OS)||caselles[i][j].equals(estatCasella.XS)||caselles[j][i].equals(estatCasella.OS)||caselles[j][i].equals(estatCasella.XS)){
            return true;    
            }
        }
    }
    
    for(int i=caselles.length-1;i>=0;i++){
        if(caselles[i][i].equals(estatCasella.OS)||caselles[i][i].equals(estatCasella.XS)){
            return true;
        }
    }
    
    return false;
    }
    
    public boolean hiHaTresEnRatlla(){
        if(hiHaTresEnRatlla(EstatCasella.OS)){
           return true;
        }
           else if(hiHaTresEnRatlla(EstatCasella.XS)){
               return true;
       }
           return false;
    }
    public boolean estaOcupada(Coordenada coordenada,EstatCasella estatCasella){
        if(caselles[coordenada.getFila()-1][coordenada.getColumna()-1]==estatCasella){
         return true;
        }
        return false;
    }
    public boolean estaOcupada(Coordenada coordenada){
        if(caselles[coordenada.getFila()-1][coordenada.getColumna()-1]!=EstatCasella.BUIDA){
            return true;
        }
        return false;
    }
    public void posarFitxa(Coordenada coordenada, EstatCasella estatCasella){
    
    caselles[coordenada.getFila()-1][coordenada.getColumna()-1]=estatCasella;
    
    }
    public void buidar(){
        for (int i=0;i<caselles.length;i++){
            for(int j=0;j<caselles[i].length;j++){
                caselles[i][j]=EstatCasella.BUIDA;
            }
        }
    }
    public boolean estaPle(){
        for (int i=0;i<caselles.length;i++){
            for(int j=0;j<caselles[i].length;j++){
                if(caselles[i][j]==EstatCasella.BUIDA);
                return false;
            }
        }
    
        return true;
    }
    public void mostrar(){
        GestorIO teclat=new GestorIO();
        for(int i=0;i<caselles.length;i++){
            for(int j=0;j<caselles[i].length;j++){
                teclat.out(caselles[i][j]+" ");
            }
            teclat.out("\n");
        }
    }
    
}
