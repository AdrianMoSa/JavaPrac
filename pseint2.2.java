/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;
import java.math.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		String comparacio;
		double imc;
		double imcoxford;
		double pes;
		String resultat;
		System.out.println("Introdueix el teu pes (KG): ");
		pes = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Introdueix la teua altura (cm): ");
		altura = Double.parseDouble(bufEntrada.readLine());
		altura = altura/100;
		imcoxford = 1.3*pes/(Math.pow(altura,2.5));
		imc = pes/(Math.pow(altura,2));
		if (imcoxford<18.5) {
			resultat = "(Manca de pes)";
		}
		if (imcoxford>=18.5 && imcoxford<25.0) {
			resultat = "(Normal)";
		}
		if (imcoxford>=25.0 && imcoxford<30) {
			resultat = "(Sobrepes)";
		}
		if (imcoxford>=30.0) {
			resultat = "(Obés)";
		}
		if (imcoxford-imc>1 || imcoxford-imc<-1) {
			comparacio = "(Descompensado)";
		}
		if (altura<=0 || pes<=0) {
			System.out.println("error");
		}
		System.out.println("el teu IMC(OXFORD2003) es "+imcoxford+" "+resultat+comparacio);
	}


}

