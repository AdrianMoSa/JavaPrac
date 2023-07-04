import java.util.Scanner;

public class repas3_1 {


    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

    int numero;
    int [] arrayNumero= new int [5];
    System.out.println("Introdueix un numero per a guardar ");
    
         
        
    for (int i=0;i<arrayNumero.length;i++){
         while(!teclat.hasNextInt()){
            System.out.print("Introduce un numero per a guardar: ");
            teclat.nextLine();
        }  
        numero=teclat.nextInt();
        arrayNumero[i]=numero;
              
        }
   for (int j=0;j<arrayNumero.length;j++){
    System.out.print(" "+arrayNumero[j]);
    
    
    }
}

}
