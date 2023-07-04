import java.util.Scanner;
public class repasExamen3_2{
    public static void main(String[] args) {
        Scanner teclat=new Scanner(System.in);
        int nombre;
        System.out.println("Introdueix un nombre per a la matriu ");
        nombre=teclat.nextInt();
        int matriu[][]=new int [nombre][nombre];

        for (int i=0;i<matriu.length;i++){
            for(int j=0;j<matriu[i].length;j++){
                matriu[i][j]=(j*i)+(j+1);
            }
        }
        for (int i=0;i<matriu.length;i++){
            for(int j=0;j<matriu[i].length;j++){
                System.out.print(matriu[i][j]);
            }
        }
        System.out.println();
    }
}