public class factorial {
    public static void main(String[] args) {
        factorial programa=new factorial ();
        programa.inicio();
       
    }
    public void inicio(){
        System.out.println(binari(4));
        
    }
    public int calcularFactorial(int numero){
        int resultat;
        if(numero>=0){
            resultat=1;
        for(int i=numero;i>=1;i--){
            resultat*=i;
            }
        }
        else{
            resultat=-1;
            for(int i=numero;i<-1;i++){
                resultat*=i;
            }
        }
        return resultat;
    }
    public int factorialGeneral(int numero){
        if(numero==1){
            return 1;
        }
        else if(numero==-1){
            return -1;
        }
        else if(numero==0){
            return 1;
        }
        if(numero>=0){
        return numero*factorialGeneral(numero-1);
        }
        else{
            return numero*factorialGeneral(numero+1);
        }
    }
    public String binari(int numero){
        if (numero<=1){
            return String.valueOf(numero);
        }
        return String.valueOf(numero%2);
    }
    
}
