import java.util.Scanner;
public class ut2_3_1{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
int acumulador=0;
int maxim;
System.out.println("Diu un maxim ");
maxim=teclat.nextInt();

for(int i=0;i<maxim;i++){
System.out.println("Introdueix nombres ");
acumulador+=teclat.nextInt();

}
System.out.println("El nombre total es "+acumulador);
}
}
