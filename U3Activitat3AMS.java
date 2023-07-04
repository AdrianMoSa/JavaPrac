public class U3Activitat3AMS {
    public static void main(String[] args) {
        int j;
        int [] array= new int [1000000];
        int clave;
    

        
        for(int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*1000000);

        }
        long tempsInicial= System.currentTimeMillis();
       for (int i=0;i<array.length;i++){
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
        System.out.println("El temps de execucio de insercio directa  es de "+tempsExecucio);


         tempsInicial= System.currentTimeMillis();
       for (int i=0;i<array.length-1;i++){
        int valorMinimoActual=array[i];
        int indicevalorMinimoActual=i;

        for(int k=1+1;k<array.length;k++){
            if(valorMinimoActual>array[k]){
                valorMinimoActual=array[k];
                indicevalorMinimoActual=k;
            }
            
        }
        if (indicevalorMinimoActual!=i){
            array[indicevalorMinimoActual]=array[i];
            array[i]=valorMinimoActual;
        }
       }
        tempsFinal = System.currentTimeMillis();
        tempsExecucio =  tempsFinal - tempsInicial;
        System.out.println("El temps de execucio de seleccio directa  es de "+tempsExecucio);



        tempsInicial= System.currentTimeMillis();
       for (int i=1;i<array.length;i++){

        for(int k=0;k<array.length-1;k++){
            if(array[k]>array[k+1]){
                int aux=array[k];
                array[k]=array[k+1];
                array[k+1]=aux;
            }
            
        }
       
       }
        tempsFinal = System.currentTimeMillis();
        tempsExecucio =  tempsFinal - tempsInicial;
        System.out.println("El temps de execucio de intercanvi directe  es de "+tempsExecucio);

        
    }
}
