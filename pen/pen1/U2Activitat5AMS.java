import java.util.Scanner;
public class U2Activitat5AMS{ 
  
   public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);

final double random= Math.random()*100; 
final int partEntera=(int) random;
int intent;
int contador=1;
int numero;
boolean acertado=false;


System.out.println("BENVINGUT AL JOC: ENDEVINA EL NUMERO SECRET ");
System.out.println("---------------------------------------------\n\n");
System.out.print("De quants intents vols disposar: ");
  while(!teclat.hasNextInt()||((intent=teclat.nextInt())<1||(intent>10))){
    teclat.nextLine();
    System.out.println("error valor invalid ");
    System.out.print("Introdueix un nombre entre 1 y 10 per als intents : ");

  }

    for(int i=1;(i<intent+1)&&(!acertado);i++){
      System.out.print("Intent "+i+": ");
        teclat.nextLine();
      while(!teclat.hasNextInt()||((numero=teclat.nextInt())<0||(numero>99))){
        teclat.nextLine();
        System.out.println("error valor invalid ");
        System.out.print("Introdueix un nombre entre 0 y 99 per als intents : ");
        
        }
      
    
        int diferencia=numero-partEntera;
        
        
        if(numero==partEntera){
          acertado=true;
        }
        if(diferencia<=-30){
        System.out.println("El nombre introduit es menor (gelat) ");
          }
        else if (diferencia>-30 && diferencia<-10){
        System.out.println("El nombre introduit es menor (templat) ");
          }
        else if (diferencia>=-10 && diferencia<0){
         System.out.println("El nombre introduit es menor (calent) ");       
        }
        else if (diferencia>=30){
         System.out.println("El nombre introduit es major (gelat) ");       
        }
        else if (diferencia<30 && diferencia>10){
         System.out.println("El nombre introduit es major (templat) ");       
        }
        else if (diferencia<=10 && diferencia>0){
         System.out.println("El nombre introduit es major (calent) ");
             
        }
       

}
  if(acertado){
    System.out.println("Enhorabona has acertat ");

  }
  else{
  System.out.println("Ho sent has fallat ");
  }
}
}   

