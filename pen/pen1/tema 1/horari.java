public class horari{

 public static void main(String[] args){
String vermell = "\033[031m";
String verd= "\033[032m";
String taronja= "\033[033m";
String blau= "\033[034m";
String programacio= verd+ "programacio";

System.out.println("+verd \t\t dilluns "+vermell+" \t\t "+taronja+" dimarts \t\t dimecres \t\t dijous \t\t divendres");
System.out.println(" \t\t castaña \t\t"+programacio+"  \t\t sistemas"+blau+" \t\t Ingles \t\t Programacio");
System.out.println(" \t\t castaña \t\t Programacio \t\t"+blau+" sistemas \t\t Ingles \t\t Programacio");
System.out.println(" \t\t castaña \t\t Programacio \t\t sistemas \t\t Ingles \t\t Programacio");
System.out.println(" \t\t castaña \t\t Programacio \t\t sistemas \t\t Ingles \t\t Programacio");
    }
}
