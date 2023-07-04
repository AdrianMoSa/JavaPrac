import java.util.Scanner;

public class eClase7{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);
    int numer;
    final int correcte=26;
    System.out.println("Endevina un numero entre 1 y 100 ");
    numer=teclat.nextInt();
    if (numer==correcte){
    System.out.println("Enhorabona has acertat");
        }
    else{
    System.out.println("Ho sent eixe no es el numer correcte");
        }

    }
}
