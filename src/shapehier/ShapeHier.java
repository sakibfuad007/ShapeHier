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
public class ShapeHier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle ob1=new Circle("Circle", 5);
        System.out.println("------------"+ob1.shapeName()+"-------------");
        System.out.println("Area: "+ob1.area());
        
        Rectangle ob2=new Rectangle("Rectangle", 3, 4);
        System.out.println("------------"+ob2.shapeName()+"-------------");
        System.out.println("Area: "+ob2.area());
        
        Triangle ob3=new Triangle("Triangle", 2.5, 4.9);
        System.out.println("------------"+ob3.shapeName()+"-------------");
        System.out.println("Area: "+ob3.area());
        
        Sphere ob4=new Sphere("Sphere", 9.8);
        System.out.println("------------"+ob4.shapeName()+"-------------");
        System.out.println("Area: "+ob4.area());
        System.out.println("Volume: "+ob4.volume());
        
        Cube ob5=new Cube("Cube", 3, 4, 5);
        System.out.println("------------"+ob5.shapeName()+"-------------");
        System.out.println("Area: "+ob5.area());
        System.out.println("Volume: "+ob5.volume());
        
    }
    
}
