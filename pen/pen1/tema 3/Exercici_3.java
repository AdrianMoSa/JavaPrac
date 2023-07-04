/**
 * Autor: Adrian Moya Sanchez
 */
import java.util.Scanner;
public class Exercici_3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Mètodes básics: teclat.nextInt() teclat.nextDouble() teclat.nextLine() teclat.hasNextInt() teclat.hasNextDouble()
        int partit1;
        int partit2;
        int partit3;
        int acumulador1=0;
        int acumulador2=0;
        int acumulador3=0;
        boolean acabar=false;
                
        System.out.println("--Dades Eleccions -- ");
        System.out.println("---------------------");
        for(int i=1;i<=7&&(!acabar);i++){
         
         System.out.println("DADES DE LA REGIO "+i+": ");
         System.out.print("vots del partit 1: ");
         while(!teclat.hasNextInt()||(partit1=teclat.nextInt())<0){
         teclat.nextLine();
         System.out.println("ERROR. VALOR INCORRECTE ");
         acabar=true;
         }
         acumulador1+=partit1;    
          teclat.nextLine();
       
         System.out.print("Vots del partit 2: ");
         while(!teclat.hasNextInt()||(partit2=teclat.nextInt())<0){
         teclat.nextLine();
         System.out.println("ERROR. VALOR INCORRECTE ");
         acabar=true;
         } 
          acumulador2+=partit2;
          teclat.nextLine(); 

         
         System.out.print("Vots del partit 3: ");
         while(!teclat.hasNextInt()||(partit3=teclat.nextInt())<0){
         teclat.nextLine();
         System.out.println("ERROR. VALOR INCORRECTE ");
         acabar=true;
         } 
          acumulador3+=partit3;
          teclat.nextLine();            
         
        
      
        }
        
         if(acabar=false){
        System.out.println("error");
        teclat.close();        
        }
        if(acumulador1>acumulador2&&acumulador1>acumulador3){
        System.out.println("\nEL partit 1 ha guanyat las eleccions ");
        System.out.println("\nResultats finals");
        System.out.println("partit 1: "+acumulador1+" vots ");
        System.out.println("partit 2: "+acumulador2+" vots ");
        System.out.println("partit 3: "+acumulador3+" vots ");
          }

        else if(acumulador2>acumulador1&&acumulador2>acumulador3){
        System.out.println("\nEL partit 2 ha guanyat las eleccions ");
        System.out.println("\nResultats finals");
        System.out.println("partit 1: "+acumulador1+" vots ");
        System.out.println("partit 2: "+acumulador2+" vots ");
        System.out.println("partit 3: "+acumulador3+" vots ");
          }
         else if(acumulador3>acumulador1&&acumulador3>acumulador2){
        System.out.println("\nEL partit 3 ha guanyat las eleccions ");
        System.out.println("\nResultats finals");
        System.out.println("partit 1: "+acumulador1+" vots ");
        System.out.println("partit 2: "+acumulador2+" vots ");
        System.out.println("partit 3: "+acumulador3+" vots ");
          }
        else if(acumulador1==acumulador2&&acumulador1!=acumulador3){
        System.out.println("\nEL partit 1 ha guanyat las eleccions ");
        System.out.println("\nEL partit 2 ha guanyat las eleccions ");
        System.out.println("\nResultats finals");
        System.out.println("partit 1: "+acumulador1+" vots ");
        System.out.println("partit 2: "+acumulador2+" vots ");
        System.out.println("partit 3: "+acumulador3+" vots ");
          }
        else if(acumulador1==acumulador3&&acumulador1!=acumulador2){
        System.out.println("\nEL partit 1 ha guanyat las eleccions ");
        System.out.println("\nEL partit 3 ha guanyat las eleccions ");
        System.out.println("\nResultats finals");
        System.out.println("partit 1: "+acumulador1+" vots ");
        System.out.println("partit 2: "+acumulador2+" vots ");
        System.out.println("partit 3: "+acumulador3+" vots ");
          }
        else if(acumulador2==acumulador3&&acumulador3!=acumulador1){
        System.out.println("\nEL partit 2 ha guanyat las eleccions ");
        System.out.println("\nEL partit 3 ha guanyat las eleccions ");
        System.out.println("\nResultats finals");
        System.out.println("partit 1: "+acumulador1+" vots ");
        System.out.println("partit 2: "+acumulador2+" vots ");
        System.out.println("partit 3: "+acumulador3+" vots ");
          }
        else{
        System.out.println("\nEL partit 1 ha guanyat las eleccions ");
        System.out.println("\nEL partit 2 ha guanyat las eleccions ");
        System.out.println("\nEL partit 3 ha guanyat las eleccions ");
        System.out.println("\nResultats finals");
        System.out.println("partit 1: "+acumulador1+" vots ");
        System.out.println("partit 2: "+acumulador2+" vots ");
        System.out.println("partit 3: "+acumulador3+" vots ");        
        }
        
    } 
}
