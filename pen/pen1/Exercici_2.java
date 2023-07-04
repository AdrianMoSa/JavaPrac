/**
 * Autor: Ací ha d'anar el teu nom complet. IMPORTANT!!!
 */
import java.util.Scanner;
public class Exercici_2 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Mètodes básics: teclat.nextInt() teclat.nextDouble() teclat.nextLine() teclat.hasNextInt() teclat.hasNextDouble()
        int [][] matriu={{8,1,0,2},{9,0,5,8},{3,2,3,1},{8,0,4,3}};
        int numero;
        boolean encontrat=false;
        
        System.out.print("Introdueix el valor que busques: ");
        while(!teclat.hasNextInt()){
            teclat.nextLine();
            System.out.print("ERROR. Introdueix el valor que busques: ");

        }
        numero=teclat.nextInt();

        for(int i=0;i<matriu.length&&!encontrat;i++){
            for(int j=0;j<matriu[i].length&&!encontrat;j++){
                if (numero==matriu[i][j]){
                     encontrat=true;
                     System.out.println("El valor "+numero+" es troba en la fila "+(i+1)+" i columna "+(j+1));
                }
            
            }
            
            }
        if(!encontrat){
            System.out.println("El valor introduit no es troba en la matriu");
        }
        
    } 
}