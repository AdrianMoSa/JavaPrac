/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */

import java.util.Scanner;

public class U2Activitat3AMS{
public static void main(String[] args) {
Scanner teclat = new Scanner(System.in);
String animal="";
		int any;
		int resultat;
		System.out.print("Introdueix l'any (DC) de que vols saber l'horoscop xines: ");
        if (!teclat.hasNextInt()){
        System.out.println("error. Introdueix un nombre ");        
        }
        else{
		    any = teclat.nextInt();
		    resultat = any%12;

		    if(any <= 0){
			System.out.println("error");
			}
			 else{
		    switch (resultat) {
		    case 0 :
			    animal = "mono";
			    break;
		    case 1:
			    animal = "gallo";
			    break;
		    case 2:
			    animal = "perro";
			    break;
            case 3:
			    animal = "cerdo";
			    break;
		    case 4:
		    	animal = "raton";
		    	break;
		    case 5:
		    	animal = "buey";
		    	break;
		    case 6:
		    	animal = "tigre";
		    	break;
		    case 7:
		    	animal = "conejo";
		    	break;
		    case 8:
		    	animal = "dragon";
		    	break;
		    case 9:
		    	animal = "serpiente";
		    	break;
		    case 10:
		    	animal = "caballo";
		    	break;
		    case 11:
		    	animal = "cabra";
		    	break;
		
		}
		System.out.println("El teu horoscop xines correspon a "+animal);
	}
		
}
}
}
