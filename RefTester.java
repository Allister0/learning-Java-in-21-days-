// Demostrates the use of references to objects
// self notes: “You aren’t directly using objects when you assign an object to a variable or pass an object to a method as an argument. You aren’t even using copies of the objects. Instead, you’re using references to those objects.”

package java_in_21days;
import java.util.Scanner;
import java.awt.Point;

class RefTester { 
    public static void main(String[] arguments) {
        // 2 Pointer variables created
        Point pt1, pt2;
        // new point object assigned to pt1
        pt1 = new Point(100, 190);
        //pt1 assigned to pt2 (becomes a reference type variable, (not primitive))
        pt2 = pt1;
        // x variable of pt1 assigned value of 200
        pt1.x = 200;
        // y variable of pt1 assigned value of 290
        pt1.y = 290;
        
        System.out.println("Point1: " + pt1.x + "," + pt1.y);
        System.out.println("Point2: " + pt2.x + "," + pt2.y);
        // results should be the same for both displayed due to pt2 becoming reference variable and having the same data as pt1 inside itself.
        
        
        
        
        //Additional messing around (finish later)
//        Object em = new Object();
//        Object sl = new Object();
//        Scanner sn;
//        sn = new Scanner(System.in);
//        sl = (sl) sn.nextLine(); 
//        em = (sl) sn;
//        
//        
//     
//        
//        System.out.println("Please enter a number between 0 and 10");           
    }
}
  