import java.util.Scanner;
public class repaso9{ 
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
int numero;

System.out.println("Introduce un numero para calcular el factorial ");
while(!teclat.hasNextInt()||(numero=teclat.nextInt())<0&&numero>20){
teclat.nextLine();
System.out.println("Error caracter invalido ");
}
for(int i=numero;i>0;i--){
for(int j=i;j>0;j--){
System.out.print(i+" ");
}
System.out.println();
}

}
}
