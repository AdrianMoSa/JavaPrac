import java.util.Scanner;

public class euros{

 public static void main(String[] args){

final double euros= 1.17;

Scanner teclat= new Scanner(System.in);
System.out.println("Introdueix una quantitat en dolars");
double dolares= teclat.nextDouble();
System.out.println(dolares+"€ es igual a "+euros*dolares+"$");

    }
}
