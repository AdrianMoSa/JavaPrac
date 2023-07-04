import java.util.Scanner;
public class pruebacolumna {
    public static void main(String[] args) {
        Scanner teclat= new Scanner(System.in);
        int [][] matriz;
        int numero;
        System.out.println("Introdueix un nombre per a la matriu cuadrada ");
        numero=teclat.nextInt();
        matriz=new int [numero][numero];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(int)(Math.random()*2);
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                
            }
            System.out.print(matriz[i][2]);
            System.out.println();
        }
    }
}
