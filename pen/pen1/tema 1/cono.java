import java.util.Scanner;

public class cono{

 public static void main(String[] args){
    Scanner teclat= new Scanner(System.in);
    final double PI= 3.14;
    System.out.println("Introdueix l'altura");
    Double altura=teclat.nextDouble();
    teclat.nextLine();
    System.out.println("Introdueix el radi");
    Double radi=teclat.nextDouble();
    teclat.nextLine();
    final Double volumen= PI*radi*radi*altura/3;
    System.out.println("El volumen total es "+volumen);
    }
}
