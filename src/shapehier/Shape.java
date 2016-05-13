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
public class Shape {
    private String  shapeType;
    
    Shape(String name)
    {
        shapeType=name;
    }
    
    public String shapeName()
    {
        return shapeType;
    }
}
