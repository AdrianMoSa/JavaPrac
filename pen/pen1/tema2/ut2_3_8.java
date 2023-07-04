import java.util.Scanner;
public class ut2_3_8{ 
    
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
System.out.println("introduce un numero de columnas ");
int numero=teclat.nextInt();
    for(int i=numero;i>=0;i--){
        for(int j=0;j<=i;j++){

System.out.print("*");

        }
System.out.println();
    }

}
}
