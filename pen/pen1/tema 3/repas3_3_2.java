public class repas3_3_2 {
    public static void main(String[] args) {
       
        int [][] numeros=new int [8][6];

        for (int i=0;i<numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                if(i==0){
                    numeros[i][j]=1;
               
               }
               if(j==0){
                   numeros[i][j]=1;
               }
               if(j==numeros[i].length-1){
                   numeros[i][j]=1;
               }
               if(i==numeros.length-1){
                   numeros[i][j]=1;
               }

            }

            }
            
            for (int i=0;i<numeros.length;i++){
                for (int j=0;j<numeros[i].length;j++){
            System.out.print(numeros[i][j]);
        }
        System.out.println();
            }
}
}
