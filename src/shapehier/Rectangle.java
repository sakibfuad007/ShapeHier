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
public class Rectangle extends TwoDShape {
    
    Rectangle(String name, double height, double width)
    {
        super(name, height, width);
    }
    
    public double area()
    {
        return super.getA()*super.getB();
    }
}
