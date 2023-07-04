import java.util.Scanner;
import java.util.Random;
import java.util.*;
import javax.swing.event.SwingPropertyChangeSupport;

public class U4Activitat1AMS{
//crear una variable final scanner//
    public static void main(String[] args) {
        U4Activitat1AMS programa=new U4Activitat1AMS();
        programa.inicio();
     
       
    }
    public void inicio(){
        int mida=nombreDeLLetres();
        int intentes=demanarIntentes();
        int dificultat=demanarDificultat();
        String paraulaSecreta=muntarParaula(mida);
        String paraulaUsuari;
        boolean esCorrecte;
        int intentesFets=0;
        do{
            paraulaUsuari=demanarRespostaEnFormatValid(mida);
            esCorrecte=resoldreResposta(paraulaUsuari, paraulaSecreta);
            intentes--;
            intentesFets++;
            paraulaSecreta=comprobarDificultat(dificultat, intentesFets, paraulaSecreta);

        }
        while(!esCorrecte&&intentes>0);
        
    }

    public static Integer nombreDeLLetres(){
      int mida=0;
      Scanner teclat=new Scanner(System.in);
      boolean correcte=false;

      while(!correcte){
        System.out.print("Quina mida de paraula vols: ");
        if(teclat.hasNextInt()){
         mida=teclat.nextInt();
      
         if(mida>0&&mida<9){
           correcte=true;
          }
          
        
        }
        else{
          teclat.nextLine();
        }
      }
      return mida;
      
    }
    
    public static String muntarParaula(int mida){
        String paraula=""; 
        int caracteres = mida; 
        for (int i=0; i<caracteres; i++){ 
        
                     paraula = paraula + generarLletraAleatoria(); 
                     } 
                     return paraula; 
     }
     public static String barallarParaula(String paraula){
      Random r=new Random();
      String novaParaula="";
      int aleatori; 
      for(int i=0;i<paraula.length();i++){
        aleatori=r.nextInt(99);
        if(aleatori<50){
          novaParaula=novaParaula+paraula.charAt(i);
        }
        else{
          novaParaula=paraula.charAt(i)+novaParaula;
        }
        
       }
       return novaParaula;
     }
     public static Integer demanarIntentes(){
      Scanner teclat=new Scanner(System.in);
      int intentes=0;
      boolean correcte=false;

      while(!correcte){
        System.out.print("De cuants intentes vols disposar? ");
        if(teclat.hasNextInt()){
         intentes=teclat.nextInt();
      
         if(intentes>4&&intentes<16){
           correcte=true;
          }
          
        
        }
        else{
          teclat.nextLine();
        }
      }
      return intentes;
      
     }
     public static Integer demanarDificultat(){
      Scanner teclat=new Scanner(System.in);
      int dificultat=0;
      
      boolean correcte=false;

      while(!correcte){
        System.out.print("Trieu el nivell de dificultat (1:fàcil, 2:normal, 3:professional): ");
        if(teclat.hasNextInt()){
         dificultat=teclat.nextInt();
      
         if(dificultat>0&&dificultat<4){
           correcte=true;
          }
          
        
        }
        else{
          teclat.nextLine();
        }
      }
      return dificultat;
     }
     public static String comprobarDificultat(int dificultat,int intentes,String paraulaSecreta){
      String paraulaModificada=paraulaSecreta; 
      if(dificultat==2&&intentes%5==0){
        paraulaModificada=barallarParaula(paraulaSecreta);
        System.out.println("Paraula secreta barrejada ");
       }
       if(dificultat==3&&intentes%2==0){
        paraulaModificada=barallarParaula(paraulaSecreta);
        System.out.println("Paraula secreta barrejada ");
       }
       return paraulaModificada;
     }
     public static Character generarLletraAleatoria(){ 
      Random r=new Random();
      return ((char)(r.nextInt(122-97)+97));
     }
      public static String llegirResposta(int mida){
        System.out.print("Escriu "+mida+" lletres minuscules: "); 
        Scanner teclat=new Scanner(System.in);
        String resposta=teclat.next();
        return resposta;
      }
      public static Boolean comprovarFormat(String paraula,int mida){
        int caracteres=mida;
       if((paraula.length()>mida)||(paraula.length()<mida)){
        System.out.println("Heu d´introduir "+caracteres+ " lletres. Continua intentant-ho ");
           return false;}
         
            for(int i=0;i<caracteres;i++){
            
                if((paraula.charAt(i)<97)||(paraula.charAt(i)>122)){
                    System.out.println("Heu d´introduir "+caracteres+ "lletres. Continua intentant-ho ");
                return false;
                }
            }

        return true;
      }
       public static String demanarRespostaEnFormatValid(int mida){
           String respostaUsuari;
           boolean esFormatCorrecte;
            int resposta=mida;
           do{
               respostaUsuari=llegirResposta(resposta);
               esFormatCorrecte=comprovarFormat(respostaUsuari,resposta);
           }while(!esFormatCorrecte);
           return respostaUsuari;
           }
       
      
      public static String generarPista(String aleatoria,String paraula){
            String esta="x";
            String correcte="0";
            String incorrecte="-";
            String resultado="";
            boolean acertat=false;
            for(int i=0;i<paraula.length();i++){
              if(paraula.charAt(i)==aleatoria.charAt(i)){
                resultado+=correcte;
                acertat=true;

              }
              if(!acertat){
                for (int j=0;j<paraula.length();j++){
                    if(paraula.charAt(i)==aleatoria.charAt(j)){
                        resultado+=esta;
                    
                        acertat=true;
                        break;
                    }
                 }
                         if(!acertat){
                         resultado+=incorrecte;
               
                         }
              
            }
            acertat=false;
            
          }
          return resultado;
      }
      public static Boolean donarResposta(String paraula){
          boolean pistaCorrecta=paraula.equals("0")||paraula.equals("00")||paraula.equals("000")||paraula.equals("00000")||paraula.equals("000000")||paraula.equals("0000000")||paraula.equals("00000000");
            if(!pistaCorrecta){
            System.out.println("La resposta és ["+paraula+"]. Continua intentant-ho");
            
          }
          else{
          System.out.println("La resposta és ["+paraula+"]. Has encertat!");
          }
          return pistaCorrecta;
      }
      public Boolean resoldreResposta(String paraula, String aleatoria){
        String pista=generarPista(aleatoria, paraula);
        boolean esRespostaCorrecta=donarResposta(pista);
        return esRespostaCorrecta;
    }
    
}
