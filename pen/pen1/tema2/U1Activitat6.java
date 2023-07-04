/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */

import java.util.Scanner;

public class U1Activitat6{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    int reste;   
    final int moneda50 =50;
    final int moneda20 = 20;
    final int moneda10 = 10;
    final int moneda5 = 5;
    final int moneda2 = 2;
    final int moneda1 = 1;
    
    System.out.println(" - MÀQUINA DE BEGUDES -");
    System.out.println("-------------------------------- ");
    System.out.print("Introdueix el preu de la beguda que vols: ");
    int preuBeguda = teclat.nextInt();
    teclat.nextLine();
    System.out.print("Diners que introdueixes a la màquina en centims (màxim 100): ");
    int diners = teclat.nextInt();
    teclat.nextLine();
    reste = diners-preuBeguda;
    System.out.println("El seu canvi es : "+reste);
    System.out.println("La quantitat de monedes de 50 cèntims ès: " +(reste/moneda50));
    reste %= moneda50;
    System.out.println("La quantitat de monedes de 20 cèntims ès: " +(reste/moneda20));
    reste %= moneda20;
    System.out.println("La quantitat de monedes de 10 cèntims ès: " +(reste/moneda10));
    reste %= moneda10;
    System.out.println("La quantitat de monedes de 5 cèntims ès: " +(reste/moneda5));
    reste %= moneda5;
    System.out.println("La quantitat de monedes de 2 cèntims ès: " +(reste/moneda2));
    reste %= moneda2;
    System.out.println("La quantitat de monedes de 1 cèntims ès: " +(reste/moneda1));
    reste %= moneda1;
    teclat.close();
    }
}
    



    
