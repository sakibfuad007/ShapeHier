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
public class Sphere extends ThreeDShape{
    
    Sphere(String name, double a)
    {
        super(name, a, 0, 0);
    }
    
    public double area()
    {
        return 4*3.1416*super.getA()*super.getA();
    }
    
    public double volume()
    {
        return (4/3)*3.1416*super.getA()*super.getA()*super.getA();
    }
}
