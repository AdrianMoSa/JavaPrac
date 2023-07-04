/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigonometria;

/**
 *
 * @author ciclost
 */
public class Triangle {
    private double ladoa;
    private double ladob;
    private double ladoc;
    private Angle angleA;
    private Angle angleB;
    private Angle angleC;

    public Triangle(double ladoa, double ladob, double ladoc) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
        this.angleA= Angle.acos(((ladob*ladob)+(ladoc*ladoc)-(ladoa*ladoa))/(2*ladob*ladoc));
        this.angleB= Angle.acos(((ladoa*ladoa)+(ladoc*ladoc)-(ladob*ladob))/(2*ladoa*ladoc));
        this.angleC= Angle.acos(((ladoa*ladoa)+(ladob*ladob)-(ladoc*ladoc))/(2*ladoa*ladob));
    }
    public Triangle(double ladoa,Angle angleB,Angle angleC){
        this.ladoa=ladoa;
        this.angleB= new Angle(angleB);
        this.angleC= new Angle(angleC);
        this.angleA= new Angle(180-angleB.getGraus()-angleC.getGraus());
        this.ladob=ladoa*angleB.getSinus()/(angleA.getSinus());
        this.ladoc=ladoa*angleC.getSinus()/(angleA.getSinus());
    }

    public Triangle(Angle anglea, double ladob, double ladoc) {
        this.ladob = ladob;
        this.ladoc= ladoc;
        this.angleA = new Angle(anglea);
        this.ladoa=Math.sqrt((ladob*ladob)+(ladoc*ladoc)-(2*ladob*ladoc)*(angleA.getCosinus()));
        this.angleB= Angle.acos(((ladoa*ladoa)+(ladoc*ladoc)-(ladob*ladob))/(2*ladoa*ladoc));
        this.angleC= Angle.acos(((ladoa*ladoa)+(ladob*ladob)-(ladoc*ladoc))/(2*ladoa*ladob));
        
    }
    public Triangle(double area,Angle angleA,Angle angleB,Angle angleC){
 
        this.angleA=new Angle(angleA);
        this.angleB=new Angle (angleB);
        this.angleC=new Angle(angleC);
        this.ladoa=Math.sqrt((2*(angleB.getSinus()+angleC.getSinus())*area)/(angleB.getSinus()*angleC.getSinus()));
        this.ladob=(2*area)/(ladoa*(angleC.getSinus()));
        this.ladoc=(2*area)/(ladoa*(angleB.getSinus()));
    }
    public Triangle(Triangle triangle){
        this.ladoa= triangle.ladoa;
        this.ladob=triangle.ladob;
        this.ladoc=triangle.ladoc;
        this.angleA=new Angle(triangle.angleA);
        this.angleB=new Angle(triangle.angleB);
        this.angleC=new Angle(triangle.angleC);
    }

    public double getLadoa() {
        return ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public double getLadoc() {
        return ladoc;
    }

    public Angle getAngleA() {
        
        return new Angle(angleA);
    }

    public Angle getAngleB() {
        return new Angle(angleB);
    }

    public Angle getAngleC() {
        return new Angle(angleC);
    }
    public double getArea(){
        return Math.sqrt(getSemiperimetre()*(getSemiperimetre()-ladoa)*(getSemiperimetre()-ladob)*(getSemiperimetre()-ladoc));
    }
    
    public double getPerimetre(){
        return ladoa+ladob+ladoc;
    }
    public double getSemiperimetre(){
        return getPerimetre()/2;
    }
    public double getAlturaA(){
        return 2/ladoa*Math.sqrt(getSemiperimetre()*(getSemiperimetre()-ladoa)*(getSemiperimetre()-ladob)*(getSemiperimetre()-ladoc));
    }
    public double getAlturaB(){
        return 2/ladob*Math.sqrt(getSemiperimetre()*(getSemiperimetre()-ladoa)*(getSemiperimetre()-ladob)*(getSemiperimetre()-ladoc));
    }
    public double getAlturaC(){
        return 2/ladoc*Math.sqrt(getSemiperimetre()*(getSemiperimetre()-ladoa)*(getSemiperimetre()-ladob)*(getSemiperimetre()-ladoc));
    }
    public double getMitjanaA(){
        return Math.sqrt(2*(ladob*ladob+ladoc*ladoc)-ladoa*ladoa)/2;
    }
    public double getMitjanaB(){
        return Math.sqrt(2*(ladoa*ladoa+ladoc*ladoc)-ladob*ladob)/2;
    }
    public double getMitjanaC(){
        return Math.sqrt(2*(ladoa*ladoa+ladob*ladob)-ladoc*ladoc)/2;
    }
    public double getRadiCircurmscrit(){
        return (ladoa)/(Math.sqrt(3));
    }
   
    public double getRadiInscrit(){
        return (ladoa*ladob)/(getPerimetre());
    }
    
    public String getTipusAngles(){
        if(angleA.esAgut()&&angleB.esAgut()&&angleC.esAgut()){
            return "Acutangle";
        }
        else if(angleA.esRecte()||angleB.esRecte()||angleC.esRecte()){
            return "Rectangle";
        }
        else if(angleA.esObtus()&&angleB.esAgut()&&angleC.esAgut()){
            return "Obtusangle";
        }
        else if(angleB.esObtus()&&angleA.esAgut()&&angleC.esAgut()){
            return "Obtusangle";
        }
        else if(angleC.esObtus()&&angleB.esAgut()&&angleA.esAgut()){
            return "Obtusangle";
        }
        return "No es un triangle";
    }
    public String getTipusCostats(){
        if(ladoa==ladob&&ladoa==ladoc&&ladob==ladoc){
            return "Equilater";
        }
        else if(ladoa==ladob&&ladoa!=ladoc||ladoa==ladoc&&ladoa!=ladob||ladob==ladoc&&ladob!=ladoa){
           return "Isosceles"; 
        }
        else if(ladoa!=ladob&&ladoa!=ladoc){
            return "Escale";
        }
        return "No es un triangle";
    }
    public boolean esSemblant(Triangle triangle){
        return angleA.equals(triangle.angleA)&& angleB.equals(triangle.angleB)&&angleC.equals(triangle.angleC)&&ladoa/triangle.ladoa==ladob/triangle.ladob&&ladob/triangle.ladob==ladoc/triangle.ladoc;
    }
    public String toString(){
        return "lado a :"+ladoa+"\n lado b : "+ladob+"\n lado c: "+ladoc+ "\n angle A: "+angleA+"\n angle B: "+angleB+"\n angle C: "+angleC+"\n area: "+getArea();
    }
    public void Visualitzar(){
        System.out.println(this);
    }
    public static Angle angleFaltant(Angle a, Angle b){
        return new Angle((180-(a.getGraus()+b.getGraus())));
    }
  
    public static Angle angleQueFormen(double b, double c, Angle C){

       
        double a = (b * b) + (c * c) - (2 * b * c) * (C.getCosinus());
        Angle B = new Angle(Angle.acos(((b * b) + (c * c) - (a * a)) / (2 * c * a)));
        return new Angle(180 - (B.getGraus() + C.getGraus()));



    }
}
