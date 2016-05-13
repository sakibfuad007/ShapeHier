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
public class Cube extends ThreeDShape{
    
    Cube(String name, double a, double b, double c)
    {
        super(name, a, b, c);
    }
     public double area()
     {
         return 2*(super.getA()*super.getB()+super.getB()*super.getC()+super.getC()*super.getA());
     }
     
     public double volume()
     {
         return super.getA()*super.getB()*super.getC();
     }
}
