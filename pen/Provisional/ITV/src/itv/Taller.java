package itv;

import util.GestorIO;
import util.Interval;
import enums.TipusVehicle;

public class Taller {

    private int opcio;
    GestorIO g = new GestorIO();

    public static void main(String[] args) {
        Taller t1 = new Taller();
        t1.inici();
    }

    public void inici() {
        Menu menu = new Menu();
        
        menu.menu();
        g.out("Introdueix una opcio: ");
        opcio = g.inInt();
        switch (opcio) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;
                
            case 4:

                break;
                
            case 5:

                break;
                
            case 6:

                break;
            
            default:

        }
    }
}
