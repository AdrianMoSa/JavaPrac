import java.util.Scanner;
public class ut2_3_4{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
System.out.println("Diu un nombre positiu ");
int numero=teclat.nextInt();
for(int i=numero;i>0;i--){
numero*=i;


}
System.out.println("el factorial es " +numero);


}
}
