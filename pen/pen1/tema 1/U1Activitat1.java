/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */
import java.util.Scanner;

public class U1Activitat1 {
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
	
        System.out.print("Dis-me el valor del radi d'un cercle: ");
        double radi = teclat.nextDouble();
        teclat.nextLine();
    
        
        System.out.print("\nAra dis-me el valor de la base d'un rectangle: ");
        double base = teclat.nextDouble();
        teclat.nextLine();
       
        
        System.out.print("\nNo oblides dir-me també el valor de l'altura del rectangle: ");
        double altura = teclat.nextDouble();
        teclat.nextLine();
        
        
        final double PI = 3.14;
        double perimetre = 2*PI*radi;
        double areaCercle = PI*(radi*radi);
        double areaRectangle = base*altura;
        
        System.out.printf("\nDe moment tenim un cercle de perímetre %.2f i àrea %.2f, i un rectangle d'àrea %.2f\n",perimetre,areaCercle,areaRectangle);
        
        System.out.print("\nM'agrada el teorema de Pitágores, dis-me el valor del catet 1: ");
        double catet1 = teclat.nextDouble();
        teclat.nextLine();
        
        System.out.print("\nI també el catet 2: ");
        double catet2 = teclat.nextDouble();
        teclat.nextLine();
        
        double hipotenusaCuadrat = (catet1*catet1+catet2*catet2);
        double hipotenusa = Math.sqrt(catet1*catet1+catet2*catet2);
        
        System.out.printf("\nD'acord, el valor de la hipotenusa al quadrat és %.2f, per tant, el valor de la hipotenusa és: %.2f\n",hipotenusaCuadrat,hipotenusa);
        
        teclat.close();
    } 
}
