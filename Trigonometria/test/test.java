/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ciclost
 */
import trigonometria.Angle;
import trigonometria.Triangle;
public class test {
    public static void main(String[] args) {
        Angle a= new Angle(20);
        Angle b=new Angle(30);
        Triangle t1=new Triangle(4,3,3);
        Triangle t2=new Triangle(2,t1.getAngleB(),t1.getAngleC());
        Triangle t3=new Triangle(t2.getAngleA(),1.45,1.45);
        Triangle t4=new Triangle(1.73,t3.getAngleA(),t3.getAngleB(),t3.getAngleC());
        Triangle t5=new Triangle(t1);
        
        t1.Visualitzar();
        System.out.println(t1.getTipusCostats());
        System.out.println(t1.getTipusAngles());
    
      
        
    }
}
