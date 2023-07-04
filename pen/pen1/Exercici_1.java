/**
 * Autor: Ací ha d'anar el teu nom complet. IMPORTANT!!!
 */
import java.util.Scanner;
public class Exercici_1 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Mètodes básics: teclat.nextInt() teclat.nextDouble() teclat.nextLine() teclat.hasNextInt() teclat.hasNextDouble()
        int [][] matriu={{8,1,0,2},{9,0,5,8},{3,2,3,1},{8,0,4,3}};
        
        for (int i=0;i<matriu.length;i++){
            for (int j=0;j<matriu[i].length;j++){
                System.out.print(matriu[i][matriu[i].length-j-1]+"");
            }
            System.out.println();    
        }
        
    } 
}