/**
 * Autor: Ací ha d'anar el teu nom complet. IMPORTANT!!!
 */
import java.util.Scanner;
public class Exercici_1 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Mètodes básics: teclat.nextInt() teclat.nextDouble() teclat.nextLine() teclat.hasNextInt() teclat.hasNextDouble()
        int altura;
        System.out.print("Introdueix l'altura de la figura: ");
        altura=teclat.nextInt();
        for(int i=0;i<=altura;i++){
        for(int j=altura;j<=0;j--){
         System.out.print("*");   
        }
        teclat.nextLine();
        }
        
    } 
}
