import java.util.Scanner;

public class eClase8{ 
    
    public static void main(String[] args) {

	Scanner teclat = new Scanner(System.in);

    System.out.println("Dius-me un dia de la setmana ");
    String setmana=teclat.nextLine();
    System.out.println(setmana);

    if (setmana.equals("Dilluns")){
    System.out.println("Programacio");
        }
    else if (setmana.equals("Dimarts")){
    System.out.println("Sistemes");    
    }
    else if (setmana.equals("Dimecres")){
    System.out.println("Programacio");    
    }
    else if (setmana.equals("Dijous")){
    System.out.println("FOL");    
    }
    else if (setmana.equals("Divendres")){
    System.out.println("Base de datos");    
    }
     else{
    System.out.println("No es un dia correcte");                
                        }
    }
}
