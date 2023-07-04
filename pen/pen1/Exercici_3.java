/**
 * Autor: Ací ha d'anar el teu nom complet. IMPORTANT!!!
 */
import java.util.Scanner;
public class Exercici_3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        // Mètodes básics: teclat.nextInt() teclat.nextDouble() teclat.nextLine() teclat.hasNextInt() teclat.hasNextDouble()
        char [][]matriu={{'A','Z','X','I','W'},{'P','T','S','M','X'},{'Q','U','E','Q','E'},{'O','R','W','E','Z'},{'U','M','Y','O','V'}};
        int contador=0;

        int columna=0;
        int fila=0;
        int ultimaPosicion=matriu.length-1;
        
        for(int i=0;i<matriu.length;i++){
            for(int j=0;j<matriu[i].length;j++){
                System.out.print(matriu[i][j]+"");
                fila=ultimaPosicion;
                columna=0;
               
              
                
            }
            if (matriu[fila-i][i]=='A'||matriu[fila-i][i]=='E'||matriu[fila-i][i]=='I'||matriu[fila-i][i]=='O'||matriu[fila-i][i]=='U'){
                contador++;
            }
            System.out.println();
        }

        System.out.println("La Subdiagonal conté "+contador+" vocals");
        
    } 
}