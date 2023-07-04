/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opcions;

import main.ITV;

/**
 *
 * @author ciclost
 */
public class Eixir extends Opcio{
    private ITV itv;
    public Eixir(ITV itv) {
        super("Eixir del programa");
        this.itv = itv;
    }

    @Override
    public void executar() {
        itv.finalitzar();
    }
    
}
