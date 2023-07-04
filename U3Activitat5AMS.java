/* Jose Ramón como el dia en el que explicaste esto no pude ir a clase y tras intentarlo varios dias al final lo he hecho en común con Adrian Reyes durante toda esta tarde de Domingo.
Y si pudieras enviarme la solución porque no consigo saber como hacer para que cuando introduzco solo un numero y pulso intro no se quede esperando otro numero ya que me ha pasado en otras prácticas de control de datos.
*/

import java.util.Scanner;

public class U3Activitat5AMS {

    

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String entero1 = "";
        String entero2 = "";
        String operador1 = "";
        String operador = "";
        int resultado = 0;
        String salida = "";
        int operando1 = 0;
        int operando2 = 0;
        boolean salir = false;

        do {

            System.out.print("Introdueix una operaci贸n (END per acabar): ");
            entero1 = teclado.next();

            if (entero1.equals("END")) {
                salir = true;
                break;
            }
            if (entero1.equals("0") || entero1.equals("1") || entero1.equals("2") || entero1.equals("3") || entero1.equals("4") || entero1.equals("5") || entero1.equals("6") || entero1.equals("7") || entero1.equals("8") || entero1.equals("9")) {
                operando1 = Integer.parseInt(entero1);

                operador1 = teclado.next();
                if (operador1.equals("+") || operador1.equals("-") || operador1.equals("*") || operador1.equals("/")) {
                    operador = operador1;

                    
                    entero2 = teclado.next();
                    if (entero2.equals("0") || entero2.equals("1") || entero2.equals("2") || entero2.equals("3") || entero2.equals("4") || entero2.equals("5") || entero2.equals("6") || entero2.equals("7") || entero2.equals("8") || entero2.equals("9")) {
                        operando2 = Integer.parseInt(entero2);
                        
                        if (operador.equals("+")) {
                            resultado = operando1 + operando2;
                        } else if (operador.equals("-")) {
                            resultado = operando1 - operando2;
                        } else if (operador.equals("*")) {
                            resultado = operando1 * operando2;
                        } else if (operador.equals("/")) {
                            resultado = operando1 / operando2;
                        } else {
                            System.out.println("No es una operaci贸");
                        }
                    } else {
                        System.out.println("No es una operaci贸");
                        teclado.nextLine();
                    }
                }
                
                System.out.println(operando1 + " " + operador + " " + operando2 + " = " + resultado);
                
            } else {
                System.out.println("No es una operaci贸");
                teclado.nextLine();
            }

            

        } while (!salir);

    }
}