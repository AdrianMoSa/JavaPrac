package itv;

import util.GestorIO;
import util.Interval;

public class Menu {
    GestorIO g = new GestorIO();
    
    public void menu(){
        g.out("---MENU---\n");
        g.out("---1. Alta i recepcio de vehicles---\n");
        g.out("---2. Reclamar vehicle per a entrar al box---\n");
        g.out("---3. Moure tots el vehicles de fase dins de un box---\n");
        g.out("---4. Informacio del estat de un box concret---\n");
        g.out("---5. Informacio general de tots el boxes---\n");
        g.out("---6. Eixir del programa---\n");
    }
}
