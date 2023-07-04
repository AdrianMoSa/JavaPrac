import java.util.Scanner;
public class example14{
    public static void main(String[] args) {
        example14 programa= new example14();
        programa.inici();
    }
    public void inici(){
        int [] vector={3,4,5,8,10,12};
        System.out.println("El numero "+pedirNombre()+" apareix"+repeticio(vector,pedirNombre()+" vegades"));
        
    }
    public int pedirNombre(int nombre){
        Scanner teclat=new Scanner(System.in);
        System.out.println("Introdueix un nombre ");
         return teclat.nextInt();
    }
    public int repeticio(int vector[],int nombre){
        int repeticio=0;
         for(int i=0;i<vector.length;i++){
             if (vector[i]==pedirNombre(nombre)){
                 repeticio++;
             }
         }
         return repeticio;
    }
}