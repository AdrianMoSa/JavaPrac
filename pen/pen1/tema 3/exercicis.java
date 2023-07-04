import java.util.Scanner;
public class exercicis{
    public static void main(String[] args) {
        exercicis programa= new exercicis();
        programa.inici();
    }
    public void inici(){
        int minim=0;
        int maxim=9;
        //en llegirEnter pots introduir cualquier nombre com minim i maxim no requiere ser variable//
      llegirEnter(0,5);
       
        
    }
    public void llegirEnter(){
        Scanner teclat=new Scanner(System.in);
        int enter;
        System.out.println("Introdueix un enter");
        while(!teclat.hasNextInt()){
            teclat.nextLine();
            System.out.println("Introdueix un enter");
        }
        enter=teclat.nextInt();
    }
    public void llegirEnter(int minim){
        Scanner teclat=new Scanner(System.in);
        int enter;
        System.out.println("Introdueix un enter major que 0 y menor que 10");
        while(!teclat.hasNextInt()||(enter=teclat.nextInt())<minim){
            teclat.nextLine();
            System.out.println("Introdueix un enter major que 0");
        }
        
    }
    public void llegirEnter(int minim,int maxim){
        Scanner teclat=new Scanner(System.in);
        int enter;
        System.out.println("Introdueix un enter major que 0 y menor que deu");
        while(!teclat.hasNextInt()||(enter=teclat.nextInt())<minim||enter>maxim){
            teclat.nextLine();
            System.out.println("Introdueix un enter major que 0 i menor que 10");
        }
        
    }
    public void conversio(int centig
}
