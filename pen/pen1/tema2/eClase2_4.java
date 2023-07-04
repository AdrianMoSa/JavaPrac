import java.util.Scanner;
public class eClase2_4{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
int cociente=0;
System.out.println("Introdueix un nombre per a dividir: ");
if (!teclat.hasNextInt()){
System.out.println("error. introdueix un nombre enter ");
}
else{
int dividendo=teclat.nextInt();
teclat.nextLine();
System.out.println("Introdueix el denominador");
if (!teclat.hasNextInt()){
System.out.println("error. introdueix un nombre enter ");
}
else{
int divisor=teclat.nextInt();
while (dividendo>0){
cociente++;
dividendo= dividendo-divisor;
}
System.out.println("resto " + cociente);
System.out.println("cociente " +(-dividendo));




}
}
}
}
