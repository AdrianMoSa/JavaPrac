public class TemperaturesEldaPetrer{
    public static void main(String[] args) {
        // Hi ha una estaciò meteorològica per a Elda-Petrer on es guarda la temperatura mitjana de cada día.
        double[] temperaturesElda = new double[365];
        temperaturesElda[0] = 14.3;
        temperaturesElda[1] = 14.8;
        temperaturesElda[2] = 13.2;
        temperaturesElda[3] = 12.1;
        temperaturesElda[4] = 15.5;

        // Arribat un punt de l'any s'incorpora una estació a Petrer
        double[] temperaturesPetrer = new double[365];

        // No volem perdre les mesures que hem pres des de principis d'any, per tant ho copiem
        temperaturesPetrer = temperaturesElda;

        // A partir d'eixe moment es prenen temperatures cada dia als dos municipis.
        temperaturesElda[5] = 18.6;
        temperaturesPetrer[5] = 15.2;

        temperaturesElda[6] = 17.1;
        temperaturesPetrer[6] = 16.9;

        // Una volta es prenen totes les temperatures de l'any mostrem com han quedat els registres a Elda:
        String separador = "";
        for(int i=0; i<7; i++){
            System.out.print(separador + temperaturesElda[i]);
            separador = ", ";
        }
        System.out.println();
    }
}