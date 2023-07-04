import java.util.Scanner;
public class eClase2_1{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
System.out.println("Cuants guions vols affegir: ");
int guion=0;
if ((!teclat.hasNextInt())&&(guion=teclat.nextInt()<=0)){
System.out.println("error. introdueix un nombre enter ");
}
else{

int i = 0;
while(i<guion){
System.out.print("_ ");

i++;
}
}

}
}
