import java.util.Scanner;

public class UT31_PR33 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroNotas,i=0;
        
        double maxima, notaIntroducida, sumaNotas=0;

        boolean salir = false;
        boolean encontrado = false;
        double posicion=-1;

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
            if(notas[j] > maxima){
                maxima = notas[j];
            }
            sumaNotas += notas[j]; 
        }

        System.out.println("La nota máxima es un "+maxima);
        System.out.printf("La media es %.2f \n", (sumaNotas/i));
        System.out.println("Introdueix una nota a buscar ");
        double busqueda=teclado.nextDouble();
         for(int j = 0; j<i&&!encontrado; j++){
            if(notas[j] == busqueda){
               posicion = j;
                encontrado=true;
                break;
            }
            sumaNotas += notas[j]; 
        }
        if(posicion==-1){
        System.out println("no se ha encontrado coincidencia ")
        }
        else{
        System.out.println("La posicion de la nota encontrada es "+(posicion+1));
        }
    }
}
