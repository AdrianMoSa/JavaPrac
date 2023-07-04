package Part_2;

public class Triangle {

    private double c1;
    private double c2;
    private double c3;

    public Triangle() {
    }
    
    public Triangle(double c1, double c2, double c3) throws TriangleIlegalException {
        if((c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1) && (c1 >= 0 && c2 >= 0 && c3 >= 0)){
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            System.out.println("Triangle ok");
        }else{
            throw new TriangleIlegalException("Triangle INCORRECTE. La suma de dos del seus costats tenen que ser mes gran que el tercer costat.");
        }
    }
    
    public static void main(String[] args) {

        try{
            Triangle t1 = new Triangle(3,3,3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}


class TriangleIlegalException extends Exception{

    public TriangleIlegalException() {
    }

    public TriangleIlegalException(String message) {
        super(message);
    }
    
    
}