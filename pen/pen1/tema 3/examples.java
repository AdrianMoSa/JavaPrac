public class examples{
    public static void main(String[] args) {
        examples programa= new examples();
        programa.inici();
    }
    public void inici(){
        int [] i={3,4,5};
        System.out.println(maxim(i));
        
    }
    public int maxim(int a[]){
        int maxim=o;
         for(int i=0;i<a.length;i++){
             if (a[i]>maxim){
                 maxim=a[i];
             }
         }
         return maxim;
    }
}