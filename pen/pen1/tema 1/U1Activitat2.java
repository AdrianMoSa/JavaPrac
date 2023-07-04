/**
 * Autor: Adrián Moya Sánchez
 * Descripció: compila i funciona,
 * No he tingut cap problema.
 * 
 */


public class U1Activitat2 {
    public static void main(String[] args) {

double poblacioActual = 312032486;
final double segDia = 86400;
final double segAny = 86400*365;
final double nacimentAny = segAny/7;
final double mortsAny= segAny/13;
final double inmigrantsAny = segAny/45;
double increment = nacimentAny - mortsAny + inmigrantsAny;

System.out.println("PROJECCIÓ DE LA POBLACIÓ ALS EUA");
System.out.println("------------------------------------");
System.out.printf("\t Any actual: %.0f persones \n\n",poblacioActual);
poblacioActual=poblacioActual+increment; 
System.out.printf("\t Any 2022: %.0f persones \n\n",poblacioActual);
poblacioActual=poblacioActual+increment; 
System.out.printf("\t Any 2023: %.0f persones \n\n",poblacioActual);
poblacioActual=poblacioActual+increment; 
System.out.printf("\t Any 2024: %.0f persones \n\n",poblacioActual);
poblacioActual=poblacioActual+increment; 
System.out.printf("\t Any 2025: %.0f persones \n\n",poblacioActual);
    }
}
