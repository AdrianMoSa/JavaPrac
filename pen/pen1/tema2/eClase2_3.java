import java.util.Scanner;
public class eClase2_3{ 
    
    public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
System.out.println("Introdueix un nombre per a multiplicar: ");
if (!teclat.hasNextInt()){
System.out.println("error. introdueix un nombre enter ");
}
else{

int numero=teclat.nextInt();
int acumulador=0;
int i = 0;
while(i<=numero){
    if((numero%3==0)){
    acumulador+=numero;
    System.out.println(+acumulador);

    }
i++;
}

System.out.println(+acumulador);



}

}

}


