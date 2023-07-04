import java.util.Scanner;

public class repas3_2 {


    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

    int numero;
    int [] arrayNumeroA= new int [10];
    int [] arrayNumeroB= new int [10];
    int [] arrayNumeroC= new int [20];
    
    int j=0;
         
        
    for (int i=0;i<arrayNumeroA.length;i++){
        System.out.println("Introdueix un numero per a guardar en el array A ");
         while(!teclat.hasNextInt()){
            System.out.print("Introduce un numero per a guardar: ");
            teclat.nextLine();
        }  
        numero=teclat.nextInt();
        arrayNumeroA[i]=numero;
              
        }

      for (int i=0;i<arrayNumeroB.length;i++){
        System.out.println("Introdueix un numero per a guardar en el array B ");
         while(!teclat.hasNextInt()){
            System.out.print("Introduce un numero per a guardar: ");
            teclat.nextLine();
        }  
        numero=teclat.nextInt();
        arrayNumeroB[i]=numero;
              
        }

    for (int i=0;i<arrayNumeroA.length;i++){
   arrayNumeroC[j]=arrayNumeroA[i];
    j++;
   arrayNumeroC[j]=arrayNumeroB[i];
    j++;
    }
        
    for(int i=0;i<arrayNumeroC.length;i++){

    System.out.println(" "+arrayNumeroC[i]);
    }
}

}
