import java.util.Scanner;
public class practica3_1{ 
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
int numero;
double notes;
boolean valid=false;
double notaMaxima=0;
double mitjana=0;
double acumulador=0;
System.out.print("Introdueix el nombre de notes ");
while(!teclat.hasNextInt()){
System.out.println("error, introduce un numero correcto ");
teclat.nextLine();
    }
numero=teclat.nextInt();
teclat.nextLine();
double[]arrayNotes= new double [numero];
System.out.println("Introduce el numero de notas ");
for(int i=0;i<numero;i++){
while(!teclat.hasNextDouble()){
System.out.println("error. Introduce la nota correcta ");
System.out.println("te faltan "+i +"notas");
teclat.next();
}
notes=teclat.nextDouble();
arrayNotes[i]=notes;
if (notes>notaMaxima){
notaMaxima=notes;
}
acumulador+=notes;
if(arrayNotes[i]<-1||arrayNotes[i]>10){
i--;
while((notes==-1.0)){
valid=true;
break;
}
mitjana=acumulador/i;
}

    }

for(int i=0;i<arrayNotes.length;i++){
System.out.print(arrayNotes[i]+" ");
}

}
}

