/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import main.taller.LlistaVehicles;
import main.taller.Taller;
import main.taller.opcions.CalculIngressos;
import main.taller.opcions.CalculIPagamentsRevisats;
import main.taller.opcions.MostraBox;
import main.taller.opcions.MostraBoxes;
import main.taller.opcions.PasDeFase;
import main.taller.opcions.ReclamacioVehicle;
import main.taller.opcions.RegistreNouVehicle;
import main.taller.opcions.Eixir;

/**
 *
 * @author ciclost
 */
public class ITV {

    private opcions menu;
    private Taller taller;
    private LlistaVehicles vehiclesFinalitzats;
    private boolean fin;
    
    public ITV() {
        
        this.fin = false;
        this.taller = new Taller();
        this.vehiclesFinalitzats = new LlistaVehicles();
        
        this.menu = new opcions();
        this.menu.afeggir(new RegistreNouVehicle(taller));
        this.menu.afeggir(new ReclamacioVehicle(taller));
        this.menu.afeggir(new PasDeFase(taller));
        this.menu.afeggir(new MostraBox(taller));
        this.menu.afeggir(new MostraBoxes(taller));
        this.menu.afeggir(new CalculIPagamentsRevisats(taller, vehiclesFinalitzats));
        this.menu.afeggir(new CalculIngressos(vehiclesFinalitzats));
        this.menu.afeggir(new Eixir(this));
    }
    
    
    private void inici() {
        
        do {
            menu.mostrar();
            menu.getOpcio().executar();
          
        } while (!fin);
    }
    
    public void finalitzar(){
        this.fin = true;
    }

    public static void main(String[] args) {
        new ITV().inici();
    }
    

}
