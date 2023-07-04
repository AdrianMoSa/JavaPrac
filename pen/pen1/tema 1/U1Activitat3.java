/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */


public class U1Activitat3 {
    public static void main(String[] args) {

        final double MULTIPLO = 60;
        final double CONVERSOR = 1.6;
        double kmRecorridos = 14;
        double min = 45;
        double seg = 30;
        double hor = (min/MULTIPLO) + (seg/(MULTIPLO*MULTIPLO));
        
        System.out.println("DISTÁNCIA I TEMPS (km\\h)");
        System.out.println("------------------------");
        System.out.println(kmRecorridos+" quilómetres ("+min+"' "+seg+"'')");
        System.out.println("");
        System.out.println("VELOCITAT MITJANA (mph)");
        System.out.println("------------------------");
        
        double velocidadMedia = (kmRecorridos/hor)/CONVERSOR;
        System.out.printf("%.2f\n",velocidadMedia);
	
        
    } 
}
