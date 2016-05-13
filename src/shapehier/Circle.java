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
public class Circle extends TwoDShape {
    
    Circle(String name, double rad)
    {
        super(name,rad, 0);
    }
    
    public double area()
    {
        return 3.1416*super.getA()*super.getA();
    }
}
