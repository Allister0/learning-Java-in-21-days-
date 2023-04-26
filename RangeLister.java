/**Abstract: contains Rangelister class defining makeRange method which will take two integers 
(upper and lower boundaries) and create an array containing all integer numbers inbetween.***/
// additon scanner feature added to make app interactive with user.
package java_in_21days;
import java.util.Scanner;
// creating class Range Lister
class RangeLister {
    //creating scanner object
     static Scanner sc = new Scanner(System.in);

    // creating int type array method, that takes two int type arguments 
    int[] makeRange(int lower, int upper) {
        // creating interger array object containing the upper boundary minus the lower boundary + 1 as the total number of elements/slots inside the array
        int[] range = new int[(upper-lower) + 1];
        
        // this for loop assigns a value of the element/ slot starting from the slot above the first (increases first argument value by one every iteration)  
        for (int i = 0; i < range.length; i++){
         range[i] = lower++;
    }
        // returns value of range array 
      return range;  
    }
    // main public class method to recieve user input and print out range array 
    public static void main(String[] arguments) {
        
        // prompt user to give a value for the first argument being passed into the makeRange method 
        System.out.println("Enter the lower boundary value: "); 
        
        // scan user input 
        int st1 = sc.nextInt();
        
        // assign user input to value being passed into first argument 
        int l = st1;
        
        // repeat steps to generate value passed into second argument 
        System.out.println("Enter the upper boundary value: ");
        int st2 = sc.nextInt();
        int u = st2;
        
        // create range array belonging to this method 
        int [] range;
        
        // initialize RangeLister
        RangeLister lister = new RangeLister();
        
        // Create Range Lister Object 
        range = lister.makeRange(l,u);
        
        // display beginning of array 
        System.out.print("The array: [ ");
        
        // loop displaying each element value until the upper boundary is reached ( the first value is the lower boundary value)
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i] + " "); 
        }
        // display end of Array 
        System.out.println("]");
    }
}
