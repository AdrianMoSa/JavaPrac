import java.util.Scanner;

public class eClase6{ 
    
    public static void main(String[] args) {

    Scanner teclat = new Scanner(System.in);
    int nota;
    System.out.println("Diu-me una nota ");
    nota = teclat.nextInt();
    if((nota>=9)&&(nota==10)){
    System.out.println("Sobresalent");            
        }
        else if (nota==7){
         System.out.println("Notable");
            }
            else if (nota==6){
                 System.out.println("be"); 
                }
                else if (nota==5){
                 System.out.println("Suficient");            
                      }
                    else if ((nota<5)&&(nota>=0)){
                     System.out.println("insuficient");                     
                    }
                    else{
                    System.out.println("nota no valida");
                    }

    }
}
