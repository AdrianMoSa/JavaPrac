import java.util.Scanner;

public class practica11{

 public static void main(String[] args){
int numero1;
int numero2;
int numero3;

    Scanner teclat= new Scanner(System.in);
    System.out.println("introduce un numero");
    numero1 = teclat.nextInt();
    System.out.println("Introduce otro numero");
    numero2 = teclat.nextInt();
    System.out.println("Introduce el ultimo numero");
    numero3 = teclat.nextInt();
    System.out.println("El resultado de la multiplicacion es "+numero1*numero2*numero3);


    } 

}
