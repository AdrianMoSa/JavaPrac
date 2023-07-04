/**
 * Autor: Ací ha d'anar el teu nom complet. IMPORTANT!!!
 */
import java.util.Scanner;
public class Exercici_2 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Mètodes básics: teclat.nextInt() teclat.nextDouble() teclat.nextLine() teclat.hasNextInt() teclat.hasNextDouble()
     double operand1;
     double operand2;
     double resultat;
     String aritmetic ="";
    System.out.println("Introdueix una operacio (operand1 operand2 operador) ");
    if(!teclat.hasNextInt()||aritmetic.equals(" *")||aritmetic.equals(" +")||aritmetic.equals(" /")||aritmetic.equals(" -")){
    System.out.println("error.Operacion invalida ");
    }
     operand1=teclat.nextDouble();
     operand2=teclat.nextDouble();
     aritmetic=teclat.nextLine();
    
    if(aritmetic.equals(" *")){
    resultat= operand1*operand2;
    System.out.printf("\n La operacio es %.1f %s %.1f = %.1f  " ,operand1,aritmetic,operand2,resultat);
     
    }   
    
    else if(aritmetic.equals(" /")){
    resultat= operand1/operand2;
    System.out.printf("\n La operacio es %.1f %s %.1f = %.1f  " ,operand1,aritmetic,operand2,resultat);
     
    }  
    else if(aritmetic.equals(" +")){
    resultat= operand1+operand2;
    System.out.printf("\n La operacio es %.1f %s %.1f = %.1f  " ,operand1,aritmetic,operand2,resultat);
     
    }  
    else if(aritmetic.equals(" -")){
    resultat= operand1-operand2;
    System.out.printf("\n La operacio es %.1f %s %.1f = %.1f  " ,operand1,aritmetic,operand2,resultat);
    
    }
    else{
    System.out.println("Error. Operación invalida");    
    }
    } 
}
