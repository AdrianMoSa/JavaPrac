import java.util.Scanner;
public class eClase2_2{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
System.out.println("Introdueix un nombre per a multiplicar: ");
if (!teclat.hasNextInt()){
System.out.println("error. introdueix un nombre enter ");
}
else{

int numero=teclat.nextInt();

int i = 0;
while(i<=10){
System.out.println(numero+"x"+i+"="+(numero*i));

i++;
}

}
}
}
