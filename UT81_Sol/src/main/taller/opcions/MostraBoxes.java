/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import main.taller.Taller;

/**
 *
 * @author ciclost
 */
public class MostraBoxes extends OpcioTaller{

    public MostraBoxes(Taller taller) {
        super("Mostrar taller completo", taller);
    }

    @Override
    public void executar() {
        taller.getColaInicial().mostrar();
        taller.mostrarBoxes();
    }
    
    
    
    
}
