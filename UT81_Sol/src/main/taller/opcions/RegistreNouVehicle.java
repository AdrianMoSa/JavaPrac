/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import java.util.regex.Pattern;
import main.taller.tipusvehicles.Camio;
import main.taller.tipusvehicles.Cotxe;
import main.taller.Taller;
import main.taller.tipusvehicles.Furgoneta;
import main.taller.tipusvehicles.Microbus;
import main.taller.tipusvehicles.TipusVehicle;
import main.taller.tipusvehicles.Vehicle;
import main.util.GestorIO;
import main.util.Interval;
 
/**
 *
 * @author ciclost
 */
public class RegistreNouVehicle extends OpcioTaller {
  GestorIO teclat = new GestorIO();
    
    public RegistreNouVehicle(Taller taller) {
        super("Donar de alta el nou cotxe i posar a la cua", taller);
    }

    @Override
    public void executar() {
        GestorIO teclat = new GestorIO();
        Vehicle vehicle = this.recogirNouVehicle();
        if(taller.getColaInicial().teMatricula(vehicle.getMatricula())){
            teclat.out("No se ha pogut afeggir el vehícle. Ja existeix esa matrícula en la cua.");
        }
        else{
            taller.getColaInicial().afegir(vehicle);
            teclat.out("Vehícle affegit a la cua");
        }  
    }

    private Vehicle recogirNouVehicle() {
        
        TipusVehicle tipus = getTipusVehicle();
        
        switch (tipus) {
            case COTXE:
               return new Cotxe(getNumPlazas(2,7), getMatricula(), getModel(), getPotencia(200, 3000), getCilindres(2,6)); 
            
            case MICROBUS:
               return new Microbus(getNumPlazas(2,20), getMatricula(), getModel(), getCilindres(2,6)); 
               
            case FURGONETA:
               return new Furgoneta(getPMA(1,10), getMatricula(), getModel(), getCilindres(4,10));
               
            case CAMIO:
               return new Camio(getPMA(1, 20), getMatricula(), getModel(), getPotencia(1000, 4000), getCilindres(8,16));
            
        }
        return null;
    }
    
    
    private double getPMA(int min, int max) {
        return getValorDouble("PMA", min, max);
    }
    
    private int getNumPlazas(int min, int max) {
        return getValorInt("Nombre de places", min, max);
    }
    
    private int getCilindres(int min, int max) {
        return getValorInt("Cilindres", min, max);
    }
    private int getPotencia(int min, int max) {
        return getValorInt("Potencia", min, max);
    }
    
    private TipusVehicle getTipusVehicle() {
        boolean error;
        int opcio;

        do {
            teclat.out("¿Quin tipus de vehícle? [1:Cotxe, 2:Microbús, 3: Furgoneta, 4:Camio]:");
            opcio = teclat.inInt();
            error = !new Interval(1, 4).inclou(opcio);
            if (error) {
                teclat.out("Error! Deu de ser de un tipus valid");
            }
        } while (error);
        return TipusVehicle.tipusSegonIndex(opcio);
    }

    private String getMatricula() {
        String matricula;
        boolean error;
        do {
            teclat.out("¿Quina matricula? [DDDDLLL]:");
            matricula = teclat.inString();
            error = !Pattern.matches(Vehicle.PATRON_MATRICULA, matricula);
            if (error) {
                teclat.out("Error! Introdueix una matrícula valida");
            }
        } while (error);
        return matricula;
    }

    private String getModel() {
        
        teclat.out("¿Quin model?:");
        return teclat.inString();
    }

}
