import java.util.Scanner;
public class repaso19{ 
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
int numero;
String espacio=" ";
System.out.println("Introduce un numero para calcular el factorial ");
while(!teclat.hasNextInt()||(numero=teclat.nextInt())<0&&numero>20){
teclat.nextLine();
System.out.println("Error caracter invalido ");
}
for(int i=1;i<=numero;i++){
System.out.print("* ");
for(int j=0;j<=numero;j++){
System.out.print(espacio+"* "+espacio);

}
System.out.println();
}

}
}
