import java.util.Scanner;
public class eClase2_6{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
int numero;
boolean error=false;
do{
if (error){
    System.out.println("error introduce un numero entre 0 y 10");
    teclat.nextLine();
}
System.out.println("Introduce un numero entre 0 y 10");
numero=teclat.nextInt();

error=(!teclat.hasNextInt()||(numero=teclat.nextInt())<0||numero>10);

} while (error);


System.out.println("tu numero es el "+numero);
}
}
