public class U3Activitat3AMS {
    public static void main(String[] args) {
        int j;
        int [] array= new int [1000000];
        int clave;
    

        
        for(int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*1000000);

        }
        long tempsInicial= System.currentTimeMillis();
       for (int i=1;i<array.length;i++){
        clave = array[i];
        j=i-1;

        while(j>=0 && array[j]>clave){
            array[j+1]=array[j];
            j=j-1;
        }
        array[j+1]=clave;
       }
        long tempsFinal = System.currentTimeMillis();
        long tempsExecucio =  tempsFinal - tempsInicial;
        System.out.println("El temps de execucio es de "+tempsExecucio);
    }
}
