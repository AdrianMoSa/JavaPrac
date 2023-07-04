/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_1;

/**
 *
 * @author reyes
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        double aleatorios = 0;
//        
//        for(int i=0; i<10; i++){
//            aleatorios = (int)(Math.random()*((150 - (-50)) + 1) + (-50));
//            System.out.println(aleatorios);
//        }

        double[] aleatorios = new double[5];
        
        for(int i=0; i<aleatorios.length; i ++){
            aleatorios[i] = (int)(Math.random()* 500);
        }
        
        for(int i=0; i<aleatorios.length; i ++){
            System.out.println((i = (int)(Math.random()* 5))+": "+aleatorios[i]+" ");
        }
        
        System.out.println("\n"+aleatorios[(int)(Math.random()* 5)]);
    }
}
