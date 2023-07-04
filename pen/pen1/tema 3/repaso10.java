import java.util.Scanner;
public class repaso10{ 
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
int numero;
int acumulador=0;
System.out.println("Introduce un numero para calcular el factorial ");
while(!teclat.hasNextInt()||(numero=teclat.nextInt())<0){
teclat.nextLine();
System.out.println("Error caracter invalido ");
}
System.out.print(numero+"!=");
for(int i=numero;i>1;i--){
acumulador +=i*numero;
System.out.print(i+" * ");
numero*=i-1;
}
System.out.print("1= " + numero);
}
}
