import java.util.Scanner;
public class U3Activitat2AMS {
	public static void main(String[] args) {
        Scanner teclat= new Scanner(System.in);
double [] arraySistolica = new double [10];
double [] arrayDiastolica= new double [10];
int j=0;
double sistolica=1;
double diastolica=1;
boolean valido=true;
int opcio;



System.out.println("Tensió arterial ");
System.out.println("-----------------------");
System.out.print("Introdueix les mesures: ");
    for(int i=0;j<2||(i<arraySistolica.length&&sistolica!=0&&diastolica!=0);i++){
    while(!teclat.hasNextDouble()){
    teclat.next();
    System.out.println("error");
    valido=false;
    }
    
    sistolica=teclat.nextDouble();
    System.out.println("todo ok Jose Luis");
    System.out.println(sistolica+"sistolica");
    
    while(!teclat.hasNextDouble()&&valido){
    System.out.println("error");
    teclat.next();
    valido=false;
    }
    
    diastolica=teclat.nextDouble();
    System.out.println("todo ok Jose Luis");
    System.out.println(diastolica+"diastolica");
    
    if(valido&&sistolica>3&&sistolica<23&&diastolica>3&&diastolica<23&&sistolica>diastolica){
    arraySistolica[i]=sistolica;
    arrayDiastolica[i]=diastolica;
    System.out.println("array sistolica "+arraySistolica[i]);
    System.out.println("array diastolica"+arrayDiastolica[i]);
    j++;
    }
    else{
    i--;    
    }    
    valido=true;
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
