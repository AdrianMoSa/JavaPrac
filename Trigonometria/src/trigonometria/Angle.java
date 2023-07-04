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
public class Angle {
    private double graus;

    public Angle(double graus) {
        
        this.graus = Math.abs(graus);
       
    }
    
    public Angle(Angle angle){
        this.graus=angle.graus;
    }
    
    public double toRadians(){
        return(graus*Math.PI/180);
    }
    
    public void setGraus(double graus) {
        this.graus = graus;
        simplificar();
    }

    public double getGraus() {
        return graus;
    }
    public double getSinus(){
        return Math.sin(toRadians());
    }
    public double getCosinus(){
        return Math.cos(toRadians());
    }
    public double getTangent(){
        return Math.tan(toRadians());
    }
    public boolean esAgut(){
       if(graus<90){
           return true;
       }
       return false;
    }
    public boolean esRecte(){
        if(graus==90){
            return true;
        }
        return false;
    }
    public boolean esObtus(){
        if(graus>90&&graus<180){
         return true;
        }
        return false;
    }
    public void simplificar(){
        if(graus>360){
        graus=graus-360;
        }
        else{
            graus=graus;
        }
    }
    public String toString(){
        return graus+"º";
    }
    public void visualitzar(){
        System.out.println(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.graus) ^ (Double.doubleToLongBits(this.graus) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Angle other = (Angle) obj;
        if (Double.doubleToLongBits(this.graus) != Double.doubleToLongBits(other.graus)) {
            return false;
        }
        return true;
    }
    public static double toGraus(double radians){
        return radians*180/Math.PI;
    }
    public static Angle asin(double sinus){
        return new Angle(toGraus(Math.asin(sinus)));
    }
    public static Angle acos(double cosinus){
        return new Angle(toGraus(Math.acos(cosinus)));
    }
    public static Angle atan(double tangent){
        return new Angle(toGraus(Math.atan(tangent)));
    }
    
}
