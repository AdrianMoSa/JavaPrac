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
        this.angleA= new Angle(Angle.acos(Math.pow(ladob, 2)+Math.pow(ladoc, 2)-Math.pow(ladob, 2)/2*ladob*ladoc));
        this.angleB= new Angle(Angle.acos(Math.pow(ladoa, 2)+Math.pow(ladoc, 2)-Math.pow(ladob, 2)/2*ladoa*ladoc));
        this.angleC= new Angle(Angle.acos(Math.pow(ladoa, 2)+Math.pow(ladob, 2)-Math.pow(ladoc, 2)/2*ladoa*ladob));
    }
    public Triangle(double ladoa,Angle angleB,Angle angleC){
        this.ladoa=ladoa;
        this.angleB= new Angle(angleB);
        this.angleC= new Angle(angleC);
        this.angleA= new Angle(180-angleB.getGraus()-angleC.getGraus());
        this.ladob=ladoa*angleB.getSinus()/angleA.getSinus();
        this.ladoc=ladoa*angleC.getSinus()/angleA.getSinus();
    }

    public Triangle(double ladoa, double ladob, Angle angleC) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.angleC = new Angle(angleC);
        this.ladoc=Math.sqrt(ladoa*ladoa+ladob*ladob-2*ladoa*ladob*angleC.getCosinus());
        this.angleA= new Angle(Angle.acos(Math.pow(ladob, 2)+Math.pow(ladoc, 2)-Math.pow(ladob, 2)/2*ladob*ladoc));
        this.angleB= new Angle(Angle.acos(Math.pow(ladoa, 2)+Math.pow(ladoc, 2)-Math.pow(ladob, 2)/2*ladoa*ladoc));
        
    }
    public Triangle(double area,Angle angleA,Angle angleb,Angle angleC){
        
        this.angleA=new Angle(angleA);
        this.angleB=new Angle (angleb);
        this.angleC=new Angle(angleC);
        this.ladoa=Math.sqrt(2*(angleA.getSinus()+angleC.getSinus())*area/angleb.getSinus()*angleC.getSinus());
        this.ladob=(2*area)/(ladoa*angleC.getSinus());
        this.ladoc=(2*area)/(ladoa*angleB.getSinus());
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
        return ladoa/2*angleA.getSinus();
    }
    public double getRadiInscrit(){
        return 
    }
}
