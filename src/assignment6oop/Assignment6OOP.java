/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment6oop;
import javax.swing.JOptionPane; // import the users input
/**
 *
 * @author John Hernandez 06/30/24
 */
public class Assignment6OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Variables for main project
        double radius;  
        double PI = 3.14159;
        double output; // variable for displaying Circle methods
        String str; 
        
        //Input 
        str = JOptionPane.showInputDialog("What is the radius of the Circle?");
        radius = Double.parseDouble(str);
        
        Circle circle = new Circle(); //created Circle object in variable
        
        //Output
        output = circle.Area(radius, PI);
        JOptionPane.showMessageDialog(null, "Area of the Circle: "+output);
        
        output = circle.Diameter(radius);
        JOptionPane.showMessageDialog(null, "Diameter of the Circle: "+output);
        
        output = circle.Circumference(radius, PI);
        JOptionPane.showMessageDialog(null, "Circumference of the Circle: "+output);
    }
    
}
