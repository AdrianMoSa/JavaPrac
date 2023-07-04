import java.util.Scanner;
public class eClase2_5{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
int numero;
System.out.println("Introduce un numero entero");
while(!teclat.hasNextInt()){
System.out.println("error, introduce un numero entero");
teclat.nextLine();

}
numero=teclat.nextInt();
System.out.println("Tu numero es el " +numero);
}
}
