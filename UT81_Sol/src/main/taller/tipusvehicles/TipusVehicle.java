/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.tipusvehicles;

import main.util.Interval;

/**
 *
 * @author ciclost
 */
public enum TipusVehicle {
    COTXE, FURGONETA, MICROBUS, CAMIO, NADA;
    
    public static final TipusVehicle tipusSegonIndex(int index) {
        
        assert new Interval(1,4).inclou(index);
        
        switch(index) {
            case 1:
                return COTXE;
            case 3:
                return FURGONETA;
            case 2:
                return MICROBUS;
            case 4:
                return CAMIO;
        }
        
        return NADA;
    }
    
    @Override
    public String toString() {
        switch(this) {
            case COTXE:
                return "Cotxe";
                
            case FURGONETA:
                return "Furgoneta";
                
            case MICROBUS:
                return "Microbús";
                
            case CAMIO:
                return "Camió";
        }
        
        return null;
    }
}
