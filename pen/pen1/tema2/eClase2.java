import java.util.Scanner;

public class eClase2{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    System.out.println("Introdueix el dividendo ");
    int dividendo = teclat.nextInt();
    System.out.println("Introdueix el divisor ");
    int divisor = teclat.nextInt();
    if (divisor==0){
    System.out.println("error no se puede dividir"); 
    }
    else{
    System.out.println("El resultat es "+(divisor/dividendo));    
        
    }      
    

  }    
     }
