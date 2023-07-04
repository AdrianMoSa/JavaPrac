import java.util.Scanner;
public class practica3_8 {
    
    public static void main(String[] args) {
        Scanner teclat= new Scanner(System.in);
    System.out.println("Introdueix un nombre de files");
    int files=teclat.nextInt();
    System.out.println("Introdueix un nombre de columnes");
    int columnes=teclat.nextInt();
    int [][] array=new int[files][columnes];
    
    for (int i=0;i<array.length;i++){
        for (int j=0;j<array[i].length;j++){
            array[i][j]=i+j;
            
        }
    }
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
        System.out.print(array[i][j]+"\t");
        }
        System.out.println();   
    } 
    }
}
