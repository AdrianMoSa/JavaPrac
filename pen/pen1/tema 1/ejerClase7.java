import java.util.Scanner;

public class ejerClase7{

 public static void main(String[] args){
Scanner teclat= new Scanner(System.in);
System.out.println("Introduce un numero por teclado");
double numero=teclat.nextDouble();
teclat.nextLine();
System.out.println("Introduce un numero por teclado");
double numero2=teclat.nextDouble();
teclat.nextLine();

System.out.println("el resultado de la suma es "+(numero+numero2));
System.out.println("el resultado de la resta es "+(numero-numero2));
System.out.println("el resultado de la multiplicacion es "+(numero*numero2));
System.out.println("el resultado de la division es "+(numero/numero2));
}
}
