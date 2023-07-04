import java.util.Scanner;
public class repas3_3_4 {
    public static void main(String[] args) {
        Scanner teclat=new Scanner(System.in);
        System.out.println("Introdueix un nombre per a la matriu");
        int nombre=teclat.nextInt();
        int matriu[][] = new int [nombre][nombre];
        boolean simetrica=true;

        for(int i=0;i<matriu.length;i++){
            for(int j=0;j<matriu[i].length;j++){
                matriu[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<matriu.length&&simetrica;i++){
            for(int j=0;j<matriu[i].length;j++){
                System.out.print(matriu[i][j]+" ");
                if(matriu[i][j]!=matriu[j][i]){
                    simetrica=false;
                    break;
                }
            }
            System.out.println();
        }
        System.out.println(simetrica);
    }
}
