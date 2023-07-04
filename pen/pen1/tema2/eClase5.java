import java.util.Scanner;

public class eClase5{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    System.out.println("Introdueix un caracter per teclat");
    char numer=teclat.nextLine().charAt(0);
    
    if((numer>='0')&&(numer<='9')){
    System.out.println("El "+numer+" es numeric");    
    } 
    else{
    System.out.println("El "+numer+" no es numeric");    
    }
   
}
    }
