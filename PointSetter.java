package java_in_21days;
import java.awt.Point;

//New class and object demostrating the use of the Point import, using dot notation to retrieve and assign value to instance variables (generated from the creation of objects from classes, they are the variables belonging to the object inherited from the class)
class PointSetter {
    public static void main(String[] arguments) {
        // new object created from PointSetter class
        Point location = new Point(4,13);
        
        //display instance variables
        System.out.println("Starting location: ");
        System.out.println("X equls " + location.x);
        System.out.println("Y equals " + location.y);
        
        //display new values that will be assigned to instance variables
        System.out.println("\nMoving to (7,6)");
        //assign values to instance variables
        location.x = 7;
        location.y = 6;
        
        // display changes to location/variables
        System.out.println("\nEnding location: ");
        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);
    }
}
