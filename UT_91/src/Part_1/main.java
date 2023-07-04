package Part_1;

public class main {

    public static void main(String[] args) {

        int i=0;
        
        do {
            try {
                double[] arrayRelleno = rellenarArray();
                arrayAleatori(arrayRelleno);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            i++;
        } while (i < 10);
    }

    static double[] rellenarArray() {
        double[] elements = new double[100];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int) (Math.random() * 500);
        }
        return elements;
    }

    static void arrayAleatori(double elements[]) throws ArrayIndexOutOfBoundsException {
        int i = 0;
        
            i = (int) (Math.random() * ((150 - (-50)) + 1) + (-50));
            
            if (i >= 0 && i <= elements.length - 1) {
                System.out.println("El valor del array a la posicio " + i + " es " + elements[i] + " ");
            } else {
                throw new ArrayIndexOutOfBoundsException("El index " + i + " no pertany al array");
            }
        
    }

}
