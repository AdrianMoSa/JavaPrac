package a72.joc;

import a72.util.GestorIO;
import a72.util.Interval;

public class Coordenada {
    private int fila;
    private int columna;
    private static final Interval LIMITS=new Interval(1,3);

    public Coordenada() {
    }

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

   public boolean validar(){
       if (LIMITS.inclou(fila)&&LIMITS.inclou(columna)){
           return true;
       }
           return false;
   }
   public void recollir(){
       GestorIO teclat=new GestorIO();
       do{
       teclat.out("Introdueix la fila (valors entre 1 i 3 ");
       this.fila=teclat.inInt();
       teclat.out("Introdueix la columna (valors entre 1 i 3 ");
       this.columna=teclat.inInt();
       }
       while(!validar());    
    
      
       
       
   }
    
}
