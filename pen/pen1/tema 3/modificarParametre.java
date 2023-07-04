public class modificarParametre{
    public static void main(String[] args) {
        modificarParametre programa= new modificarParametre();
        programa.inici();
    }
    public void inici(){
        String i="hola";
        System.out.println("Abans de cridar el metode \"i\"val " +i);
        modificarParametre(i);
        System.out.println("despres de cridar el metode \"i\" val " +i);
    }
    public void modificarParametre(String a){
         a="adeu";
        System.out.println("Heu modificat el valor a " +a);
    }
}