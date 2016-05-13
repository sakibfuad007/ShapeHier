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
public class TwoDShape extends Shape {
    private double a;
    private double b;
    
    TwoDShape(String name, double len,double wid)
    {
        super(name);
        a=len;
        b=wid;
    }
    
    public double getA()
    {
        return a;
    }
    
    public double getB()
    {
        return b;
    }
}
