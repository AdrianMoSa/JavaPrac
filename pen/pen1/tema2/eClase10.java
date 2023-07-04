import java.util.Scanner;

public class eClase10{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);

    System.out.println("Dime un dia ");
    int dia=teclat.nextInt();
    teclat.nextLine();
    System.out.println("Dime un mes ");
    String mes= teclat.nextLine();
    System.out.println("Dime un any ");
    int any= teclat.nextInt();
    String resultat=("tu fecha de "+dia+" de "+mes+" de "+any+" es correcta ");
    
    if ((any!=0)&&(dia>0)&&(dia<=30)&&(mes.equals("Abril"))||(mes.equals("Junio"))||(mes.equals("Septiembre"))||(mes.equals("Noviembre"))){
    System.out.println(resultat);
    
    }
    else if ((any!=0)&&(dia>0)&&(dia<=31)&&(mes.equals("Enero"))||(mes.equals("Marzo"))||(mes.equals("Mayo"))||(mes.equals("Julio"))||(mes.equals("Agosto"))||(mes.equals("Octubre"))||(mes.equals("Diciembre"))){
    System.out.println(resultat);
        }
    else if ((any!=0)&&(dia>0)&&(dia<=28)&&(mes.equals("Febrero"))){
    System.out.println(resultat);
        }
    else {
    System.out.println("La combinacio no es correcta ");    
    }

    }
}
