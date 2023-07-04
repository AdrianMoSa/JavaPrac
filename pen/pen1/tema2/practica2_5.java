import java.util.Scanner;

public class practica2_5{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    final double minimDescompte=300;
    final double descompte=10;
    final double maxim=600;
    double preuEstimat=0;
    boolean positiu= false;
    System.out.println("Introdueix el preu inicial ");
    double preuInicial = teclat.nextDouble();
    if (preuInicial>0){
        if (preuInicial>=minimDescompte&&preuInicial<maxim){
            preuEstimat=preuInicial*0.9; 
            System.out.println("el preu total es de "+preuEstimat);          
             }  
          if (preuEstimat>maxim){
            preuInicial=preuInicial-300;
            System.out.println("el valor total es "+preuInicial);            
            }
            else if (preuInicial<minim){
            System.out.println("El precio es "+preuInicial);            
            }
            
            
        }
            else{
            System.out.println("Error introdueix un preu positiu ");
            }
   }
}
