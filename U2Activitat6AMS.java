/**
 * Autor: Adrian Moya Sanchez.
 * Descripció: compila y funciona,
 * cap problema
 * 
 */
import java.util.Scanner;
public class U2Activitat6AMS {
	public static void main(String[] args) {
		Scanner teclat= new Scanner(System.in);
		double notes=0, totalNotes=0, totalAprovats=0,totalSuspesos=0, notaAlta=0, notaBaixa=999, sumaNotes=0, sumaAprovats=0, sumaSuspesos=0, percentatgeAprovats=0, percentatgeSuspesos=0, mediaGeneral = 0, mediaAprovats = 0, mediaSuspesos = 0;
		boolean valido= false;
		boolean finalizado= false;
		boolean negativo= false;
		
		System.out.println("*************************");
        System.out.println("--Estadistica de notes--");
        System.out.println("*************************");
		while(!valido || !negativo){
			System.out.print(" Introdueix una nota (valor negatiu per a finalitzar): ");
			if(teclat.hasNextDouble()){
				notes=teclat.nextDouble();
				if(!(notes>10.0)){
					valido=true;
		
				}
				else{
					System.out.println("Error: nota invalida ");
					valido=false;
				}
				
				if(notes<0){
					negativo = true;
					
				}
				
			}
			else{
				System.out.println("Error: nota invalida ");
				valido=false;
			}
			teclat.nextLine();
			
			if (valido && !negativo){
				totalNotes++;
				if (notes>=5){
					sumaAprovats = sumaAprovats+notes;
					totalAprovats++;
				}
				if (notes<5){
					sumaSuspesos = sumaSuspesos+notes;
					totalSuspesos++;
				}
				percentatgeAprovats = (totalAprovats*100)/totalNotes;
				percentatgeSuspesos = (totalSuspesos*100)/totalNotes;
				if (notes>notaAlta){
					notaAlta=notes;
				}
				if (notes<notaBaixa){
					notaBaixa=notes;
				}
				sumaNotes = sumaNotes+notes;
				
				mediaGeneral = sumaNotes/totalNotes;
				mediaAprovats = sumaAprovats/totalAprovats;
				mediaSuspesos = sumaSuspesos/totalSuspesos;		
			}	
			
		}
		if(negativo){
			System.out.printf("\nSe han evaluat un total de %.0f alumnes \n" ,totalNotes);
            System.out.printf("La nota mitjana del curs es ha sigut un: %.2f \n",mediaGeneral);
			System.out.printf("Han aprovat %.0f alumnos, el que suposa un %.2f per cent del total.\n",totalAprovats,percentatgeAprovats);
			if (totalAprovats==0){
				System.out.printf("La nota mitjana dels alumnes aprovats es inexistent, per que no hi ha cap aprovat.\n");
			}
			else{
				System.out.printf("La nota mitjana dels alumnes que han aprovat es de %.2f \n ",mediaAprovats);
			}
			System.out.printf("Han suspes %.0f alumnes, el que suposa un %.2f per cent del total.\n " ,totalSuspesos,percentatgeSuspesos);	
			if(totalSuspesos==0){
				System.out.printf("La nota mitjana dels alumnes suspesos es inexistent, per que no hi ha cap suspes. \n ");
			}
			else{
				System.out.printf("La nota mitjana dels alumnos que han suspes es de %.2f \n ",mediaSuspesos);
			}
			
			System.out.println("La nota mes alta ha sigut "+notaAlta);
			System.out.println("La nota mes baixa ha sigut "+notaBaixa);
		}		
		
			
			
	}
				
	
								
		
		
}
	