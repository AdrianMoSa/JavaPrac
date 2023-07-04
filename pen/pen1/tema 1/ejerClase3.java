import java.util.Scanner;

public class ejerClase7{

 public static void main(String[] args){
Scanner teclat= new Scanner(System.in);


System.out.println("Introduce el primer numero ");
int numero= teclat.nextInt();
teclat.nextLine();

System.out.println("Introduce el segundo numero ");
int numero2=teclat.nextInt();
teclat.nextLine();
System.out.println(numero%numero2 == 0);


    }
}
