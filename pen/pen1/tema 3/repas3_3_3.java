public class repas3_3_3 {
    public static void main(String[] args) {
        int[][]numeros=new int[4][5];
        int[][]numeros2=new int[4][5];
        int[][]suma=new int[4][5];

        for(int i=0;i<numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                numeros[i][j]=(int)(Math.random()*10);
                numeros2[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                suma[i][j]=numeros[i][j]+numeros2[i][j];
            }
        
        }
    }
}
