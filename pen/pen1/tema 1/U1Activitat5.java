/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */

import java.util.Scanner;

public class U1Activitat5 {
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    double temperaturaGrados;
    double Fahrenheit;
    double vientoKm;
    double vientoM;
    double temperaturaReal;
    
    System.out.println("CÀLCUL DE LA TEMPERATURA REAL ");
    System.out.println("---------------------------------------\t");
    System.out.print("Introdueix la temperatura (ºC): ");
    temperaturaGrados = teclat.nextDouble();
    teclat.nextLine();
    Fahrenheit= ((temperaturaGrados*1.8)+32);
    System.out.print("Introdueix la velocitat del vent (km/h): ");
    vientoKm = teclat.nextDouble();
    teclat.nextLine();
    vientoM = (vientoKm/1.6);
    temperaturaReal= (35.74+0.6215*Fahrenheit-35.75 *Math.pow(vientoM,0.16)+0.4275*Fahrenheit * Math.pow(vientoM,0.16));
    temperaturaReal=(temperaturaReal-32)*5/9;
    System.out.printf("\nLa temperatura real es %.2f \n",temperaturaReal);
    teclat.close();
    
    

    }
}
