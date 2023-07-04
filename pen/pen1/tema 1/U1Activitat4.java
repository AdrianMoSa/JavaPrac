/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */


public class U1Activitat4 {
    public static void main(String[] args) {
    double a = 3.4;
    double b = 50.2;
    double c = 2.1;
    double d = 0.55;
    double e = 44.5;
    double f = 5.9;
    double x = ((e*d)-(b*f))/((a*d)-(b*c));
    double y = ((a*f-e*c))/(a*d-b*c);

    
    System.out.println("SISTEMA D'EQUACIONS LINEALS ");
    System.out.println("--------------------------------------");
    System.out.println("3.4x + 50.2y = 44.5 ");
    System.out.println("2.1x + 0.55y = 5.9 \n");
    System.out.println("SOLUCIÓ PER CRAMER");
    System.out.println("--------------------------------------");
    System.out.printf(" x = %.2f \n",x);
    System.out.printf(" y = %.2f \n",y);
    System.out.println("\nCOMPROVACIÓ DONADA LA 'x'");
    System.out.println("--------------------------------------");
    System.out.printf("y = %.2f \n",(e-(a*x))/b);
    System.out.printf("y = %.2f \n",(f-(c*x))/d);
    }
}
