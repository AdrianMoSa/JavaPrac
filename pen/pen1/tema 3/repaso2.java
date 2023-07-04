import java.util.Scanner;
public class repaso2{ 
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
int acumulador=0;

for(int i=0;i<3;i++){
System.out.println("introduce un numero");
while(!teclat.hasNextInt()){
System.out.println("error introduce un numero");
teclat.nextLine();
}
int numero=teclat.nextInt();
    if(numero>acumulador){
    acumulador=numero;
    }
System.out.println(+acumulador);
}
System.out.println("el numero mayor es "+acumulador);
}
}
