import java.util.Scanner;

public class practica2_6{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    int numer1;
    int numer2;
    int opcio;
    System.out.println ("Di dos numers enters :");
    numer1=teclat.nextInt();
    numer2=teclat.nextInt();
    teclat.nextLine();
    System.out.println(" opcio 1: suma ");
    System.out.println(" opcio 2: resta ");
    System.out.println(" opcio 3: multiplicacio ");
    System.out.println(" opcio 4: divisio ");
    System.out.print(" Selecciona una opcio: ");
    opcio=teclat.nextInt();
    teclat.nextLine();
    switch(opcio){
    case 1:
    System.out.println("El resultat de la suma es: "+(numer1+numer2));
    break;
     case 2:
    System.out.println("El resultat de la resta es: "+(numer1-numer2));
    break;   
    case 3:
    System.out.println("El resultat de la multiplicacio es: "+(numer1*numer2));
    break;
    case 4:
    System.out.println("El resultat de la divisio es: "+(numer1/numer2));
    break;
    default:
    System.out.println("No has introducido un numero correcto ");
    }
    
    }
}
