import java.util.Scanner;

public class multiLinea{

 public static void main(String[] args){
Scanner teclat= new Scanner(System.in);
int multi1;
int multi2;
System.out.println("Introduce dos numeros ");
multi1=teclat.nextInt(); multi2=teclat.nextInt();
teclat.nextLine();
System.out.println(multi1+ " x " +multi2+ " = " +multi1*multi2);
}

}
