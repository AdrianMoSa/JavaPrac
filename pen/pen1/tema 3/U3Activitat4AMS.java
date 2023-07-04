import java.util.Scanner;
public class U3Activitat4AMS{
public static void main(String[] args) {
    Scanner teclat=new Scanner(System.in);
    int [][] matriuBinaria;
    int [] matriuFilas;
    int [][] matriuColumnas;
    int contador=0;
    int mida;
    int maximo1=0;
    System.out.print("Introdueix la mida de la matriu ");
    while(!teclat.hasNextInt()||(mida=teclat.nextInt())<1){
        teclat.nextLine();
        System.out.print("Introdueix la mida de la matriu: ");
    }
    teclat.nextLine();
    matriuBinaria=new int[mida][mida];
    matriuFilas= new int[mida];
    for(int i=0;i<matriuBinaria.length;i++){
        for(int j=0;j<matriuBinaria[i].length;j++){
            matriuBinaria[i][j]=(int)(Math.random()*2);
        }
    }
    for(int i=0;i<matriuBinaria.length;i++){
        for(int j=0;j<matriuBinaria[i].length;j++){
            System.out.print(matriuBinaria[i][j]);
        }
        System.out.println();
    }
    for(int i=0;i<matriuBinaria.length;i++){
        for(int j=0;j<matriuBinaria[i].length;j++){
            if(matriuBinaria[i][j]==1){
                contador++;
                
            }
           
            
        }
        matriuFilas[i]=contador;
        System.out.println("el contador es" +contador);
        contador=0;
    }
    for(int i=0;i<matriuFilas.length;i++){
        
            maximo1=matriuFilas[i];
        
        
      
        
        
    }
}

}
