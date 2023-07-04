import java.util.Scanner;
public class repaso1{ 
    int numero;
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
System.out.println("Di un numero para saber el dia de la semana ");
  while(!teclat.hasNextInt()||(numero=teclat.nextInt())<1||numero>7){
    teclat.nextLine();
    System.out.println("error valor invalid ");
    System.out.print("Introdueix un nombre entre 1 y 7 per als dies : ");
}
teclat.nextLine();
switch (numero){
case 1:
System.out.println("Lunes");
break;
case 2:
System.out.println("Martes");
break;
case 3:
System.out.println("Miercoles");
break;
case 4:
System.out.println("Jueves");
break;
case 5:
System.out.println("Viernes");
break;
case 6:
System.out.println("Sabado");
break;
case 7:
System.out.println("Domingo");
break;

}

}
}
