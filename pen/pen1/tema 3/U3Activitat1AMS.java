public class U3Activitat1AMS {
	public static void main(String[] args) {
    

    int [] arrayA={10,20,30,40,50,0};
    int [] arrayB={60,70,80,90,100};
    int [] arrayC= new int [5];
    int suma= arrayA[3]+arrayB[4];
    int posicion=5;
    arrayC[1]=suma+arrayA[0];
    System.out.println("Este es el resultado de suma: "+suma);
    System.out.println("este es el resultado de arrayC[1]: "+arrayC[1]);
    if (posicion<arrayA.length){
    System.out.println("no hay error");
    
    }    
   else{
    System.out.println("error la posicion es mayor ");
    }
    

    
    }
}
