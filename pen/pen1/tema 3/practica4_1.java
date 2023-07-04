import java.util.Scanner;
public class practica4_1{

private int[]llistaEnters= new int[10];
private int maxim=0;
private int quantitat=0;
private int meitatMaxim=maxim/2;
    public static void main(String[] args) {
    practica4_1 programa=new practica4_1();
        programa.inicio();
    }
    public void inicio(){
        llegirLLista();
        ordenarLlista();
        mostrarLlista();
        obtenerMaxim();
        valorsInferiors();
        mostrarValorMaxim();
        mostrarInferiors();
    }
    public void ordenarLlista(){
        for(int i=0;i<llistaEnters.length-1;i++){
            for(int j = i+1;j<llistaEnters.length;j++){
                if(llistaEnters[i]>llistaEnters[j]){
                    int canvi=llistaEnters[j];
                    llistaEnters[j]=canvi;
                }
            }
        }
   }
   public void llegirLLista(){
       Scanner teclat=new Scanner(System.in);
       
       for (int i=0;i<llistaEnters.length;i++){
        System.out.println((+i+1)+": Introdueix un nombre ");
               llistaEnters[i]=teclat.nextInt();
           
       }
   }
   public void mostrarLlista(){
       
       for (int i=0;i<llistaEnters.length;i++){
           
               System.out.println(llistaEnters[i]);
           
       }
   }
   public void obtenerMaxim(){
       for (int i=0;i<llistaEnters.length;i++){
           if (llistaEnters[i]>maxim){
            maxim=llistaEnters[i];
            
           }
       }
   }
   public void valorsInferiors(){
    
    for(int i=0;i<llistaEnters.length;i++){
        if (meitatMaxim>llistaEnters[i]);
        quantitat++;
    }
   }
   public void mostrarValorMaxim(){
       System.out.println("El valor maxim es de "+maxim);
   }
   public void mostrarInferiors(){
       System.out.println("La meitat maxim es de "+meitatMaxim);
       System.out.println("El nombre total de inferiors es de "+quantitat);
   }
}