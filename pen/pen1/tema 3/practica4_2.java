import java.util.Scanner;
public class practica4_2{
    private double temperaturesAny[][]=new double [52][7];
    private int dia=1;
    private int setmana=0;
    private int mes=1;
    private final int diesSetmana=7;
    private double total;

public static void main(String[] args) {
    practica4_2 programa=new practica4_2();
    programa.inicio();
}
public void inicio(){
llegirTemperatures();
actualitzarDataActual();
mostrarDataActual();
}
//nivel 1 de descomposicion//
public void mostrarMenu(){

}
public void tractarOrdre(){

}
//nivel 2 de descomposicio si es correcta//
public void introduirRegistreTemperaturesSetmanals(){

}
public void mostrarTemperaturaMitjana(){

}
public void mostrarDiferenciaMaxima(){

}
public void finalitzarExecucio(){

}
//nivel 2 de descomposicio si no es correcta mostrar menu//

//nivel 3 de descomposicio//
public void llegirTemperatures(){
Scanner teclat=new Scanner(System.in);
for(int i=0;i<diesSetmana;i++){
        System.out.println("Introdueix la temperatura per al dia "+(i+1));
        temperaturesAny[setmana][i]=teclat.nextDouble();
        setmana++;

    }



}
public void actualitzarDataActual(){
    for(int i=0;i<diesSetmana;i++){
        if(dia==28&&mes==2||dia==31&&mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12||dia==30&&mes==4||mes==6||mes==9||mes==11||mes==12){
        dia=1;
        mes++;
        }
        else if (dia==31&&mes==12){
            dia=1;
            mes=1;
            setmana=0;
        }
        else{
            dia++;
        }
    }
    
}
public void mostrarDataActual(){
if(mes==1){
    System.out.println("La data actual es dia "+dia +" gener");
}
else if(mes==2){
    System.out.println("La data actual es dia "+dia +" febrer");
}
else if(mes==3){
    System.out.println("La data actual es dia "+dia +" març");
}
else if(mes==4){
    System.out.println("La data actual es dia "+dia +" abril");
}
else if(mes==5){
    System.out.println("La data actual es dia "+dia +" maig");
}
else if(mes==6){
    System.out.println("La data actual es dia "+dia +" juny");
}
else if(mes==7){
    System.out.println("La data actual es dia "+dia +" july");
}
else if(mes==8){
    System.out.println("La data actual es dia "+dia +" agost");
}
else if(mes==9){
    System.out.println("La data actual es dia "+dia +" septembre");
}
else if(mes==10){
    System.out.println("La data actual es dia "+dia +" octobre");
}
else if(mes==11){
    System.out.println("La data actual es dia "+dia +" novembre");
}
else if(mes==12){
    System.out.println("La data actual es dia "+dia +" decembre");
}
}
public void calcularTemperaturaMitjana(){
for(int i=0;i<setmana;i++){
    for (int j=0;j<diesSetmana;j++){
        total=temperaturesAny[i][j];
    }
}
}

}
