import java.util.Scanner;

public class eClase4{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    int any

    System.out.println("a que any va ser la introduccio de l'euro");
    any= teclat.nextInt();
    if (any==2002){
    System.out.println("Enhorabuena has acertat ");
    }       
    else if (any<2002){
         System.out.println("El any va a ser mes tard");
            
            }
        
       else if(any>2002){
        System.out.println("El any va a ser mes prompte");
        }
    }
}
