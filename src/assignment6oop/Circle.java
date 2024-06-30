  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment6oop;

/**
 *
 * @author johnc
 */
public class Circle 
{
    private double radius; // Variables I can use in Circle class
    private double PI;
    
    
    public Circle() // default constructor
    {
       radius = 0.0; 
    }
    
    public double Circle(double r) //accessor method
    {
        radius = r;
        return radius;
    }
    
    public void setRadius(double r) // accessor method
    {
        radius = r;
    }
    
    public double getRadius(double r) // accessor method
    {
        return radius;
    
    }
    
    public double Area(double r, double pi) // accesor method
    {
        double area; // variable only in Area method also known as shadowing
        radius = r;
        PI = pi;
        area = PI *radius*radius;
        return area; //return a double variable
    }
    public double Diameter(double r) // accessor method
    {
        double diameter; // variable only in Diameter method also known as shadowing
        radius = r;
        diameter = radius *2;
        return diameter; // return a double variable  
    }
    public double Circumference(double r, double pi) // accessor method
    {
        double circumference; // variable only in Circumference method
        radius = r;
        PI = pi;
        circumference = 2 * PI * radius;
        return circumference;  // return a double variable
    }
 
}
