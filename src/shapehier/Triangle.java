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
public class Triangle extends TwoDShape {
    
    Triangle(String name, double h, double b)
    {
        super(name, h, b);
    }
    
    public double area()
    {
        return 0.5*super.getA()*super.getB();
    }
}
