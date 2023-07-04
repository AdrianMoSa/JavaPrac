import java.util.Scanner;
public class practica {
	public static void main(String[] args) {
        Scanner teclat= new Scanner(System.in);
        int numeroAlumno;
        double [] arrayPrimer= new double [5];
        double [] arraySegun= new double [5];
        double [] arrayTercer= new double [5];
        double acumuladorPrimer=0;
        double acumuladorSegun=0;
        double acumuladorTercer=0;
        double nota;
        double totalNotes=5;
        for (int i=0;i<arrayPrimer.length;i++){
            System.out.println("Introduce una nota ");
            nota=teclat.nextDouble();
            arrayPrimer[i]=nota;
            acumuladorPrimer+=nota;
        }
            System.out.println("La media del primer trimestre es de "+acumuladorPrimer/totalNotes);
           
            for (int i=0;i<arraySegun.length;i++){
                System.out.println("Introduce una nota ");
                nota=teclat.nextDouble();
                arraySegun[i]=nota;
                acumuladorSegun+=nota;
            }
                System.out.println("La media del segundo trimestre es de "+acumuladorSegun/totalNotes);
            
            for (int i=0;i<arrayTercer.length;i++){
                    System.out.println("Introduce una nota ");
                    nota=teclat.nextDouble();
                    arrayTercer[i]=nota;
                    acumuladorTercer+=nota;
                }
                    System.out.println("La media del tercer trimestre es de "+acumuladorTercer/totalNotes);

            System.out.println("Introduce un alumno ");
            numeroAlumno=teclat.nextInt();
            numeroAlumno=numeroAlumno-1;
            System.out.println("La media del alumno es "+(arrayPrimer[numeroAlumno]+arraySegun[numeroAlumno]+arrayTercer[numeroAlumno])/3);
    }
}
