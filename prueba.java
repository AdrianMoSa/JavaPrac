import java.util.Arrays;
import java.util.*;

public class prueba{
    public static void main(String[] args) {
        prueba programa= new prueba();
        programa.inici();
    }
    public void inici(){
       System.out.println(pasarDouble(835));
    }
    public int returnRandom(int num1, int num2){
        int generarAleatori=(int)(Math.random()*2);
        if (generarAleatori==0){
            return num1;
        }
        else{
            return num2;
        }
        
    }
   public double[] arrayDoubles(double []vector){
    double [] copia=Arrays.copyOf(vector, vector.length);
    Arrays.sort(copia);
    return copia;
   }
   public String[] afeggir(String[]vector,String nombre){
        
    String[]copia=Arrays.copyOf(vector, vector.length+1);
    copia[copia.length-1]=nombre;
    return copia;
}
public String pasarDobles(Double numero){
    return numero.toString();
}
public Double pasarString(String numero){
    return Double.parseDouble(numero);
}
public Double pasarDouble(int numero){
    return (double)numero;
}

}