/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapehier;

/**
 *
 * @author sakib
 */
public class ThreeDShape extends Shape {
    private double a;
    private double b;
    private double c;
    
    ThreeDShape(String name, double aa, double bb, double cc)
    {
        super(name);
        a=aa;
        b=bb;
        c=cc;
    }
     public double getA()
     {
         return a;
     }
     public double getB()
     {
         return b;
     }
     public double getC()
     {
         return c;
     }
}
