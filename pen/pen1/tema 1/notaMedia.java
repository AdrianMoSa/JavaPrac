import java.util.Scanner;

public class notaMedia{

 public static void main(String[] args){
Scanner teclat= new Scanner(System.in);
System.out.println("Introduce la primera nota");
double nota1=teclat.nextDouble();
teclat.nextLine();
System.out.println("Introduce la segunda nota");
double nota2=teclat.nextDouble();
teclat.nextLine();
System.out.println("Introduce la nota que deseas ");
double notaDeseo=teclat.nextDouble();
teclat.nextLine();
double resultado= notaDeseo*3-nota1-nota2;
System.out.println("Debes sacar un " +resultado+" en el tercer trimestre");

}
}

