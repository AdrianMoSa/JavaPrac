import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nombre1, nombre2, resultat;


        System.out.print("Introdueix el primer valor: ");
        nombre1 = lector.nextInt();
        System.out.print("Introdueix el segon valor: ");
        nombre2 = lector.nextInt();
        resultat = nombre1 + nombre2;
        System.out.println("La suma és: "+ resultat);
        lector.close();
    }
} 

