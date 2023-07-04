public class repasExamen3_4{
    public static void main(String[] args) {
        int [][]matriu1={{1,2,3},{4,5,6},{7,8,9}};
        int [][]matriu2={{10,20,30},{40,50,60},{70,80,90}};
        for (int i=0;i<matriu1.length;i++){
            for (int j=0;j<matriu2.length;j++){
                matriu1[i][j]=matriu1[i][j]+matriu2[i][matriu2[i].length-j-1];
            }
        }
        for (int i=0;i<matriu1.length;i++){
            for (int j=0;j<matriu2.length;j++){
                System.out.print(matriu1[i][j]+" ");
            }
            System.out.println();
        }
    }
}