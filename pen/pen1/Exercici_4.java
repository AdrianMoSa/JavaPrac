/**
 * Autor: Ací ha d'anar el teu nom complet. IMPORTANT!!!
 */
import java.util.Scanner;
public class Exercici_4{
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Mètodes básics: teclat.nextInt() teclat.nextDouble() teclat.nextLine() teclat.hasNextInt() teclat.hasNextDouble()
        double [][]temperatures={{20,10,15},{18,13,8},{25,5,1},{40,22,30},{15,8,5},{20,21,22},{42,10,8}};
        String []diesSetmana={"Dilluns","Dimarts","Dimecres","Dijous","Divendres","Disabte","Diumenge"};
        String []pobles={"Petrer","Elda","Novelda"};
        double temperaturaMaxima=0;
        double temperaturaMinima=100;
        int posicionMaxima=0;
        int posicionMinima=0;
        int posicionMaximaDia=0;
        int posicionMinimaDia=0;
        for (int i=0;i<temperatures.length;i++){
            for(int j=0;j<temperatures[i].length;j++){
                if(temperaturaMaxima<temperatures[i][j]){
                    temperaturaMaxima=temperatures[i][j];
                    posicionMaxima=i;
                    posicionMaximaDia=j;
                }
                if(temperaturaMinima>temperatures[i][j]){
                    temperaturaMinima=temperatures[i][j];
                    posicionMinima=i;
                    posicionMinimaDia=j;
                }

            }
        }

        
        System.out.println("La temperatura mes alta ha sigut de "+temperaturaMaxima+" i es va registrar el "+diesSetmana[posicionMaxima]+" en "+pobles[posicionMaximaDia]);
        System.out.println("La temperatura mes baixa ha sigut de "+temperaturaMinima+" i es va registrar el "+diesSetmana[posicionMinima]+" en "+pobles[posicionMinimaDia]);
    
}
}