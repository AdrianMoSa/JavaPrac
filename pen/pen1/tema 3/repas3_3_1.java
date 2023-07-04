public class repas3_3_1 {
    public static void main(String[] args) {
        int[] sumatorio=new int [10];
        int [] sumatorio2=new int[10];
        int [][] numeros=new int [10][10];
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                numeros[i][j]=(int)(Math.random()*10);
                sumatorio[i]+=numeros[i][j];
                sumatorio2[i]+=numeros[i][i];
            }
        }
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j]+"| "+sumatorio[i]);
            }
            System.out.println();
        }
    }
}
