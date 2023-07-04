import java.util.Scanner;

public class practica2_4{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    
    
    System.out.println("Introdueix una nota "); 
    double nota=teclat.nextDouble();
    if(nota>=9){
        System.out.println("excelent");
        }
    else if (nota>=6.5){
     System.out.println("notable");    
        }
    else if (nota>=5){
        System.out.println("aprovat");    
        }
    else {
        System.out.println("suspes");    
        }
    }
}
