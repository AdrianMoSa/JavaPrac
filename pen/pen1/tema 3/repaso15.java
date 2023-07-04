import java.util.Scanner;
public class repaso19{ 
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
int numero;
boolean acertado=false;
final double random=(int)(math.random()*10000);
System.out.println("Introdueix un nombre de 4 cifres ");

for(int i=0;!acertado||i<4;i++){
while(!teclat.hasNextDouble()||(numero=teclat.nextInt())<0||numero>9000){
teclat.nextLine();
System.out.println("error introdueix un nombre de 4 xifres");
}
if(numero==random){}
boolean acertado=true;

}
if(acertado){
System.out.println("HAS ACERTADO");
}
else{
System.out.println("Lo siento has fallado");
}
}
}
