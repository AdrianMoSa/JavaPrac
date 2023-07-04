/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */

import java.util.Scanner;

public class U2Activitat2AMS{
public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
double altura;
String resultat="";
String comparacio="";
final double imc;
final double imcoxford;
double pes;

System.out.print("Introdueix el teu pes (KG): ");
if (!teclat.hasNextDouble()){
    System.out.println("error: introdueix valor positiu per a KG");
}
else{
    pes= teclat.nextDouble();
    teclat.nextLine();
    System.out.print("Introdueix la teua altura (cm): ");
    if (!teclat.hasNextDouble()){
    System.out.println("error: introdueix valor positiu per a l' altura");
    }
    else{
        altura = teclat.nextDouble();
        teclat.nextLine();
        altura = altura/100;
        imcoxford = 1.3*pes/(Math.pow(altura,2.5));
        imc = pes/(Math.pow(altura,2));
        if (altura<=0 || pes<=0) {
			System.out.println("error");
		}
    else{
        if (imcoxford<18.5) {
			resultat = "Manca de pes";
	}
    else if (imcoxford>=18.5 && imcoxford<25.0) {
			resultat = "Normal";
		}
    else if (imcoxford>=25.0 && imcoxford<30) {
			resultat = "Sobrepes";
		}
    else if (imcoxford>=30.0) {
			resultat = "Obés";
		}
    if (imcoxford-imc>1 || imcoxford-imc<-1) {
		     comparacio = "descompensat";
		}

		System.out.printf("el teu IMC(OXFORD2003) es %.2f (%s %s) \n",imcoxford,resultat,comparacio);
}
}
}


}

}
