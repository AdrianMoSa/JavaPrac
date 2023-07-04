import java.util.Scanner;
public class repaso16{ 
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
int numero;
int xifres=0;
System.out.println("dime un numero ");
numero=teclat.nextInt();
for(int i=numero;i!=0;i/=10){
xifres++;
}
System.out.println("El programa "+numero+" te "+xifres+" xifres");
}
}
