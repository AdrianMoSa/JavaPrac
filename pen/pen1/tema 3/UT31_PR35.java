import java.util.Scanner;

public class UT31_PR35 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroNotas,i=0;
        int suspes=0;
        int aprovat=0;
        int notable=0;
        int excelent=0;
        String asteriscosS="";
        String asteriscosA="";
        String asteriscosN="";
        String asteriscosE="";
        
        double maxima, notaIntroducida, sumaNotas=0;

        boolean salir = false;

        double[] notas;
        
        System.out.print("Introduce cuántas notas quieres leer: ");

        while(!teclado.hasNextInt()){
            System.out.print("Introduce cuántas notas quieres leer: ");
            teclado.nextLine();
        }

        numeroNotas = teclado.nextInt();
        notas = new double[numeroNotas];
        teclado.nextLine();


        System.out.print("Introduce las notas: ");


        while(i<numeroNotas && !salir){

            while (!teclado.hasNextDouble()) {
                teclado.next();
            }

            notaIntroducida = teclado.nextDouble(); 
            
            if(notaIntroducida >= 0.0 && notaIntroducida <= 10.0){
                notas[i] = notaIntroducida;
                i++;
            }
            else if(notaIntroducida == -1.0){
                salir = true;
            }
        }

        maxima = notas[0];
       
        for(int j = 0; j<i; j++){
            System.out.println("Nota "+(j+1)+": "+notas[j]);
            if(notas[j]<5){
                suspes++;
                asteriscosS+="*"
            }
            else if(notas[j]>=5&&notas[j]<7){
                aprovat++;
                asteriscosA+="*"
"
            }
            else if(notas[j]>=7&&notas[j]<9){
                notable++;
                asteriscosN+="*"
            }
            else if(notas[j]>=9&&notas[j]<=10){
                excelent++;
                asteriscosE+="*"
            }
            if(notas[j] > maxima){
                maxima = notas[j];
            }
            sumaNotas += notas[j]; 
        }
            

        System.out.println("La nota máxima es un "+maxima);
        System.out.printf("La media es %.2f \n", (sumaNotas/i));
         System.out.println("Grafic de barres de les notes ");
        System.out.println("---------------------------------")
        System.out.println("suspes: "+asteriscosS);
        System.out.println("Aprovat: "+asteriscosA);
        System.out.println("Notable: "+asteriscosN);
        System.out.println("Excelent: "+asteriscosE;
    }
}
