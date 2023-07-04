public class  repasExamen3_1{
public static void main(String[] args) {
    
    double [][] matriu={{4,5,6,7},{4,3,2,1}};
    double acumulador=0;
    double contador=0;
    for (int i=0;i<matriu.length;i++){
        for (int j=0;j<matriu[i].length;j++){
        acumulador+=matriu[i][j];
        contador++;
        }
    }
    double mitjana=acumulador/contador;
    System.out.println("la mitjana es de "+mitjana);
    
}
}