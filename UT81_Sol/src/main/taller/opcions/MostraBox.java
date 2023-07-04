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
public class MostraBox extends OpcioTaller{

    public MostraBox(Taller taller) {
        super("Mostra box", taller);
    }

    @Override
    public void executar() {
        taller.getBox().mostrar();
                    
    }
    
    
}
