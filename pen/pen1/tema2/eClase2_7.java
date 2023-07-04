import java.util.Scanner;
public class eClase2_7{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
System.out.println("Introdueix un nombre  per a multiplicar: ");
if (!teclat.hasNextInt()){
System.out.println("error. introdueix un nombre enter ");
}
else{

int numero=teclat.nextInt();
teclat.nextLine();
System.out.println("Introdueix el nombre maxim ");
if (!teclat.hasNextInt()){
System.out.println("error. introdueix un nombre enter  ");
}
else{
int maxim=teclat.nextInt();
teclat.nextLine();
for(int i=0;i<=maxim;i++){
System.out.println(numero+"x"+i+"="+(numero*i));


}
}
}
}
}
