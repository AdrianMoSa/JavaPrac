import java.util.Scanner;

public class U3Activitat2AMS {
  public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);
    double[] arraySistolica = new double[10];
    double[] arrayDiastolica = new double[10];
    double sistolicaMaxima = 0;
    double diastolicaMinima = 100;
    int j = 0;
    double acumuladorSistolica = 0;
    double acumuladorDiastolica = 0;
    double mediaSistolica = 0;
    double mediaDiastolica = 0;
    double sistolica = 1;
    double posicionSistolica=0;
    double diastolica = 1;
    double posicionDiastolica=0;
    int acumulador=0;
    double posicion=0;
    double proxim=0;
    double lejano=100;
    boolean valido = true;
    int opcio;
    String tipo="";

    System.out.println("Tensió arterial ");
    System.out.println("-----------------------");
    System.out.print("Introdueix les mesures: ");
    for (int i = 0; j < 1 || (i < arraySistolica.length && (sistolica != 0 && diastolica != 0)); i++) {
      while (!teclat.hasNextDouble()) {
        teclat.next();
        valido = false;
      }

      sistolica = teclat.nextDouble();

      while (!teclat.hasNextDouble() && valido) {
        teclat.next();
        valido = false;
      }

      diastolica = teclat.nextDouble();

      if (valido && sistolica >= 3 && sistolica <= 22 && diastolica >= 3 && diastolica <= 22 && sistolica > diastolica) {
        arraySistolica[i] = sistolica;
        arrayDiastolica[i] = diastolica;
        acumuladorDiastolica += diastolica;
        acumuladorSistolica += sistolica;
        proxim=Math.abs(sistolica-(diastolica*2));
        if (proxim<lejano){
          lejano=proxim;
          posicionSistolica=arraySistolica[i];
          posicionDiastolica=arrayDiastolica[i];
        }
        
        if (sistolicaMaxima < sistolica) {
          sistolicaMaxima = sistolica;
        }
        if (diastolicaMinima > diastolica) {
          diastolicaMinima = diastolica;
        }
        j++;
        acumulador++;
      } else {
        i--;
      }
      valido = true;
    }
    mediaDiastolica = acumuladorDiastolica / acumulador;
    mediaSistolica = acumuladorSistolica / acumulador;
    if(posicionSistolica < 12 && posicionDiastolica < 8){
      tipo="Optima";
  }else if(posicionSistolica>= 12 && posicionSistolica <= 12.9 && posicionDiastolica>=8 && posicionDiastolica<=8.4){
      tipo="Normal";
  }else if(posicionSistolica >= 13 && posicionSistolica <= 13.9 && posicionDiastolica >= 8.5 && posicionDiastolica <= 8.9){
      tipo="Normal-Alta";
  }else if(posicionSistolica >= 14 && posicionSistolica <= 15.9 && posicionDiastolica >= 9 && posicionDiastolica <= 9.9){
      tipo="Grau 1";
  }else if(posicionSistolica >= 16 && posicionSistolica <= 17.9 && posicionDiastolica >= 10 && posicionDiastolica <= 10.9){
      tipo="Grau 2";
  }else if(posicionSistolica >= 18 && posicionDiastolica >= 11){
      tipo="Grau 3";
  }else if(posicionSistolica >= 14 && posicionDiastolica < 9){
      tipo="Sistolica aillada";
  }
    
    System.out.println("1- Sistolica maxima ");
      System.out.println("2- Diastolica minima ");
      System.out.println("3- Mes compensada ");
      System.out.println("4- Tensio mitjana ");
      System.out.println("5- Eixir");
    do {
      System.out.print("Selecciona l'opcio desitjada: ");

      while (!teclat.hasNextInt() || (opcio = teclat.nextInt()) < 1 || opcio > 5) {
        System.out.print("Error introdueix un nombre entre 1 y 5");
      }
      switch (opcio) {
      case 1:
        System.out.println("La Sistolica maxima es  " + sistolicaMaxima);
        break;
      case 2:
        System.out.println("La diastolica minima es " + diastolicaMinima);
        break;
      case 3:
        System.out.println(posicionSistolica+" "+posicionDiastolica+" "+tipo);
        break;
      case 4:
      System.out.println("La media sistolica es de " + mediaSistolica + " y la media Diastolica es de " + mediaDiastolica);
        break;
      case 5:
        System.out.println("Adeu");
        break;
      }
    } while (opcio != 5);

  }
}
