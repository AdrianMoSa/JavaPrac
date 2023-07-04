import java.util.Scanner;
public class ut2_3_3{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
System.out.println("Diu un nombre ");
int numero=teclat.nextInt();
for(int i=numero;i!=0;i/=10){

System.out.println("cifra " + (i%10));

}



}
}
