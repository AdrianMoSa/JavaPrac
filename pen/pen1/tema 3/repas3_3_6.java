import java.util.Scanner;
public class repas3_3_6{

    public static void main(String[] args) {
        Scanner teclat=new Scanner(System.in);
    double divisions [][]=new double [30][4];
    double divisor;
    double dividend;
    double cocent;
    double residu;
    boolean acertat=false;
    boolean terminar=false;
    for (int i=0;i<divisions.length&&!terminar;i++){
        for(int j=0;j<divisions[i].length&&!terminar;j++){
            System.out.print("Introdueix una divisio ");
            dividend=teclat.nextDouble();
            divisor=teclat.nextDouble();
            cocent=teclat.nextDouble();
            residu=teclat.nextDouble();
            if (divisor*cocent+residu==dividend){
            acertat=true;}
           
            while(dividend==-1||divisor==-1||cocent==-1||residu==-1){
                terminar=true;
                 }
                 acertat=false;
                System.out.print(acertat);
            }
        }
    }





    


}