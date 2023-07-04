import java.util.Scanner;

public class repas3_3 {


    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

    int numero;
    int [] arrayNumeroA= new int [2];
    int [] arrayNumeroB= new int [2];
   boolean igual=true;
    

         
        
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

    for(int i=0;i<arrayNumeroA.length&&igual;i++){
    if(arrayNumeroA[i]!=arrayNumeroB[i]){
    igual=false;
    
    }
    
    else{
    
    }
    }
    if(igual){
    System.out.println("Son iguales");
    }  
    else{
    System.out.println("no son iguals");
    } 
}
}
