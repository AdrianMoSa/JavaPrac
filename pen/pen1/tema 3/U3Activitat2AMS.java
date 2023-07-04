import java.util.Scanner;
public class U3Activitat2AMS {
	public static void main(String[] args) {
        Scanner teclat= new Scanner(System.in);
double [] arraySistolica = new double [10];
double [] arrayDiastolica= new double [10];
double mesures=1;
int opcio;



System.out.println("Tensió arterial ");
System.out.println("-----------------------");
System.out.print("Introdueix les mesures: ");
    for(int i=0; i<arraySistolica.length&&mesures!=0;i++){
    mesures=teclat.nextDouble();
   if (i%2==0){
    arrayDiastolica[i]=mesures;
    
    }
    else if(i%2!=0){
    arraySistolica[i]=mesures;
    
    }


    }
    for(int i=0;i<arraySistolica.length;i++){
    System.out.println("Les mesures astoliques : "+arraySistolica[i]);
    System.out.println("Les mesures diastoliques : "+arrayDiastolica[i]);
    
    }
System.out.println("1- Sistolica maxima ");
System.out.println("2- Diastolica minima ");
System.out.println("3- Mes compensada ");
System.out.println("4- Tensio mitjana ");
System.out.println("5- Eixir");
System.out.print("Selecciona l'opcio desitjada ");
while(!teclat.hasNextInt()||(opcio=teclat.nextInt())<1||opcio>5){
System.out.print("Error introdueix un nombre entre 1 y 5");
}
switch (opcio){
case 1:

case 2:

case 3:

case 4:

case 5:

}

  }
}
