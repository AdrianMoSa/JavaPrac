/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.tipusvehicles;

import java.util.regex.Pattern;

/**
 *
 * @author ciclost
 */
public abstract class Vehicle {

    private String matricula;
    private String model;
    protected int potencia;
    protected int cilindres;
    
    public static final double PREUBASE = 15;
    public static final String PATRON_MATRICULA = "\\d{4}[A-Z]{3}";

    public Vehicle(String matricula, String model, int potencia, int cilindres) {
        assert Pattern.matches(PATRON_MATRICULA, matricula);

        this.matricula = matricula;
        this.model = model;
        this.potencia = potencia;
        this.cilindres = cilindres;
    }
    
    public Vehicle(String matricula, String model, int cilindres) {
        assert Pattern.matches(PATRON_MATRICULA, matricula);

        this.matricula = matricula;
        this.model = model;
        this.potencia = 0;
        this.cilindres = cilindres;
    }
   
    public boolean teEsta(String matricula) {
        assert matricula != null;
        return this.matricula.equals(matricula);
    }   
    
    @Override
    public String toString() {
        return "Matricula:" + matricula + " Modelo:" + model;
    }
    
    protected double preciBase() {
        return PREUBASE * cilindres;
    }
    
    public double calcularPreu() {
        return preciBase();
    }
    
    public String getMatricula(){
        return this.matricula;
    }
}
